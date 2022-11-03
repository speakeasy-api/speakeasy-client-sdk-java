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
        for (Field field : fields) {
            queryParamTag = parseQueryParamsMetadata(field);
            if (queryParamTag != null) {
                //TODO: serialization
                if ("deepObject".equals(queryParamTag.style)) {
                    return populateDeepObjectParams(queryParamTag, field.get(getApiQueryParams), existingQueries);
                }
            }
        }
        return null;
    }

    private static String populateDeepObjectParams(QueryParamsTag queryParamsTag, Object innerObject, Map<String,String> existingQueries) throws IllegalAccessException {
        Map<String,String> headers = new HashMap<>();
        Map<String,String> queryParams = new HashMap<>();

        //need to check if not a Map and is object instead
//        Field[] innerFields = innerObject.getClass().getDeclaredFields();
//            QueryParamsTag queryParamsTag = parseQueryParamsMetadata(innerField);

            if(innerObject instanceof Map) {
                Map<Object,Object> map = (Map<Object,Object>)innerObject;
                for (Map.Entry<Object,Object> entry : map.entrySet()) {
                    if(entry.getValue() instanceof List) {
                        List list = (List) entry.getValue();
                        for (Object object : list) {
                            String queryKey = String.format("%s[%s]", queryParamsTag.name, entry.getKey().toString());
                            String queryValue = String.format("%s", object);
                            //existingQueries.put(queryKey, queryValue);
                            //Need to create a new map and add the queries
                        }
                    }
                }
            }

        return "";
    }

    private static void addToHeaders(Map<String, String> headers, String securityTag, Field innerSecurityField, Object innerSecurityObject) throws IllegalAccessException {
        innerSecurityField.setAccessible(true);
        headers.put(securityTag, (String) innerSecurityField.get(innerSecurityObject));
    }

    private static QueryParamsTag parseQueryParamsMetadata(Field field) {
        var metadata = field.getAnnotation(QueryParamsMetadata.class);
        if (metadata != null) {
            return new QueryParamsTag(
                metadata.style(),
                metadata.explode(),
                metadata.name());
        }
        return null;
    }

    static class QueryParamsTag {
        String style;
        boolean explode;
        String name;

        public QueryParamsTag(String style, boolean explode, String name) {
            this.style = style;
            this.explode = explode;
            this.name = name;
        }
    }
}
