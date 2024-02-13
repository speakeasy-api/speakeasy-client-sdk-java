/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package io.github.speakeasy_sdks_staging.javaclientsdk;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.github.speakeasy_sdks_staging.javaclientsdk.utils.HTTPClient;
import io.github.speakeasy_sdks_staging.javaclientsdk.utils.HTTPRequest;
import io.github.speakeasy_sdks_staging.javaclientsdk.utils.JSON;
import io.github.speakeasy_sdks_staging.javaclientsdk.utils.SerializedBody;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;

/**
 * REST APIs for managing Schema entities
 */
public class Schemas {
	
	private SDKConfiguration sdkConfiguration;

	public Schemas(SDKConfiguration sdkConfiguration) {
		this.sdkConfiguration = sdkConfiguration;
	}

    /**
     * Delete a particular schema revision for an Api.
     * @param request the request object containing all of the parameters for the API call
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.DeleteSchemaResponse deleteSchema(io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.DeleteSchemaRequest request) throws Exception {
        String baseUrl = this.sdkConfiguration.serverUrl;
        String url = io.github.speakeasy_sdks_staging.javaclientsdk.utils.Utils.generateURL(io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.DeleteSchemaRequest.class, baseUrl, "/v1/apis/{apiID}/version/{versionID}/schema/{revisionID}", request, this.sdkConfiguration.globals);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("DELETE");
        req.setURL(url);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", this.sdkConfiguration.userAgent);
        
        HTTPClient client = this.sdkConfiguration.securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");
        
        io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.DeleteSchemaResponse res = new io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.DeleteSchemaResponse(contentType, httpRes.statusCode(), httpRes) {{
            error = null;
        }};
        
        if (httpRes.statusCode() == 200) {
        }
        else {
            if (io.github.speakeasy_sdks_staging.javaclientsdk.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                io.github.speakeasy_sdks_staging.javaclientsdk.models.shared.Error out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), io.github.speakeasy_sdks_staging.javaclientsdk.models.shared.Error.class);
                res.error = out;
            }
        }

        return res;
    }

    /**
     * Download the latest schema for a particular apiID.
     * @param request the request object containing all of the parameters for the API call
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.DownloadSchemaResponse downloadSchema(io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.DownloadSchemaRequest request) throws Exception {
        String baseUrl = this.sdkConfiguration.serverUrl;
        String url = io.github.speakeasy_sdks_staging.javaclientsdk.utils.Utils.generateURL(io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.DownloadSchemaRequest.class, baseUrl, "/v1/apis/{apiID}/version/{versionID}/schema/download", request, this.sdkConfiguration.globals);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);

        req.addHeader("Accept", "application/json;q=1, application/x-yaml;q=0");
        req.addHeader("user-agent", this.sdkConfiguration.userAgent);
        
        HTTPClient client = this.sdkConfiguration.securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");
        
        io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.DownloadSchemaResponse res = new io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.DownloadSchemaResponse(contentType, httpRes.statusCode(), httpRes) {{
            twoHundredApplicationJsonSchema = null;
            twoHundredApplicationXYamlSchema = null;
            error = null;
        }};
        
        if (httpRes.statusCode() == 200) {
            if (io.github.speakeasy_sdks_staging.javaclientsdk.utils.Utils.matchContentType(contentType, "application/json")) {
                byte[] out = httpRes.body();
                res.twoHundredApplicationJsonSchema = out;
            }
            if (io.github.speakeasy_sdks_staging.javaclientsdk.utils.Utils.matchContentType(contentType, "application/x-yaml")) {
                byte[] out = httpRes.body();
                res.twoHundredApplicationXYamlSchema = out;
            }
        }
        else {
            if (io.github.speakeasy_sdks_staging.javaclientsdk.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                io.github.speakeasy_sdks_staging.javaclientsdk.models.shared.Error out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), io.github.speakeasy_sdks_staging.javaclientsdk.models.shared.Error.class);
                res.error = out;
            }
        }

        return res;
    }

    /**
     * Download a particular schema revision for an Api.
     * @param request the request object containing all of the parameters for the API call
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.DownloadSchemaRevisionResponse downloadSchemaRevision(io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.DownloadSchemaRevisionRequest request) throws Exception {
        String baseUrl = this.sdkConfiguration.serverUrl;
        String url = io.github.speakeasy_sdks_staging.javaclientsdk.utils.Utils.generateURL(io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.DownloadSchemaRevisionRequest.class, baseUrl, "/v1/apis/{apiID}/version/{versionID}/schema/{revisionID}/download", request, this.sdkConfiguration.globals);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);

        req.addHeader("Accept", "application/json;q=1, application/x-yaml;q=0");
        req.addHeader("user-agent", this.sdkConfiguration.userAgent);
        
        HTTPClient client = this.sdkConfiguration.securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");
        
        io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.DownloadSchemaRevisionResponse res = new io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.DownloadSchemaRevisionResponse(contentType, httpRes.statusCode(), httpRes) {{
            twoHundredApplicationJsonSchema = null;
            twoHundredApplicationXYamlSchema = null;
            error = null;
        }};
        
        if (httpRes.statusCode() == 200) {
            if (io.github.speakeasy_sdks_staging.javaclientsdk.utils.Utils.matchContentType(contentType, "application/json")) {
                byte[] out = httpRes.body();
                res.twoHundredApplicationJsonSchema = out;
            }
            if (io.github.speakeasy_sdks_staging.javaclientsdk.utils.Utils.matchContentType(contentType, "application/x-yaml")) {
                byte[] out = httpRes.body();
                res.twoHundredApplicationXYamlSchema = out;
            }
        }
        else {
            if (io.github.speakeasy_sdks_staging.javaclientsdk.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                io.github.speakeasy_sdks_staging.javaclientsdk.models.shared.Error out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), io.github.speakeasy_sdks_staging.javaclientsdk.models.shared.Error.class);
                res.error = out;
            }
        }

        return res;
    }

    /**
     * Get information about the latest schema.
     * Returns information about the last uploaded schema for a particular API version. 
     * This won't include the schema itself, that can be retrieved via the downloadSchema operation.
     * @param request the request object containing all of the parameters for the API call
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GetSchemaResponse getSchema(io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GetSchemaRequest request) throws Exception {
        String baseUrl = this.sdkConfiguration.serverUrl;
        String url = io.github.speakeasy_sdks_staging.javaclientsdk.utils.Utils.generateURL(io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GetSchemaRequest.class, baseUrl, "/v1/apis/{apiID}/version/{versionID}/schema", request, this.sdkConfiguration.globals);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", this.sdkConfiguration.userAgent);
        
        HTTPClient client = this.sdkConfiguration.securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");
        
        io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GetSchemaResponse res = new io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GetSchemaResponse(contentType, httpRes.statusCode(), httpRes) {{
            schema = null;
            error = null;
        }};
        
        if (httpRes.statusCode() == 200) {
            if (io.github.speakeasy_sdks_staging.javaclientsdk.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                io.github.speakeasy_sdks_staging.javaclientsdk.models.shared.Schema out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), io.github.speakeasy_sdks_staging.javaclientsdk.models.shared.Schema.class);
                res.schema = out;
            }
        }
        else {
            if (io.github.speakeasy_sdks_staging.javaclientsdk.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                io.github.speakeasy_sdks_staging.javaclientsdk.models.shared.Error out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), io.github.speakeasy_sdks_staging.javaclientsdk.models.shared.Error.class);
                res.error = out;
            }
        }

        return res;
    }

    /**
     * Get a diff of two schema revisions for an Api.
     * @param request the request object containing all of the parameters for the API call
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GetSchemaDiffResponse getSchemaDiff(io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GetSchemaDiffRequest request) throws Exception {
        String baseUrl = this.sdkConfiguration.serverUrl;
        String url = io.github.speakeasy_sdks_staging.javaclientsdk.utils.Utils.generateURL(io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GetSchemaDiffRequest.class, baseUrl, "/v1/apis/{apiID}/version/{versionID}/schema/{baseRevisionID}/diff/{targetRevisionID}", request, this.sdkConfiguration.globals);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", this.sdkConfiguration.userAgent);
        
        HTTPClient client = this.sdkConfiguration.securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");
        
        io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GetSchemaDiffResponse res = new io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GetSchemaDiffResponse(contentType, httpRes.statusCode(), httpRes) {{
            schemaDiff = null;
            error = null;
        }};
        
        if (httpRes.statusCode() == 200) {
            if (io.github.speakeasy_sdks_staging.javaclientsdk.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                io.github.speakeasy_sdks_staging.javaclientsdk.models.shared.SchemaDiff out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), io.github.speakeasy_sdks_staging.javaclientsdk.models.shared.SchemaDiff.class);
                res.schemaDiff = out;
            }
        }
        else {
            if (io.github.speakeasy_sdks_staging.javaclientsdk.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                io.github.speakeasy_sdks_staging.javaclientsdk.models.shared.Error out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), io.github.speakeasy_sdks_staging.javaclientsdk.models.shared.Error.class);
                res.error = out;
            }
        }

        return res;
    }

    /**
     * Get information about a particular schema revision for an Api.
     * Returns information about the last uploaded schema for a particular schema revision. 
     * This won't include the schema itself, that can be retrieved via the downloadSchema operation.
     * @param request the request object containing all of the parameters for the API call
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GetSchemaRevisionResponse getSchemaRevision(io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GetSchemaRevisionRequest request) throws Exception {
        String baseUrl = this.sdkConfiguration.serverUrl;
        String url = io.github.speakeasy_sdks_staging.javaclientsdk.utils.Utils.generateURL(io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GetSchemaRevisionRequest.class, baseUrl, "/v1/apis/{apiID}/version/{versionID}/schema/{revisionID}", request, this.sdkConfiguration.globals);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", this.sdkConfiguration.userAgent);
        
        HTTPClient client = this.sdkConfiguration.securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");
        
        io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GetSchemaRevisionResponse res = new io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GetSchemaRevisionResponse(contentType, httpRes.statusCode(), httpRes) {{
            schema = null;
            error = null;
        }};
        
        if (httpRes.statusCode() == 200) {
            if (io.github.speakeasy_sdks_staging.javaclientsdk.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                io.github.speakeasy_sdks_staging.javaclientsdk.models.shared.Schema out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), io.github.speakeasy_sdks_staging.javaclientsdk.models.shared.Schema.class);
                res.schema = out;
            }
        }
        else {
            if (io.github.speakeasy_sdks_staging.javaclientsdk.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                io.github.speakeasy_sdks_staging.javaclientsdk.models.shared.Error out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), io.github.speakeasy_sdks_staging.javaclientsdk.models.shared.Error.class);
                res.error = out;
            }
        }

        return res;
    }

    /**
     * Get information about all schemas associated with a particular apiID.
     * Returns information the schemas associated with a particular apiID. 
     * This won't include the schemas themselves, they can be retrieved via the downloadSchema operation.
     * @param request the request object containing all of the parameters for the API call
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GetSchemasResponse getSchemas(io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GetSchemasRequest request) throws Exception {
        String baseUrl = this.sdkConfiguration.serverUrl;
        String url = io.github.speakeasy_sdks_staging.javaclientsdk.utils.Utils.generateURL(io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GetSchemasRequest.class, baseUrl, "/v1/apis/{apiID}/version/{versionID}/schemas", request, this.sdkConfiguration.globals);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", this.sdkConfiguration.userAgent);
        
        HTTPClient client = this.sdkConfiguration.securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");
        
        io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GetSchemasResponse res = new io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GetSchemasResponse(contentType, httpRes.statusCode(), httpRes) {{
            classes = null;
            error = null;
        }};
        
        if (httpRes.statusCode() == 200) {
            if (io.github.speakeasy_sdks_staging.javaclientsdk.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                io.github.speakeasy_sdks_staging.javaclientsdk.models.shared.Schema[] out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), io.github.speakeasy_sdks_staging.javaclientsdk.models.shared.Schema[].class);
                res.classes = out;
            }
        }
        else {
            if (io.github.speakeasy_sdks_staging.javaclientsdk.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                io.github.speakeasy_sdks_staging.javaclientsdk.models.shared.Error out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), io.github.speakeasy_sdks_staging.javaclientsdk.models.shared.Error.class);
                res.error = out;
            }
        }

        return res;
    }

    /**
     * Register a schema.
     * Allows uploading a schema for a particular API version.
     * This will be used to populate ApiEndpoints and used as a base for any schema generation if present.
     * @param request the request object containing all of the parameters for the API call
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.RegisterSchemaResponse registerSchema(io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.RegisterSchemaRequest request) throws Exception {
        String baseUrl = this.sdkConfiguration.serverUrl;
        String url = io.github.speakeasy_sdks_staging.javaclientsdk.utils.Utils.generateURL(io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.RegisterSchemaRequest.class, baseUrl, "/v1/apis/{apiID}/version/{versionID}/schema", request, this.sdkConfiguration.globals);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("POST");
        req.setURL(url);
        SerializedBody serializedRequestBody = io.github.speakeasy_sdks_staging.javaclientsdk.utils.Utils.serializeRequestBody(request, "requestBody", "multipart");
        if (serializedRequestBody == null) {
            throw new Exception("Request body is required");
        }
        req.setBody(serializedRequestBody);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", this.sdkConfiguration.userAgent);
        
        HTTPClient client = this.sdkConfiguration.securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");
        
        io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.RegisterSchemaResponse res = new io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.RegisterSchemaResponse(contentType, httpRes.statusCode(), httpRes) {{
            error = null;
        }};
        
        if (httpRes.statusCode() == 200) {
        }
        else {
            if (io.github.speakeasy_sdks_staging.javaclientsdk.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                io.github.speakeasy_sdks_staging.javaclientsdk.models.shared.Error out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), io.github.speakeasy_sdks_staging.javaclientsdk.models.shared.Error.class);
                res.error = out;
            }
        }

        return res;
    }
}