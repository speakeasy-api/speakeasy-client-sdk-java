/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package dev.speakeasyapi.javaclientsdk.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.net.http.HttpResponse;


public class DownloadSchemaResponse {
    /**
     * OK
     */
    
    public byte[] twoHundredApplicationJsonSchema;

    public DownloadSchemaResponse withTwoHundredApplicationJsonSchema(byte[] twoHundredApplicationJsonSchema) {
        this.twoHundredApplicationJsonSchema = twoHundredApplicationJsonSchema;
        return this;
    }
    
    /**
     * OK
     */
    
    public byte[] twoHundredApplicationXYamlSchema;

    public DownloadSchemaResponse withTwoHundredApplicationXYamlSchema(byte[] twoHundredApplicationXYamlSchema) {
        this.twoHundredApplicationXYamlSchema = twoHundredApplicationXYamlSchema;
        return this;
    }
    
    /**
     * HTTP response content type for this operation
     */
    
    public String contentType;

    public DownloadSchemaResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    /**
     * Default error response
     */
    
    public dev.speakeasyapi.javaclientsdk.models.shared.Error error;

    public DownloadSchemaResponse withError(dev.speakeasyapi.javaclientsdk.models.shared.Error error) {
        this.error = error;
        return this;
    }
    
    /**
     * HTTP response status code for this operation
     */
    
    public Integer statusCode;

    public DownloadSchemaResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    
    public HttpResponse<byte[]> rawResponse;

    public DownloadSchemaResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
    public DownloadSchemaResponse(@JsonProperty("ContentType") String contentType, @JsonProperty("StatusCode") Integer statusCode) {
        this.contentType = contentType;
        this.statusCode = statusCode;
  }
}
