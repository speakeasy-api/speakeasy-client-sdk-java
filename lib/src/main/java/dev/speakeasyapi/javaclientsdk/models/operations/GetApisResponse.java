package dev.speakeasyapi.javaclientsdk.models.operations;



public class GetApisResponse {
    public dev.speakeasyapi.javaclientsdk.models.shared.Api[] apis;
    public GetApisResponse withApis(dev.speakeasyapi.javaclientsdk.models.shared.Api[] apis) {
        this.apis = apis;
        return this;
    }
    
    public String contentType;
    public GetApisResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    public dev.speakeasyapi.javaclientsdk.models.shared.Error error;
    public GetApisResponse withError(dev.speakeasyapi.javaclientsdk.models.shared.Error error) {
        this.error = error;
        return this;
    }
    
    public Integer statusCode;
    public GetApisResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
}
