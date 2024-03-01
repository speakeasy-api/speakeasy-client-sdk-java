/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package io.github.speakeasy_sdks_staging.javaclientsdk.models.operations;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.core.type.TypeReference;
import io.github.speakeasy_sdks_staging.javaclientsdk.utils.SpeakeasyMetadata;
import io.github.speakeasy_sdks_staging.javaclientsdk.utils.Utils;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;


public class RegisterSchemaRequest {

    /**
     * The schema file to upload provided as a multipart/form-data file segment.
     */
    @SpeakeasyMetadata("request:mediaType=multipart/form-data")
    private RegisterSchemaRequestBody requestBody;

    /**
     * The ID of the Api to get the schema for.
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=apiID")
    private String apiID;

    /**
     * The version ID of the Api to delete metadata for.
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=versionID")
    private String versionID;

    public RegisterSchemaRequest(
            RegisterSchemaRequestBody requestBody,
            String apiID,
            String versionID) {
        Utils.checkNotNull(requestBody, "requestBody");
        Utils.checkNotNull(apiID, "apiID");
        Utils.checkNotNull(versionID, "versionID");
        this.requestBody = requestBody;
        this.apiID = apiID;
        this.versionID = versionID;
    }

    /**
     * The schema file to upload provided as a multipart/form-data file segment.
     */
    public RegisterSchemaRequestBody requestBody() {
        return requestBody;
    }

    /**
     * The ID of the Api to get the schema for.
     */
    public String apiID() {
        return apiID;
    }

    /**
     * The version ID of the Api to delete metadata for.
     */
    public String versionID() {
        return versionID;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * The schema file to upload provided as a multipart/form-data file segment.
     */
    public RegisterSchemaRequest withRequestBody(RegisterSchemaRequestBody requestBody) {
        Utils.checkNotNull(requestBody, "requestBody");
        this.requestBody = requestBody;
        return this;
    }

    /**
     * The ID of the Api to get the schema for.
     */
    public RegisterSchemaRequest withApiID(String apiID) {
        Utils.checkNotNull(apiID, "apiID");
        this.apiID = apiID;
        return this;
    }

    /**
     * The version ID of the Api to delete metadata for.
     */
    public RegisterSchemaRequest withVersionID(String versionID) {
        Utils.checkNotNull(versionID, "versionID");
        this.versionID = versionID;
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
        RegisterSchemaRequest other = (RegisterSchemaRequest) o;
        return 
            java.util.Objects.deepEquals(this.requestBody, other.requestBody) &&
            java.util.Objects.deepEquals(this.apiID, other.apiID) &&
            java.util.Objects.deepEquals(this.versionID, other.versionID);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            requestBody,
            apiID,
            versionID);
    }
    
    @Override
    public String toString() {
        return Utils.toString(RegisterSchemaRequest.class,
                "requestBody", requestBody,
                "apiID", apiID,
                "versionID", versionID);
    }
    
    public final static class Builder {
 
        private RegisterSchemaRequestBody requestBody;
 
        private String apiID;
 
        private String versionID;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The schema file to upload provided as a multipart/form-data file segment.
         */
        public Builder requestBody(RegisterSchemaRequestBody requestBody) {
            Utils.checkNotNull(requestBody, "requestBody");
            this.requestBody = requestBody;
            return this;
        }

        /**
         * The ID of the Api to get the schema for.
         */
        public Builder apiID(String apiID) {
            Utils.checkNotNull(apiID, "apiID");
            this.apiID = apiID;
            return this;
        }

        /**
         * The version ID of the Api to delete metadata for.
         */
        public Builder versionID(String versionID) {
            Utils.checkNotNull(versionID, "versionID");
            this.versionID = versionID;
            return this;
        }
        
        public RegisterSchemaRequest build() {
            return new RegisterSchemaRequest(
                requestBody,
                apiID,
                versionID);
        }
    }
}

