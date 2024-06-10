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

public class GetSchemaRevisionRequest {

    /**
     * The ID of the Api to retrieve schemas for.
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=apiID")
    private String apiID;

    /**
     * The revision ID of the schema to retrieve.
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=revisionID")
    private String revisionID;

    /**
     * The version ID of the Api to delete metadata for.
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=versionID")
    private String versionID;

    @JsonCreator
    public GetSchemaRevisionRequest(
            String apiID,
            String revisionID,
            String versionID) {
        Utils.checkNotNull(apiID, "apiID");
        Utils.checkNotNull(revisionID, "revisionID");
        Utils.checkNotNull(versionID, "versionID");
        this.apiID = apiID;
        this.revisionID = revisionID;
        this.versionID = versionID;
    }

    /**
     * The ID of the Api to retrieve schemas for.
     */
    @JsonIgnore
    public String apiID() {
        return apiID;
    }

    /**
     * The revision ID of the schema to retrieve.
     */
    @JsonIgnore
    public String revisionID() {
        return revisionID;
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
     * The ID of the Api to retrieve schemas for.
     */
    public GetSchemaRevisionRequest withApiID(String apiID) {
        Utils.checkNotNull(apiID, "apiID");
        this.apiID = apiID;
        return this;
    }

    /**
     * The revision ID of the schema to retrieve.
     */
    public GetSchemaRevisionRequest withRevisionID(String revisionID) {
        Utils.checkNotNull(revisionID, "revisionID");
        this.revisionID = revisionID;
        return this;
    }

    /**
     * The version ID of the Api to delete metadata for.
     */
    public GetSchemaRevisionRequest withVersionID(String versionID) {
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
        GetSchemaRevisionRequest other = (GetSchemaRevisionRequest) o;
        return 
            java.util.Objects.deepEquals(this.apiID, other.apiID) &&
            java.util.Objects.deepEquals(this.revisionID, other.revisionID) &&
            java.util.Objects.deepEquals(this.versionID, other.versionID);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            apiID,
            revisionID,
            versionID);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetSchemaRevisionRequest.class,
                "apiID", apiID,
                "revisionID", revisionID,
                "versionID", versionID);
    }
    
    public final static class Builder {
 
        private String apiID;
 
        private String revisionID;
 
        private String versionID;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The ID of the Api to retrieve schemas for.
         */
        public Builder apiID(String apiID) {
            Utils.checkNotNull(apiID, "apiID");
            this.apiID = apiID;
            return this;
        }

        /**
         * The revision ID of the schema to retrieve.
         */
        public Builder revisionID(String revisionID) {
            Utils.checkNotNull(revisionID, "revisionID");
            this.revisionID = revisionID;
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
        
        public GetSchemaRevisionRequest build() {
            return new GetSchemaRevisionRequest(
                apiID,
                revisionID,
                versionID);
        }
    }
}

