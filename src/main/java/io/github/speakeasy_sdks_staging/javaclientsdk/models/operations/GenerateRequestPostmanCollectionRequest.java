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


public class GenerateRequestPostmanCollectionRequest {

    /**
     * The ID of the request to retrieve.
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=requestID")
    private String requestID;

    @JsonCreator
    public GenerateRequestPostmanCollectionRequest(
            String requestID) {
        Utils.checkNotNull(requestID, "requestID");
        this.requestID = requestID;
    }

    /**
     * The ID of the request to retrieve.
     */
    @JsonIgnore
    public String requestID() {
        return requestID;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * The ID of the request to retrieve.
     */
    public GenerateRequestPostmanCollectionRequest withRequestID(String requestID) {
        Utils.checkNotNull(requestID, "requestID");
        this.requestID = requestID;
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
        GenerateRequestPostmanCollectionRequest other = (GenerateRequestPostmanCollectionRequest) o;
        return 
            java.util.Objects.deepEquals(this.requestID, other.requestID);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            requestID);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GenerateRequestPostmanCollectionRequest.class,
                "requestID", requestID);
    }
    
    public final static class Builder {
 
        private String requestID;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The ID of the request to retrieve.
         */
        public Builder requestID(String requestID) {
            Utils.checkNotNull(requestID, "requestID");
            this.requestID = requestID;
            return this;
        }
        
        public GenerateRequestPostmanCollectionRequest build() {
            return new GenerateRequestPostmanCollectionRequest(
                requestID);
        }
    }
}

