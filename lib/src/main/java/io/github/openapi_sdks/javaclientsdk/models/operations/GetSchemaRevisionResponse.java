package io.github.openapi_sdks.javaclientsdk.models.operations;



public class GetSchemaRevisionResponse {
    public String contentType;
    public GetSchemaRevisionResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    public io.github.openapi_sdks.javaclientsdk.models.shared.Error error;
    public GetSchemaRevisionResponse withError(io.github.openapi_sdks.javaclientsdk.models.shared.Error error) {
        this.error = error;
        return this;
    }
    
    public io.github.openapi_sdks.javaclientsdk.models.shared.Schema schema;
    public GetSchemaRevisionResponse withSchema(io.github.openapi_sdks.javaclientsdk.models.shared.Schema schema) {
        this.schema = schema;
        return this;
    }
    
    public Integer statusCode;
    public GetSchemaRevisionResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
}