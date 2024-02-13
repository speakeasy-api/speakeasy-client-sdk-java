/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package io.github.speakeasy_sdks_staging.javaclientsdk.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.speakeasy_sdks_staging.javaclientsdk.utils.Utils;
import java.io.InputStream;
import java.lang.Deprecated;

/**
 * Filter - A filter is a key-value pair that can be used to filter a list of requests.
 */

public class Filter {

    /**
     * The key of the filter.
     */
    @JsonProperty("key")
    private String key;

    /**
     * The operator of the filter.
     */
    @JsonProperty("operator")
    private String operator;

    /**
     * The value of the filter.
     */
    @JsonProperty("value")
    private String value;

    public Filter(
            @JsonProperty("key") String key,
            @JsonProperty("operator") String operator,
            @JsonProperty("value") String value) {
        Utils.checkNotNull(key, "key");
        Utils.checkNotNull(operator, "operator");
        Utils.checkNotNull(value, "value");
        this.key = key;
        this.operator = operator;
        this.value = value;
    }

    /**
     * The key of the filter.
     */
    public String key() {
        return key;
    }

    /**
     * The operator of the filter.
     */
    public String operator() {
        return operator;
    }

    /**
     * The value of the filter.
     */
    public String value() {
        return value;
    }
    
    public final static Builder builder() {
        return new Builder();
    }

    /**
     * The key of the filter.
     */
    public Filter withKey(String key) {
        Utils.checkNotNull(key, "key");
        this.key = key;
        return this;
    }

    /**
     * The operator of the filter.
     */
    public Filter withOperator(String operator) {
        Utils.checkNotNull(operator, "operator");
        this.operator = operator;
        return this;
    }

    /**
     * The value of the filter.
     */
    public Filter withValue(String value) {
        Utils.checkNotNull(value, "value");
        this.value = value;
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
        Filter other = (Filter) o;
        return 
            java.util.Objects.deepEquals(this.key, other.key) &&
            java.util.Objects.deepEquals(this.operator, other.operator) &&
            java.util.Objects.deepEquals(this.value, other.value);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            key,
            operator,
            value);
    }
    
    @Override
    public String toString() {
        return Utils.toString(Filter.class,
                "key", key,
                "operator", operator,
                "value", value);
    }
    
    public final static class Builder {
 
        private String key;
 
        private String operator;
 
        private String value;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The key of the filter.
         */
        public Builder key(String key) {
            Utils.checkNotNull(key, "key");
            this.key = key;
            return this;
        }

        /**
         * The operator of the filter.
         */
        public Builder operator(String operator) {
            Utils.checkNotNull(operator, "operator");
            this.operator = operator;
            return this;
        }

        /**
         * The value of the filter.
         */
        public Builder value(String value) {
            Utils.checkNotNull(value, "value");
            this.value = value;
            return this;
        }
        
        public Filter build() {
            return new Filter(
                key,
                operator,
                value);
        }
    }
}

