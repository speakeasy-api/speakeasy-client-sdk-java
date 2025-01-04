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
import java.util.Objects;
import java.util.Optional;


public class GetCodeSamplesRequest {

    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=languages")
    private Optional<? extends List<String>> languages;

    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=operation_ids")
    private Optional<? extends List<String>> operationIds;

    /**
     * The registry URL from which to retrieve the snippets. E.g. https://spec.speakeasy.com/org/ws/my-source
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=registry_url")
    private String registryUrl;

    @JsonCreator
    public GetCodeSamplesRequest(
            Optional<? extends List<String>> languages,
            Optional<? extends List<String>> operationIds,
            String registryUrl) {
        Utils.checkNotNull(languages, "languages");
        Utils.checkNotNull(operationIds, "operationIds");
        Utils.checkNotNull(registryUrl, "registryUrl");
        this.languages = languages;
        this.operationIds = operationIds;
        this.registryUrl = registryUrl;
    }
    
    public GetCodeSamplesRequest(
            String registryUrl) {
        this(Optional.empty(), Optional.empty(), registryUrl);
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<List<String>> languages() {
        return (Optional<List<String>>) languages;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<List<String>> operationIds() {
        return (Optional<List<String>>) operationIds;
    }

    /**
     * The registry URL from which to retrieve the snippets. E.g. https://spec.speakeasy.com/org/ws/my-source
     */
    @JsonIgnore
    public String registryUrl() {
        return registryUrl;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public GetCodeSamplesRequest withLanguages(List<String> languages) {
        Utils.checkNotNull(languages, "languages");
        this.languages = Optional.ofNullable(languages);
        return this;
    }

    public GetCodeSamplesRequest withLanguages(Optional<? extends List<String>> languages) {
        Utils.checkNotNull(languages, "languages");
        this.languages = languages;
        return this;
    }

    public GetCodeSamplesRequest withOperationIds(List<String> operationIds) {
        Utils.checkNotNull(operationIds, "operationIds");
        this.operationIds = Optional.ofNullable(operationIds);
        return this;
    }

    public GetCodeSamplesRequest withOperationIds(Optional<? extends List<String>> operationIds) {
        Utils.checkNotNull(operationIds, "operationIds");
        this.operationIds = operationIds;
        return this;
    }

    /**
     * The registry URL from which to retrieve the snippets. E.g. https://spec.speakeasy.com/org/ws/my-source
     */
    public GetCodeSamplesRequest withRegistryUrl(String registryUrl) {
        Utils.checkNotNull(registryUrl, "registryUrl");
        this.registryUrl = registryUrl;
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
        GetCodeSamplesRequest other = (GetCodeSamplesRequest) o;
        return 
            Objects.deepEquals(this.languages, other.languages) &&
            Objects.deepEquals(this.operationIds, other.operationIds) &&
            Objects.deepEquals(this.registryUrl, other.registryUrl);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            languages,
            operationIds,
            registryUrl);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetCodeSamplesRequest.class,
                "languages", languages,
                "operationIds", operationIds,
                "registryUrl", registryUrl);
    }
    
    public final static class Builder {
 
        private Optional<? extends List<String>> languages = Optional.empty();
 
        private Optional<? extends List<String>> operationIds = Optional.empty();
 
        private String registryUrl;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder languages(List<String> languages) {
            Utils.checkNotNull(languages, "languages");
            this.languages = Optional.ofNullable(languages);
            return this;
        }

        public Builder languages(Optional<? extends List<String>> languages) {
            Utils.checkNotNull(languages, "languages");
            this.languages = languages;
            return this;
        }

        public Builder operationIds(List<String> operationIds) {
            Utils.checkNotNull(operationIds, "operationIds");
            this.operationIds = Optional.ofNullable(operationIds);
            return this;
        }

        public Builder operationIds(Optional<? extends List<String>> operationIds) {
            Utils.checkNotNull(operationIds, "operationIds");
            this.operationIds = operationIds;
            return this;
        }

        /**
         * The registry URL from which to retrieve the snippets. E.g. https://spec.speakeasy.com/org/ws/my-source
         */
        public Builder registryUrl(String registryUrl) {
            Utils.checkNotNull(registryUrl, "registryUrl");
            this.registryUrl = registryUrl;
            return this;
        }
        
        public GetCodeSamplesRequest build() {
            return new GetCodeSamplesRequest(
                languages,
                operationIds,
                registryUrl);
        }
    }
}

