import internal.utils.SecurityClient;
import org.apache.commons.lang3.StringUtils;
import pkg.models.operations.GetApisRequest;
import pkg.models.operations.GetApisResponse;
import pkg.models.shared.Security;

import static internal.utils.QueryParams.populateQueryParams;
import static internal.utils.Security.createSecurityClient;

public class Sdk {

    private SecurityClient securityClient;
    private String[]  servers = new String[]{
        "https://api.prod.speakeasyapi.dev",
    };

    private String serverURL;

    private Sdk(SdkBuilder sdkBuilder) {
        this.securityClient = sdkBuilder.securityClient;
        this.servers = sdkBuilder.servers;
        this.serverURL = sdkBuilder.serverURL;
    }


    public static class SdkBuilder {
        private SecurityClient securityClient;
        private String[] servers;
        private String serverURL;

        public SdkBuilder withSecurity(Security security) {
            securityClient = createSecurityClient(security);
            return this;
        }

        public SdkBuilder withServers(String[] servers) {
            this.servers = servers;
            return this;
        }

        public SdkBuilder withServerURL(String serverURL) {
            this.serverURL= serverURL;
            return this;
        }

        public Sdk build() {
            if (this.serverURL == null) {
                this.serverURL = this.servers[0];
            }
            return new Sdk(this);
        }
    }

    public GetApisResponse getApis(GetApisRequest getApisRequest) {
        String baseURL = this.serverURL;
        String url = StringUtils.removeEnd(baseURL, "/") + "/v1/apis";
        try {
            populateQueryParams(getApisRequest.queryParams, securityClient.getQueryParams());
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
        return null;
    }

}
