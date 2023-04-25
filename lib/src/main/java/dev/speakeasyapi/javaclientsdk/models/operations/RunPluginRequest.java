/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package dev.speakeasyapi.javaclientsdk.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import dev.speakeasyapi.javaclientsdk.utils.SpeakeasyMetadata;

public class RunPluginRequest {
    /**
     * The filter to apply to the query.
     */
    @SpeakeasyMetadata("queryParam:serialization=json,name=filters")
    public dev.speakeasyapi.javaclientsdk.models.shared.Filters filters;
    public RunPluginRequest withFilters(dev.speakeasyapi.javaclientsdk.models.shared.Filters filters) {
        this.filters = filters;
        return this;
    }
    
    /**
     * The ID of the plugin to run.
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=pluginID")
    public String pluginID;
    public RunPluginRequest withPluginID(String pluginID) {
        this.pluginID = pluginID;
        return this;
    }
    
    public RunPluginRequest(@JsonProperty("pluginID") String pluginID) {
        this.pluginID = pluginID;
  }
}
