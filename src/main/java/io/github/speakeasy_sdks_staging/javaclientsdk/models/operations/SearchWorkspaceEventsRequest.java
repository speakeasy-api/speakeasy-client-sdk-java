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

public class SearchWorkspaceEventsRequest {

    /**
     * A specific gen lock ID for the events.
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=generate_gen_lock_id")
    private Optional<? extends String> generateGenLockId;

    /**
     * Specified interaction type for events.
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=interaction_type")
    private Optional<? extends io.github.speakeasy_sdks_staging.javaclientsdk.models.shared.InteractionType> interactionType;

    /**
     * Unique identifier of the lint report digest.
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=lint_report_digest")
    private Optional<? extends String> lintReportDigest;

    /**
     * Unique identifier of the openapi diff report digest.
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=openapi_diff_report_digest")
    private Optional<? extends String> openapiDiffReportDigest;

    /**
     * Unique identifier of the source revision digest.
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=source_revision_digest")
    private Optional<? extends String> sourceRevisionDigest;

    /**
     * Unique identifier of the workspace.
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=workspaceID")
    private Optional<? extends String> workspaceID;

    @JsonCreator
    public SearchWorkspaceEventsRequest(
            Optional<? extends String> generateGenLockId,
            Optional<? extends io.github.speakeasy_sdks_staging.javaclientsdk.models.shared.InteractionType> interactionType,
            Optional<? extends String> lintReportDigest,
            Optional<? extends String> openapiDiffReportDigest,
            Optional<? extends String> sourceRevisionDigest,
            Optional<? extends String> workspaceID) {
        Utils.checkNotNull(generateGenLockId, "generateGenLockId");
        Utils.checkNotNull(interactionType, "interactionType");
        Utils.checkNotNull(lintReportDigest, "lintReportDigest");
        Utils.checkNotNull(openapiDiffReportDigest, "openapiDiffReportDigest");
        Utils.checkNotNull(sourceRevisionDigest, "sourceRevisionDigest");
        Utils.checkNotNull(workspaceID, "workspaceID");
        this.generateGenLockId = generateGenLockId;
        this.interactionType = interactionType;
        this.lintReportDigest = lintReportDigest;
        this.openapiDiffReportDigest = openapiDiffReportDigest;
        this.sourceRevisionDigest = sourceRevisionDigest;
        this.workspaceID = workspaceID;
    }
    
    public SearchWorkspaceEventsRequest() {
        this(Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty());
    }

    /**
     * A specific gen lock ID for the events.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<String> generateGenLockId() {
        return (Optional<String>) generateGenLockId;
    }

    /**
     * Specified interaction type for events.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<io.github.speakeasy_sdks_staging.javaclientsdk.models.shared.InteractionType> interactionType() {
        return (Optional<io.github.speakeasy_sdks_staging.javaclientsdk.models.shared.InteractionType>) interactionType;
    }

    /**
     * Unique identifier of the lint report digest.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<String> lintReportDigest() {
        return (Optional<String>) lintReportDigest;
    }

    /**
     * Unique identifier of the openapi diff report digest.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<String> openapiDiffReportDigest() {
        return (Optional<String>) openapiDiffReportDigest;
    }

    /**
     * Unique identifier of the source revision digest.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<String> sourceRevisionDigest() {
        return (Optional<String>) sourceRevisionDigest;
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
     * A specific gen lock ID for the events.
     */
    public SearchWorkspaceEventsRequest withGenerateGenLockId(String generateGenLockId) {
        Utils.checkNotNull(generateGenLockId, "generateGenLockId");
        this.generateGenLockId = Optional.ofNullable(generateGenLockId);
        return this;
    }

    /**
     * A specific gen lock ID for the events.
     */
    public SearchWorkspaceEventsRequest withGenerateGenLockId(Optional<? extends String> generateGenLockId) {
        Utils.checkNotNull(generateGenLockId, "generateGenLockId");
        this.generateGenLockId = generateGenLockId;
        return this;
    }

