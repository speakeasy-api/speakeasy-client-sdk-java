package dev.speakeasyapi.javaclientsdk.models.operations;

import java.net.http.HttpResponse;

public class GetRequestFromEventLogResponse {
    public String contentType;
    public GetRequestFromEventLogResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    public dev.speakeasyapi.javaclientsdk.models.shared.Error error;
    public GetRequestFromEventLogResponse withError(dev.speakeasyapi.javaclientsdk.models.shared.Error error) {
        this.error = error;
        return this;
    }
    
    public Integer statusCode;
    public GetRequestFromEventLogResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    public HttpResponse<byte[]> rawResponse;
    public GetRequestFromEventLogResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
    public dev.speakeasyapi.javaclientsdk.models.shared.UnboundedRequest unboundedRequest;
    public GetRequestFromEventLogResponse withUnboundedRequest(dev.speakeasyapi.javaclientsdk.models.shared.UnboundedRequest unboundedRequest) {
        this.unboundedRequest = unboundedRequest;
        return this;
    }
    
}
