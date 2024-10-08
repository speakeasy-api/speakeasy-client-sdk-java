/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package dev.speakeasyapi.javaclientsdk.models.operations;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import dev.speakeasyapi.javaclientsdk.models.shared.SuggestRequestBody;
import dev.speakeasyapi.javaclientsdk.utils.SpeakeasyMetadata;
import dev.speakeasyapi.javaclientsdk.utils.Utils;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Objects;
import java.util.Optional;


public class SuggestOpenAPIRegistryRequest {

    /**
     * Suggest options
     */
    @SpeakeasyMetadata("request:mediaType=application/json")
    private Optional<? extends SuggestRequestBody> suggestRequestBody;

    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=namespace_name")
    private String namespaceName;

    /**
     * Tag or digest
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=revision_reference")
    private String revisionReference;

    @SpeakeasyMetadata("header:style=simple,explode=false,name=x-session-id")
    private String xSessionId;

    @JsonCreator
    public SuggestOpenAPIRegistryRequest(
            Optional<? extends SuggestRequestBody> suggestRequestBody,
            String namespaceName,
            String revisionReference,
            String xSessionId) {
        Utils.checkNotNull(suggestRequestBody, "suggestRequestBody");
        Utils.checkNotNull(namespaceName, "namespaceName");
        Utils.checkNotNull(revisionReference, "revisionReference");
        Utils.checkNotNull(xSessionId, "xSessionId");
        this.suggestRequestBody = suggestRequestBody;
        this.namespaceName = namespaceName;
        this.revisionReference = revisionReference;
        this.xSessionId = xSessionId;
    }
    
    public SuggestOpenAPIRegistryRequest(
            String namespaceName,
            String revisionReference,
            String xSessionId) {
        this(Optional.empty(), namespaceName, revisionReference, xSessionId);
    }

    /**
     * Suggest options
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<SuggestRequestBody> suggestRequestBody() {
        return (Optional<SuggestRequestBody>) suggestRequestBody;
    }

    @JsonIgnore
    public String namespaceName() {
        return namespaceName;
    }

    /**
     * Tag or digest
     */
    @JsonIgnore
    public String revisionReference() {
        return revisionReference;
    }

    @JsonIgnore
    public String xSessionId() {
        return xSessionId;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Suggest options
     */
    public SuggestOpenAPIRegistryRequest withSuggestRequestBody(SuggestRequestBody suggestRequestBody) {
        Utils.checkNotNull(suggestRequestBody, "suggestRequestBody");
        this.suggestRequestBody = Optional.ofNullable(suggestRequestBody);
        return this;
    }

    /**
     * Suggest options
     */
    public SuggestOpenAPIRegistryRequest withSuggestRequestBody(Optional<? extends SuggestRequestBody> suggestRequestBody) {
        Utils.checkNotNull(suggestRequestBody, "suggestRequestBody");
        this.suggestRequestBody = suggestRequestBody;
        return this;
    }

    public SuggestOpenAPIRegistryRequest withNamespaceName(String namespaceName) {
        Utils.checkNotNull(namespaceName, "namespaceName");
        this.namespaceName = namespaceName;
        return this;
    }

    /**
     * Tag or digest
     */
    public SuggestOpenAPIRegistryRequest withRevisionReference(String revisionReference) {
        Utils.checkNotNull(revisionReference, "revisionReference");
        this.revisionReference = revisionReference;
        return this;
    }

    public SuggestOpenAPIRegistryRequest withXSessionId(String xSessionId) {
        Utils.checkNotNull(xSessionId, "xSessionId");
        this.xSessionId = xSessionId;
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
        SuggestOpenAPIRegistryRequest other = (SuggestOpenAPIRegistryRequest) o;
        return 
            Objects.deepEquals(this.suggestRequestBody, other.suggestRequestBody) &&
            Objects.deepEquals(this.namespaceName, other.namespaceName) &&
            Objects.deepEquals(this.revisionReference, other.revisionReference) &&
            Objects.deepEquals(this.xSessionId, other.xSessionId);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            suggestRequestBody,
            namespaceName,
            revisionReference,
            xSessionId);
    }
    
    @Override
    public String toString() {
        return Utils.toString(SuggestOpenAPIRegistryRequest.class,
                "suggestRequestBody", suggestRequestBody,
                "namespaceName", namespaceName,
                "revisionReference", revisionReference,
                "xSessionId", xSessionId);
    }
    
    public final static class Builder {
 
        private Optional<? extends SuggestRequestBody> suggestRequestBody = Optional.empty();
 
        private String namespaceName;
 
        private String revisionReference;
 
        private String xSessionId;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Suggest options
         */
        public Builder suggestRequestBody(SuggestRequestBody suggestRequestBody) {
            Utils.checkNotNull(suggestRequestBody, "suggestRequestBody");
            this.suggestRequestBody = Optional.ofNullable(suggestRequestBody);
            return this;
        }

        /**
         * Suggest options
         */
        public Builder suggestRequestBody(Optional<? extends SuggestRequestBody> suggestRequestBody) {
            Utils.checkNotNull(suggestRequestBody, "suggestRequestBody");
            this.suggestRequestBody = suggestRequestBody;
            return this;
        }

        public Builder namespaceName(String namespaceName) {
            Utils.checkNotNull(namespaceName, "namespaceName");
            this.namespaceName = namespaceName;
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

        public Builder xSessionId(String xSessionId) {
            Utils.checkNotNull(xSessionId, "xSessionId");
            this.xSessionId = xSessionId;
            return this;
        }
        
        public SuggestOpenAPIRegistryRequest build() {
            return new SuggestOpenAPIRegistryRequest(
                suggestRequestBody,
                namespaceName,
                revisionReference,
                xSessionId);
        }
    }
}

