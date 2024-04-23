/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package io.github.speakeasy_sdks_staging.javaclientsdk.models.shared;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import io.github.speakeasy_sdks_staging.javaclientsdk.utils.Utils;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Optional;

/**
 * ApiInput - An Api is representation of a API (a collection of API Endpoints) within the Speakeasy Platform.
 */

public class ApiInput {

    /**
     * The ID of this Api. This is a human-readable name (subject to change).
     */
    @JsonProperty("api_id")
    private String apiId;

    /**
     * A detailed description of the Api.
     */
    @JsonProperty("description")
    private String description;

    /**
     * A set of values associated with a meta_data key. This field is only set on get requests.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("meta_data")
    private Optional<? extends java.util.Map<String, java.util.List<String>>> metaData;

    /**
     * The version ID of this Api. This is semantic version identifier.
     */
    @JsonProperty("version_id")
    private String versionId;

    @JsonCreator
    public ApiInput(
            @JsonProperty("api_id") String apiId,
            @JsonProperty("description") String description,
            @JsonProperty("meta_data") Optional<? extends java.util.Map<String, java.util.List<String>>> metaData,
            @JsonProperty("version_id") String versionId) {
        Utils.checkNotNull(apiId, "apiId");
        Utils.checkNotNull(description, "description");
        Utils.checkNotNull(metaData, "metaData");
        Utils.checkNotNull(versionId, "versionId");
        this.apiId = apiId;
        this.description = description;
        this.metaData = metaData;
        this.versionId = versionId;
    }
    
    public ApiInput(
            String apiId,
            String description,
            String versionId) {
        this(apiId, description, Optional.empty(), versionId);
    }

    /**
     * The ID of this Api. This is a human-readable name (subject to change).
     */
    @JsonIgnore
    public String apiId() {
        return apiId;
    }

    /**
     * A detailed description of the Api.
     */
    @JsonIgnore
    public String description() {
        return description;
    }

    /**
     * A set of values associated with a meta_data key. This field is only set on get requests.
     */
    @JsonIgnore
    public Optional<? extends java.util.Map<String, java.util.List<String>>> metaData() {
        return metaData;
    }

    /**
     * The version ID of this Api. This is semantic version identifier.
     */
    @JsonIgnore
    public String versionId() {
        return versionId;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * The ID of this Api. This is a human-readable name (subject to change).
     */
    public ApiInput withApiId(String apiId) {
        Utils.checkNotNull(apiId, "apiId");
        this.apiId = apiId;
        return this;
    }

    /**
     * A detailed description of the Api.
     */
    public ApiInput withDescription(String description) {
        Utils.checkNotNull(description, "description");
        this.description = description;
        return this;
    }

    /**
     * A set of values associated with a meta_data key. This field is only set on get requests.
     */
    public ApiInput withMetaData(java.util.Map<String, java.util.List<String>> metaData) {
        Utils.checkNotNull(metaData, "metaData");
        this.metaData = Optional.ofNullable(metaData);
        return this;
    }

    /**
     * A set of values associated with a meta_data key. This field is only set on get requests.
     */
    public ApiInput withMetaData(Optional<? extends java.util.Map<String, java.util.List<String>>> metaData) {
        Utils.checkNotNull(metaData, "metaData");
        this.metaData = metaData;
        return this;
    }

    /**
     * The version ID of this Api. This is semantic version identifier.
     */
    public ApiInput withVersionId(String versionId) {
        Utils.checkNotNull(versionId, "versionId");
        this.versionId = versionId;
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
        ApiInput other = (ApiInput) o;
        return 
            java.util.Objects.deepEquals(this.apiId, other.apiId) &&
            java.util.Objects.deepEquals(this.description, other.description) &&
            java.util.Objects.deepEquals(this.metaData, other.metaData) &&
            java.util.Objects.deepEquals(this.versionId, other.versionId);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            apiId,
            description,
            metaData,
            versionId);
    }
    
    @Override
    public String toString() {
        return Utils.toString(ApiInput.class,
                "apiId", apiId,
                "description", description,
                "metaData", metaData,
                "versionId", versionId);
    }
    
    public final static class Builder {
 
        private String apiId;
 
        private String description;
 
        private Optional<? extends java.util.Map<String, java.util.List<String>>> metaData = Optional.empty();
 
        private String versionId;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The ID of this Api. This is a human-readable name (subject to change).
         */
        public Builder apiId(String apiId) {
            Utils.checkNotNull(apiId, "apiId");
            this.apiId = apiId;
            return this;
        }

        /**
         * A detailed description of the Api.
         */
        public Builder description(String description) {
            Utils.checkNotNull(description, "description");
            this.description = description;
            return this;
        }

        /**
         * A set of values associated with a meta_data key. This field is only set on get requests.
         */
        public Builder metaData(java.util.Map<String, java.util.List<String>> metaData) {
            Utils.checkNotNull(metaData, "metaData");
            this.metaData = Optional.ofNullable(metaData);
            return this;
        }

        /**
         * A set of values associated with a meta_data key. This field is only set on get requests.
         */
        public Builder metaData(Optional<? extends java.util.Map<String, java.util.List<String>>> metaData) {
            Utils.checkNotNull(metaData, "metaData");
            this.metaData = metaData;
            return this;
        }

        /**
         * The version ID of this Api. This is semantic version identifier.
         */
        public Builder versionId(String versionId) {
            Utils.checkNotNull(versionId, "versionId");
            this.versionId = versionId;
            return this;
        }
        
        public ApiInput build() {
            return new ApiInput(
                apiId,
                description,
                metaData,
                versionId);
        }
    }
}

