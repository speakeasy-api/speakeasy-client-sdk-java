/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package io.github.speakeasy_sdks_staging.javaclientsdk;

import com.fasterxml.jackson.core.type.TypeReference;
import io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.SDKMethodInterfaces.*;
import io.github.speakeasy_sdks_staging.javaclientsdk.utils.HTTPClient;
import io.github.speakeasy_sdks_staging.javaclientsdk.utils.RetryConfig;
import io.github.speakeasy_sdks_staging.javaclientsdk.utils.SpeakeasyHTTPClient;
import io.github.speakeasy_sdks_staging.javaclientsdk.utils.Utils;
import java.io.InputStream;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * Speakeasy API: The Speakeasy API allows teams to manage common operations with their APIs
 * /docs - The Speakeasy Platform Documentation
 */
public class SDK {
    /**
     * AvailableServers contains identifiers for the servers available to the SDK.
     */
    public enum AvailableServers {
PROD("prod");

        private final String server;

        private AvailableServers(String server) {
            this.server = server;
        }

        public String server() {
           return server;
        }
    }

    /**
     * SERVERS contains the list of server urls available to the SDK.
     */
    public static final java.util.Map<AvailableServers, String> SERVERS = new java.util.HashMap<>() {{
    put(AvailableServers.PROD, "https://api.prod.speakeasyapi.dev");
    }};

    /**
     * REST APIs for managing Api entities
     */
    private final Apis apis;

    /**
     * REST APIs for managing ApiEndpoint entities
     */
    private final ApiEndpoints apiEndpoints;

    /**
     * REST APIs for managing Version Metadata entities
     */
    private final Metadata metadata;

    /**
     * REST APIs for managing Schema entities
     */
    private final Schemas schemas;

    /**
     * REST APIs for managing Authentication
     */
    private final Auth auth;

    /**
     * REST APIs for retrieving request information
     */
    private final Requests requests;

    /**
     * REST APIs for managing embeds
     */
    private final Embeds embeds;

    /**
     * REST APIs for capturing event data
     */
    private final Events events;

    /**
     * REST APIs for managing Api entities
     */
    public Apis apis() {
        return apis;
    }

    /**
     * REST APIs for managing ApiEndpoint entities
     */
    public ApiEndpoints apiEndpoints() {
        return apiEndpoints;
    }

    /**
     * REST APIs for managing Version Metadata entities
     */
    public Metadata metadata() {
        return metadata;
    }

    /**
     * REST APIs for managing Schema entities
     */
    public Schemas schemas() {
        return schemas;
    }

    /**
     * REST APIs for managing Authentication
     */
    public Auth auth() {
        return auth;
    }

    /**
     * REST APIs for retrieving request information
     */
    public Requests requests() {
        return requests;
    }

    /**
     * REST APIs for managing embeds
     */
    public Embeds embeds() {
        return embeds;
    }

    /**
     * REST APIs for capturing event data
     */
    public Events events() {
        return events;
    }

    private final SDKConfiguration sdkConfiguration;

    /**
     * The Builder class allows the configuration of a new instance of the SDK.
     */
    public static class Builder {

        private final SDKConfiguration sdkConfiguration = new SDKConfiguration();

        private Builder() {
        }

        /**
         * Allows the default HTTP client to be overridden with a custom implementation.
         *
         * @param client The HTTP client to use for all requests.
         * @return The builder instance.
         */
        public Builder client(HTTPClient client) {
            this.sdkConfiguration.defaultClient = client;
            return this;
        }
        
        /**
         * Configures the SDK to use the provided security details.
         *
         * @param security The security details to use for all requests.
         * @return The builder instance.
         */
        public Builder security(io.github.speakeasy_sdks_staging.javaclientsdk.models.shared.Security security) {
            this.sdkConfiguration.securitySource = SecuritySource.of(security);
            return this;
        }

