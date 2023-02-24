package dev.speakeasyapi.javaclientsdk.models.operations;



public class RunPluginResponse {
    public dev.speakeasyapi.javaclientsdk.models.shared.BoundedRequest[] boundedRequests;
    public RunPluginResponse withBoundedRequests(dev.speakeasyapi.javaclientsdk.models.shared.BoundedRequest[] boundedRequests) {
        this.boundedRequests = boundedRequests;
        return this;
    }
    
    public String contentType;
    public RunPluginResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    public dev.speakeasyapi.javaclientsdk.models.shared.Error error;
    public RunPluginResponse withError(dev.speakeasyapi.javaclientsdk.models.shared.Error error) {
        this.error = error;
        return this;
    }
    
    public Integer statusCode;
    public RunPluginResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
}