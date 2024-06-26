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

public class DeleteVersionMetadataRequest {

    /**
     * The ID of the Api to delete metadata for.
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=apiID")
    private String apiID;

    /**
     * The key of the metadata to delete.
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=metaKey")
    private String metaKey;

    /**
     * The value of the metadata to delete.
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=metaValue")
    private String metaValue;

    /**
     * The version ID of the Api to delete metadata for.
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=versionID")
    private String versionID;

    @JsonCreator
    public DeleteVersionMetadataRequest(
            String apiID,
            String metaKey,
            String metaValue,
            String versionID) {
        Utils.checkNotNull(apiID, "apiID");
        Utils.checkNotNull(metaKey, "metaKey");
        Utils.checkNotNull(metaValue, "metaValue");
        Utils.checkNotNull(versionID, "versionID");
        this.apiID = apiID;
        this.metaKey = metaKey;
        this.metaValue = metaValue;
        this.versionID = versionID;
    }

    /**
     * The ID of the Api to delete metadata for.
     */
    @JsonIgnore
    public String apiID() {
        return apiID;
    }

    /**
     * The key of the metadata to delete.
     */
    @JsonIgnore
    public String metaKey() {
        return metaKey;
    }

    /**
     * The value of the metadata to delete.
     */
    @JsonIgnore
    public String metaValue() {
        return metaValue;
    }

    /**
     * The version ID of the Api to delete metadata for.
     */
    @JsonIgnore
    public String versionID() {
        return versionID;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * The ID of the Api to delete metadata for.
     */
    public DeleteVersionMetadataRequest withApiID(String apiID) {
        Utils.checkNotNull(apiID, "apiID");
        this.apiID = apiID;
        return this;
    }

    /**
     * The key of the metadata to delete.
     */
    public DeleteVersionMetadataRequest withMetaKey(String metaKey) {
        Utils.checkNotNull(metaKey, "metaKey");
        this.metaKey = metaKey;
        return this;
    }

    /**
     * The value of the metadata to delete.
     */
    public DeleteVersionMetadataRequest withMetaValue(String metaValue) {
        Utils.checkNotNull(metaValue, "metaValue");
        this.metaValue = metaValue;
        return this;
    }

    /**
     * The version ID of the Api to delete metadata for.
     */
    public DeleteVersionMetadataRequest withVersionID(String versionID) {
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
        DeleteVersionMetadataRequest other = (DeleteVersionMetadataRequest) o;
        return 
            java.util.Objects.deepEquals(this.apiID, other.apiID) &&
            java.util.Objects.deepEquals(this.metaKey, other.metaKey) &&
            java.util.Objects.deepEquals(this.metaValue, other.metaValue) &&
            java.util.Objects.deepEquals(this.versionID, other.versionID);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            apiID,
            metaKey,
            metaValue,
            versionID);
    }
    
    @Override
    public String toString() {
        return Utils.toString(DeleteVersionMetadataRequest.class,
                "apiID", apiID,
                "metaKey", metaKey,
                "metaValue", metaValue,
                "versionID", versionID);
    }
    
    public final static class Builder {
 
        private String apiID;
 
        private String metaKey;
 
        private String metaValue;
 
        private String versionID;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The ID of the Api to delete metadata for.
         */
        public Builder apiID(String apiID) {
            Utils.checkNotNull(apiID, "apiID");
            this.apiID = apiID;
            return this;
        }

        /**
         * The key of the metadata to delete.
         */
        public Builder metaKey(String metaKey) {
            Utils.checkNotNull(metaKey, "metaKey");
            this.metaKey = metaKey;
            return this;
        }

        /**
         * The value of the metadata to delete.
         */
        public Builder metaValue(String metaValue) {
            Utils.checkNotNull(metaValue, "metaValue");
            this.metaValue = metaValue;
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
        
        public DeleteVersionMetadataRequest build() {
            return new DeleteVersionMetadataRequest(
                apiID,
                metaKey,
                metaValue,
                versionID);
        }
    }
}

