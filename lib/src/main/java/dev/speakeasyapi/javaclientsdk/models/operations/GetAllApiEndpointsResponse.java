package dev.speakeasyapi.javaclientsdk.models.operations;



public class GetAllApiEndpointsResponse {
    public dev.speakeasyapi.javaclientsdk.models.shared.ApiEndpoint[] apiEndpoints;
    public GetAllApiEndpointsResponse withApiEndpoints(dev.speakeasyapi.javaclientsdk.models.shared.ApiEndpoint[] apiEndpoints) {
        this.apiEndpoints = apiEndpoints;
        return this;
    }
    
    public String contentType;
    public GetAllApiEndpointsResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    public dev.speakeasyapi.javaclientsdk.models.shared.Error error;
    public GetAllApiEndpointsResponse withError(dev.speakeasyapi.javaclientsdk.models.shared.Error error) {
        this.error = error;
        return this;
    }
    
    public Integer statusCode;
    public GetAllApiEndpointsResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
}