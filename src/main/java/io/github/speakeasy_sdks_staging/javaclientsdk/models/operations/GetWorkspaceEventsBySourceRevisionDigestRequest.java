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


public class GetWorkspaceEventsBySourceRevisionDigestRequest {

    /**
     * Unique identifier of the source revision digest.
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=sourceRevisionDigest")
    private String sourceRevisionDigest;

    /**
     * Unique identifier of the workspace.
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=workspaceID")
    private Optional<? extends String> workspaceID;

    @JsonCreator
    public GetWorkspaceEventsBySourceRevisionDigestRequest(
            String sourceRevisionDigest,
            Optional<? extends String> workspaceID) {
        Utils.checkNotNull(sourceRevisionDigest, "sourceRevisionDigest");
        Utils.checkNotNull(workspaceID, "workspaceID");
        this.sourceRevisionDigest = sourceRevisionDigest;
        this.workspaceID = workspaceID;
    }
    
    public GetWorkspaceEventsBySourceRevisionDigestRequest(
            String sourceRevisionDigest) {
        this(sourceRevisionDigest, Optional.empty());
    }

    /**
     * Unique identifier of the source revision digest.
     */
    @JsonIgnore
    public String sourceRevisionDigest() {
        return sourceRevisionDigest;
    }

    /**
     * Unique identifier of the workspace.
     */
    @JsonIgnore
    public Optional<? extends String> workspaceID() {
        return workspaceID;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Unique identifier of the source revision digest.
     */
    public GetWorkspaceEventsBySourceRevisionDigestRequest withSourceRevisionDigest(String sourceRevisionDigest) {
        Utils.checkNotNull(sourceRevisionDigest, "sourceRevisionDigest");
        this.sourceRevisionDigest = sourceRevisionDigest;
        return this;
    }

    /**
     * Unique identifier of the workspace.
     */
    public GetWorkspaceEventsBySourceRevisionDigestRequest withWorkspaceID(String workspaceID) {
        Utils.checkNotNull(workspaceID, "workspaceID");
        this.workspaceID = Optional.ofNullable(workspaceID);
        return this;
    }

    /**
     * Unique identifier of the workspace.
     */
    public GetWorkspaceEventsBySourceRevisionDigestRequest withWorkspaceID(Optional<? extends String> workspaceID) {
        Utils.checkNotNull(workspaceID, "workspaceID");
        this.workspaceID = workspaceID;
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
        GetWorkspaceEventsBySourceRevisionDigestRequest other = (GetWorkspaceEventsBySourceRevisionDigestRequest) o;
        return 
            java.util.Objects.deepEquals(this.sourceRevisionDigest, other.sourceRevisionDigest) &&
            java.util.Objects.deepEquals(this.workspaceID, other.workspaceID);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            sourceRevisionDigest,
            workspaceID);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetWorkspaceEventsBySourceRevisionDigestRequest.class,
                "sourceRevisionDigest", sourceRevisionDigest,
                "workspaceID", workspaceID);
    }
    
    public final static class Builder {
 
        private String sourceRevisionDigest;
 
        private Optional<? extends String> workspaceID = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Unique identifier of the source revision digest.
         */
        public Builder sourceRevisionDigest(String sourceRevisionDigest) {
            Utils.checkNotNull(sourceRevisionDigest, "sourceRevisionDigest");
            this.sourceRevisionDigest = sourceRevisionDigest;
            return this;
        }

        /**
         * Unique identifier of the workspace.
         */
        public Builder workspaceID(String workspaceID) {
            Utils.checkNotNull(workspaceID, "workspaceID");
            this.workspaceID = Optional.ofNullable(workspaceID);
            return this;
        }

        /**
         * Unique identifier of the workspace.
         */
        public Builder workspaceID(Optional<? extends String> workspaceID) {
            Utils.checkNotNull(workspaceID, "workspaceID");
            this.workspaceID = workspaceID;
            return this;
        }
        
        public GetWorkspaceEventsBySourceRevisionDigestRequest build() {
            return new GetWorkspaceEventsBySourceRevisionDigestRequest(
                sourceRevisionDigest,
                workspaceID);
        }
    }
}

