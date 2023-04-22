/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package dev.speakeasyapi.javaclientsdk.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import dev.speakeasyapi.javaclientsdk.utils.SpeakeasyMetadata;

public class RevokeEmbedAccessTokenRequest {
    /**
     * The ID of the EmbedToken to revoke.
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=tokenID")
    public String tokenID;
    public RevokeEmbedAccessTokenRequest withTokenID(String tokenID) {
        this.tokenID = tokenID;
        return this;
    }
    

    public RevokeEmbedAccessTokenRequest(@JsonProperty("tokenID") String tokenID) {
    this.tokenID = tokenID;
  }
}
