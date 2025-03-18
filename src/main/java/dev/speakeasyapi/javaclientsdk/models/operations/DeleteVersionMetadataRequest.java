/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */


package dev.speakeasyapi.javaclientsdk.models.operations;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import dev.speakeasyapi.javaclientsdk.utils.SpeakeasyMetadata;
import dev.speakeasyapi.javaclientsdk.utils.Utils;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

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
            Objects.deepEquals(this.apiID, other.apiID) &&
            Objects.deepEquals(this.metaKey, other.metaKey) &&
            Objects.deepEquals(this.metaValue, other.metaValue) &&
            Objects.deepEquals(this.versionID, other.versionID);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
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

