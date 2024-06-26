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

public class GetManifestRequest {

    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=namespace_name")
    private String namespaceName;

    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=organization_slug")
    private String organizationSlug;

    /**
     * Tag or digest
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=revision_reference")
    private String revisionReference;

    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=workspace_slug")
    private String workspaceSlug;

    @JsonCreator
    public GetManifestRequest(
            String namespaceName,
            String organizationSlug,
            String revisionReference,
            String workspaceSlug) {
        Utils.checkNotNull(namespaceName, "namespaceName");
        Utils.checkNotNull(organizationSlug, "organizationSlug");
        Utils.checkNotNull(revisionReference, "revisionReference");
        Utils.checkNotNull(workspaceSlug, "workspaceSlug");
        this.namespaceName = namespaceName;
        this.organizationSlug = organizationSlug;
        this.revisionReference = revisionReference;
        this.workspaceSlug = workspaceSlug;
    }

    @JsonIgnore
    public String namespaceName() {
        return namespaceName;
    }

    @JsonIgnore
    public String organizationSlug() {
        return organizationSlug;
    }

    /**
     * Tag or digest
     */
    @JsonIgnore
    public String revisionReference() {
        return revisionReference;
    }

    @JsonIgnore
    public String workspaceSlug() {
        return workspaceSlug;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public GetManifestRequest withNamespaceName(String namespaceName) {
        Utils.checkNotNull(namespaceName, "namespaceName");
        this.namespaceName = namespaceName;
        return this;
    }

    public GetManifestRequest withOrganizationSlug(String organizationSlug) {
        Utils.checkNotNull(organizationSlug, "organizationSlug");
        this.organizationSlug = organizationSlug;
        return this;
    }

    /**
     * Tag or digest
     */
    public GetManifestRequest withRevisionReference(String revisionReference) {
        Utils.checkNotNull(revisionReference, "revisionReference");
        this.revisionReference = revisionReference;
        return this;
    }

    public GetManifestRequest withWorkspaceSlug(String workspaceSlug) {
        Utils.checkNotNull(workspaceSlug, "workspaceSlug");
        this.workspaceSlug = workspaceSlug;
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
        GetManifestRequest other = (GetManifestRequest) o;
        return 
            java.util.Objects.deepEquals(this.namespaceName, other.namespaceName) &&
            java.util.Objects.deepEquals(this.organizationSlug, other.organizationSlug) &&
            java.util.Objects.deepEquals(this.revisionReference, other.revisionReference) &&
            java.util.Objects.deepEquals(this.workspaceSlug, other.workspaceSlug);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            namespaceName,
            organizationSlug,
            revisionReference,
            workspaceSlug);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetManifestRequest.class,
                "namespaceName", namespaceName,
                "organizationSlug", organizationSlug,
                "revisionReference", revisionReference,
                "workspaceSlug", workspaceSlug);
    }
    
    public final static class Builder {
 
        private String namespaceName;
 
        private String organizationSlug;
 
        private String revisionReference;
 
        private String workspaceSlug;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder namespaceName(String namespaceName) {
            Utils.checkNotNull(namespaceName, "namespaceName");
            this.namespaceName = namespaceName;
            return this;
        }

        public Builder organizationSlug(String organizationSlug) {
            Utils.checkNotNull(organizationSlug, "organizationSlug");
            this.organizationSlug = organizationSlug;
            return this;
        }

        /**
         * Tag or digest
         */
        public Builder revisionReference(String revisionReference) {
            Utils.checkNotNull(revisionReference, "revisionReference");
            this.revisionReference = revisionReference;
            return this;
        }

        public Builder workspaceSlug(String workspaceSlug) {
            Utils.checkNotNull(workspaceSlug, "workspaceSlug");
            this.workspaceSlug = workspaceSlug;
            return this;
        }
        
        public GetManifestRequest build() {
            return new GetManifestRequest(
                namespaceName,
                organizationSlug,
                revisionReference,
                workspaceSlug);
        }
    }
}

