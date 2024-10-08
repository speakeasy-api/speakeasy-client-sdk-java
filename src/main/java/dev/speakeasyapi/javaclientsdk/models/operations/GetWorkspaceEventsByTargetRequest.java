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
import java.time.OffsetDateTime;
import java.util.Objects;
import java.util.Optional;


public class GetWorkspaceEventsByTargetRequest {

    /**
     * Filter to only return events created after this timestamp
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=after_created_at")
    private Optional<OffsetDateTime> afterCreatedAt;

    /**
     * Filter to only return events corresponding to a particular gen_lock_id (gen_lock_id uniquely identifies a target)
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=targetID")
    private String targetID;

    /**
     * Unique identifier of the workspace.
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=workspaceID")
    private Optional<String> workspaceID;

    @JsonCreator
    public GetWorkspaceEventsByTargetRequest(
            Optional<OffsetDateTime> afterCreatedAt,
            String targetID,
            Optional<String> workspaceID) {
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
    @JsonIgnore
    public Optional<OffsetDateTime> afterCreatedAt() {
        return afterCreatedAt;
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
    @JsonIgnore
    public Optional<String> workspaceID() {
        return workspaceID;
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
    public GetWorkspaceEventsByTargetRequest withAfterCreatedAt(Optional<OffsetDateTime> afterCreatedAt) {
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
    public GetWorkspaceEventsByTargetRequest withWorkspaceID(Optional<String> workspaceID) {
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
            Objects.deepEquals(this.afterCreatedAt, other.afterCreatedAt) &&
            Objects.deepEquals(this.targetID, other.targetID) &&
            Objects.deepEquals(this.workspaceID, other.workspaceID);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
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
 
        private Optional<OffsetDateTime> afterCreatedAt = Optional.empty();
 
        private String targetID;
 
        private Optional<String> workspaceID = Optional.empty();  
        
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
        public Builder afterCreatedAt(Optional<OffsetDateTime> afterCreatedAt) {
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
        public Builder workspaceID(Optional<String> workspaceID) {
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

