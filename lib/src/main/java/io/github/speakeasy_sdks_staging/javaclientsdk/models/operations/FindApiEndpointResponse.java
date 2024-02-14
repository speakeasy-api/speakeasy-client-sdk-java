/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package io.github.speakeasy_sdks_staging.javaclientsdk.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.net.http.HttpResponse;


public class FindApiEndpointResponse {
    /**
     * OK
     */
    
    public io.github.speakeasy_sdks_staging.javaclientsdk.models.shared.ApiEndpoint apiEndpoint;

    public FindApiEndpointResponse withApiEndpoint(io.github.speakeasy_sdks_staging.javaclientsdk.models.shared.ApiEndpoint apiEndpoint) {
        this.apiEndpoint = apiEndpoint;
        return this;
    }
    
    /**
     * HTTP response content type for this operation
     */
    
    public String contentType;

    public FindApiEndpointResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    /**
     * Default error response
     */
    
    public io.github.speakeasy_sdks_staging.javaclientsdk.models.shared.Error error;

    public FindApiEndpointResponse withError(io.github.speakeasy_sdks_staging.javaclientsdk.models.shared.Error error) {
        this.error = error;
        return this;
    }
    
    /**
     * HTTP response status code for this operation
     */
    
    public Integer statusCode;

    public FindApiEndpointResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    
    public HttpResponse<byte[]> rawResponse;

    public FindApiEndpointResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
    public FindApiEndpointResponse(@JsonProperty("ContentType") String contentType, @JsonProperty("StatusCode") Integer statusCode, @JsonProperty("RawResponse") HttpResponse<byte[]> rawResponse) {
        this.contentType = contentType;
        this.statusCode = statusCode;
        this.rawResponse = rawResponse;
  }
}
