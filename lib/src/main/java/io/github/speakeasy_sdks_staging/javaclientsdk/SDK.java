/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package io.github.speakeasy_sdks_staging.javaclientsdk;

import io.github.speakeasy_sdks_staging.javaclientsdk.utils.HTTPClient;
import io.github.speakeasy_sdks_staging.javaclientsdk.utils.SpeakeasyHTTPClient;

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

		public final String server;

		private AvailableServers(String server) {
			this.server = server;
		}
	}

	/**
	 * SERVERS contains the list of server urls available to the SDK.
	 */
	public static final java.util.Map<AvailableServers, String> SERVERS = new java.util.HashMap<AvailableServers, String>() {{
		put(AvailableServers.PROD, "https://api.prod.speakeasyapi.dev");
	}};
  	
    /**
     * REST APIs for managing Api entities
     */
    public Apis apis;
    /**
     * REST APIs for managing ApiEndpoint entities
     */
    public ApiEndpoints apiEndpoints;
    /**
     * REST APIs for managing Version Metadata entities
     */
    public Metadata metadata;
    /**
     * REST APIs for managing Schema entities
     */
    public Schemas schemas;
    /**
     * REST APIs for managing Authentication
     */
    public Auth auth;
    /**
     * REST APIs for retrieving request information
     */
    public Requests requests;
    /**
     * REST APIs for managing embeds
     */
    public Embeds embeds;
    /**
     * REST APIs for capturing event data
     */
    public Events events;	

	private SDKConfiguration sdkConfiguration;

	/**
	 * The Builder class allows the configuration of a new instance of the SDK.
	 */
	public static class Builder {
		private SDKConfiguration sdkConfiguration = new SDKConfiguration();

		private Builder() {
		}

		/**
		 * Allows the default HTTP client to be overridden with a custom implementation.
		 * @param client The HTTP client to use for all requests.
		 * @return The builder instance.
		 */
		public Builder setClient(HTTPClient client) {
			this.sdkConfiguration.defaultClient = client;
			return this;
		}
		
		/**
		 * Configures the SDK to use the provided security details.
		 * @param security The security details to use for all requests.
		 * @return The builder instance.
		 */
		public Builder setSecurity(io.github.speakeasy_sdks_staging.javaclientsdk.models.shared.Security security) {
			this.sdkConfiguration.security = security;
			return this;
		}
		
		/**
		 * Allows the overriding of the default server URL.
		 * @param serverUrl The server URL to use for all requests.
		 * @return The builder instance.
		 */
		public Builder setServerURL(String serverUrl) {
			this.sdkConfiguration.serverUrl = serverUrl;
			return this;
		}
		
		/**
		 * Allows the overriding of the default server URL  with a templated URL populated with the provided parameters.
		 * @param serverUrl The server URL to use for all requests.
		 * @param params The parameters to use when templating the URL.
		 * @return The builder instance.
		 */
		public Builder setServerURL(String serverUrl, java.util.Map<String, String> params) {
			this.sdkConfiguration.serverUrl = io.github.speakeasy_sdks_staging.javaclientsdk.utils.Utils.templateUrl(serverUrl, params);
			return this;
		}
		
		/**
		 * Allows the overriding of the default server by name
		 * @param server The server to use for all requests.
		 * @return The builder instance.
		 */
		public Builder setServer(AvailableServers server) {
			this.sdkConfiguration.server = server.toString();
			this.sdkConfiguration.serverUrl = SERVERS.get(server);
			return this;
		}
		
		/**
		 * Allows setting the workspaceID parameter for all supported operations.
		 * @param workspaceID The value to set.
		 * @return The builder instance.
		 */
		public Builder setWorkspaceID(String workspaceID) {
			if (!this.sdkConfiguration.globals.get("parameters").containsKey("pathParam")) {
				this.sdkConfiguration.globals.get("parameters").put("pathParam", new java.util.HashMap<String, java.lang.Object>());
			}

			this.sdkConfiguration.globals.get("parameters").get("pathParam").put("workspaceID", workspaceID);

			return this;
		}
		
		/**
		 * Builds a new instance of the SDK.
		 * @return The SDK instance.
		 * @throws Exception Thrown if the SDK could not be built.
		 */
		public SDK build() throws Exception {
			if (this.sdkConfiguration.defaultClient == null) {
				this.sdkConfiguration.defaultClient = new SpeakeasyHTTPClient();
			}
			
			if (this.sdkConfiguration.security != null) {
				this.sdkConfiguration.securityClient = io.github.speakeasy_sdks_staging.javaclientsdk.utils.Utils.configureSecurityClient(this.sdkConfiguration.defaultClient, this.sdkConfiguration.security);
			}
			
			if (this.sdkConfiguration.securityClient == null) {
				this.sdkConfiguration.securityClient = this.sdkConfiguration.defaultClient;
			}
			
			if (this.sdkConfiguration.serverUrl == null || this.sdkConfiguration.serverUrl.isBlank()) {
				this.sdkConfiguration.serverUrl = SERVERS.get(AvailableServers.PROD);
				this.sdkConfiguration.server = AvailableServers.PROD.toString();
			}

			if (this.sdkConfiguration.serverUrl.endsWith("/")) {
				this.sdkConfiguration.serverUrl = this.sdkConfiguration.serverUrl.substring(0, this.sdkConfiguration.serverUrl.length() - 1);
			}
			
			return new SDK(this.sdkConfiguration);
		}
	}

	/**
	 * Get a new instance of the SDK builder to configure a new instance of the SDK.
	 * @return The SDK builder instance.
	 */
	public static Builder builder() {
		return new Builder();
	}

	private SDK(SDKConfiguration sdkConfiguration) throws Exception {
		this.sdkConfiguration = sdkConfiguration;
		
		this.apis = new Apis(this.sdkConfiguration);
		
		this.apiEndpoints = new ApiEndpoints(this.sdkConfiguration);
		
		this.metadata = new Metadata(this.sdkConfiguration);
		
		this.schemas = new Schemas(this.sdkConfiguration);
		
		this.auth = new Auth(this.sdkConfiguration);
		
		this.requests = new Requests(this.sdkConfiguration);
		
		this.embeds = new Embeds(this.sdkConfiguration);
		
		this.events = new Events(this.sdkConfiguration);
	}
}