/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package io.github.speakeasy_sdks_staging.javaclientsdk.models.operations;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.core.type.TypeReference;
import io.github.speakeasy_sdks_staging.javaclientsdk.utils.Utils;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.http.HttpResponse;
import java.util.Optional;

public class GeneratePostmanCollectionResponse implements io.github.speakeasy_sdks_staging.javaclientsdk.utils.Response {

    /**
     * HTTP response content type for this operation
     */
    private String contentType;

    /**
     * Default error response
     */
    private Optional<? extends io.github.speakeasy_sdks_staging.javaclientsdk.models.errors.Error> error;

    /**
     * OK
     */
    private Optional<? extends InputStream> postmanCollection;

    /**
     * HTTP response status code for this operation
     */
    private int statusCode;

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    private HttpResponse<InputStream> rawResponse;

    @JsonCreator
    public GeneratePostmanCollectionResponse(
            String contentType,
            Optional<? extends io.github.speakeasy_sdks_staging.javaclientsdk.models.errors.Error> error,
            Optional<? extends InputStream> postmanCollection,
            int statusCode,
            HttpResponse<InputStream> rawResponse) {
        Utils.checkNotNull(contentType, "contentType");
        Utils.checkNotNull(error, "error");
        Utils.checkNotNull(postmanCollection, "postmanCollection");
        Utils.checkNotNull(statusCode, "statusCode");
        Utils.checkNotNull(rawResponse, "rawResponse");
        this.contentType = contentType;
        this.error = error;
        this.postmanCollection = postmanCollection;
        this.statusCode = statusCode;
        this.rawResponse = rawResponse;
    }
    
    public GeneratePostmanCollectionResponse(
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
    public Optional<io.github.speakeasy_sdks_staging.javaclientsdk.models.errors.Error> error() {
        return (Optional<io.github.speakeasy_sdks_staging.javaclientsdk.models.errors.Error>) error;
    }

    /**
     * OK
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<InputStream> postmanCollection() {
        return (Optional<InputStream>) postmanCollection;
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
    public GeneratePostmanCollectionResponse withContentType(String contentType) {
        Utils.checkNotNull(contentType, "contentType");
        this.contentType = contentType;
        return this;
    }

    /**
     * Default error response
     */
    public GeneratePostmanCollectionResponse withError(io.github.speakeasy_sdks_staging.javaclientsdk.models.errors.Error error) {
        Utils.checkNotNull(error, "error");
        this.error = Optional.ofNullable(error);
        return this;
    }

    /**
     * Default error response
     */
    public GeneratePostmanCollectionResponse withError(Optional<? extends io.github.speakeasy_sdks_staging.javaclientsdk.models.errors.Error> error) {
        Utils.checkNotNull(error, "error");
        this.error = error;
        return this;
    }

    /**
     * OK
     */
    public GeneratePostmanCollectionResponse withPostmanCollection(InputStream postmanCollection) {
        Utils.checkNotNull(postmanCollection, "postmanCollection");
        this.postmanCollection = Optional.ofNullable(postmanCollection);
        return this;
    }

    /**
     * OK
     */
    public GeneratePostmanCollectionResponse withPostmanCollection(Optional<? extends InputStream> postmanCollection) {
        Utils.checkNotNull(postmanCollection, "postmanCollection");
        this.postmanCollection = postmanCollection;
        return this;
    }

    /**
     * HTTP response status code for this operation
     */
    public GeneratePostmanCollectionResponse withStatusCode(int statusCode) {
        Utils.checkNotNull(statusCode, "statusCode");
        this.statusCode = statusCode;
        return this;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    public GeneratePostmanCollectionResponse withRawResponse(HttpResponse<InputStream> rawResponse) {
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
        GeneratePostmanCollectionResponse other = (GeneratePostmanCollectionResponse) o;
        return 
            java.util.Objects.deepEquals(this.contentType, other.contentType) &&
            java.util.Objects.deepEquals(this.error, other.error) &&
            java.util.Objects.deepEquals(this.postmanCollection, other.postmanCollection) &&
            java.util.Objects.deepEquals(this.statusCode, other.statusCode) &&
            java.util.Objects.deepEquals(this.rawResponse, other.rawResponse);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            contentType,
            error,
            postmanCollection,
            statusCode,
            rawResponse);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GeneratePostmanCollectionResponse.class,
                "contentType", contentType,
                "error", error,
                "postmanCollection", postmanCollection,
                "statusCode", statusCode,
                "rawResponse", rawResponse);
    }
    
    public final static class Builder {
 
        private String contentType;
 
        private Optional<? extends io.github.speakeasy_sdks_staging.javaclientsdk.models.errors.Error> error = Optional.empty();
 
        private Optional<? extends InputStream> postmanCollection = Optional.empty();
 
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
        public Builder error(io.github.speakeasy_sdks_staging.javaclientsdk.models.errors.Error error) {
            Utils.checkNotNull(error, "error");
            this.error = Optional.ofNullable(error);
            return this;
        }

        /**
         * Default error response
         */
        public Builder error(Optional<? extends io.github.speakeasy_sdks_staging.javaclientsdk.models.errors.Error> error) {
            Utils.checkNotNull(error, "error");
            this.error = error;
            return this;
        }

        /**
         * OK
         */
        public Builder postmanCollection(InputStream postmanCollection) {
            Utils.checkNotNull(postmanCollection, "postmanCollection");
            this.postmanCollection = Optional.ofNullable(postmanCollection);
            return this;
        }

        /**
         * OK
         */
        public Builder postmanCollection(Optional<? extends InputStream> postmanCollection) {
            Utils.checkNotNull(postmanCollection, "postmanCollection");
            this.postmanCollection = postmanCollection;
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
        
        public GeneratePostmanCollectionResponse build() {
            return new GeneratePostmanCollectionResponse(
                contentType,
                error,
                postmanCollection,
                statusCode,
                rawResponse);
        }
    }
}

