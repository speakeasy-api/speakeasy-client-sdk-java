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

public class GetAllApiEndpointsRequest {

    /**
     * The ID of the Api to retrieve ApiEndpoints for.
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=apiID")
    private String apiID;

    @JsonCreator
    public GetAllApiEndpointsRequest(
            String apiID) {
        Utils.checkNotNull(apiID, "apiID");
        this.apiID = apiID;
    }

    /**
     * The ID of the Api to retrieve ApiEndpoints for.
     */
    @JsonIgnore
    public String apiID() {
        return apiID;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * The ID of the Api to retrieve ApiEndpoints for.
     */
    public GetAllApiEndpointsRequest withApiID(String apiID) {
        Utils.checkNotNull(apiID, "apiID");
        this.apiID = apiID;
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
        GetAllApiEndpointsRequest other = (GetAllApiEndpointsRequest) o;
        return 
            java.util.Objects.deepEquals(this.apiID, other.apiID);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            apiID);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetAllApiEndpointsRequest.class,
                "apiID", apiID);
    }
    
    public final static class Builder {
 
        private String apiID;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The ID of the Api to retrieve ApiEndpoints for.
         */
        public Builder apiID(String apiID) {
            Utils.checkNotNull(apiID, "apiID");
            this.apiID = apiID;
            return this;
        }
        
        public GetAllApiEndpointsRequest build() {
            return new GetAllApiEndpointsRequest(
                apiID);
        }
    }
}

