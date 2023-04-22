/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package dev.speakeasyapi.javaclientsdk.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Error - The `Status` type defines a logical error model
 */
public class Error {
    /**
     * A developer-facing error message.
     */
    @JsonProperty("message")
    public String message;
    public Error withMessage(String message) {
        this.message = message;
        return this;
    }
    
    /**
     * The HTTP status code
     */
    @JsonProperty("status_code")
    public Integer statusCode;
    public Error withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    

    public Error(@JsonProperty("message") String message, @JsonProperty("status_code") Integer statusCode) {
    this.message = message;
this.statusCode = statusCode;
  }
}
