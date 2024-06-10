/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package io.github.speakeasy_sdks_staging.javaclientsdk.models.shared;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import io.github.speakeasy_sdks_staging.javaclientsdk.utils.Utils;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;

public class GenerateOpenApiSpecDiff {

    @JsonProperty("current_schema")
    private String currentSchema;

    @JsonProperty("new_schema")
    private String newSchema;

    @JsonCreator
    public GenerateOpenApiSpecDiff(
            @JsonProperty("current_schema") String currentSchema,
            @JsonProperty("new_schema") String newSchema) {
        Utils.checkNotNull(currentSchema, "currentSchema");
        Utils.checkNotNull(newSchema, "newSchema");
        this.currentSchema = currentSchema;
        this.newSchema = newSchema;
    }

    @JsonIgnore
    public String currentSchema() {
        return currentSchema;
    }

    @JsonIgnore
    public String newSchema() {
        return newSchema;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public GenerateOpenApiSpecDiff withCurrentSchema(String currentSchema) {
        Utils.checkNotNull(currentSchema, "currentSchema");
        this.currentSchema = currentSchema;
        return this;
    }

    public GenerateOpenApiSpecDiff withNewSchema(String newSchema) {
        Utils.checkNotNull(newSchema, "newSchema");
        this.newSchema = newSchema;
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
        GenerateOpenApiSpecDiff other = (GenerateOpenApiSpecDiff) o;
        return 
            java.util.Objects.deepEquals(this.currentSchema, other.currentSchema) &&
            java.util.Objects.deepEquals(this.newSchema, other.newSchema);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            currentSchema,
            newSchema);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GenerateOpenApiSpecDiff.class,
                "currentSchema", currentSchema,
                "newSchema", newSchema);
    }
    
    public final static class Builder {
 
        private String currentSchema;
 
        private String newSchema;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder currentSchema(String currentSchema) {
            Utils.checkNotNull(currentSchema, "currentSchema");
            this.currentSchema = currentSchema;
            return this;
        }

        public Builder newSchema(String newSchema) {
            Utils.checkNotNull(newSchema, "newSchema");
            this.newSchema = newSchema;
            return this;
        }
        
        public GenerateOpenApiSpecDiff build() {
            return new GenerateOpenApiSpecDiff(
                currentSchema,
                newSchema);
        }
    }
}

