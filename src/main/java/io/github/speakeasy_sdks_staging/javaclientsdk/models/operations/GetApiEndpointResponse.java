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

public class GetApiEndpointResponse implements io.github.speakeasy_sdks_staging.javaclientsdk.utils.Response {

    /**
     * OK
     */
    private Optional<? extends io.github.speakeasy_sdks_staging.javaclientsdk.models.shared.ApiEndpoint> apiEndpoint;

    /**
     * HTTP response content type for this operation
     */
    private String contentType;

    /**
     * Default error response
     */
    private Optional<? extends io.github.speakeasy_sdks_staging.javaclientsdk.models.errors.Error> error;

    /**
     * HTTP response status code for this operation
     */
    private int statusCode;

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    private HttpResponse<InputStream> rawResponse;

    @JsonCreator
    public GetApiEndpointResponse(
            Optional<? extends io.github.speakeasy_sdks_staging.javaclientsdk.models.shared.ApiEndpoint> apiEndpoint,
            String contentType,
            Optional<? extends io.github.speakeasy_sdks_staging.javaclientsdk.models.errors.Error> error,
            int statusCode,
            HttpResponse<InputStream> rawResponse) {
        Utils.checkNotNull(apiEndpoint, "apiEndpoint");
        Utils.checkNotNull(contentType, "contentType");
        Utils.checkNotNull(error, "error");
        Utils.checkNotNull(statusCode, "statusCode");
        Utils.checkNotNull(rawResponse, "rawResponse");
        this.apiEndpoint = apiEndpoint;
        this.contentType = contentType;
        this.error = error;
        this.statusCode = statusCode;
        this.rawResponse = rawResponse;
    }
    
    public GetApiEndpointResponse(
            String contentType,
            int statusCode,
            HttpResponse<InputStream> rawResponse) {
        this(Optional.empty(), contentType, Optional.empty(), statusCode, rawResponse);
    }

    /**
     * OK
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<io.github.speakeasy_sdks_staging.javaclientsdk.models.shared.ApiEndpoint> apiEndpoint() {
        return (Optional<io.github.speakeasy_sdks_staging.javaclientsdk.models.shared.ApiEndpoint>) apiEndpoint;
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
     * OK
     */
    public GetApiEndpointResponse withApiEndpoint(io.github.speakeasy_sdks_staging.javaclientsdk.models.shared.ApiEndpoint apiEndpoint) {
        Utils.checkNotNull(apiEndpoint, "apiEndpoint");
        this.apiEndpoint = Optional.ofNullable(apiEndpoint);
        return this;
    }

    /**
     * OK
     */
    public GetApiEndpointResponse withApiEndpoint(Optional<? extends io.github.speakeasy_sdks_staging.javaclientsdk.models.shared.ApiEndpoint> apiEndpoint) {
        Utils.checkNotNull(apiEndpoint, "apiEndpoint");
        this.apiEndpoint = apiEndpoint;
        return this;
    }

    /**
     * HTTP response content type for this operation
     */
    public GetApiEndpointResponse withContentType(String contentType) {
        Utils.checkNotNull(contentType, "contentType");
        this.contentType = contentType;
        return this;
    }

    /**
     * Default error response
     */
    public GetApiEndpointResponse withError(io.github.speakeasy_sdks_staging.javaclientsdk.models.errors.Error error) {
        Utils.checkNotNull(error, "error");
        this.error = Optional.ofNullable(error);
        return this;
    }

    /**
     * Default error response
     */
    public GetApiEndpointResponse withError(Optional<? extends io.github.speakeasy_sdks_staging.javaclientsdk.models.errors.Error> error) {
        Utils.checkNotNull(error, "error");
        this.error = error;
        return this;
    }

    /**
     * HTTP response status code for this operation
     */
    public GetApiEndpointResponse withStatusCode(int statusCode) {
        Utils.checkNotNull(statusCode, "statusCode");
        this.statusCode = statusCode;
        return this;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    public GetApiEndpointResponse withRawResponse(HttpResponse<InputStream> rawResponse) {
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
        GetApiEndpointResponse other = (GetApiEndpointResponse) o;
        return 
            java.util.Objects.deepEquals(this.apiEndpoint, other.apiEndpoint) &&
            java.util.Objects.deepEquals(this.contentType, other.contentType) &&
            java.util.Objects.deepEquals(this.error, other.error) &&
            java.util.Objects.deepEquals(this.statusCode, other.statusCode) &&
            java.util.Objects.deepEquals(this.rawResponse, other.rawResponse);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            apiEndpoint,
            contentType,
            error,
            statusCode,
            rawResponse);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetApiEndpointResponse.class,
                "apiEndpoint", apiEndpoint,
                "contentType", contentType,
                "error", error,
                "statusCode", statusCode,
                "rawResponse", rawResponse);
    }
    
    public final static class Builder {
 
        private Optional<? extends io.github.speakeasy_sdks_staging.javaclientsdk.models.shared.ApiEndpoint> apiEndpoint = Optional.empty();
 
        private String contentType;
 
        private Optional<? extends io.github.speakeasy_sdks_staging.javaclientsdk.models.errors.Error> error = Optional.empty();
 
        private Integer statusCode;
 
        private HttpResponse<InputStream> rawResponse;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * OK
         */
        public Builder apiEndpoint(io.github.speakeasy_sdks_staging.javaclientsdk.models.shared.ApiEndpoint apiEndpoint) {
            Utils.checkNotNull(apiEndpoint, "apiEndpoint");
            this.apiEndpoint = Optional.ofNullable(apiEndpoint);
            return this;
        }

        /**
         * OK
         */
        public Builder apiEndpoint(Optional<? extends io.github.speakeasy_sdks_staging.javaclientsdk.models.shared.ApiEndpoint> apiEndpoint) {
            Utils.checkNotNull(apiEndpoint, "apiEndpoint");
            this.apiEndpoint = apiEndpoint;
            return this;
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
        
        public GetApiEndpointResponse build() {
            return new GetApiEndpointResponse(
                apiEndpoint,
                contentType,
                error,
                statusCode,
                rawResponse);
        }
    }
}

