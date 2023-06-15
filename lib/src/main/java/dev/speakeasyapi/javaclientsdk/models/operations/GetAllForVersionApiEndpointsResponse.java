/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package dev.speakeasyapi.javaclientsdk.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.net.http.HttpResponse;


public class GetAllForVersionApiEndpointsResponse {
    /**
     * OK
     */
    
    public dev.speakeasyapi.javaclientsdk.models.shared.ApiEndpoint[] apiEndpoints;

    public GetAllForVersionApiEndpointsResponse withApiEndpoints(dev.speakeasyapi.javaclientsdk.models.shared.ApiEndpoint[] apiEndpoints) {
        this.apiEndpoints = apiEndpoints;
        return this;
    }
    
    
    public String contentType;

    public GetAllForVersionApiEndpointsResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    /**
     * Default error response
     */
    
    public dev.speakeasyapi.javaclientsdk.models.shared.Error error;

    public GetAllForVersionApiEndpointsResponse withError(dev.speakeasyapi.javaclientsdk.models.shared.Error error) {
        this.error = error;
        return this;
    }
    
    
    public Integer statusCode;

    public GetAllForVersionApiEndpointsResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    
    public HttpResponse<byte[]> rawResponse;

    public GetAllForVersionApiEndpointsResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
    public GetAllForVersionApiEndpointsResponse(@JsonProperty("ContentType") String contentType, @JsonProperty("StatusCode") Integer statusCode) {
        this.contentType = contentType;
        this.statusCode = statusCode;
  }
}