        /**
         * Configures the SDK to use a custom security source.
         * @param securitySource The security source to use for all requests.
         * @return The builder instance.
         */
        public Builder securitySource(SecuritySource securitySource) {
            this.sdkConfiguration.securitySource = securitySource;
            return this;
        }
        
        /**
         * Overrides the default server URL.
         *
         * @param serverUrl The server URL to use for all requests.
         * @return The builder instance.
         */
        public Builder serverURL(String serverUrl) {
            this.sdkConfiguration.serverUrl = serverUrl;
            return this;
        }

        /**
         * Overrides the default server URL  with a templated URL populated with the provided parameters.
         *
         * @param serverUrl The server URL to use for all requests.
         * @param params The parameters to use when templating the URL.
         * @return The builder instance.
         */
        public Builder serverURL(String serverUrl, java.util.Map<String, String> params) {
            this.sdkConfiguration.serverUrl = io.github.speakeasy_sdks_staging.javaclientsdk.utils.Utils.templateUrl(serverUrl, params);
            return this;
        }
        
        /**
         * Overrides the default server by name.
         *
         * @param server The server to use for all requests.
         * @return The builder instance.
         */
        public Builder server(AvailableServers server) {
            this.sdkConfiguration.server = server.toString();
            this.sdkConfiguration.serverUrl = SERVERS.get(server);
            return this;
        }
        
        /**
         * Overrides the default configuration for retries
         *
         * @param retryConfig The retry configuration to use for all requests.
         * @return The builder instance.
         */
        public Builder retryConfig(RetryConfig retryConfig) {
            this.sdkConfiguration.retryConfig = Optional.of(retryConfig);
            return this;
        }
        /**
         * Allows setting the workspaceID parameter for all supported operations.
         *
         * @param workspaceID The value to set.
         * @return The builder instance.
         */
        public Builder workspaceID(String workspaceID) {
            if (!this.sdkConfiguration.globals.get("parameters").containsKey("pathParam")) {
                this.sdkConfiguration.globals.get("parameters").put("pathParam", new java.util.HashMap<>());
            }

            this.sdkConfiguration.globals.get("parameters").get("pathParam").put("workspaceID", workspaceID);

            return this;
        }
        
        /**
         * Builds a new instance of the SDK.
         * @return The SDK instance.
         */
        public SDK build() {
            if (sdkConfiguration.defaultClient == null) {
                sdkConfiguration.defaultClient = new SpeakeasyHTTPClient();
            }
	    if (sdkConfiguration.securitySource == null) {
	    	sdkConfiguration.securitySource = SecuritySource.of(null);
	    }
            if (sdkConfiguration.serverUrl == null || sdkConfiguration.serverUrl.isBlank()) {
                sdkConfiguration.serverUrl = SERVERS.get(AvailableServers.PROD);
                sdkConfiguration.server = AvailableServers.PROD.toString();
            }
            if (sdkConfiguration.serverUrl.endsWith("/")) {
                sdkConfiguration.serverUrl = sdkConfiguration.serverUrl.substring(0, sdkConfiguration.serverUrl.length() - 1);
            }
            return new SDK(sdkConfiguration);
        }
    }

    /**
     * Get a new instance of the SDK builder to configure a new instance of the SDK.
     * @return The SDK builder instance.
     */
    public static Builder builder() {
        return new Builder();
    }

    private SDK(SDKConfiguration sdkConfiguration) {
        this.sdkConfiguration = sdkConfiguration;
        this.apis = new Apis(sdkConfiguration);
        this.apiEndpoints = new ApiEndpoints(sdkConfiguration);
        this.metadata = new Metadata(sdkConfiguration);
        this.schemas = new Schemas(sdkConfiguration);
        this.auth = new Auth(sdkConfiguration);
        this.requests = new Requests(sdkConfiguration);
        this.embeds = new Embeds(sdkConfiguration);
        this.events = new Events(sdkConfiguration);
    }



































}
