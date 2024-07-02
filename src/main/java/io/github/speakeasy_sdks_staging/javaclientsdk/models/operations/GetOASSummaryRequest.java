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

public class GetOASSummaryRequest {

    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=namespace_name")
    private String namespaceName;

    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=revision_reference")
    private String revisionReference;

    @JsonCreator
    public GetOASSummaryRequest(
            String namespaceName,
            String revisionReference) {
        Utils.checkNotNull(namespaceName, "namespaceName");
        Utils.checkNotNull(revisionReference, "revisionReference");
        this.namespaceName = namespaceName;
        this.revisionReference = revisionReference;
    }

    @JsonIgnore
    public String namespaceName() {
        return namespaceName;
    }

    @JsonIgnore
    public String revisionReference() {
        return revisionReference;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public GetOASSummaryRequest withNamespaceName(String namespaceName) {
        Utils.checkNotNull(namespaceName, "namespaceName");
        this.namespaceName = namespaceName;
        return this;
    }

    public GetOASSummaryRequest withRevisionReference(String revisionReference) {
        Utils.checkNotNull(revisionReference, "revisionReference");
        this.revisionReference = revisionReference;
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
        GetOASSummaryRequest other = (GetOASSummaryRequest) o;
        return 
            java.util.Objects.deepEquals(this.namespaceName, other.namespaceName) &&
            java.util.Objects.deepEquals(this.revisionReference, other.revisionReference);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            namespaceName,
            revisionReference);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetOASSummaryRequest.class,
                "namespaceName", namespaceName,
                "revisionReference", revisionReference);
    }
    
    public final static class Builder {
 
        private String namespaceName;
 
        private String revisionReference;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder namespaceName(String namespaceName) {
            Utils.checkNotNull(namespaceName, "namespaceName");
            this.namespaceName = namespaceName;
            return this;
        }

        public Builder revisionReference(String revisionReference) {
            Utils.checkNotNull(revisionReference, "revisionReference");
            this.revisionReference = revisionReference;
            return this;
        }
        
        public GetOASSummaryRequest build() {
            return new GetOASSummaryRequest(
                namespaceName,
                revisionReference);
        }
    }
}

