/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package dev.speakeasyapi.javaclientsdk.models.operations;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import dev.speakeasyapi.javaclientsdk.models.shared.Workspace;
import dev.speakeasyapi.javaclientsdk.utils.SpeakeasyMetadata;
import dev.speakeasyapi.javaclientsdk.utils.Utils;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;


public class UpdateWorkspaceDetailsRequest {

    /**
     * The workspace details to update.
     */
    @SpeakeasyMetadata("request:mediaType=application/json")
    private Workspace workspace;

    /**
     * Unique identifier of the workspace.
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=workspace_id")
    private Optional<String> workspaceId;

    @JsonCreator
    public UpdateWorkspaceDetailsRequest(
            Workspace workspace,
            Optional<String> workspaceId) {
        Utils.checkNotNull(workspace, "workspace");
        Utils.checkNotNull(workspaceId, "workspaceId");
        this.workspace = workspace;
        this.workspaceId = workspaceId;
    }
    
    public UpdateWorkspaceDetailsRequest(
            Workspace workspace) {
        this(workspace, Optional.empty());
    }

    /**
     * The workspace details to update.
     */
    @JsonIgnore
    public Workspace workspace() {
        return workspace;
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
     * The workspace details to update.
     */
    public UpdateWorkspaceDetailsRequest withWorkspace(Workspace workspace) {
        Utils.checkNotNull(workspace, "workspace");
        this.workspace = workspace;
        return this;
    }

    /**
     * Unique identifier of the workspace.
     */
    public UpdateWorkspaceDetailsRequest withWorkspaceId(String workspaceId) {
        Utils.checkNotNull(workspaceId, "workspaceId");
        this.workspaceId = Optional.ofNullable(workspaceId);
        return this;
    }

    /**
     * Unique identifier of the workspace.
     */
    public UpdateWorkspaceDetailsRequest withWorkspaceId(Optional<String> workspaceId) {
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
        UpdateWorkspaceDetailsRequest other = (UpdateWorkspaceDetailsRequest) o;
        return 
            Objects.deepEquals(this.workspace, other.workspace) &&
            Objects.deepEquals(this.workspaceId, other.workspaceId);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            workspace,
            workspaceId);
    }
    
    @Override
    public String toString() {
        return Utils.toString(UpdateWorkspaceDetailsRequest.class,
                "workspace", workspace,
                "workspaceId", workspaceId);
    }
    
    public final static class Builder {
 
        private Workspace workspace;
 
        private Optional<String> workspaceId = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The workspace details to update.
         */
        public Builder workspace(Workspace workspace) {
            Utils.checkNotNull(workspace, "workspace");
            this.workspace = workspace;
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
        
        public UpdateWorkspaceDetailsRequest build() {
            return new UpdateWorkspaceDetailsRequest(
                workspace,
                workspaceId);
        }
    }
}

