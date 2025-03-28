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

public class GetApisRequest {

    /**
     * Metadata to filter Apis on
     */
    @SpeakeasyMetadata("queryParam:style=deepObject,explode=true,name=metadata")
    private Optional<? extends Map<String, List<String>>> metadata;

    /**
     * Configuration for filter operations
     */
    @SpeakeasyMetadata("queryParam:style=deepObject,explode=true,name=op")
    private Optional<? extends QueryParamOp> op;

    @JsonCreator
    public GetApisRequest(
            Optional<? extends Map<String, List<String>>> metadata,
            Optional<? extends QueryParamOp> op) {
        Utils.checkNotNull(metadata, "metadata");
        Utils.checkNotNull(op, "op");
        this.metadata = metadata;
        this.op = op;
    }
    
    public GetApisRequest() {
        this(Optional.empty(), Optional.empty());
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
    public Optional<QueryParamOp> op() {
        return (Optional<QueryParamOp>) op;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Metadata to filter Apis on
     */
    public GetApisRequest withMetadata(Map<String, List<String>> metadata) {
        Utils.checkNotNull(metadata, "metadata");
        this.metadata = Optional.ofNullable(metadata);
        return this;
    }

    /**
     * Metadata to filter Apis on
     */
    public GetApisRequest withMetadata(Optional<? extends Map<String, List<String>>> metadata) {
        Utils.checkNotNull(metadata, "metadata");
        this.metadata = metadata;
        return this;
    }

    /**
     * Configuration for filter operations
     */
    public GetApisRequest withOp(QueryParamOp op) {
        Utils.checkNotNull(op, "op");
        this.op = Optional.ofNullable(op);
        return this;
    }

    /**
     * Configuration for filter operations
     */
    public GetApisRequest withOp(Optional<? extends QueryParamOp> op) {
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
        GetApisRequest other = (GetApisRequest) o;
        return 
            Objects.deepEquals(this.metadata, other.metadata) &&
            Objects.deepEquals(this.op, other.op);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            metadata,
            op);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetApisRequest.class,
                "metadata", metadata,
                "op", op);
    }
    
    public final static class Builder {
 
        private Optional<? extends Map<String, List<String>>> metadata = Optional.empty();
 
        private Optional<? extends QueryParamOp> op = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
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
        public Builder op(QueryParamOp op) {
            Utils.checkNotNull(op, "op");
            this.op = Optional.ofNullable(op);
            return this;
        }

        /**
         * Configuration for filter operations
         */
        public Builder op(Optional<? extends QueryParamOp> op) {
            Utils.checkNotNull(op, "op");
            this.op = op;
            return this;
        }
        
        public GetApisRequest build() {
            return new GetApisRequest(
                metadata,
                op);
        }
    }
}

