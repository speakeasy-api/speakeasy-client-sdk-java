/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package io.github.speakeasy_sdks_staging.javaclientsdk.models.operations;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.core.type.TypeReference;
import io.github.speakeasy_sdks_staging.javaclientsdk.utils.SpeakeasyMetadata;
import io.github.speakeasy_sdks_staging.javaclientsdk.utils.Utils;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Optional;

public class SuggestOperationIDsRequest {

    /**
     * The schema file to upload provided as a multipart/form-data file segment.
     */
    @SpeakeasyMetadata("request:mediaType=multipart/form-data")
    private SuggestOperationIDsRequestBody requestBody;

    /**
     * Max number of suggestions to request
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=limit")
    private Optional<? extends Double> limit;

    @SpeakeasyMetadata("header:style=simple,explode=false,name=x-session-id")
    private String xSessionId;

    @JsonCreator
    public SuggestOperationIDsRequest(
            SuggestOperationIDsRequestBody requestBody,
            Optional<? extends Double> limit,
            String xSessionId) {
        Utils.checkNotNull(requestBody, "requestBody");
        Utils.checkNotNull(limit, "limit");
        Utils.checkNotNull(xSessionId, "xSessionId");
        this.requestBody = requestBody;
        this.limit = limit;
        this.xSessionId = xSessionId;
    }
    
    public SuggestOperationIDsRequest(
            SuggestOperationIDsRequestBody requestBody,
            String xSessionId) {
        this(requestBody, Optional.empty(), xSessionId);
    }

    /**
     * The schema file to upload provided as a multipart/form-data file segment.
     */
    @JsonIgnore
    public SuggestOperationIDsRequestBody requestBody() {
        return requestBody;
    }

    /**
     * Max number of suggestions to request
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Double> limit() {
        return (Optional<Double>) limit;
    }

    @JsonIgnore
    public String xSessionId() {
        return xSessionId;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * The schema file to upload provided as a multipart/form-data file segment.
     */
    public SuggestOperationIDsRequest withRequestBody(SuggestOperationIDsRequestBody requestBody) {
        Utils.checkNotNull(requestBody, "requestBody");
        this.requestBody = requestBody;
        return this;
    }

    /**
     * Max number of suggestions to request
     */
    public SuggestOperationIDsRequest withLimit(double limit) {
        Utils.checkNotNull(limit, "limit");
        this.limit = Optional.ofNullable(limit);
        return this;
    }

    /**
     * Max number of suggestions to request
     */
    public SuggestOperationIDsRequest withLimit(Optional<? extends Double> limit) {
        Utils.checkNotNull(limit, "limit");
        this.limit = limit;
        return this;
    }

    public SuggestOperationIDsRequest withXSessionId(String xSessionId) {
        Utils.checkNotNull(xSessionId, "xSessionId");
        this.xSessionId = xSessionId;
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
        SuggestOperationIDsRequest other = (SuggestOperationIDsRequest) o;
        return 
            java.util.Objects.deepEquals(this.requestBody, other.requestBody) &&
            java.util.Objects.deepEquals(this.limit, other.limit) &&
            java.util.Objects.deepEquals(this.xSessionId, other.xSessionId);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            requestBody,
            limit,
            xSessionId);
    }
    
    @Override
    public String toString() {
        return Utils.toString(SuggestOperationIDsRequest.class,
                "requestBody", requestBody,
                "limit", limit,
                "xSessionId", xSessionId);
    }
    
    public final static class Builder {
 
        private SuggestOperationIDsRequestBody requestBody;
 
        private Optional<? extends Double> limit = Optional.empty();
 
        private String xSessionId;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The schema file to upload provided as a multipart/form-data file segment.
         */
        public Builder requestBody(SuggestOperationIDsRequestBody requestBody) {
            Utils.checkNotNull(requestBody, "requestBody");
            this.requestBody = requestBody;
            return this;
        }

        /**
         * Max number of suggestions to request
         */
        public Builder limit(double limit) {
            Utils.checkNotNull(limit, "limit");
            this.limit = Optional.ofNullable(limit);
            return this;
        }

        /**
         * Max number of suggestions to request
         */
        public Builder limit(Optional<? extends Double> limit) {
            Utils.checkNotNull(limit, "limit");
            this.limit = limit;
            return this;
        }

        public Builder xSessionId(String xSessionId) {
            Utils.checkNotNull(xSessionId, "xSessionId");
            this.xSessionId = xSessionId;
            return this;
        }
        
        public SuggestOperationIDsRequest build() {
            return new SuggestOperationIDsRequest(
                requestBody,
                limit,
                xSessionId);
        }
    }
}