    /**
     * Specified interaction type for events.
     */
    public SearchWorkspaceEventsRequest withInteractionType(io.github.speakeasy_sdks_staging.javaclientsdk.models.shared.InteractionType interactionType) {
        Utils.checkNotNull(interactionType, "interactionType");
        this.interactionType = Optional.ofNullable(interactionType);
        return this;
    }

    /**
     * Specified interaction type for events.
     */
    public SearchWorkspaceEventsRequest withInteractionType(Optional<? extends io.github.speakeasy_sdks_staging.javaclientsdk.models.shared.InteractionType> interactionType) {
        Utils.checkNotNull(interactionType, "interactionType");
        this.interactionType = interactionType;
        return this;
    }

    /**
     * Unique identifier of the lint report digest.
     */
    public SearchWorkspaceEventsRequest withLintReportDigest(String lintReportDigest) {
        Utils.checkNotNull(lintReportDigest, "lintReportDigest");
        this.lintReportDigest = Optional.ofNullable(lintReportDigest);
        return this;
    }

    /**
     * Unique identifier of the lint report digest.
     */
    public SearchWorkspaceEventsRequest withLintReportDigest(Optional<? extends String> lintReportDigest) {
        Utils.checkNotNull(lintReportDigest, "lintReportDigest");
        this.lintReportDigest = lintReportDigest;
        return this;
    }

    /**
     * Unique identifier of the openapi diff report digest.
     */
    public SearchWorkspaceEventsRequest withOpenapiDiffReportDigest(String openapiDiffReportDigest) {
        Utils.checkNotNull(openapiDiffReportDigest, "openapiDiffReportDigest");
        this.openapiDiffReportDigest = Optional.ofNullable(openapiDiffReportDigest);
        return this;
    }

    /**
     * Unique identifier of the openapi diff report digest.
     */
    public SearchWorkspaceEventsRequest withOpenapiDiffReportDigest(Optional<? extends String> openapiDiffReportDigest) {
        Utils.checkNotNull(openapiDiffReportDigest, "openapiDiffReportDigest");
        this.openapiDiffReportDigest = openapiDiffReportDigest;
        return this;
    }

    /**
     * Unique identifier of the source revision digest.
     */
    public SearchWorkspaceEventsRequest withSourceRevisionDigest(String sourceRevisionDigest) {
        Utils.checkNotNull(sourceRevisionDigest, "sourceRevisionDigest");
        this.sourceRevisionDigest = Optional.ofNullable(sourceRevisionDigest);
        return this;
    }

    /**
     * Unique identifier of the source revision digest.
     */
    public SearchWorkspaceEventsRequest withSourceRevisionDigest(Optional<? extends String> sourceRevisionDigest) {
        Utils.checkNotNull(sourceRevisionDigest, "sourceRevisionDigest");
        this.sourceRevisionDigest = sourceRevisionDigest;
        return this;
    }

    /**
     * Unique identifier of the workspace.
     */
    public SearchWorkspaceEventsRequest withWorkspaceID(String workspaceID) {
        Utils.checkNotNull(workspaceID, "workspaceID");
        this.workspaceID = Optional.ofNullable(workspaceID);
        return this;
    }

