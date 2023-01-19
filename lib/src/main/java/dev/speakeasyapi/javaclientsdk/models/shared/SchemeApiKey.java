package dev.speakeasyapi.javaclientsdk.models.shared;

import dev.speakeasyapi.javaclientsdk.utils.SpeakeasyMetadata;
public class SchemeApiKey {
    @SpeakeasyMetadata("security:name=x-api-key")
    public String apiKey;
    public SchemeApiKey withApiKey(String apiKey) {
        this.apiKey = apiKey;
        return this;
    }
}