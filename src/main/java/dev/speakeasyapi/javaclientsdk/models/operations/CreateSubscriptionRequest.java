/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package dev.speakeasyapi.javaclientsdk.models.operations;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import dev.speakeasyapi.javaclientsdk.models.shared.RegistrySubscription;
import dev.speakeasyapi.javaclientsdk.utils.SpeakeasyMetadata;
import dev.speakeasyapi.javaclientsdk.utils.Utils;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;


public class CreateSubscriptionRequest {

    /**
     * The subscription to create
     */
    @SpeakeasyMetadata("request:mediaType=application/json")
    private RegistrySubscription registrySubscription;

    /**
     * The workspace ID
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=workspace_id")
    private Optional<String> workspaceId;

    @JsonCreator
    public CreateSubscriptionRequest(
            RegistrySubscription registrySubscription,
            Optional<String> workspaceId) {
        Utils.checkNotNull(registrySubscription, "registrySubscription");
        Utils.checkNotNull(workspaceId, "workspaceId");
        this.registrySubscription = registrySubscription;
        this.workspaceId = workspaceId;
    }
    
    public CreateSubscriptionRequest(
            RegistrySubscription registrySubscription) {
        this(registrySubscription, Optional.empty());
    }

    /**
     * The subscription to create
     */
    @JsonIgnore
    public RegistrySubscription registrySubscription() {
        return registrySubscription;
    }

    /**
     * The workspace ID
     */
    @JsonIgnore
    public Optional<String> workspaceId() {
        return workspaceId;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * The subscription to create
     */
    public CreateSubscriptionRequest withRegistrySubscription(RegistrySubscription registrySubscription) {
        Utils.checkNotNull(registrySubscription, "registrySubscription");
        this.registrySubscription = registrySubscription;
        return this;
    }

    /**
     * The workspace ID
     */
    public CreateSubscriptionRequest withWorkspaceId(String workspaceId) {
        Utils.checkNotNull(workspaceId, "workspaceId");
        this.workspaceId = Optional.ofNullable(workspaceId);
        return this;
    }

    /**
     * The workspace ID
     */
    public CreateSubscriptionRequest withWorkspaceId(Optional<String> workspaceId) {
        Utils.checkNotNull(workspaceId, "workspaceId");
        this.workspaceId = workspaceId;
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
        CreateSubscriptionRequest other = (CreateSubscriptionRequest) o;
        return 
            Objects.deepEquals(this.registrySubscription, other.registrySubscription) &&
            Objects.deepEquals(this.workspaceId, other.workspaceId);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            registrySubscription,
            workspaceId);
    }
    
    @Override
    public String toString() {
        return Utils.toString(CreateSubscriptionRequest.class,
                "registrySubscription", registrySubscription,
                "workspaceId", workspaceId);
    }
    
    public final static class Builder {
 
        private RegistrySubscription registrySubscription;
 
        private Optional<String> workspaceId = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The subscription to create
         */
        public Builder registrySubscription(RegistrySubscription registrySubscription) {
            Utils.checkNotNull(registrySubscription, "registrySubscription");
            this.registrySubscription = registrySubscription;
            return this;
        }

        /**
         * The workspace ID
         */
        public Builder workspaceId(String workspaceId) {
            Utils.checkNotNull(workspaceId, "workspaceId");
            this.workspaceId = Optional.ofNullable(workspaceId);
            return this;
        }

        /**
         * The workspace ID
         */
        public Builder workspaceId(Optional<String> workspaceId) {
            Utils.checkNotNull(workspaceId, "workspaceId");
            this.workspaceId = workspaceId;
            return this;
        }
        
        public CreateSubscriptionRequest build() {
            return new CreateSubscriptionRequest(
                registrySubscription,
                workspaceId);
        }
    }
}

