package io.github.openapi_sdks.javaclientsdk.models.operations;



public class InsertVersionMetadataResponse {
    public String contentType;
    public InsertVersionMetadataResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    public io.github.openapi_sdks.javaclientsdk.models.shared.Error error;
    public InsertVersionMetadataResponse withError(io.github.openapi_sdks.javaclientsdk.models.shared.Error error) {
        this.error = error;
        return this;
    }
    
    public Integer statusCode;
    public InsertVersionMetadataResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    public io.github.openapi_sdks.javaclientsdk.models.shared.VersionMetadata versionMetadata;
    public InsertVersionMetadataResponse withVersionMetadata(io.github.openapi_sdks.javaclientsdk.models.shared.VersionMetadata versionMetadata) {
        this.versionMetadata = versionMetadata;
        return this;
    }
    
}