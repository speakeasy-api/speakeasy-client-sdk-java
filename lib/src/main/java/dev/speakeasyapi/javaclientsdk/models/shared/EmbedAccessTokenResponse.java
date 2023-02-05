package dev.speakeasyapi.javaclientsdk.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * EmbedAccessTokenResponse
 * An EmbedAccessTokenResponse contains a token that can be used to embed a Speakeasy dashboard.
**/
public class EmbedAccessTokenResponse {
    @JsonProperty("access_token")
    public String accessToken;
    public EmbedAccessTokenResponse withAccessToken(String accessToken) {
        this.accessToken = accessToken;
        return this;
    }
}
