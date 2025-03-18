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
import java.lang.SuppressWarnings;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

public class GetAllApiVersionsRequest {

    /**
     * The ID of the Api to retrieve.
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=apiID")
    private String apiID;

    /**
     * Metadata to filter Apis on
     */
    @SpeakeasyMetadata("queryParam:style=deepObject,explode=true,name=metadata")
    private Optional<? extends Map<String, List<String>>> metadata;

    /**
     * Configuration for filter operations
     */
    @SpeakeasyMetadata("queryParam:style=deepObject,explode=true,name=op")
    private Optional<? extends Op> op;

    @JsonCreator
    public GetAllApiVersionsRequest(
            String apiID,
            Optional<? extends Map<String, List<String>>> metadata,
            Optional<? extends Op> op) {
        Utils.checkNotNull(apiID, "apiID");
        Utils.checkNotNull(metadata, "metadata");
        Utils.checkNotNull(op, "op");
        this.apiID = apiID;
        this.metadata = metadata;
        this.op = op;
    }
    
    public GetAllApiVersionsRequest(
            String apiID) {
        this(apiID, Optional.empty(), Optional.empty());
    }

    /**
     * The ID of the Api to retrieve.
     */
    @JsonIgnore
    public String apiID() {
        return apiID;
    }

    /**
     * Metadata to filter Apis on
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Map<String, List<String>>> metadata() {
        return (Optional<Map<String, List<String>>>) metadata;
    }

    /**
     * Configuration for filter operations
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Op> op() {
        return (Optional<Op>) op;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * The ID of the Api to retrieve.
     */
    public GetAllApiVersionsRequest withApiID(String apiID) {
        Utils.checkNotNull(apiID, "apiID");
        this.apiID = apiID;
        return this;
    }

    /**
     * Metadata to filter Apis on
     */
    public GetAllApiVersionsRequest withMetadata(Map<String, List<String>> metadata) {
        Utils.checkNotNull(metadata, "metadata");
        this.metadata = Optional.ofNullable(metadata);
        return this;
    }

    /**
     * Metadata to filter Apis on
     */
    public GetAllApiVersionsRequest withMetadata(Optional<? extends Map<String, List<String>>> metadata) {
        Utils.checkNotNull(metadata, "metadata");
        this.metadata = metadata;
        return this;
    }

    /**
     * Configuration for filter operations
     */
    public GetAllApiVersionsRequest withOp(Op op) {
        Utils.checkNotNull(op, "op");
        this.op = Optional.ofNullable(op);
        return this;
    }

    /**
     * Configuration for filter operations
     */
    public GetAllApiVersionsRequest withOp(Optional<? extends Op> op) {
        Utils.checkNotNull(op, "op");
        this.op = op;
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
        GetAllApiVersionsRequest other = (GetAllApiVersionsRequest) o;
        return 
            Objects.deepEquals(this.apiID, other.apiID) &&
            Objects.deepEquals(this.metadata, other.metadata) &&
            Objects.deepEquals(this.op, other.op);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            apiID,
            metadata,
            op);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetAllApiVersionsRequest.class,
                "apiID", apiID,
                "metadata", metadata,
                "op", op);
    }
    
    public final static class Builder {
 
        private String apiID;
 
        private Optional<? extends Map<String, List<String>>> metadata = Optional.empty();
 
        private Optional<? extends Op> op = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The ID of the Api to retrieve.
         */
        public Builder apiID(String apiID) {
            Utils.checkNotNull(apiID, "apiID");
            this.apiID = apiID;
            return this;
        }

        /**
         * Metadata to filter Apis on
         */
        public Builder metadata(Map<String, List<String>> metadata) {
            Utils.checkNotNull(metadata, "metadata");
            this.metadata = Optional.ofNullable(metadata);
            return this;
        }

        /**
         * Metadata to filter Apis on
         */
        public Builder metadata(Optional<? extends Map<String, List<String>>> metadata) {
            Utils.checkNotNull(metadata, "metadata");
            this.metadata = metadata;
            return this;
        }

        /**
         * Configuration for filter operations
         */
        public Builder op(Op op) {
            Utils.checkNotNull(op, "op");
            this.op = Optional.ofNullable(op);
            return this;
        }

        /**
         * Configuration for filter operations
         */
        public Builder op(Optional<? extends Op> op) {
            Utils.checkNotNull(op, "op");
            this.op = op;
            return this;
        }
        
        public GetAllApiVersionsRequest build() {
            return new GetAllApiVersionsRequest(
                apiID,
                metadata,
                op);
        }
    }
}

