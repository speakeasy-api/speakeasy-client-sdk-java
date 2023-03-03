package dev.speakeasyapi.javaclientsdk.models.operations;

import java.net.http.HttpResponse;

public class GenerateOpenApiSpecForApiEndpointResponse {
    public String contentType;
    public GenerateOpenApiSpecForApiEndpointResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    public dev.speakeasyapi.javaclientsdk.models.shared.Error error;
    public GenerateOpenApiSpecForApiEndpointResponse withError(dev.speakeasyapi.javaclientsdk.models.shared.Error error) {
        this.error = error;
        return this;
    }
    
    public dev.speakeasyapi.javaclientsdk.models.shared.GenerateOpenApiSpecDiff generateOpenApiSpecDiff;
    public GenerateOpenApiSpecForApiEndpointResponse withGenerateOpenApiSpecDiff(dev.speakeasyapi.javaclientsdk.models.shared.GenerateOpenApiSpecDiff generateOpenApiSpecDiff) {
        this.generateOpenApiSpecDiff = generateOpenApiSpecDiff;
        return this;
    }
    
    public Integer statusCode;
    public GenerateOpenApiSpecForApiEndpointResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    public HttpResponse<byte[]> rawResponse;
    public GenerateOpenApiSpecForApiEndpointResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
}
