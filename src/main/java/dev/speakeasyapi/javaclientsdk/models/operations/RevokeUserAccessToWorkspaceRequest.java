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
import java.util.Optional;


public class RevokeUserAccessToWorkspaceRequest {

    /**
     * Unique identifier of the user.
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=userId")
    private String userId;

    /**
     * Unique identifier of the workspace.
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=workspace_id")
    private Optional<String> workspaceId;

    @JsonCreator
    public RevokeUserAccessToWorkspaceRequest(
            String userId,
            Optional<String> workspaceId) {
        Utils.checkNotNull(userId, "userId");
        Utils.checkNotNull(workspaceId, "workspaceId");
        this.userId = userId;
        this.workspaceId = workspaceId;
    }
    
    public RevokeUserAccessToWorkspaceRequest(
            String userId) {
        this(userId, Optional.empty());
    }

    /**
     * Unique identifier of the user.
     */
    @JsonIgnore
    public String userId() {
        return userId;
    }

    /**
     * Unique identifier of the workspace.
     */
    @JsonIgnore
    public Optional<String> workspaceId() {
        return workspaceId;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Unique identifier of the user.
     */
    public RevokeUserAccessToWorkspaceRequest withUserId(String userId) {
        Utils.checkNotNull(userId, "userId");
        this.userId = userId;
        return this;
    }

    /**
     * Unique identifier of the workspace.
     */
    public RevokeUserAccessToWorkspaceRequest withWorkspaceId(String workspaceId) {
        Utils.checkNotNull(workspaceId, "workspaceId");
        this.workspaceId = Optional.ofNullable(workspaceId);
        return this;
    }

    /**
     * Unique identifier of the workspace.
     */
    public RevokeUserAccessToWorkspaceRequest withWorkspaceId(Optional<String> workspaceId) {
        Utils.checkNotNull(workspaceId, "workspaceId");
        this.workspaceId = workspaceId;
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
        RevokeUserAccessToWorkspaceRequest other = (RevokeUserAccessToWorkspaceRequest) o;
        return 
            Objects.deepEquals(this.userId, other.userId) &&
            Objects.deepEquals(this.workspaceId, other.workspaceId);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            userId,
            workspaceId);
    }
    
    @Override
    public String toString() {
        return Utils.toString(RevokeUserAccessToWorkspaceRequest.class,
                "userId", userId,
                "workspaceId", workspaceId);
    }
    
    public final static class Builder {
 
        private String userId;
 
        private Optional<String> workspaceId = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Unique identifier of the user.
         */
        public Builder userId(String userId) {
            Utils.checkNotNull(userId, "userId");
            this.userId = userId;
            return this;
        }

        /**
         * Unique identifier of the workspace.
         */
        public Builder workspaceId(String workspaceId) {
            Utils.checkNotNull(workspaceId, "workspaceId");
            this.workspaceId = Optional.ofNullable(workspaceId);
            return this;
        }

        /**
         * Unique identifier of the workspace.
         */
        public Builder workspaceId(Optional<String> workspaceId) {
            Utils.checkNotNull(workspaceId, "workspaceId");
            this.workspaceId = workspaceId;
            return this;
        }
        
        public RevokeUserAccessToWorkspaceRequest build() {
            return new RevokeUserAccessToWorkspaceRequest(
                userId,
                workspaceId);
        }
    }
}

