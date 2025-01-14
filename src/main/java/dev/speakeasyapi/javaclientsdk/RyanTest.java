/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package dev.speakeasyapi.javaclientsdk;

import dev.speakeasyapi.javaclientsdk.utils.HTTPClient;
import dev.speakeasyapi.javaclientsdk.utils.RetryConfig;
import dev.speakeasyapi.javaclientsdk.utils.SpeakeasyHTTPClient;
import dev.speakeasyapi.javaclientsdk.utils.Utils;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

/**
 * Speakeasy API: The Subscriptions API manages subscriptions for CLI and registry events
 * /docs - The Speakeasy Platform Documentation
 */
public class RyanTest {

  
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
    @SuppressWarnings("serial")
    public static final Map<AvailableServers, String> SERVERS = new HashMap<>() { {
    put(AvailableServers.PROD, "https://api.prod.speakeasyapi.dev");
    }};

    /**
     * REST APIs for working with Registry artifacts
     */
    private final Artifacts artifacts;

    /**
     * REST APIs for managing Authentication
     */
    private final Auth auth;

    /**
     * REST APIs for retrieving Code Samples
     */
    private final CodeSamples codeSamples;

    /**
     * REST APIs for managing the github integration
     */
    private final Github github;

    /**
     * REST APIs for managing Organizations (speakeasy L1 Tenancy construct)
     */
    private final Organizations organizations;

    /**
     * REST APIs for managing reports (lint reports, change reports, etc)
     */
    private final Reports reports;

    /**
     * REST APIs for managing short URLs
     */
    private final ShortURLs shortURLs;

    /**
     * REST APIs for managing subscriptions
     */
    private final Subscriptions subscriptions;

    /**
     * REST APIs for managing LLM OAS suggestions
     */
    private final Suggest suggest;

    /**
     * REST APIs for managing Workspaces (speakeasy tenancy)
     */
    private final Workspaces workspaces;

    /**
     * REST APIs for managing events captured by a speakeasy binary (CLI, GitHub Action etc)
     */
    private final Events events;

    /**
     * REST APIs for working with Registry artifacts
     */
    public Artifacts artifacts() {
        return artifacts;
    }

    /**
     * REST APIs for managing Authentication
     */
    public Auth auth() {
        return auth;
    }

    /**
     * REST APIs for retrieving Code Samples
     */
    public CodeSamples codeSamples() {
        return codeSamples;
    }

    /**
     * REST APIs for managing the github integration
     */
    public Github github() {
        return github;
    }

    /**
     * REST APIs for managing Organizations (speakeasy L1 Tenancy construct)
     */
    public Organizations organizations() {
        return organizations;
    }

    /**
     * REST APIs for managing reports (lint reports, change reports, etc)
     */
    public Reports reports() {
        return reports;
    }

    /**
     * REST APIs for managing short URLs
     */
    public ShortURLs shortURLs() {
        return shortURLs;
    }

    /**
     * REST APIs for managing subscriptions
     */
    public Subscriptions subscriptions() {
        return subscriptions;
    }

    /**
     * REST APIs for managing LLM OAS suggestions
     */
    public Suggest suggest() {
        return suggest;
    }

    /**
     * REST APIs for managing Workspaces (speakeasy tenancy)
     */
    public Workspaces workspaces() {
        return workspaces;
    }

    /**
     * REST APIs for managing events captured by a speakeasy binary (CLI, GitHub Action etc)
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
        public Builder security(dev.speakeasyapi.javaclientsdk.models.shared.Security security) {
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
        public Builder serverURL(String serverUrl, Map<String, String> params) {
            this.sdkConfiguration.serverUrl = Utils.templateUrl(serverUrl, params);
            return this;
        }
        
        /**
         * Overrides the default server by name.
         *
         * @param server The server to use for all requests.
         * @return The builder instance.
         */
        public Builder server(AvailableServers server) {
            this.sdkConfiguration.server = server.server();
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
         * Allows setting the workspaceId parameter for all supported operations.
         *
         * @param workspaceId The value to set.
         * @return The builder instance.
         */
        public Builder workspaceId(String workspaceId) {
            if (!this.sdkConfiguration.globals.get("parameters").containsKey("pathParam")) {
                this.sdkConfiguration.globals.get("parameters").put("pathParam", new HashMap<>());
            }

            this.sdkConfiguration.globals.get("parameters").get("pathParam").put("workspaceId", workspaceId);

            return this;
        }
        
        /**
         * Builds a new instance of the SDK.
         * @return The SDK instance.
         */
        public RyanTest build() {
            if (sdkConfiguration.defaultClient == null) {
                sdkConfiguration.defaultClient = new SpeakeasyHTTPClient();
            }
	        if (sdkConfiguration.securitySource == null) {
	    	    sdkConfiguration.securitySource = SecuritySource.of(null);
	        }
            if (sdkConfiguration.serverUrl == null || sdkConfiguration.serverUrl.isBlank()) {
                sdkConfiguration.serverUrl = SERVERS.get(AvailableServers.PROD);
                sdkConfiguration.server = AvailableServers.PROD.server();
            }
            if (sdkConfiguration.serverUrl.endsWith("/")) {
                sdkConfiguration.serverUrl = sdkConfiguration.serverUrl.substring(0, sdkConfiguration.serverUrl.length() - 1);
            }
            return new RyanTest(sdkConfiguration);
        }
    }
    
    /**
     * Get a new instance of the SDK builder to configure a new instance of the SDK.
     * @return The SDK builder instance.
     */
    public static Builder builder() {
        return new Builder();
    }

    private RyanTest(SDKConfiguration sdkConfiguration) {
        this.sdkConfiguration = sdkConfiguration;
        this.artifacts = new Artifacts(sdkConfiguration);
        this.auth = new Auth(sdkConfiguration);
        this.codeSamples = new CodeSamples(sdkConfiguration);
        this.github = new Github(sdkConfiguration);
        this.organizations = new Organizations(sdkConfiguration);
        this.reports = new Reports(sdkConfiguration);
        this.shortURLs = new ShortURLs(sdkConfiguration);
        this.subscriptions = new Subscriptions(sdkConfiguration);
        this.suggest = new Suggest(sdkConfiguration);
        this.workspaces = new Workspaces(sdkConfiguration);
        this.events = new Events(sdkConfiguration);
        this.sdkConfiguration.initialize();
    }}