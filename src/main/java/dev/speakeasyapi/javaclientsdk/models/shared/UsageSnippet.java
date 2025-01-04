/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package dev.speakeasyapi.javaclientsdk.models.shared;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import dev.speakeasyapi.javaclientsdk.utils.Utils;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class UsageSnippet {

    /**
     * The code snippet
     */
    @JsonProperty("code")
    private String code;

    /**
     * The language of the snippet
     */
    @JsonProperty("language")
    private String language;

    /**
     * The operation ID for the snippet
     */
    @JsonProperty("operationId")
    private String operationId;

    @JsonCreator
    public UsageSnippet(
            @JsonProperty("code") String code,
            @JsonProperty("language") String language,
            @JsonProperty("operationId") String operationId) {
        Utils.checkNotNull(code, "code");
        Utils.checkNotNull(language, "language");
        Utils.checkNotNull(operationId, "operationId");
        this.code = code;
        this.language = language;
        this.operationId = operationId;
    }

    /**
     * The code snippet
     */
    @JsonIgnore
    public String code() {
        return code;
    }

    /**
     * The language of the snippet
     */
    @JsonIgnore
    public String language() {
        return language;
    }

    /**
     * The operation ID for the snippet
     */
    @JsonIgnore
    public String operationId() {
        return operationId;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * The code snippet
     */
    public UsageSnippet withCode(String code) {
        Utils.checkNotNull(code, "code");
        this.code = code;
        return this;
    }

    /**
     * The language of the snippet
     */
    public UsageSnippet withLanguage(String language) {
        Utils.checkNotNull(language, "language");
        this.language = language;
        return this;
    }

    /**
     * The operation ID for the snippet
     */
    public UsageSnippet withOperationId(String operationId) {
        Utils.checkNotNull(operationId, "operationId");
        this.operationId = operationId;
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
        UsageSnippet other = (UsageSnippet) o;
        return 
            Objects.deepEquals(this.code, other.code) &&
            Objects.deepEquals(this.language, other.language) &&
            Objects.deepEquals(this.operationId, other.operationId);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            code,
            language,
            operationId);
    }
    
    @Override
    public String toString() {
        return Utils.toString(UsageSnippet.class,
                "code", code,
                "language", language,
                "operationId", operationId);
    }
    
    public final static class Builder {
 
        private String code;
 
        private String language;
 
        private String operationId;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The code snippet
         */
        public Builder code(String code) {
            Utils.checkNotNull(code, "code");
            this.code = code;
            return this;
        }

        /**
         * The language of the snippet
         */
        public Builder language(String language) {
            Utils.checkNotNull(language, "language");
            this.language = language;
            return this;
        }

        /**
         * The operation ID for the snippet
         */
        public Builder operationId(String operationId) {
            Utils.checkNotNull(operationId, "operationId");
            this.operationId = operationId;
            return this;
        }
        
        public UsageSnippet build() {
            return new UsageSnippet(
                code,
                language,
                operationId);
        }
    }
}

