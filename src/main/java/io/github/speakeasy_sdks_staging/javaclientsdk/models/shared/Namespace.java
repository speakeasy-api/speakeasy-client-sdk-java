/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package io.github.speakeasy_sdks_staging.javaclientsdk.models.shared;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import io.github.speakeasy_sdks_staging.javaclientsdk.utils.Utils;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.OffsetDateTime;

/**
 * Namespace - A namespace contains many revisions.
 */

public class Namespace {

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

    @JsonProperty("updated_at")
    private OffsetDateTime updatedAt;

    public Namespace(
            @JsonProperty("created_at") OffsetDateTime createdAt,
            @JsonProperty("id") String id,
            @JsonProperty("name") String name,
            @JsonProperty("updated_at") OffsetDateTime updatedAt) {
        Utils.checkNotNull(createdAt, "createdAt");
        Utils.checkNotNull(id, "id");
        Utils.checkNotNull(name, "name");
        Utils.checkNotNull(updatedAt, "updatedAt");
        this.createdAt = createdAt;
        this.id = id;
        this.name = name;
        this.updatedAt = updatedAt;
    }

    public OffsetDateTime createdAt() {
        return createdAt;
    }

    /**
     * {organization_slug}/{workspace_slug}/{namespace_name}
     */
    public String id() {
        return id;
    }

    /**
     * A human-readable name for the namespace.
     */
    public String name() {
        return name;
    }

    public OffsetDateTime updatedAt() {
        return updatedAt;
    }

    public final static Builder builder() {
        return new Builder();
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
            java.util.Objects.deepEquals(this.createdAt, other.createdAt) &&
            java.util.Objects.deepEquals(this.id, other.id) &&
            java.util.Objects.deepEquals(this.name, other.name) &&
            java.util.Objects.deepEquals(this.updatedAt, other.updatedAt);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            createdAt,
            id,
            name,
            updatedAt);
    }
    
    @Override
    public String toString() {
        return Utils.toString(Namespace.class,
                "createdAt", createdAt,
                "id", id,
                "name", name,
                "updatedAt", updatedAt);
    }
    
    public final static class Builder {
 
        private OffsetDateTime createdAt;
 
        private String id;
 
        private String name;
 
        private OffsetDateTime updatedAt;  
        
        private Builder() {
          // force use of static builder() method
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

        public Builder updatedAt(OffsetDateTime updatedAt) {
            Utils.checkNotNull(updatedAt, "updatedAt");
            this.updatedAt = updatedAt;
            return this;
        }
        
        public Namespace build() {
            return new Namespace(
                createdAt,
                id,
                name,
                updatedAt);
        }
    }
}

