package pkg.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.LocalDateTime;
import java.util.Map;

public class API {
    @JsonProperty("api_id")
    public String APIID;
    @JsonProperty("created_at")
    public LocalDateTime createdAt;
    @JsonProperty("description")
    public String description;
    @JsonProperty("matched,omitempty")
    public boolean matched;
    @JsonProperty("meta_data,omitempty")
    public Map<String, String[]> metaData;
    @JsonProperty("updated_at")
    public LocalDateTime updatedAt;
    @JsonProperty("version_id")
    public String versionID;
    @JsonProperty("workspace_id")
    public String workspaceID;
}
