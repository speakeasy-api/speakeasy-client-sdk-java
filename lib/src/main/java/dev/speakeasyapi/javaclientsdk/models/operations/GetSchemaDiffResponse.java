/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package dev.speakeasyapi.javaclientsdk.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.net.http.HttpResponse;


public class GetSchemaDiffResponse {
    /**
     * HTTP response content type for this operation
     */
    
    public String contentType;

    public GetSchemaDiffResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    /**
     * Default error response
     */
    
    public dev.speakeasyapi.javaclientsdk.models.shared.Error error;

    public GetSchemaDiffResponse withError(dev.speakeasyapi.javaclientsdk.models.shared.Error error) {
        this.error = error;
        return this;
    }
    
    /**
     * OK
     */
    
    public dev.speakeasyapi.javaclientsdk.models.shared.SchemaDiff schemaDiff;

    public GetSchemaDiffResponse withSchemaDiff(dev.speakeasyapi.javaclientsdk.models.shared.SchemaDiff schemaDiff) {
        this.schemaDiff = schemaDiff;
        return this;
    }
    
    /**
     * HTTP response status code for this operation
     */
    
    public Integer statusCode;

    public GetSchemaDiffResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    
    public HttpResponse<byte[]> rawResponse;

    public GetSchemaDiffResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
    public GetSchemaDiffResponse(@JsonProperty("ContentType") String contentType, @JsonProperty("StatusCode") Integer statusCode) {
        this.contentType = contentType;
        this.statusCode = statusCode;
  }
}