    /**
     * Unique identifier of the workspace.
     */
    public SearchWorkspaceEventsRequest withWorkspaceID(Optional<? extends String> workspaceID) {
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
        SearchWorkspaceEventsRequest other = (SearchWorkspaceEventsRequest) o;
        return 
            java.util.Objects.deepEquals(this.generateGenLockId, other.generateGenLockId) &&
            java.util.Objects.deepEquals(this.interactionType, other.interactionType) &&
            java.util.Objects.deepEquals(this.lintReportDigest, other.lintReportDigest) &&
            java.util.Objects.deepEquals(this.openapiDiffReportDigest, other.openapiDiffReportDigest) &&
            java.util.Objects.deepEquals(this.sourceRevisionDigest, other.sourceRevisionDigest) &&
            java.util.Objects.deepEquals(this.workspaceID, other.workspaceID);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            generateGenLockId,
            interactionType,
            lintReportDigest,
            openapiDiffReportDigest,
            sourceRevisionDigest,
            workspaceID);
    }
    
    @Override
    public String toString() {
        return Utils.toString(SearchWorkspaceEventsRequest.class,
                "generateGenLockId", generateGenLockId,
                "interactionType", interactionType,
                "lintReportDigest", lintReportDigest,
                "openapiDiffReportDigest", openapiDiffReportDigest,
                "sourceRevisionDigest", sourceRevisionDigest,
                "workspaceID", workspaceID);
    }
    
    public final static class Builder {
 
        private Optional<? extends String> generateGenLockId = Optional.empty();
 
        private Optional<? extends io.github.speakeasy_sdks_staging.javaclientsdk.models.shared.InteractionType> interactionType = Optional.empty();
 
        private Optional<? extends String> lintReportDigest = Optional.empty();
 
        private Optional<? extends String> openapiDiffReportDigest = Optional.empty();
 
        private Optional<? extends String> sourceRevisionDigest = Optional.empty();
 
        private Optional<? extends String> workspaceID = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * A specific gen lock ID for the events.
         */
        public Builder generateGenLockId(String generateGenLockId) {
            Utils.checkNotNull(generateGenLockId, "generateGenLockId");
            this.generateGenLockId = Optional.ofNullable(generateGenLockId);
            return this;
        }

        /**
         * A specific gen lock ID for the events.
         */
        public Builder generateGenLockId(Optional<? extends String> generateGenLockId) {
            Utils.checkNotNull(generateGenLockId, "generateGenLockId");
            this.generateGenLockId = generateGenLockId;
            return this;
        }

        /**
         * Specified interaction type for events.
         */
        public Builder interactionType(io.github.speakeasy_sdks_staging.javaclientsdk.models.shared.InteractionType interactionType) {
            Utils.checkNotNull(interactionType, "interactionType");
            this.interactionType = Optional.ofNullable(interactionType);
            return this;
        }

        /**
         * Specified interaction type for events.
         */
        public Builder interactionType(Optional<? extends io.github.speakeasy_sdks_staging.javaclientsdk.models.shared.InteractionType> interactionType) {
            Utils.checkNotNull(interactionType, "interactionType");
            this.interactionType = interactionType;
            return this;
        }

        /**
         * Unique identifier of the lint report digest.
         */
        public Builder lintReportDigest(String lintReportDigest) {
            Utils.checkNotNull(lintReportDigest, "lintReportDigest");
            this.lintReportDigest = Optional.ofNullable(lintReportDigest);
            return this;
        }

        /**
         * Unique identifier of the lint report digest.
         */
        public Builder lintReportDigest(Optional<? extends String> lintReportDigest) {
            Utils.checkNotNull(lintReportDigest, "lintReportDigest");
            this.lintReportDigest = lintReportDigest;
            return this;
        }

        /**
         * Unique identifier of the openapi diff report digest.
         */
        public Builder openapiDiffReportDigest(String openapiDiffReportDigest) {
            Utils.checkNotNull(openapiDiffReportDigest, "openapiDiffReportDigest");
            this.openapiDiffReportDigest = Optional.ofNullable(openapiDiffReportDigest);
            return this;
        }

        /**
         * Unique identifier of the openapi diff report digest.
         */
        public Builder openapiDiffReportDigest(Optional<? extends String> openapiDiffReportDigest) {
            Utils.checkNotNull(openapiDiffReportDigest, "openapiDiffReportDigest");
            this.openapiDiffReportDigest = openapiDiffReportDigest;
            return this;
        }

        /**
         * Unique identifier of the source revision digest.
         */
        public Builder sourceRevisionDigest(String sourceRevisionDigest) {
            Utils.checkNotNull(sourceRevisionDigest, "sourceRevisionDigest");
            this.sourceRevisionDigest = Optional.ofNullable(sourceRevisionDigest);
            return this;
        }

        /**
         * Unique identifier of the source revision digest.
         */
        public Builder sourceRevisionDigest(Optional<? extends String> sourceRevisionDigest) {
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
        
        public SearchWorkspaceEventsRequest build() {
            return new SearchWorkspaceEventsRequest(
                generateGenLockId,
                interactionType,
                lintReportDigest,
                openapiDiffReportDigest,
                sourceRevisionDigest,
                workspaceID);
        }
    }
}

