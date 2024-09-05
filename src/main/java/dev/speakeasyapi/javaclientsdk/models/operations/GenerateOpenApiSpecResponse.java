/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package dev.speakeasyapi.javaclientsdk.models.operations;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import dev.speakeasyapi.javaclientsdk.models.errors.Error;
import dev.speakeasyapi.javaclientsdk.models.shared.GenerateOpenApiSpecDiff;
import dev.speakeasyapi.javaclientsdk.utils.Response;
import dev.speakeasyapi.javaclientsdk.utils.Utils;
import java.io.InputStream;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.net.http.HttpResponse;
import java.util.Objects;
import java.util.Optional;


public class GenerateOpenApiSpecResponse implements Response {

    /**
     * HTTP response content type for this operation
     */
    private String contentType;

    /**
     * Default error response
     */
    private Optional<? extends Error> error;

    /**
     * OK
     */
    private Optional<? extends GenerateOpenApiSpecDiff> generateOpenApiSpecDiff;

    /**
     * HTTP response status code for this operation
     */
    private int statusCode;

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    private HttpResponse<InputStream> rawResponse;

    @JsonCreator
    public GenerateOpenApiSpecResponse(
            String contentType,
            Optional<? extends Error> error,
            Optional<? extends GenerateOpenApiSpecDiff> generateOpenApiSpecDiff,
            int statusCode,
            HttpResponse<InputStream> rawResponse) {
        Utils.checkNotNull(contentType, "contentType");
        Utils.checkNotNull(error, "error");
        Utils.checkNotNull(generateOpenApiSpecDiff, "generateOpenApiSpecDiff");
        Utils.checkNotNull(statusCode, "statusCode");
        Utils.checkNotNull(rawResponse, "rawResponse");
        this.contentType = contentType;
        this.error = error;
        this.generateOpenApiSpecDiff = generateOpenApiSpecDiff;
        this.statusCode = statusCode;
        this.rawResponse = rawResponse;
    }
    
    public GenerateOpenApiSpecResponse(
            String contentType,
            int statusCode,
            HttpResponse<InputStream> rawResponse) {
        this(contentType, Optional.empty(), Optional.empty(), statusCode, rawResponse);
    }

    /**
     * HTTP response content type for this operation
     */
    @JsonIgnore
    public String contentType() {
        return contentType;
    }

