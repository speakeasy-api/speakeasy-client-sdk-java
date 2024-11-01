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


public class GenerateRequestPostmanCollectionResponse implements Response {

    /**
     * HTTP response content type for this operation
     */
    private String contentType;

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
    public GenerateRequestPostmanCollectionResponse(
            String contentType,
            Optional<? extends InputStream> postmanCollection,
            int statusCode,
            HttpResponse<InputStream> rawResponse) {
        Utils.checkNotNull(contentType, "contentType");
        Utils.checkNotNull(postmanCollection, "postmanCollection");
        Utils.checkNotNull(statusCode, "statusCode");
        Utils.checkNotNull(rawResponse, "rawResponse");
        this.contentType = contentType;
        this.postmanCollection = postmanCollection;
        this.statusCode = statusCode;
        this.rawResponse = rawResponse;
    }
    
    public GenerateRequestPostmanCollectionResponse(
            String contentType,
            int statusCode,
            HttpResponse<InputStream> rawResponse) {
        this(contentType, Optional.empty(), statusCode, rawResponse);
    }

    /**
     * HTTP response content type for this operation
     */
    @JsonIgnore
    public String contentType() {
        return contentType;
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
    public GenerateRequestPostmanCollectionResponse withContentType(String contentType) {
        Utils.checkNotNull(contentType, "contentType");
        this.contentType = contentType;
        return this;
    }

    /**
     * OK
     */
    public GenerateRequestPostmanCollectionResponse withPostmanCollection(InputStream postmanCollection) {
        Utils.checkNotNull(postmanCollection, "postmanCollection");
        this.postmanCollection = Optional.ofNullable(postmanCollection);
        return this;
    }

    /**
     * OK
     */
    public GenerateRequestPostmanCollectionResponse withPostmanCollection(Optional<? extends InputStream> postmanCollection) {
        Utils.checkNotNull(postmanCollection, "postmanCollection");
        this.postmanCollection = postmanCollection;
        return this;
    }

    /**
     * HTTP response status code for this operation
     */
    public GenerateRequestPostmanCollectionResponse withStatusCode(int statusCode) {
        Utils.checkNotNull(statusCode, "statusCode");
        this.statusCode = statusCode;
        return this;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    public GenerateRequestPostmanCollectionResponse withRawResponse(HttpResponse<InputStream> rawResponse) {
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
        GenerateRequestPostmanCollectionResponse other = (GenerateRequestPostmanCollectionResponse) o;
        return 
            Objects.deepEquals(this.contentType, other.contentType) &&
            Objects.deepEquals(this.postmanCollection, other.postmanCollection) &&
            Objects.deepEquals(this.statusCode, other.statusCode) &&
            Objects.deepEquals(this.rawResponse, other.rawResponse);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            contentType,
            postmanCollection,
            statusCode,
            rawResponse);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GenerateRequestPostmanCollectionResponse.class,
                "contentType", contentType,
                "postmanCollection", postmanCollection,
                "statusCode", statusCode,
                "rawResponse", rawResponse);
    }
    
    public final static class Builder {
 
        private String contentType;
 
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
        
        public GenerateRequestPostmanCollectionResponse build() {
            return new GenerateRequestPostmanCollectionResponse(
                contentType,
                postmanCollection,
                statusCode,
                rawResponse);
        }
    }
}

