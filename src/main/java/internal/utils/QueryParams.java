package internal.utils;

import pkg.models.operations.GetApiQueryParams;
import pkg.models.operations.GetApisRequest;
import pkg.models.shared.QueryParamsMetadata;

import java.util.*;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.net.http.HttpClient;
import java.util.HashMap;
import java.util.Map;

public class QueryParams {

    public static String populateQueryParams(GetApiQueryParams getApiQueryParams, Map<String, String> existingQueries) throws IllegalAccessException {
        //get Type
        Field[] fields  = getApiQueryParams.getClass().getDeclaredFields();
        QueryParamsTag queryParamTag;
        Map<String,List<String>> queryParams = new HashMap<>();
        for (Field field : fields) {
            queryParamTag = parseQueryParamsMetadata(field);
            if (queryParamTag != null) {
                //TODO: serialization
                if ("deepObject".equals(queryParamTag.style)) {
                    queryParams.putAll(populateDeepObjectParams(queryParamTag, field.get(getApiQueryParams), existingQueries));
                }
            }
        }
        return null;
    }

    private static Map<String, List<String>> populateDeepObjectParams(QueryParamsTag queryParamsTag, Object innerObject, Map<String,String> existingQueries) throws IllegalAccessException {
        Map<String, String> headers = new HashMap<>();
        Map<String, List<String>> queryParams = new HashMap<>();
        for (Map.Entry<String, String> e : existingQueries.entrySet()) {
            var listValue = Arrays.asList(e.getValue());
            if (existingQueries.containsKey(e.getKey())) {
                queryParams.put(e.getKey(), listValue);
            } else {
                queryParams.put(e.getKey(), listValue);
            }
        }
        if (innerObject instanceof Map) {
            Map<Object, Object> map = (Map<Object, Object>) innerObject;
            for (Map.Entry<Object, Object> entry : map.entrySet()) {
                String queryKey = String.format("%s[%s]", queryParamsTag.name, entry.getKey().toString());
                if (entry.getValue() instanceof List) {
                    List list = (List) entry.getValue();
                    for (Object object : list) {
                        String queryValue = String.format("%s", object);
                        if (queryParams.containsKey(queryKey)) {
                            queryParams.get(queryKey).add(queryValue);
                        } else {
                            queryParams.put(queryKey, Arrays.asList(queryValue));
                        }
                    }
                } else {
                    String queryValue = String.format("%s", entry.getValue());
                    if (queryParams.containsKey(queryKey)) {
                        queryParams.get(queryKey).add(queryValue);
                    } else {
                        List<String> v = new ArrayList<>();
                        v.add(queryValue);
                        queryParams.put(queryKey, v);
                    }
                }
            }
        } else {
            Field[] fields = innerObject.getClass().getDeclaredFields();
            for (Field field : fields) {
                QueryParamsTag qPTag = parseQueryParamsMetadata(field);
                if (qPTag != null) {
                    String queryKey = String.format("%s[%s]", queryParamsTag.name, qPTag.name);
                    String queryValue = String.format("%s", field.get(innerObject));
                    queryParams.put(queryKey, Arrays.asList(queryValue));
                }
            }
        }

        return queryParams;
    }

    private static void addToHeaders(Map<String, String> headers, String securityTag, Field innerSecurityField,
        Object innerSecurityObject) throws IllegalAccessException {
        innerSecurityField.setAccessible(true);
        headers.put(securityTag, (String) innerSecurityField.get(innerSecurityObject));
    }

    private static QueryParamsTag parseQueryParamsMetadata(Field field) {
        var metadata = field.getAnnotation(QueryParamsMetadata.class);
        if (metadata != null) {
            return new QueryParamsTag(
                metadata.style(),
                metadata.explode(),
                metadata.name(),
                metadata.serialization()
            );
        }
        return null;
    }

    static class QueryParamsTag {
        String style;
        boolean explode;
        String name;
        String serialization;

        public QueryParamsTag(String style, boolean explode, String name, String serialization) {
            this.style = style;
            this.explode = explode;
            this.name = name.toLowerCase();
            this.serialization = serialization;
        }
    }
}
