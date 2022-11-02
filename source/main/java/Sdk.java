import internal.utils.SecurityClient;
import pkg.models.shared.security.Security;

import static internal.utils.SecurityUtils.createSecurityClient;

public class Sdk {

    private SecurityClient securityClient;
    private String[]  servers = new String[]{
        "https://api.prod.speakeasyapi.dev",
    };

    public Sdk() {
    }

    public Sdk withSecurity(Security security) {
        securityClient = createSecurityClient(security);
        return this;
    }
}
