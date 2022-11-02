package pkg.models.shared.security;

public class Security {

    @SecurityMetadata(value="scheme", type="apiKey", subtype="header")
    private final SchemeApiKey apiKey;

    public Security(SchemeApiKey apiKey) {
        this.apiKey = apiKey;
    }

}