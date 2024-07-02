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

public class FetchPublishingPRsResponse implements io.github.speakeasy_sdks_staging.javaclientsdk.utils.Response {

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
    private Optional<? extends io.github.speakeasy_sdks_staging.javaclientsdk.models.shared.GithubPublishingPRResponse> githubPublishingPRResponse;

    /**
     * HTTP response status code for this operation
     */
    private int statusCode;

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    private HttpResponse<InputStream> rawResponse;

    @JsonCreator
    public FetchPublishingPRsResponse(
            String contentType,
            Optional<? extends io.github.speakeasy_sdks_staging.javaclientsdk.models.errors.Error> error,
            Optional<? extends io.github.speakeasy_sdks_staging.javaclientsdk.models.shared.GithubPublishingPRResponse> githubPublishingPRResponse,
            int statusCode,
            HttpResponse<InputStream> rawResponse) {
        Utils.checkNotNull(contentType, "contentType");
        Utils.checkNotNull(error, "error");
        Utils.checkNotNull(githubPublishingPRResponse, "githubPublishingPRResponse");
        Utils.checkNotNull(statusCode, "statusCode");
        Utils.checkNotNull(rawResponse, "rawResponse");
        this.contentType = contentType;
        this.error = error;
        this.githubPublishingPRResponse = githubPublishingPRResponse;
        this.statusCode = statusCode;
        this.rawResponse = rawResponse;
    }
    
    public FetchPublishingPRsResponse(
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
    public Optional<io.github.speakeasy_sdks_staging.javaclientsdk.models.shared.GithubPublishingPRResponse> githubPublishingPRResponse() {
        return (Optional<io.github.speakeasy_sdks_staging.javaclientsdk.models.shared.GithubPublishingPRResponse>) githubPublishingPRResponse;
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
    public FetchPublishingPRsResponse withContentType(String contentType) {
        Utils.checkNotNull(contentType, "contentType");
        this.contentType = contentType;
        return this;
    }

    /**
     * Default error response
     */
    public FetchPublishingPRsResponse withError(io.github.speakeasy_sdks_staging.javaclientsdk.models.errors.Error error) {
        Utils.checkNotNull(error, "error");
        this.error = Optional.ofNullable(error);
        return this;
    }

    /**
     * Default error response
     */
    public FetchPublishingPRsResponse withError(Optional<? extends io.github.speakeasy_sdks_staging.javaclientsdk.models.errors.Error> error) {
        Utils.checkNotNull(error, "error");
        this.error = error;
        return this;
    }

    /**
     * OK
     */
    public FetchPublishingPRsResponse withGithubPublishingPRResponse(io.github.speakeasy_sdks_staging.javaclientsdk.models.shared.GithubPublishingPRResponse githubPublishingPRResponse) {
        Utils.checkNotNull(githubPublishingPRResponse, "githubPublishingPRResponse");
        this.githubPublishingPRResponse = Optional.ofNullable(githubPublishingPRResponse);
        return this;
    }

    /**
     * OK
     */
    public FetchPublishingPRsResponse withGithubPublishingPRResponse(Optional<? extends io.github.speakeasy_sdks_staging.javaclientsdk.models.shared.GithubPublishingPRResponse> githubPublishingPRResponse) {
        Utils.checkNotNull(githubPublishingPRResponse, "githubPublishingPRResponse");
        this.githubPublishingPRResponse = githubPublishingPRResponse;
        return this;
    }

    /**
     * HTTP response status code for this operation
     */
    public FetchPublishingPRsResponse withStatusCode(int statusCode) {
        Utils.checkNotNull(statusCode, "statusCode");
        this.statusCode = statusCode;
        return this;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    public FetchPublishingPRsResponse withRawResponse(HttpResponse<InputStream> rawResponse) {
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
        FetchPublishingPRsResponse other = (FetchPublishingPRsResponse) o;
        return 
            java.util.Objects.deepEquals(this.contentType, other.contentType) &&
            java.util.Objects.deepEquals(this.error, other.error) &&
            java.util.Objects.deepEquals(this.githubPublishingPRResponse, other.githubPublishingPRResponse) &&
            java.util.Objects.deepEquals(this.statusCode, other.statusCode) &&
            java.util.Objects.deepEquals(this.rawResponse, other.rawResponse);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            contentType,
            error,
            githubPublishingPRResponse,
            statusCode,
            rawResponse);
    }
    
    @Override
    public String toString() {
        return Utils.toString(FetchPublishingPRsResponse.class,
                "contentType", contentType,
                "error", error,
                "githubPublishingPRResponse", githubPublishingPRResponse,
                "statusCode", statusCode,
                "rawResponse", rawResponse);
    }
    
    public final static class Builder {
 
        private String contentType;
 
        private Optional<? extends io.github.speakeasy_sdks_staging.javaclientsdk.models.errors.Error> error = Optional.empty();
 
        private Optional<? extends io.github.speakeasy_sdks_staging.javaclientsdk.models.shared.GithubPublishingPRResponse> githubPublishingPRResponse = Optional.empty();
 
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
        public Builder githubPublishingPRResponse(io.github.speakeasy_sdks_staging.javaclientsdk.models.shared.GithubPublishingPRResponse githubPublishingPRResponse) {
            Utils.checkNotNull(githubPublishingPRResponse, "githubPublishingPRResponse");
            this.githubPublishingPRResponse = Optional.ofNullable(githubPublishingPRResponse);
            return this;
        }

        /**
         * OK
         */
        public Builder githubPublishingPRResponse(Optional<? extends io.github.speakeasy_sdks_staging.javaclientsdk.models.shared.GithubPublishingPRResponse> githubPublishingPRResponse) {
            Utils.checkNotNull(githubPublishingPRResponse, "githubPublishingPRResponse");
            this.githubPublishingPRResponse = githubPublishingPRResponse;
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
        
        public FetchPublishingPRsResponse build() {
            return new FetchPublishingPRsResponse(
                contentType,
                error,
                githubPublishingPRResponse,
                statusCode,
                rawResponse);
        }
    }
}