    /**
     * Default error response
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Error> error() {
        return (Optional<Error>) error;
    }

    /**
     * OK
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<GenerateOpenApiSpecDiff> generateOpenApiSpecDiff() {
        return (Optional<GenerateOpenApiSpecDiff>) generateOpenApiSpecDiff;
    }

    /**
     * HTTP response status code for this operation
     */
    @JsonIgnore
    public int statusCode() {
        return statusCode;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    @JsonIgnore
    public HttpResponse<InputStream> rawResponse() {
        return rawResponse;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * HTTP response content type for this operation
     */
    public GenerateOpenApiSpecResponse withContentType(String contentType) {
        Utils.checkNotNull(contentType, "contentType");
        this.contentType = contentType;
        return this;
    }

    /**
     * Default error response
     */
    public GenerateOpenApiSpecResponse withError(Error error) {
        Utils.checkNotNull(error, "error");
        this.error = Optional.ofNullable(error);
        return this;
    }

    /**
     * Default error response
     */
    public GenerateOpenApiSpecResponse withError(Optional<? extends Error> error) {
        Utils.checkNotNull(error, "error");
        this.error = error;
        return this;
    }

    /**
     * OK
     */
    public GenerateOpenApiSpecResponse withGenerateOpenApiSpecDiff(GenerateOpenApiSpecDiff generateOpenApiSpecDiff) {
        Utils.checkNotNull(generateOpenApiSpecDiff, "generateOpenApiSpecDiff");
        this.generateOpenApiSpecDiff = Optional.ofNullable(generateOpenApiSpecDiff);
        return this;
    }

    /**
     * OK
     */
    public GenerateOpenApiSpecResponse withGenerateOpenApiSpecDiff(Optional<? extends GenerateOpenApiSpecDiff> generateOpenApiSpecDiff) {
        Utils.checkNotNull(generateOpenApiSpecDiff, "generateOpenApiSpecDiff");
        this.generateOpenApiSpecDiff = generateOpenApiSpecDiff;
        return this;
    }

    /**
     * HTTP response status code for this operation
     */
    public GenerateOpenApiSpecResponse withStatusCode(int statusCode) {
        Utils.checkNotNull(statusCode, "statusCode");
        this.statusCode = statusCode;
        return this;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    public GenerateOpenApiSpecResponse withRawResponse(HttpResponse<InputStream> rawResponse) {
        Utils.checkNotNull(rawResponse, "rawResponse");
        this.rawResponse = rawResponse;
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
        GenerateOpenApiSpecResponse other = (GenerateOpenApiSpecResponse) o;
        return 
            Objects.deepEquals(this.contentType, other.contentType) &&
            Objects.deepEquals(this.error, other.error) &&
            Objects.deepEquals(this.generateOpenApiSpecDiff, other.generateOpenApiSpecDiff) &&
            Objects.deepEquals(this.statusCode, other.statusCode) &&
            Objects.deepEquals(this.rawResponse, other.rawResponse);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            contentType,
            error,
            generateOpenApiSpecDiff,
            statusCode,
            rawResponse);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GenerateOpenApiSpecResponse.class,
                "contentType", contentType,
                "error", error,
                "generateOpenApiSpecDiff", generateOpenApiSpecDiff,
                "statusCode", statusCode,
                "rawResponse", rawResponse);
    }
    
    public final static class Builder {
 
        private String contentType;
 
        private Optional<? extends Error> error = Optional.empty();
 
        private Optional<? extends GenerateOpenApiSpecDiff> generateOpenApiSpecDiff = Optional.empty();
 
        private Integer statusCode;
 
        private HttpResponse<InputStream> rawResponse;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * HTTP response content type for this operation
         */
        public Builder contentType(String contentType) {
            Utils.checkNotNull(contentType, "contentType");
            this.contentType = contentType;
            return this;
        }

        /**
         * Default error response
         */
        public Builder error(Error error) {
            Utils.checkNotNull(error, "error");
            this.error = Optional.ofNullable(error);
            return this;
        }

        /**
         * Default error response
         */
        public Builder error(Optional<? extends Error> error) {
            Utils.checkNotNull(error, "error");
            this.error = error;
            return this;
        }

        /**
         * OK
         */
        public Builder generateOpenApiSpecDiff(GenerateOpenApiSpecDiff generateOpenApiSpecDiff) {
            Utils.checkNotNull(generateOpenApiSpecDiff, "generateOpenApiSpecDiff");
            this.generateOpenApiSpecDiff = Optional.ofNullable(generateOpenApiSpecDiff);
            return this;
        }

        /**
         * OK
         */
        public Builder generateOpenApiSpecDiff(Optional<? extends GenerateOpenApiSpecDiff> generateOpenApiSpecDiff) {
            Utils.checkNotNull(generateOpenApiSpecDiff, "generateOpenApiSpecDiff");
            this.generateOpenApiSpecDiff = generateOpenApiSpecDiff;
            return this;
        }

        /**
         * HTTP response status code for this operation
         */
        public Builder statusCode(int statusCode) {
            Utils.checkNotNull(statusCode, "statusCode");
            this.statusCode = statusCode;
            return this;
        }

        /**
         * Raw HTTP response; suitable for custom response parsing
         */
        public Builder rawResponse(HttpResponse<InputStream> rawResponse) {
            Utils.checkNotNull(rawResponse, "rawResponse");
            this.rawResponse = rawResponse;
            return this;
        }
        
        public GenerateOpenApiSpecResponse build() {
            return new GenerateOpenApiSpecResponse(
                contentType,
                error,
                generateOpenApiSpecDiff,
                statusCode,
                rawResponse);
        }
    }
}

