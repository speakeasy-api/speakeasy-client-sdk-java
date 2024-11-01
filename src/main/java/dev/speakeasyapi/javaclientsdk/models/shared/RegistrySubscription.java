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
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

/**
 * RegistrySubscription - A subscription to a registry event
 */

public class RegistrySubscription {

    @JsonProperty("created_at")
    private OffsetDateTime createdAt;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("deleted_at")
    private Optional<OffsetDateTime> deletedAt;

    @JsonProperty("event_type")
    private EventType eventType;

    @JsonProperty("id")
    private String id;

    @JsonProperty("namespace_name")
    private String namespaceName;

    @JsonProperty("subscription_settings")
    private String subscriptionSettings;

    @JsonProperty("subscription_type")
    private SubscriptionType subscriptionType;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("tags")
    private Optional<? extends List<String>> tags;

    @JsonProperty("updated_at")
    private OffsetDateTime updatedAt;

    @JsonProperty("workspace_id")
    private String workspaceId;

    @JsonCreator
    public RegistrySubscription(
            @JsonProperty("created_at") OffsetDateTime createdAt,
            @JsonProperty("deleted_at") Optional<OffsetDateTime> deletedAt,
            @JsonProperty("event_type") EventType eventType,
            @JsonProperty("id") String id,
            @JsonProperty("namespace_name") String namespaceName,
            @JsonProperty("subscription_settings") String subscriptionSettings,
            @JsonProperty("subscription_type") SubscriptionType subscriptionType,
            @JsonProperty("tags") Optional<? extends List<String>> tags,
            @JsonProperty("updated_at") OffsetDateTime updatedAt,
            @JsonProperty("workspace_id") String workspaceId) {
        Utils.checkNotNull(createdAt, "createdAt");
        Utils.checkNotNull(deletedAt, "deletedAt");
        Utils.checkNotNull(eventType, "eventType");
        Utils.checkNotNull(id, "id");
        Utils.checkNotNull(namespaceName, "namespaceName");
        Utils.checkNotNull(subscriptionSettings, "subscriptionSettings");
        Utils.checkNotNull(subscriptionType, "subscriptionType");
        Utils.checkNotNull(tags, "tags");
        Utils.checkNotNull(updatedAt, "updatedAt");
        Utils.checkNotNull(workspaceId, "workspaceId");
        this.createdAt = createdAt;
        this.deletedAt = deletedAt;
        this.eventType = eventType;
        this.id = id;
        this.namespaceName = namespaceName;
        this.subscriptionSettings = subscriptionSettings;
        this.subscriptionType = subscriptionType;
        this.tags = tags;
        this.updatedAt = updatedAt;
        this.workspaceId = workspaceId;
    }
    
    public RegistrySubscription(
            OffsetDateTime createdAt,
            EventType eventType,
            String id,
            String namespaceName,
            String subscriptionSettings,
            SubscriptionType subscriptionType,
            OffsetDateTime updatedAt,
            String workspaceId) {
        this(createdAt, Optional.empty(), eventType, id, namespaceName, subscriptionSettings, subscriptionType, Optional.empty(), updatedAt, workspaceId);
    }

    @JsonIgnore
    public OffsetDateTime createdAt() {
        return createdAt;
    }

    @JsonIgnore
    public Optional<OffsetDateTime> deletedAt() {
        return deletedAt;
    }

    @JsonIgnore
    public EventType eventType() {
        return eventType;
    }

    @JsonIgnore
    public String id() {
        return id;
    }

    @JsonIgnore
    public String namespaceName() {
        return namespaceName;
    }

    @JsonIgnore
    public String subscriptionSettings() {
        return subscriptionSettings;
    }

