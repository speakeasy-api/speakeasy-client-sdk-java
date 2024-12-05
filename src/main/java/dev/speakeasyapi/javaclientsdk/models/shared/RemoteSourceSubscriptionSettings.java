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
import java.util.List;
import java.util.Objects;


public class RemoteSourceSubscriptionSettings {

    @JsonProperty("base_spec_namespaces")
    private List<String> baseSpecNamespaces;

    @JsonProperty("output_namespace")
    private String outputNamespace;

    @JsonProperty("overlay_namespaces")
    private List<String> overlayNamespaces;

    @JsonCreator
    public RemoteSourceSubscriptionSettings(
            @JsonProperty("base_spec_namespaces") List<String> baseSpecNamespaces,
            @JsonProperty("output_namespace") String outputNamespace,
            @JsonProperty("overlay_namespaces") List<String> overlayNamespaces) {
        Utils.checkNotNull(baseSpecNamespaces, "baseSpecNamespaces");
        Utils.checkNotNull(outputNamespace, "outputNamespace");
        Utils.checkNotNull(overlayNamespaces, "overlayNamespaces");
        this.baseSpecNamespaces = baseSpecNamespaces;
        this.outputNamespace = outputNamespace;
        this.overlayNamespaces = overlayNamespaces;
    }

    @JsonIgnore
    public List<String> baseSpecNamespaces() {
        return baseSpecNamespaces;
    }

    @JsonIgnore
    public String outputNamespace() {
        return outputNamespace;
    }

    @JsonIgnore
    public List<String> overlayNamespaces() {
        return overlayNamespaces;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public RemoteSourceSubscriptionSettings withBaseSpecNamespaces(List<String> baseSpecNamespaces) {
        Utils.checkNotNull(baseSpecNamespaces, "baseSpecNamespaces");
        this.baseSpecNamespaces = baseSpecNamespaces;
        return this;
    }

    public RemoteSourceSubscriptionSettings withOutputNamespace(String outputNamespace) {
        Utils.checkNotNull(outputNamespace, "outputNamespace");
        this.outputNamespace = outputNamespace;
        return this;
    }

    public RemoteSourceSubscriptionSettings withOverlayNamespaces(List<String> overlayNamespaces) {
        Utils.checkNotNull(overlayNamespaces, "overlayNamespaces");
        this.overlayNamespaces = overlayNamespaces;
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
        RemoteSourceSubscriptionSettings other = (RemoteSourceSubscriptionSettings) o;
        return 
            Objects.deepEquals(this.baseSpecNamespaces, other.baseSpecNamespaces) &&
            Objects.deepEquals(this.outputNamespace, other.outputNamespace) &&
            Objects.deepEquals(this.overlayNamespaces, other.overlayNamespaces);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            baseSpecNamespaces,
            outputNamespace,
            overlayNamespaces);
    }
    
    @Override
    public String toString() {
        return Utils.toString(RemoteSourceSubscriptionSettings.class,
                "baseSpecNamespaces", baseSpecNamespaces,
                "outputNamespace", outputNamespace,
                "overlayNamespaces", overlayNamespaces);
    }
    
    public final static class Builder {
 
        private List<String> baseSpecNamespaces;
 
        private String outputNamespace;
 
        private List<String> overlayNamespaces;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder baseSpecNamespaces(List<String> baseSpecNamespaces) {
            Utils.checkNotNull(baseSpecNamespaces, "baseSpecNamespaces");
            this.baseSpecNamespaces = baseSpecNamespaces;
            return this;
        }

        public Builder outputNamespace(String outputNamespace) {
            Utils.checkNotNull(outputNamespace, "outputNamespace");
            this.outputNamespace = outputNamespace;
            return this;
        }

        public Builder overlayNamespaces(List<String> overlayNamespaces) {
            Utils.checkNotNull(overlayNamespaces, "overlayNamespaces");
            this.overlayNamespaces = overlayNamespaces;
            return this;
        }
        
        public RemoteSourceSubscriptionSettings build() {
            return new RemoteSourceSubscriptionSettings(
                baseSpecNamespaces,
                outputNamespace,
                overlayNamespaces);
        }
    }
}
