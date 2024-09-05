/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package dev.speakeasyapi.javaclientsdk.models.errors;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import dev.speakeasyapi.javaclientsdk.utils.Utils;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * Error - The `Status` type defines a logical error model
 */
public class Error extends RuntimeException {

    /**
     * A developer-facing error message.
     */
    @JsonProperty("message")
    private String message;

    /**
     * The HTTP status code
     */
    @JsonProperty("status_code")
    private int statusCode;

    @JsonCreator
    public Error(
            @JsonProperty("message") String message,
            @JsonProperty("status_code") int statusCode) {
        Utils.checkNotNull(message, "message");
        Utils.checkNotNull(statusCode, "statusCode");
        this.message = message;
        this.statusCode = statusCode;
    }

    /**
     * A developer-facing error message.
     */
    public String message(){
        return message;
    }

    /**
     * The HTTP status code
     */
    public int statusCode(){
        return statusCode;
    }
    
    public final static Builder builder() {
        return new Builder();
    }

    /**
     * A developer-facing error message.
     */
    public Error withMessage(String message) {
        Utils.checkNotNull(message, "message");
        this.message = message;
        return this;
    }

    /**
     * The HTTP status code
     */
    public Error withStatusCode(int statusCode) {
        Utils.checkNotNull(statusCode, "statusCode");
        this.statusCode = statusCode;
        return this;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Error other = (Error) o;
        return
            Objects.deepEquals(this.message, other.message) &&
            Objects.deepEquals(this.statusCode, other.statusCode);
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            message,
            statusCode);
    }

    @Override
    public String toString() {
        return Utils.toString(Error.class,
                "message", message,
                "statusCode", statusCode);
    }

    public final static class Builder {

        private String message;

        private Integer statusCode;

        private Builder() {
          // force use of static builder() method
        }

        /**
         * A developer-facing error message.
         */
        public Builder message(String message) {
            Utils.checkNotNull(message, "message");
            this.message = message;
            return this;
        }

        /**
         * The HTTP status code
         */
        public Builder statusCode(int statusCode) {
            Utils.checkNotNull(statusCode, "statusCode");
            this.statusCode = statusCode;
            return this;
        }

        public Error build() {
            return new Error(
                message,
                statusCode);
        }
    }
}
