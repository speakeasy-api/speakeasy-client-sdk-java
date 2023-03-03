package dev.speakeasyapi.javaclientsdk.models.operations;

import java.net.http.HttpResponse;

public class GenerateRequestPostmanCollectionResponse {
    public String contentType;
    public GenerateRequestPostmanCollectionResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    public dev.speakeasyapi.javaclientsdk.models.shared.Error error;
    public GenerateRequestPostmanCollectionResponse withError(dev.speakeasyapi.javaclientsdk.models.shared.Error error) {
        this.error = error;
        return this;
    }
    
    public byte[] postmanCollection;
    public GenerateRequestPostmanCollectionResponse withPostmanCollection(byte[] postmanCollection) {
        this.postmanCollection = postmanCollection;
        return this;
    }
    
    public Integer statusCode;
    public GenerateRequestPostmanCollectionResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    public HttpResponse<byte[]> rawResponse;
    public GenerateRequestPostmanCollectionResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
}
