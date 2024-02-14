/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package io.github.speakeasy_sdks_staging.javaclientsdk.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.net.http.HttpResponse;


public class GetWorkspaceAccessResponse {
    /**
     * OK
     */
    
    public io.github.speakeasy_sdks_staging.javaclientsdk.models.shared.AccessDetails accessDetails;

    public GetWorkspaceAccessResponse withAccessDetails(io.github.speakeasy_sdks_staging.javaclientsdk.models.shared.AccessDetails accessDetails) {
        this.accessDetails = accessDetails;
        return this;
    }
    
    /**
     * HTTP response content type for this operation
     */
    
    public String contentType;

    public GetWorkspaceAccessResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    
    public io.github.speakeasy_sdks_staging.javaclientsdk.models.shared.Error error;

    public GetWorkspaceAccessResponse withError(io.github.speakeasy_sdks_staging.javaclientsdk.models.shared.Error error) {
        this.error = error;
        return this;
    }
    
    /**
     * HTTP response status code for this operation
     */
    
    public Integer statusCode;

    public GetWorkspaceAccessResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    
    public HttpResponse<byte[]> rawResponse;

    public GetWorkspaceAccessResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
    public GetWorkspaceAccessResponse(@JsonProperty("ContentType") String contentType, @JsonProperty("StatusCode") Integer statusCode, @JsonProperty("RawResponse") HttpResponse<byte[]> rawResponse) {
        this.contentType = contentType;
        this.statusCode = statusCode;
        this.rawResponse = rawResponse;
  }
}