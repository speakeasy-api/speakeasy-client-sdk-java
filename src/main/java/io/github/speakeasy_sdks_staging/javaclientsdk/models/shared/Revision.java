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


public class Revision {

    @JsonProperty("created_at")
    private OffsetDateTime createdAt;

    @JsonProperty("digest")
    private String digest;

    /**
     * Format {namespace_id}/{revision_digest}
     */
    @JsonProperty("id")
    private String id;

    @JsonProperty("namespace_name")
    private String namespaceName;

    @JsonProperty("tags")
    private java.util.List<String> tags;

    @JsonProperty("updated_at")
    private OffsetDateTime updatedAt;

    public Revision(
            @JsonProperty("created_at") OffsetDateTime createdAt,
            @JsonProperty("digest") String digest,
            @JsonProperty("id") String id,
            @JsonProperty("namespace_name") String namespaceName,
            @JsonProperty("tags") java.util.List<String> tags,
            @JsonProperty("updated_at") OffsetDateTime updatedAt) {
        Utils.checkNotNull(createdAt, "createdAt");
        Utils.checkNotNull(digest, "digest");
        Utils.checkNotNull(id, "id");
        Utils.checkNotNull(namespaceName, "namespaceName");
        Utils.checkNotNull(tags, "tags");
        Utils.checkNotNull(updatedAt, "updatedAt");
        this.createdAt = createdAt;
        this.digest = digest;
        this.id = id;
        this.namespaceName = namespaceName;
        this.tags = tags;
        this.updatedAt = updatedAt;
    }

    public OffsetDateTime createdAt() {
        return createdAt;
    }

    public String digest() {
        return digest;
    }

    /**
     * Format {namespace_id}/{revision_digest}
     */
    public String id() {
        return id;
    }

    public String namespaceName() {
        return namespaceName;
    }

    public java.util.List<String> tags() {
        return tags;
    }

    public OffsetDateTime updatedAt() {
        return updatedAt;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public Revision withCreatedAt(OffsetDateTime createdAt) {
        Utils.checkNotNull(createdAt, "createdAt");
        this.createdAt = createdAt;
        return this;
    }

    public Revision withDigest(String digest) {
        Utils.checkNotNull(digest, "digest");
        this.digest = digest;
        return this;
    }

    /**
     * Format {namespace_id}/{revision_digest}
     */
    public Revision withId(String id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }

    public Revision withNamespaceName(String namespaceName) {
        Utils.checkNotNull(namespaceName, "namespaceName");
        this.namespaceName = namespaceName;
        return this;
    }

    public Revision withTags(java.util.List<String> tags) {
        Utils.checkNotNull(tags, "tags");
        this.tags = tags;
        return this;
    }

    public Revision withUpdatedAt(OffsetDateTime updatedAt) {
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
        Revision other = (Revision) o;
        return 
            java.util.Objects.deepEquals(this.createdAt, other.createdAt) &&
            java.util.Objects.deepEquals(this.digest, other.digest) &&
            java.util.Objects.deepEquals(this.id, other.id) &&
            java.util.Objects.deepEquals(this.namespaceName, other.namespaceName) &&
            java.util.Objects.deepEquals(this.tags, other.tags) &&
            java.util.Objects.deepEquals(this.updatedAt, other.updatedAt);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            createdAt,
            digest,
            id,
            namespaceName,
            tags,
            updatedAt);
    }
    
    @Override
    public String toString() {
        return Utils.toString(Revision.class,
                "createdAt", createdAt,
                "digest", digest,
                "id", id,
                "namespaceName", namespaceName,
                "tags", tags,
                "updatedAt", updatedAt);
    }
    
    public final static class Builder {
 
        private OffsetDateTime createdAt;
 
        private String digest;
 
        private String id;
 
        private String namespaceName;
 
        private java.util.List<String> tags;
 
        private OffsetDateTime updatedAt;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder createdAt(OffsetDateTime createdAt) {
            Utils.checkNotNull(createdAt, "createdAt");
            this.createdAt = createdAt;
            return this;
        }

        public Builder digest(String digest) {
            Utils.checkNotNull(digest, "digest");
            this.digest = digest;
            return this;
        }

        /**
         * Format {namespace_id}/{revision_digest}
         */
        public Builder id(String id) {
            Utils.checkNotNull(id, "id");
            this.id = id;
            return this;
        }

        public Builder namespaceName(String namespaceName) {
            Utils.checkNotNull(namespaceName, "namespaceName");
            this.namespaceName = namespaceName;
            return this;
        }

        public Builder tags(java.util.List<String> tags) {
            Utils.checkNotNull(tags, "tags");
            this.tags = tags;
            return this;
        }

        public Builder updatedAt(OffsetDateTime updatedAt) {
            Utils.checkNotNull(updatedAt, "updatedAt");
            this.updatedAt = updatedAt;
            return this;
        }
        
        public Revision build() {
            return new Revision(
                createdAt,
                digest,
                id,
                namespaceName,
                tags,
                updatedAt);
        }
    }
}
