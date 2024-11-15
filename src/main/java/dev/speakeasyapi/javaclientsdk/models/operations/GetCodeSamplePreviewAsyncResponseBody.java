/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package dev.speakeasyapi.javaclientsdk.models.operations;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import dev.speakeasyapi.javaclientsdk.models.shared.CodeSamplesJobStatus;
import dev.speakeasyapi.javaclientsdk.utils.Utils;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * GetCodeSamplePreviewAsyncResponseBody - Job is still in progress
 */

public class GetCodeSamplePreviewAsyncResponseBody {

    /**
     * The current status of the job. Possible values are `pending` or `running`.
     */
    @JsonProperty("status")
    private CodeSamplesJobStatus status;

    @JsonCreator
    public GetCodeSamplePreviewAsyncResponseBody(
            @JsonProperty("status") CodeSamplesJobStatus status) {
        Utils.checkNotNull(status, "status");
        this.status = status;
    }

    /**
     * The current status of the job. Possible values are `pending` or `running`.
     */
    @JsonIgnore
    public CodeSamplesJobStatus status() {
        return status;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * The current status of the job. Possible values are `pending` or `running`.
     */
    public GetCodeSamplePreviewAsyncResponseBody withStatus(CodeSamplesJobStatus status) {
        Utils.checkNotNull(status, "status");
        this.status = status;
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
        GetCodeSamplePreviewAsyncResponseBody other = (GetCodeSamplePreviewAsyncResponseBody) o;
        return 
            Objects.deepEquals(this.status, other.status);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            status);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetCodeSamplePreviewAsyncResponseBody.class,
                "status", status);
    }
    
    public final static class Builder {
 
        private CodeSamplesJobStatus status;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The current status of the job. Possible values are `pending` or `running`.
         */
        public Builder status(CodeSamplesJobStatus status) {
            Utils.checkNotNull(status, "status");
            this.status = status;
            return this;
        }
        
        public GetCodeSamplePreviewAsyncResponseBody build() {
            return new GetCodeSamplePreviewAsyncResponseBody(
                status);
        }
    }
}

