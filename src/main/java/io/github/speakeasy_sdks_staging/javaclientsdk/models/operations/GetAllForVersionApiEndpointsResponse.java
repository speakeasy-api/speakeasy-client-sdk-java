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


public class GetAllForVersionApiEndpointsResponse implements io.github.speakeasy_sdks_staging.javaclientsdk.utils.Response {

    /**
     * OK
     */
    private Optional<? extends java.util.List<io.github.speakeasy_sdks_staging.javaclientsdk.models.shared.ApiEndpoint>> apiEndpoints;

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
    public GetAllForVersionApiEndpointsResponse(
            Optional<? extends java.util.List<io.github.speakeasy_sdks_staging.javaclientsdk.models.shared.ApiEndpoint>> apiEndpoints,
            String contentType,
            Optional<? extends io.github.speakeasy_sdks_staging.javaclientsdk.models.errors.Error> error,
            int statusCode,
            HttpResponse<InputStream> rawResponse) {
        Utils.checkNotNull(apiEndpoints, "apiEndpoints");
        Utils.checkNotNull(contentType, "contentType");
        Utils.checkNotNull(error, "error");
        Utils.checkNotNull(statusCode, "statusCode");
        Utils.checkNotNull(rawResponse, "rawResponse");
        this.apiEndpoints = apiEndpoints;
        this.contentType = contentType;
        this.error = error;
        this.statusCode = statusCode;
        this.rawResponse = rawResponse;
    }
    
    public GetAllForVersionApiEndpointsResponse(
            String contentType,
            int statusCode,
            HttpResponse<InputStream> rawResponse) {
        this(Optional.empty(), contentType, Optional.empty(), statusCode, rawResponse);
    }

    /**
     * OK
     */
    @JsonIgnore
    public Optional<? extends java.util.List<io.github.speakeasy_sdks_staging.javaclientsdk.models.shared.ApiEndpoint>> apiEndpoints() {
        return apiEndpoints;
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
    @JsonIgnore
    public Optional<? extends io.github.speakeasy_sdks_staging.javaclientsdk.models.errors.Error> error() {
        return error;
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
    public GetAllForVersionApiEndpointsResponse withAPIEndpoints(java.util.List<io.github.speakeasy_sdks_staging.javaclientsdk.models.shared.ApiEndpoint> apiEndpoints) {
        Utils.checkNotNull(apiEndpoints, "apiEndpoints");
        this.apiEndpoints = Optional.ofNullable(apiEndpoints);
        return this;
    }

    /**
     * OK
     */
    public GetAllForVersionApiEndpointsResponse withAPIEndpoints(Optional<? extends java.util.List<io.github.speakeasy_sdks_staging.javaclientsdk.models.shared.ApiEndpoint>> apiEndpoints) {
        Utils.checkNotNull(apiEndpoints, "apiEndpoints");
        this.apiEndpoints = apiEndpoints;
        return this;
    }

    /**
     * HTTP response content type for this operation
     */
    public GetAllForVersionApiEndpointsResponse withContentType(String contentType) {
        Utils.checkNotNull(contentType, "contentType");
        this.contentType = contentType;
        return this;
    }

    /**
     * Default error response
     */
    public GetAllForVersionApiEndpointsResponse withError(io.github.speakeasy_sdks_staging.javaclientsdk.models.errors.Error error) {
        Utils.checkNotNull(error, "error");
        this.error = Optional.ofNullable(error);
        return this;
    }

    /**
     * Default error response
     */
    public GetAllForVersionApiEndpointsResponse withError(Optional<? extends io.github.speakeasy_sdks_staging.javaclientsdk.models.errors.Error> error) {
        Utils.checkNotNull(error, "error");
        this.error = error;
        return this;
    }

    /**
     * HTTP response status code for this operation
     */
    public GetAllForVersionApiEndpointsResponse withStatusCode(int statusCode) {
        Utils.checkNotNull(statusCode, "statusCode");
        this.statusCode = statusCode;
        return this;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    public GetAllForVersionApiEndpointsResponse withRawResponse(HttpResponse<InputStream> rawResponse) {
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
        GetAllForVersionApiEndpointsResponse other = (GetAllForVersionApiEndpointsResponse) o;
        return 
            java.util.Objects.deepEquals(this.apiEndpoints, other.apiEndpoints) &&
            java.util.Objects.deepEquals(this.contentType, other.contentType) &&
            java.util.Objects.deepEquals(this.error, other.error) &&
            java.util.Objects.deepEquals(this.statusCode, other.statusCode) &&
            java.util.Objects.deepEquals(this.rawResponse, other.rawResponse);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            apiEndpoints,
            contentType,
            error,
            statusCode,
            rawResponse);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetAllForVersionApiEndpointsResponse.class,
                "apiEndpoints", apiEndpoints,
                "contentType", contentType,
                "error", error,
                "statusCode", statusCode,
                "rawResponse", rawResponse);
    }
    
    public final static class Builder {
 
        private Optional<? extends java.util.List<io.github.speakeasy_sdks_staging.javaclientsdk.models.shared.ApiEndpoint>> apiEndpoints = Optional.empty();
 
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
        public Builder apiEndpoints(java.util.List<io.github.speakeasy_sdks_staging.javaclientsdk.models.shared.ApiEndpoint> apiEndpoints) {
            Utils.checkNotNull(apiEndpoints, "apiEndpoints");
            this.apiEndpoints = Optional.ofNullable(apiEndpoints);
            return this;
        }

        /**
         * OK
         */
        public Builder apiEndpoints(Optional<? extends java.util.List<io.github.speakeasy_sdks_staging.javaclientsdk.models.shared.ApiEndpoint>> apiEndpoints) {
            Utils.checkNotNull(apiEndpoints, "apiEndpoints");
            this.apiEndpoints = apiEndpoints;
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
        
        public GetAllForVersionApiEndpointsResponse build() {
            return new GetAllForVersionApiEndpointsResponse(
                apiEndpoints,
                contentType,
                error,
                statusCode,
                rawResponse);
        }
    }
}

