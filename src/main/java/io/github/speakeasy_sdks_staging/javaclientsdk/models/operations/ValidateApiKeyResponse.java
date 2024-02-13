/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package io.github.speakeasy_sdks_staging.javaclientsdk.models.operations;

import io.github.speakeasy_sdks_staging.javaclientsdk.utils.Utils;
import java.io.InputStream;
import java.lang.Deprecated;
import java.net.http.HttpResponse;
import java.util.Optional;


public class ValidateApiKeyResponse {

    /**
     * OK
     */
    private Optional<? extends io.github.speakeasy_sdks_staging.javaclientsdk.models.shared.ApiKeyDetails> apiKeyDetails;

    /**
     * HTTP response content type for this operation
     */
    private String contentType;

    /**
     * Default error response
     */
    private Optional<? extends io.github.speakeasy_sdks_staging.javaclientsdk.models.shared.Error> error;

    /**
     * HTTP response status code for this operation
     */
    private int statusCode;

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    private HttpResponse<InputStream> rawResponse;

    public ValidateApiKeyResponse(
            Optional<? extends io.github.speakeasy_sdks_staging.javaclientsdk.models.shared.ApiKeyDetails> apiKeyDetails,
            String contentType,
            Optional<? extends io.github.speakeasy_sdks_staging.javaclientsdk.models.shared.Error> error,
            int statusCode,
            HttpResponse<InputStream> rawResponse) {
        Utils.checkNotNull(apiKeyDetails, "apiKeyDetails");
        Utils.checkNotNull(contentType, "contentType");
        Utils.checkNotNull(error, "error");
        Utils.checkNotNull(statusCode, "statusCode");
        Utils.checkNotNull(rawResponse, "rawResponse");
        this.apiKeyDetails = apiKeyDetails;
        this.contentType = contentType;
        this.error = error;
        this.statusCode = statusCode;
        this.rawResponse = rawResponse;
    }

    /**
     * OK
     */
    public Optional<? extends io.github.speakeasy_sdks_staging.javaclientsdk.models.shared.ApiKeyDetails> apiKeyDetails() {
        return apiKeyDetails;
    }

    /**
     * HTTP response content type for this operation
     */
    public String contentType() {
        return contentType;
    }

    /**
     * Default error response
     */
    public Optional<? extends io.github.speakeasy_sdks_staging.javaclientsdk.models.shared.Error> error() {
        return error;
    }

    /**
     * HTTP response status code for this operation
     */
    public int statusCode() {
        return statusCode;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    public HttpResponse<InputStream> rawResponse() {
        return rawResponse;
    }
    
    public final static Builder builder() {
        return new Builder();
    }

    /**
     * OK
     */
    public ValidateApiKeyResponse withApiKeyDetails(io.github.speakeasy_sdks_staging.javaclientsdk.models.shared.ApiKeyDetails apiKeyDetails) {
        Utils.checkNotNull(apiKeyDetails, "apiKeyDetails");
        this.apiKeyDetails = Optional.ofNullable(apiKeyDetails);
        return this;
    }
    
    /**
     * OK
     */
    public ValidateApiKeyResponse withApiKeyDetails(Optional<? extends io.github.speakeasy_sdks_staging.javaclientsdk.models.shared.ApiKeyDetails> apiKeyDetails) {
        Utils.checkNotNull(apiKeyDetails, "apiKeyDetails");
        this.apiKeyDetails = apiKeyDetails;
        return this;
    }

    /**
     * HTTP response content type for this operation
     */
    public ValidateApiKeyResponse withContentType(String contentType) {
        Utils.checkNotNull(contentType, "contentType");
        this.contentType = contentType;
        return this;
    }

    /**
     * Default error response
     */
    public ValidateApiKeyResponse withError(io.github.speakeasy_sdks_staging.javaclientsdk.models.shared.Error error) {
        Utils.checkNotNull(error, "error");
        this.error = Optional.ofNullable(error);
        return this;
    }
    
    /**
     * Default error response
     */
    public ValidateApiKeyResponse withError(Optional<? extends io.github.speakeasy_sdks_staging.javaclientsdk.models.shared.Error> error) {
        Utils.checkNotNull(error, "error");
        this.error = error;
        return this;
    }

    /**
     * HTTP response status code for this operation
     */
    public ValidateApiKeyResponse withStatusCode(int statusCode) {
        Utils.checkNotNull(statusCode, "statusCode");
        this.statusCode = statusCode;
        return this;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    public ValidateApiKeyResponse withRawResponse(HttpResponse<InputStream> rawResponse) {
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
        ValidateApiKeyResponse other = (ValidateApiKeyResponse) o;
        return 
            java.util.Objects.deepEquals(this.apiKeyDetails, other.apiKeyDetails) &&
            java.util.Objects.deepEquals(this.contentType, other.contentType) &&
            java.util.Objects.deepEquals(this.error, other.error) &&
            java.util.Objects.deepEquals(this.statusCode, other.statusCode) &&
            java.util.Objects.deepEquals(this.rawResponse, other.rawResponse);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            apiKeyDetails,
            contentType,
            error,
            statusCode,
            rawResponse);
    }
    
    @Override
    public String toString() {
        return Utils.toString(ValidateApiKeyResponse.class,
                "apiKeyDetails", apiKeyDetails,
                "contentType", contentType,
                "error", error,
                "statusCode", statusCode,
                "rawResponse", rawResponse);
    }
    
    public final static class Builder {
 
        private Optional<? extends io.github.speakeasy_sdks_staging.javaclientsdk.models.shared.ApiKeyDetails> apiKeyDetails = Optional.empty();
 
        private String contentType;
 
        private Optional<? extends io.github.speakeasy_sdks_staging.javaclientsdk.models.shared.Error> error = Optional.empty();
 
        private Integer statusCode;
 
        private HttpResponse<InputStream> rawResponse;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * OK
         */
        public Builder apiKeyDetails(io.github.speakeasy_sdks_staging.javaclientsdk.models.shared.ApiKeyDetails apiKeyDetails) {
            Utils.checkNotNull(apiKeyDetails, "apiKeyDetails");
            this.apiKeyDetails = Optional.ofNullable(apiKeyDetails);
            return this;
        }
        
        /**
         * OK
         */
        public Builder apiKeyDetails(Optional<? extends io.github.speakeasy_sdks_staging.javaclientsdk.models.shared.ApiKeyDetails> apiKeyDetails) {
            Utils.checkNotNull(apiKeyDetails, "apiKeyDetails");
            this.apiKeyDetails = apiKeyDetails;
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
        public Builder error(io.github.speakeasy_sdks_staging.javaclientsdk.models.shared.Error error) {
            Utils.checkNotNull(error, "error");
            this.error = Optional.ofNullable(error);
            return this;
        }
        
        /**
         * Default error response
         */
        public Builder error(Optional<? extends io.github.speakeasy_sdks_staging.javaclientsdk.models.shared.Error> error) {
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
        
        public ValidateApiKeyResponse build() {
            return new ValidateApiKeyResponse(
                apiKeyDetails,
                contentType,
                error,
                statusCode,
                rawResponse);
        }
    }
}
