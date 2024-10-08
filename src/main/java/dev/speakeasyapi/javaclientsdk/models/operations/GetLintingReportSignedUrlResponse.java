/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package dev.speakeasyapi.javaclientsdk.models.operations;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
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


public class GetLintingReportSignedUrlResponse implements Response {

    /**
     * HTTP response content type for this operation
     */
    private String contentType;

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
    private Optional<? extends GetLintingReportSignedUrlSignedAccess> signedAccess;

    @JsonCreator
    public GetLintingReportSignedUrlResponse(
            String contentType,
            int statusCode,
            HttpResponse<InputStream> rawResponse,
            Optional<? extends GetLintingReportSignedUrlSignedAccess> signedAccess) {
        Utils.checkNotNull(contentType, "contentType");
        Utils.checkNotNull(statusCode, "statusCode");
        Utils.checkNotNull(rawResponse, "rawResponse");
        Utils.checkNotNull(signedAccess, "signedAccess");
        this.contentType = contentType;
        this.statusCode = statusCode;
        this.rawResponse = rawResponse;
        this.signedAccess = signedAccess;
    }
    
    public GetLintingReportSignedUrlResponse(
            String contentType,
            int statusCode,
            HttpResponse<InputStream> rawResponse) {
        this(contentType, statusCode, rawResponse, Optional.empty());
    }

    /**
     * HTTP response content type for this operation
     */
    @JsonIgnore
    public String contentType() {
        return contentType;
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
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<GetLintingReportSignedUrlSignedAccess> signedAccess() {
        return (Optional<GetLintingReportSignedUrlSignedAccess>) signedAccess;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * HTTP response content type for this operation
     */
    public GetLintingReportSignedUrlResponse withContentType(String contentType) {
        Utils.checkNotNull(contentType, "contentType");
        this.contentType = contentType;
        return this;
    }

    /**
     * HTTP response status code for this operation
     */
    public GetLintingReportSignedUrlResponse withStatusCode(int statusCode) {
        Utils.checkNotNull(statusCode, "statusCode");
        this.statusCode = statusCode;
        return this;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    public GetLintingReportSignedUrlResponse withRawResponse(HttpResponse<InputStream> rawResponse) {
        Utils.checkNotNull(rawResponse, "rawResponse");
        this.rawResponse = rawResponse;
        return this;
    }

    /**
     * OK
     */
    public GetLintingReportSignedUrlResponse withSignedAccess(GetLintingReportSignedUrlSignedAccess signedAccess) {
        Utils.checkNotNull(signedAccess, "signedAccess");
        this.signedAccess = Optional.ofNullable(signedAccess);
        return this;
    }

    /**
     * OK
     */
    public GetLintingReportSignedUrlResponse withSignedAccess(Optional<? extends GetLintingReportSignedUrlSignedAccess> signedAccess) {
        Utils.checkNotNull(signedAccess, "signedAccess");
        this.signedAccess = signedAccess;
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
        GetLintingReportSignedUrlResponse other = (GetLintingReportSignedUrlResponse) o;
        return 
            Objects.deepEquals(this.contentType, other.contentType) &&
            Objects.deepEquals(this.statusCode, other.statusCode) &&
            Objects.deepEquals(this.rawResponse, other.rawResponse) &&
            Objects.deepEquals(this.signedAccess, other.signedAccess);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            contentType,
            statusCode,
            rawResponse,
            signedAccess);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetLintingReportSignedUrlResponse.class,
                "contentType", contentType,
                "statusCode", statusCode,
                "rawResponse", rawResponse,
                "signedAccess", signedAccess);
    }
    
    public final static class Builder {
 
        private String contentType;
 
        private Integer statusCode;
 
        private HttpResponse<InputStream> rawResponse;
 
        private Optional<? extends GetLintingReportSignedUrlSignedAccess> signedAccess = Optional.empty();  
        
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
        public Builder signedAccess(GetLintingReportSignedUrlSignedAccess signedAccess) {
            Utils.checkNotNull(signedAccess, "signedAccess");
            this.signedAccess = Optional.ofNullable(signedAccess);
            return this;
        }

        /**
         * OK
         */
        public Builder signedAccess(Optional<? extends GetLintingReportSignedUrlSignedAccess> signedAccess) {
            Utils.checkNotNull(signedAccess, "signedAccess");
            this.signedAccess = signedAccess;
            return this;
        }
        
        public GetLintingReportSignedUrlResponse build() {
            return new GetLintingReportSignedUrlResponse(
                contentType,
                statusCode,
                rawResponse,
                signedAccess);
        }
    }
}

