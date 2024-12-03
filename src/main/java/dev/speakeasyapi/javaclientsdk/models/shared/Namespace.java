/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package dev.speakeasyapi.javaclientsdk.models.shared;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import dev.speakeasyapi.javaclientsdk.utils.Utils;
import java.lang.Boolean;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.time.OffsetDateTime;
import java.util.Objects;
import java.util.Optional;

/**
 * Namespace - A namespace contains many revisions.
 */

public class Namespace {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("composite_spec_metadata")
    private Optional<? extends CompositeSpecMetadata> compositeSpecMetadata;

    @JsonProperty("created_at")
    private OffsetDateTime createdAt;

    /**
     * {organization_slug}/{workspace_slug}/{namespace_name}
     */
    @JsonProperty("id")
    private String id;

    /**
     * A human-readable name for the namespace.
     */
    @JsonProperty("name")
    private String name;

    /**
     * Indicates whether the namespace is publicly accessible
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("public")
    private Optional<Boolean> public_;

    @JsonProperty("updated_at")
    private OffsetDateTime updatedAt;

    @JsonCreator
    public Namespace(
            @JsonProperty("composite_spec_metadata") Optional<? extends CompositeSpecMetadata> compositeSpecMetadata,
            @JsonProperty("created_at") OffsetDateTime createdAt,
            @JsonProperty("id") String id,
            @JsonProperty("name") String name,
            @JsonProperty("public") Optional<Boolean> public_,
            @JsonProperty("updated_at") OffsetDateTime updatedAt) {
        Utils.checkNotNull(compositeSpecMetadata, "compositeSpecMetadata");
        Utils.checkNotNull(createdAt, "createdAt");
        Utils.checkNotNull(id, "id");
        Utils.checkNotNull(name, "name");
        Utils.checkNotNull(public_, "public_");
        Utils.checkNotNull(updatedAt, "updatedAt");
        this.compositeSpecMetadata = compositeSpecMetadata;
        this.createdAt = createdAt;
        this.id = id;
        this.name = name;
        this.public_ = public_;
        this.updatedAt = updatedAt;
    }
    
    public Namespace(
            OffsetDateTime createdAt,
            String id,
            String name,
            OffsetDateTime updatedAt) {
        this(Optional.empty(), createdAt, id, name, Optional.empty(), updatedAt);
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<CompositeSpecMetadata> compositeSpecMetadata() {
        return (Optional<CompositeSpecMetadata>) compositeSpecMetadata;
    }

    @JsonIgnore
    public OffsetDateTime createdAt() {
        return createdAt;
    }

    /**
     * {organization_slug}/{workspace_slug}/{namespace_name}
     */
    @JsonIgnore
    public String id() {
        return id;
    }

    /**
     * A human-readable name for the namespace.
     */
    @JsonIgnore
    public String name() {
        return name;
    }

    /**
     * Indicates whether the namespace is publicly accessible
     */
    @JsonIgnore
    public Optional<Boolean> public_() {
        return public_;
    }

