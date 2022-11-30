package dev.speakeasyapi.javaclientsdk.utils;

import java.lang.reflect.Field;

public class HeaderMetadata extends Metadata {
    public String style = "simple";
    public boolean explode;
    public String name;

    // headerParam:style=simple,explode=false,name=apiID
    public static HeaderMetadata parse(Field field) throws IllegalArgumentException, IllegalAccessException {
        HeaderMetadata result = new HeaderMetadata();
        result = (HeaderMetadata) parse("headerParam", result, field);
        return result;
    }

    private HeaderMetadata() {
    }
}