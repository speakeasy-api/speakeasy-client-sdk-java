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


public class InsertVersionMetadataResponse implements io.github.speakeasy_sdks_staging.javaclientsdk.utils.Response {

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

    /**
     * OK
     */
    private Optional<? extends io.github.speakeasy_sdks_staging.javaclientsdk.models.shared.VersionMetadata> versionMetadata;

    @JsonCreator
    public InsertVersionMetadataResponse(
            String contentType,
            Optional<? extends io.github.speakeasy_sdks_staging.javaclientsdk.models.errors.Error> error,
            int statusCode,
            HttpResponse<InputStream> rawResponse,
            Optional<? extends io.github.speakeasy_sdks_staging.javaclientsdk.models.shared.VersionMetadata> versionMetadata) {
        Utils.checkNotNull(contentType, "contentType");
        Utils.checkNotNull(error, "error");
        Utils.checkNotNull(statusCode, "statusCode");
        Utils.checkNotNull(rawResponse, "rawResponse");
        Utils.checkNotNull(versionMetadata, "versionMetadata");
        this.contentType = contentType;
        this.error = error;
        this.statusCode = statusCode;
        this.rawResponse = rawResponse;
        this.versionMetadata = versionMetadata;
    }
    
    public InsertVersionMetadataResponse(
            String contentType,
            int statusCode,
            HttpResponse<InputStream> rawResponse) {
        this(contentType, Optional.empty(), statusCode, rawResponse, Optional.empty());
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

    /**
     * OK
     */
    @JsonIgnore
    public Optional<? extends io.github.speakeasy_sdks_staging.javaclientsdk.models.shared.VersionMetadata> versionMetadata() {
        return versionMetadata;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * HTTP response content type for this operation
     */
    public InsertVersionMetadataResponse withContentType(String contentType) {
        Utils.checkNotNull(contentType, "contentType");
        this.contentType = contentType;
        return this;
    }

    /**
     * Default error response
     */
    public InsertVersionMetadataResponse withError(io.github.speakeasy_sdks_staging.javaclientsdk.models.errors.Error error) {
        Utils.checkNotNull(error, "error");
        this.error = Optional.ofNullable(error);
        return this;
    }

    /**
     * Default error response
     */
    public InsertVersionMetadataResponse withError(Optional<? extends io.github.speakeasy_sdks_staging.javaclientsdk.models.errors.Error> error) {
        Utils.checkNotNull(error, "error");
        this.error = error;
        return this;
    }

    /**
     * HTTP response status code for this operation
     */
    public InsertVersionMetadataResponse withStatusCode(int statusCode) {
        Utils.checkNotNull(statusCode, "statusCode");
        this.statusCode = statusCode;
        return this;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    public InsertVersionMetadataResponse withRawResponse(HttpResponse<InputStream> rawResponse) {
        Utils.checkNotNull(rawResponse, "rawResponse");
        this.rawResponse = rawResponse;
        return this;
    }

    /**
     * OK
     */
    public InsertVersionMetadataResponse withVersionMetadata(io.github.speakeasy_sdks_staging.javaclientsdk.models.shared.VersionMetadata versionMetadata) {
        Utils.checkNotNull(versionMetadata, "versionMetadata");
        this.versionMetadata = Optional.ofNullable(versionMetadata);
        return this;
    }

    /**
     * OK
     */
    public InsertVersionMetadataResponse withVersionMetadata(Optional<? extends io.github.speakeasy_sdks_staging.javaclientsdk.models.shared.VersionMetadata> versionMetadata) {
        Utils.checkNotNull(versionMetadata, "versionMetadata");
        this.versionMetadata = versionMetadata;
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
        InsertVersionMetadataResponse other = (InsertVersionMetadataResponse) o;
        return 
            java.util.Objects.deepEquals(this.contentType, other.contentType) &&
            java.util.Objects.deepEquals(this.error, other.error) &&
            java.util.Objects.deepEquals(this.statusCode, other.statusCode) &&
            java.util.Objects.deepEquals(this.rawResponse, other.rawResponse) &&
            java.util.Objects.deepEquals(this.versionMetadata, other.versionMetadata);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            contentType,
            error,
            statusCode,
            rawResponse,
            versionMetadata);
    }
    
    @Override
    public String toString() {
        return Utils.toString(InsertVersionMetadataResponse.class,
                "contentType", contentType,
                "error", error,
                "statusCode", statusCode,
                "rawResponse", rawResponse,
                "versionMetadata", versionMetadata);
    }
    
    public final static class Builder {
 
        private String contentType;
 
        private Optional<? extends io.github.speakeasy_sdks_staging.javaclientsdk.models.errors.Error> error = Optional.empty();
 
        private Integer statusCode;
 
        private HttpResponse<InputStream> rawResponse;
 
        private Optional<? extends io.github.speakeasy_sdks_staging.javaclientsdk.models.shared.VersionMetadata> versionMetadata = Optional.empty();  
        
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

        /**
         * OK
         */
        public Builder versionMetadata(io.github.speakeasy_sdks_staging.javaclientsdk.models.shared.VersionMetadata versionMetadata) {
            Utils.checkNotNull(versionMetadata, "versionMetadata");
            this.versionMetadata = Optional.ofNullable(versionMetadata);
            return this;
        }

        /**
         * OK
         */
        public Builder versionMetadata(Optional<? extends io.github.speakeasy_sdks_staging.javaclientsdk.models.shared.VersionMetadata> versionMetadata) {
            Utils.checkNotNull(versionMetadata, "versionMetadata");
            this.versionMetadata = versionMetadata;
            return this;
        }
        
        public InsertVersionMetadataResponse build() {
            return new InsertVersionMetadataResponse(
                contentType,
                error,
                statusCode,
                rawResponse,
                versionMetadata);
        }
    }
}

