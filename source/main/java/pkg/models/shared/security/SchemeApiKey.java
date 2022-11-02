package pkg.models.shared.security;

public class SchemeApiKey {

    @SecurityMetadata(name="x-api-key")
    private String apiKey;

    public SchemeApiKey(String apiKey) {
        this.apiKey = apiKey;
    }

}
