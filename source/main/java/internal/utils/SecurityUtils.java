package internal.utils;

import pkg.models.shared.security.Security;

import java.lang.reflect.Field;
import java.net.http.HttpClient;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import pkg.models.shared.security.SecurityMetadata;

public class SecurityUtils {


    public static SecurityClient createSecurityClient(Security security) {
        try {
            return parseSecurityClass(security);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }

    private static SecurityClient parseSecurityClass(Security security) throws IllegalAccessException {
        //get Type
        Field[] fields  = security.getClass().getDeclaredFields();
        SecurityTag schemeSecurityTag;
        for (Field field : fields) {
            schemeSecurityTag = parseSecurityMetadata(field);
            if (schemeSecurityTag != null) {
                //TODO: parse option
                if (schemeSecurityTag.scheme) {
                    field.setAccessible(true);
                    return parseSecurityScheme(schemeSecurityTag, field.get(security));
                }
            }
        }
        return null;
    }

    private static SecurityClient parseSecurityScheme(SecurityTag schemeSecurityTag, Object innerSecurityObject) throws IllegalAccessException {
        Map<String,String> headers = new HashMap<>();
        Map<String,String> queryParams = new HashMap<>();

        Field[] innerFields = innerSecurityObject.getClass().getDeclaredFields();
        for (Field innerSecurityField : innerFields) {
            SecurityTag securityTag = parseSecurityMetadata(innerSecurityField);
            if (securityTag == null || "".equals(securityTag.name)) {
                continue;
            }
            switch (schemeSecurityTag.type) {
                case "apiKey":
                    switch (schemeSecurityTag.subType) {
                        case "header" -> addToHeaders(headers, securityTag.name, innerSecurityField, innerSecurityObject);
                        case "query" -> queryParams.put(securityTag.name,  (String) innerSecurityField.get(innerSecurityObject));
                        case "cookie" -> headers.put("Cookie", String.format("%s=%s", securityTag.name, innerSecurityField.get(innerSecurityObject))
                        );
                        default -> throw new IllegalArgumentException("not supported");
                    }
                    break;
                case "openIdConnect":
                case "oauth2":
                    addToHeaders(headers, securityTag.name, innerSecurityField, innerSecurityObject);
                    break;
                case "http":
                    switch (schemeSecurityTag.subType) {
                        case "basic", "bearer" -> addToHeaders(headers, securityTag.name, innerSecurityField, innerSecurityObject);
                        default -> throw new IllegalArgumentException("not supported");
                    }
                default:
                    throw new IllegalArgumentException("not supported");
            }
        }
        return new SecurityClient(HttpClient.newHttpClient(), headers, queryParams);
    }

    private static void addToHeaders(Map<String, String> headers, String securityTag, Field innerSecurityField, Object innerSecurityObject) throws IllegalAccessException {
        innerSecurityField.setAccessible(true);
        headers.put(securityTag, (String) innerSecurityField.get(innerSecurityObject));
    }

    private static SecurityTag parseSecurityMetadata(Field field) {
            var metadata = field.getAnnotation(SecurityMetadata.class);
            if (metadata != null) {
                return new SecurityTag(
                    metadata.name(),
                    metadata.type(),
                    metadata.subtype(),
                    "scheme".equals(metadata.value()),
                    "option".equals(metadata.value()));
            }
            return null;
    }

    static class SecurityTag {
        String name;
        String type;
        String subType;
        boolean scheme;
        boolean option;

        public SecurityTag(String name, String type, String subType, boolean scheme, boolean option) {
            this.name = name;
            this.type = type;
            this.subType = subType;
            this.scheme = scheme;
            this.option = option;
        }
    }
}
