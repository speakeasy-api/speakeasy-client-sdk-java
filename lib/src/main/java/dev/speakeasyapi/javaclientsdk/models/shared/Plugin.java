package dev.speakeasyapi.javaclientsdk.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import dev.speakeasyapi.javaclientsdk.utils.DateTimeDeserializer;
import dev.speakeasyapi.javaclientsdk.utils.DateTimeSerializer;
import java.time.OffsetDateTime;

/**
 * Plugin
 * A plugin is a short script that is run against ingested requests
**/
public class Plugin {
    @JsonProperty("code")
    public String code;
    public Plugin withCode(String code) {
        this.code = code;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonSerialize(contentUsing = DateTimeSerializer.class)
    @JsonDeserialize(contentUsing = DateTimeDeserializer.class)
    @JsonProperty("created_at")
    public OffsetDateTime createdAt;
    public Plugin withCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("eval_hash")
    public String evalHash;
    public Plugin withEvalHash(String evalHash) {
        this.evalHash = evalHash;
        return this;
    }
    @JsonProperty("plugin_id")
    public String pluginId;
    public Plugin withPluginId(String pluginId) {
        this.pluginId = pluginId;
        return this;
    }
    @JsonProperty("title")
    public String title;
    public Plugin withTitle(String title) {
        this.title = title;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonSerialize(contentUsing = DateTimeSerializer.class)
    @JsonDeserialize(contentUsing = DateTimeDeserializer.class)
    @JsonProperty("updated_at")
    public OffsetDateTime updatedAt;
    public Plugin withUpdatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }
    @JsonProperty("workspace_id")
    public String workspaceId;
    public Plugin withWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
}
