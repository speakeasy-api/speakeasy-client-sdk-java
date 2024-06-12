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
import java.time.OffsetDateTime;
import java.util.Optional;

public class GetWorkspaceEventsByTargetRequest {

    /**
     * Filter to only return events created after this timestamp
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=after_created_at")
    private Optional<? extends OffsetDateTime> afterCreatedAt;

    /**
     * Filter to only return events corresponding to a particular gen_lock_id (gen_lock_id uniquely identifies a target)
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=targetID")
    private String targetID;

    /**
     * Unique identifier of the workspace.
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=workspaceID")
    private Optional<? extends String> workspaceID;

    @JsonCreator
    public GetWorkspaceEventsByTargetRequest(
            Optional<? extends OffsetDateTime> afterCreatedAt,
            String targetID,
            Optional<? extends String> workspaceID) {
        Utils.checkNotNull(afterCreatedAt, "afterCreatedAt");
        Utils.checkNotNull(targetID, "targetID");
        Utils.checkNotNull(workspaceID, "workspaceID");
        this.afterCreatedAt = afterCreatedAt;
        this.targetID = targetID;
        this.workspaceID = workspaceID;
    }
    
    public GetWorkspaceEventsByTargetRequest(
            String targetID) {
        this(Optional.empty(), targetID, Optional.empty());
    }

    /**
     * Filter to only return events created after this timestamp
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<OffsetDateTime> afterCreatedAt() {
        return (Optional<OffsetDateTime>) afterCreatedAt;
    }

    /**
     * Filter to only return events corresponding to a particular gen_lock_id (gen_lock_id uniquely identifies a target)
     */
    @JsonIgnore
    public String targetID() {
        return targetID;
    }

    /**
     * Unique identifier of the workspace.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<String> workspaceID() {
        return (Optional<String>) workspaceID;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Filter to only return events created after this timestamp
     */
    public GetWorkspaceEventsByTargetRequest withAfterCreatedAt(OffsetDateTime afterCreatedAt) {
        Utils.checkNotNull(afterCreatedAt, "afterCreatedAt");
        this.afterCreatedAt = Optional.ofNullable(afterCreatedAt);
        return this;
    }

    /**
     * Filter to only return events created after this timestamp
     */
    public GetWorkspaceEventsByTargetRequest withAfterCreatedAt(Optional<? extends OffsetDateTime> afterCreatedAt) {
        Utils.checkNotNull(afterCreatedAt, "afterCreatedAt");
        this.afterCreatedAt = afterCreatedAt;
        return this;
    }

    /**
     * Filter to only return events corresponding to a particular gen_lock_id (gen_lock_id uniquely identifies a target)
     */
    public GetWorkspaceEventsByTargetRequest withTargetID(String targetID) {
        Utils.checkNotNull(targetID, "targetID");
        this.targetID = targetID;
        return this;
    }

    /**
     * Unique identifier of the workspace.
     */
    public GetWorkspaceEventsByTargetRequest withWorkspaceID(String workspaceID) {
        Utils.checkNotNull(workspaceID, "workspaceID");
        this.workspaceID = Optional.ofNullable(workspaceID);
        return this;
    }

    /**
     * Unique identifier of the workspace.
     */
    public GetWorkspaceEventsByTargetRequest withWorkspaceID(Optional<? extends String> workspaceID) {
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
        GetWorkspaceEventsByTargetRequest other = (GetWorkspaceEventsByTargetRequest) o;
        return 
            java.util.Objects.deepEquals(this.afterCreatedAt, other.afterCreatedAt) &&
            java.util.Objects.deepEquals(this.targetID, other.targetID) &&
            java.util.Objects.deepEquals(this.workspaceID, other.workspaceID);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            afterCreatedAt,
            targetID,
            workspaceID);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetWorkspaceEventsByTargetRequest.class,
                "afterCreatedAt", afterCreatedAt,
                "targetID", targetID,
                "workspaceID", workspaceID);
    }
    
    public final static class Builder {
 
        private Optional<? extends OffsetDateTime> afterCreatedAt = Optional.empty();
 
        private String targetID;
 
        private Optional<? extends String> workspaceID = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Filter to only return events created after this timestamp
         */
        public Builder afterCreatedAt(OffsetDateTime afterCreatedAt) {
            Utils.checkNotNull(afterCreatedAt, "afterCreatedAt");
            this.afterCreatedAt = Optional.ofNullable(afterCreatedAt);
            return this;
        }

        /**
         * Filter to only return events created after this timestamp
         */
        public Builder afterCreatedAt(Optional<? extends OffsetDateTime> afterCreatedAt) {
            Utils.checkNotNull(afterCreatedAt, "afterCreatedAt");
            this.afterCreatedAt = afterCreatedAt;
            return this;
        }

        /**
         * Filter to only return events corresponding to a particular gen_lock_id (gen_lock_id uniquely identifies a target)
         */
        public Builder targetID(String targetID) {
            Utils.checkNotNull(targetID, "targetID");
            this.targetID = targetID;
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
        
        public GetWorkspaceEventsByTargetRequest build() {
            return new GetWorkspaceEventsByTargetRequest(
                afterCreatedAt,
                targetID,
                workspaceID);
        }
    }
}