    @JsonIgnore
    public SubscriptionType subscriptionType() {
        return subscriptionType;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<List<String>> tags() {
        return (Optional<List<String>>) tags;
    }

    @JsonIgnore
    public OffsetDateTime updatedAt() {
        return updatedAt;
    }

    @JsonIgnore
    public String workspaceId() {
        return workspaceId;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public RegistrySubscription withCreatedAt(OffsetDateTime createdAt) {
        Utils.checkNotNull(createdAt, "createdAt");
        this.createdAt = createdAt;
        return this;
    }

    public RegistrySubscription withDeletedAt(OffsetDateTime deletedAt) {
        Utils.checkNotNull(deletedAt, "deletedAt");
        this.deletedAt = Optional.ofNullable(deletedAt);
        return this;
    }

    public RegistrySubscription withDeletedAt(Optional<OffsetDateTime> deletedAt) {
        Utils.checkNotNull(deletedAt, "deletedAt");
        this.deletedAt = deletedAt;
        return this;
    }

    public RegistrySubscription withEventType(EventType eventType) {
        Utils.checkNotNull(eventType, "eventType");
        this.eventType = eventType;
        return this;
    }

    public RegistrySubscription withId(String id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }

    public RegistrySubscription withNamespaceName(String namespaceName) {
        Utils.checkNotNull(namespaceName, "namespaceName");
        this.namespaceName = namespaceName;
        return this;
    }

    public RegistrySubscription withSubscriptionSettings(String subscriptionSettings) {
        Utils.checkNotNull(subscriptionSettings, "subscriptionSettings");
        this.subscriptionSettings = subscriptionSettings;
        return this;
    }

    public RegistrySubscription withSubscriptionType(SubscriptionType subscriptionType) {
        Utils.checkNotNull(subscriptionType, "subscriptionType");
        this.subscriptionType = subscriptionType;
        return this;
    }

    public RegistrySubscription withTags(List<String> tags) {
        Utils.checkNotNull(tags, "tags");
        this.tags = Optional.ofNullable(tags);
        return this;
    }

    public RegistrySubscription withTags(Optional<? extends List<String>> tags) {
        Utils.checkNotNull(tags, "tags");
        this.tags = tags;
        return this;
    }

    public RegistrySubscription withUpdatedAt(OffsetDateTime updatedAt) {
        Utils.checkNotNull(updatedAt, "updatedAt");
        this.updatedAt = updatedAt;
        return this;
    }

    public RegistrySubscription withWorkspaceId(String workspaceId) {
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
        RegistrySubscription other = (RegistrySubscription) o;
        return 
            Objects.deepEquals(this.createdAt, other.createdAt) &&
            Objects.deepEquals(this.deletedAt, other.deletedAt) &&
            Objects.deepEquals(this.eventType, other.eventType) &&
            Objects.deepEquals(this.id, other.id) &&
            Objects.deepEquals(this.namespaceName, other.namespaceName) &&
            Objects.deepEquals(this.subscriptionSettings, other.subscriptionSettings) &&
            Objects.deepEquals(this.subscriptionType, other.subscriptionType) &&
            Objects.deepEquals(this.tags, other.tags) &&
            Objects.deepEquals(this.updatedAt, other.updatedAt) &&
            Objects.deepEquals(this.workspaceId, other.workspaceId);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            createdAt,
            deletedAt,
            eventType,
            id,
            namespaceName,
            subscriptionSettings,
            subscriptionType,
            tags,
            updatedAt,
            workspaceId);
    }
    
    @Override
    public String toString() {
        return Utils.toString(RegistrySubscription.class,
                "createdAt", createdAt,
                "deletedAt", deletedAt,
                "eventType", eventType,
                "id", id,
                "namespaceName", namespaceName,
                "subscriptionSettings", subscriptionSettings,
                "subscriptionType", subscriptionType,
                "tags", tags,
                "updatedAt", updatedAt,
                "workspaceId", workspaceId);
    }
    
    public final static class Builder {
 
        private OffsetDateTime createdAt;
 
        private Optional<OffsetDateTime> deletedAt = Optional.empty();
 
        private EventType eventType;
 
        private String id;
 
        private String namespaceName;
 
        private String subscriptionSettings;
 
        private SubscriptionType subscriptionType;
 
        private Optional<? extends List<String>> tags = Optional.empty();
 
        private OffsetDateTime updatedAt;
 
        private String workspaceId;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder createdAt(OffsetDateTime createdAt) {
            Utils.checkNotNull(createdAt, "createdAt");
            this.createdAt = createdAt;
            return this;
        }

        public Builder deletedAt(OffsetDateTime deletedAt) {
            Utils.checkNotNull(deletedAt, "deletedAt");
            this.deletedAt = Optional.ofNullable(deletedAt);
            return this;
        }

        public Builder deletedAt(Optional<OffsetDateTime> deletedAt) {
            Utils.checkNotNull(deletedAt, "deletedAt");
            this.deletedAt = deletedAt;
            return this;
        }

        public Builder eventType(EventType eventType) {
            Utils.checkNotNull(eventType, "eventType");
            this.eventType = eventType;
            return this;
        }

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

        public Builder subscriptionSettings(String subscriptionSettings) {
            Utils.checkNotNull(subscriptionSettings, "subscriptionSettings");
            this.subscriptionSettings = subscriptionSettings;
            return this;
        }

        public Builder subscriptionType(SubscriptionType subscriptionType) {
            Utils.checkNotNull(subscriptionType, "subscriptionType");
            this.subscriptionType = subscriptionType;
            return this;
        }

        public Builder tags(List<String> tags) {
            Utils.checkNotNull(tags, "tags");
            this.tags = Optional.ofNullable(tags);
            return this;
        }

        public Builder tags(Optional<? extends List<String>> tags) {
            Utils.checkNotNull(tags, "tags");
            this.tags = tags;
            return this;
        }

        public Builder updatedAt(OffsetDateTime updatedAt) {
            Utils.checkNotNull(updatedAt, "updatedAt");
            this.updatedAt = updatedAt;
            return this;
        }

        public Builder workspaceId(String workspaceId) {
            Utils.checkNotNull(workspaceId, "workspaceId");
            this.workspaceId = workspaceId;
            return this;
        }
        
        public RegistrySubscription build() {
            return new RegistrySubscription(
                createdAt,
                deletedAt,
                eventType,
                id,
                namespaceName,
                subscriptionSettings,
                subscriptionType,
                tags,
                updatedAt,
                workspaceId);
        }
    }
}