    @JsonIgnore
    public OffsetDateTime updatedAt() {
        return updatedAt;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public Namespace withCompositeSpecMetadata(CompositeSpecMetadata compositeSpecMetadata) {
        Utils.checkNotNull(compositeSpecMetadata, "compositeSpecMetadata");
        this.compositeSpecMetadata = Optional.ofNullable(compositeSpecMetadata);
        return this;
    }

    public Namespace withCompositeSpecMetadata(Optional<? extends CompositeSpecMetadata> compositeSpecMetadata) {
        Utils.checkNotNull(compositeSpecMetadata, "compositeSpecMetadata");
        this.compositeSpecMetadata = compositeSpecMetadata;
        return this;
    }

    public Namespace withCreatedAt(OffsetDateTime createdAt) {
        Utils.checkNotNull(createdAt, "createdAt");
        this.createdAt = createdAt;
        return this;
    }

    /**
     * {organization_slug}/{workspace_slug}/{namespace_name}
     */
    public Namespace withId(String id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }

    /**
     * A human-readable name for the namespace.
     */
    public Namespace withName(String name) {
        Utils.checkNotNull(name, "name");
        this.name = name;
        return this;
    }

    /**
     * Indicates whether the namespace is publicly accessible
     */
    public Namespace withPublic(boolean public_) {
        Utils.checkNotNull(public_, "public_");
        this.public_ = Optional.ofNullable(public_);
        return this;
    }

    /**
     * Indicates whether the namespace is publicly accessible
     */
    public Namespace withPublic(Optional<Boolean> public_) {
        Utils.checkNotNull(public_, "public_");
        this.public_ = public_;
        return this;
    }

    public Namespace withUpdatedAt(OffsetDateTime updatedAt) {
        Utils.checkNotNull(updatedAt, "updatedAt");
        this.updatedAt = updatedAt;
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
        Namespace other = (Namespace) o;
        return 
            Objects.deepEquals(this.compositeSpecMetadata, other.compositeSpecMetadata) &&
            Objects.deepEquals(this.createdAt, other.createdAt) &&
            Objects.deepEquals(this.id, other.id) &&
            Objects.deepEquals(this.name, other.name) &&
            Objects.deepEquals(this.public_, other.public_) &&
            Objects.deepEquals(this.updatedAt, other.updatedAt);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            compositeSpecMetadata,
            createdAt,
            id,
            name,
            public_,
            updatedAt);
    }
    
    @Override
    public String toString() {
        return Utils.toString(Namespace.class,
                "compositeSpecMetadata", compositeSpecMetadata,
                "createdAt", createdAt,
                "id", id,
                "name", name,
                "public_", public_,
                "updatedAt", updatedAt);
    }
    
    public final static class Builder {
 
        private Optional<? extends CompositeSpecMetadata> compositeSpecMetadata = Optional.empty();
 
        private OffsetDateTime createdAt;
 
        private String id;
 
        private String name;
 
        private Optional<Boolean> public_ = Optional.empty();
 
        private OffsetDateTime updatedAt;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder compositeSpecMetadata(CompositeSpecMetadata compositeSpecMetadata) {
            Utils.checkNotNull(compositeSpecMetadata, "compositeSpecMetadata");
            this.compositeSpecMetadata = Optional.ofNullable(compositeSpecMetadata);
            return this;
        }

        public Builder compositeSpecMetadata(Optional<? extends CompositeSpecMetadata> compositeSpecMetadata) {
            Utils.checkNotNull(compositeSpecMetadata, "compositeSpecMetadata");
            this.compositeSpecMetadata = compositeSpecMetadata;
            return this;
        }

        public Builder createdAt(OffsetDateTime createdAt) {
            Utils.checkNotNull(createdAt, "createdAt");
            this.createdAt = createdAt;
            return this;
        }

        /**
         * {organization_slug}/{workspace_slug}/{namespace_name}
         */
        public Builder id(String id) {
            Utils.checkNotNull(id, "id");
            this.id = id;
            return this;
        }

        /**
         * A human-readable name for the namespace.
         */
        public Builder name(String name) {
            Utils.checkNotNull(name, "name");
            this.name = name;
            return this;
        }

        /**
         * Indicates whether the namespace is publicly accessible
         */
        public Builder public_(boolean public_) {
            Utils.checkNotNull(public_, "public_");
            this.public_ = Optional.ofNullable(public_);
            return this;
        }

        /**
         * Indicates whether the namespace is publicly accessible
         */
        public Builder public_(Optional<Boolean> public_) {
            Utils.checkNotNull(public_, "public_");
            this.public_ = public_;
            return this;
        }

        public Builder updatedAt(OffsetDateTime updatedAt) {
            Utils.checkNotNull(updatedAt, "updatedAt");
            this.updatedAt = updatedAt;
            return this;
        }
        
        public Namespace build() {
            return new Namespace(
                compositeSpecMetadata,
                createdAt,
                id,
                name,
                public_,
                updatedAt);
        }
    }
}

