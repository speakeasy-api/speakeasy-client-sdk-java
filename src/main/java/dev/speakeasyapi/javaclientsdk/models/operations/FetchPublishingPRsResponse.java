/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package dev.speakeasyapi.javaclientsdk.models.operations;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import dev.speakeasyapi.javaclientsdk.models.errors.Error;
import dev.speakeasyapi.javaclientsdk.models.shared.GithubPublishingPRResponse;
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


public class FetchPublishingPRsResponse implements Response {

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
    private Optional<? extends GithubPublishingPRResponse> githubPublishingPRResponse;

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
            Optional<? extends Error> error,
            Optional<? extends GithubPublishingPRResponse> githubPublishingPRResponse,
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
    public Optional<Error> error() {
        return (Optional<Error>) error;
    }

    /**
     * OK
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<GithubPublishingPRResponse> githubPublishingPRResponse() {
        return (Optional<GithubPublishingPRResponse>) githubPublishingPRResponse;
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
    public FetchPublishingPRsResponse withError(Error error) {
        Utils.checkNotNull(error, "error");
        this.error = Optional.ofNullable(error);
        return this;
    }

    /**
     * Default error response
     */
    public FetchPublishingPRsResponse withError(Optional<? extends Error> error) {
        Utils.checkNotNull(error, "error");
        this.error = error;
        return this;
    }

    /**
     * OK
     */
    public FetchPublishingPRsResponse withGithubPublishingPRResponse(GithubPublishingPRResponse githubPublishingPRResponse) {
        Utils.checkNotNull(githubPublishingPRResponse, "githubPublishingPRResponse");
        this.githubPublishingPRResponse = Optional.ofNullable(githubPublishingPRResponse);
        return this;
    }

    /**
     * OK
     */
    public FetchPublishingPRsResponse withGithubPublishingPRResponse(Optional<? extends GithubPublishingPRResponse> githubPublishingPRResponse) {
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
            Objects.deepEquals(this.contentType, other.contentType) &&
            Objects.deepEquals(this.error, other.error) &&
            Objects.deepEquals(this.githubPublishingPRResponse, other.githubPublishingPRResponse) &&
            Objects.deepEquals(this.statusCode, other.statusCode) &&
            Objects.deepEquals(this.rawResponse, other.rawResponse);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
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
 
        private Optional<? extends Error> error = Optional.empty();
 
        private Optional<? extends GithubPublishingPRResponse> githubPublishingPRResponse = Optional.empty();
 
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
        public Builder githubPublishingPRResponse(GithubPublishingPRResponse githubPublishingPRResponse) {
            Utils.checkNotNull(githubPublishingPRResponse, "githubPublishingPRResponse");
            this.githubPublishingPRResponse = Optional.ofNullable(githubPublishingPRResponse);
            return this;
        }

        /**
         * OK
         */
        public Builder githubPublishingPRResponse(Optional<? extends GithubPublishingPRResponse> githubPublishingPRResponse) {
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
