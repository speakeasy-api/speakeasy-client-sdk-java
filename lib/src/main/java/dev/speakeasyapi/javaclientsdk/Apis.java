/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package dev.speakeasyapi.javaclientsdk;

import com.fasterxml.jackson.databind.ObjectMapper;
import dev.speakeasyapi.javaclientsdk.utils.HTTPClient;
import dev.speakeasyapi.javaclientsdk.utils.HTTPRequest;
import dev.speakeasyapi.javaclientsdk.utils.JSON;
import dev.speakeasyapi.javaclientsdk.utils.SerializedBody;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.apache.http.NameValuePair;

/**
 * REST APIs for managing Api entities
 */
public class Apis {
	
	private SDKConfiguration sdkConfiguration;

	public Apis(SDKConfiguration sdkConfiguration) {
		this.sdkConfiguration = sdkConfiguration;
	}

    /**
     * Delete an Api.
     * Delete a particular version of an Api. The will also delete all associated ApiEndpoints, Metadata, Schemas &amp; Request Logs (if using a Postgres datastore).
     * @param request the request object containing all of the parameters for the API call
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public dev.speakeasyapi.javaclientsdk.models.operations.DeleteApiResponse deleteApi(dev.speakeasyapi.javaclientsdk.models.operations.DeleteApiRequest request) throws Exception {
        String baseUrl = this.sdkConfiguration.serverUrl;
        String url = dev.speakeasyapi.javaclientsdk.utils.Utils.generateURL(dev.speakeasyapi.javaclientsdk.models.operations.DeleteApiRequest.class, baseUrl, "/v1/apis/{apiID}/version/{versionID}", request, null);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("DELETE");
        req.setURL(url);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", String.format("speakeasy-sdk/%s %s %s %s", this.sdkConfiguration.language, this.sdkConfiguration.sdkVersion, this.sdkConfiguration.genVersion, this.sdkConfiguration.openapiDocVersion));
        
        HTTPClient client = this.sdkConfiguration.securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        dev.speakeasyapi.javaclientsdk.models.operations.DeleteApiResponse res = new dev.speakeasyapi.javaclientsdk.models.operations.DeleteApiResponse(contentType, httpRes.statusCode()) {{
            error = null;
        }};
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 200) {
        }
        else {
            if (dev.speakeasyapi.javaclientsdk.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                dev.speakeasyapi.javaclientsdk.models.shared.Error out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), dev.speakeasyapi.javaclientsdk.models.shared.Error.class);
                res.error = out;
            }
        }

        return res;
    }

    /**
     * Generate an OpenAPI specification for a particular Api.
     * This endpoint will generate any missing operations in any registered OpenAPI document if the operation does not already exist in the document.
     * Returns the original document and the newly generated document allowing a diff to be performed to see what has changed.
     * @param request the request object containing all of the parameters for the API call
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public dev.speakeasyapi.javaclientsdk.models.operations.GenerateOpenApiSpecResponse generateOpenApiSpec(dev.speakeasyapi.javaclientsdk.models.operations.GenerateOpenApiSpecRequest request) throws Exception {
        String baseUrl = this.sdkConfiguration.serverUrl;
        String url = dev.speakeasyapi.javaclientsdk.utils.Utils.generateURL(dev.speakeasyapi.javaclientsdk.models.operations.GenerateOpenApiSpecRequest.class, baseUrl, "/v1/apis/{apiID}/version/{versionID}/generate/openapi", request, null);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);

        req.addHeader("Accept", "application/json;q=1, application/json;q=0");
        req.addHeader("user-agent", String.format("speakeasy-sdk/%s %s %s %s", this.sdkConfiguration.language, this.sdkConfiguration.sdkVersion, this.sdkConfiguration.genVersion, this.sdkConfiguration.openapiDocVersion));
        
        HTTPClient client = this.sdkConfiguration.securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        dev.speakeasyapi.javaclientsdk.models.operations.GenerateOpenApiSpecResponse res = new dev.speakeasyapi.javaclientsdk.models.operations.GenerateOpenApiSpecResponse(contentType, httpRes.statusCode()) {{
            generateOpenApiSpecDiff = null;
            error = null;
        }};
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 200) {
            if (dev.speakeasyapi.javaclientsdk.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                dev.speakeasyapi.javaclientsdk.models.shared.GenerateOpenApiSpecDiff out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), dev.speakeasyapi.javaclientsdk.models.shared.GenerateOpenApiSpecDiff.class);
                res.generateOpenApiSpecDiff = out;
            }
        }
        else {
            if (dev.speakeasyapi.javaclientsdk.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                dev.speakeasyapi.javaclientsdk.models.shared.Error out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), dev.speakeasyapi.javaclientsdk.models.shared.Error.class);
                res.error = out;
            }
        }

        return res;
    }

    /**
     * Generate a Postman collection for a particular Api.
     * Generates a postman collection containing all endpoints for a particular API. Includes variables produced for any path/query/header parameters included in the OpenAPI document.
     * @param request the request object containing all of the parameters for the API call
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public dev.speakeasyapi.javaclientsdk.models.operations.GeneratePostmanCollectionResponse generatePostmanCollection(dev.speakeasyapi.javaclientsdk.models.operations.GeneratePostmanCollectionRequest request) throws Exception {
        String baseUrl = this.sdkConfiguration.serverUrl;
        String url = dev.speakeasyapi.javaclientsdk.utils.Utils.generateURL(dev.speakeasyapi.javaclientsdk.models.operations.GeneratePostmanCollectionRequest.class, baseUrl, "/v1/apis/{apiID}/version/{versionID}/generate/postman", request, null);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);

        req.addHeader("Accept", "application/json;q=1, application/octet-stream;q=0");
        req.addHeader("user-agent", String.format("speakeasy-sdk/%s %s %s %s", this.sdkConfiguration.language, this.sdkConfiguration.sdkVersion, this.sdkConfiguration.genVersion, this.sdkConfiguration.openapiDocVersion));
        
        HTTPClient client = this.sdkConfiguration.securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        dev.speakeasyapi.javaclientsdk.models.operations.GeneratePostmanCollectionResponse res = new dev.speakeasyapi.javaclientsdk.models.operations.GeneratePostmanCollectionResponse(contentType, httpRes.statusCode()) {{
            postmanCollection = null;
            error = null;
        }};
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 200) {
            if (dev.speakeasyapi.javaclientsdk.utils.Utils.matchContentType(contentType, "application/octet-stream")) {
                byte[] out = httpRes.body();
                res.postmanCollection = out;
            }
        }
        else {
            if (dev.speakeasyapi.javaclientsdk.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                dev.speakeasyapi.javaclientsdk.models.shared.Error out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), dev.speakeasyapi.javaclientsdk.models.shared.Error.class);
                res.error = out;
            }
        }

        return res;
    }

    /**
     * Get all Api versions for a particular ApiEndpoint.
     * Get all Api versions for a particular ApiEndpoint.
     * Supports filtering the versions based on metadata attributes.
     * @param request the request object containing all of the parameters for the API call
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public dev.speakeasyapi.javaclientsdk.models.operations.GetAllApiVersionsResponse getAllApiVersions(dev.speakeasyapi.javaclientsdk.models.operations.GetAllApiVersionsRequest request) throws Exception {
        String baseUrl = this.sdkConfiguration.serverUrl;
        String url = dev.speakeasyapi.javaclientsdk.utils.Utils.generateURL(dev.speakeasyapi.javaclientsdk.models.operations.GetAllApiVersionsRequest.class, baseUrl, "/v1/apis/{apiID}", request, null);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);

        req.addHeader("Accept", "application/json;q=1, application/json;q=0");
        req.addHeader("user-agent", String.format("speakeasy-sdk/%s %s %s %s", this.sdkConfiguration.language, this.sdkConfiguration.sdkVersion, this.sdkConfiguration.genVersion, this.sdkConfiguration.openapiDocVersion));
        java.util.List<NameValuePair> queryParams = dev.speakeasyapi.javaclientsdk.utils.Utils.getQueryParams(dev.speakeasyapi.javaclientsdk.models.operations.GetAllApiVersionsRequest.class, request, null);
        if (queryParams != null) {
            for (NameValuePair queryParam : queryParams) {
                req.addQueryParam(queryParam);
            }
        }
        
        HTTPClient client = this.sdkConfiguration.securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        dev.speakeasyapi.javaclientsdk.models.operations.GetAllApiVersionsResponse res = new dev.speakeasyapi.javaclientsdk.models.operations.GetAllApiVersionsResponse(contentType, httpRes.statusCode()) {{
            apis = null;
            error = null;
        }};
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 200) {
            if (dev.speakeasyapi.javaclientsdk.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                dev.speakeasyapi.javaclientsdk.models.shared.Api[] out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), dev.speakeasyapi.javaclientsdk.models.shared.Api[].class);
                res.apis = out;
            }
        }
        else {
            if (dev.speakeasyapi.javaclientsdk.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                dev.speakeasyapi.javaclientsdk.models.shared.Error out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), dev.speakeasyapi.javaclientsdk.models.shared.Error.class);
                res.error = out;
            }
        }

        return res;
    }

    /**
     * Get a list of Apis for a given workspace
     * Get a list of all Apis and their versions for a given workspace.
     * Supports filtering the APIs based on metadata attributes.
     * @param request the request object containing all of the parameters for the API call
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public dev.speakeasyapi.javaclientsdk.models.operations.GetApisResponse getApis(dev.speakeasyapi.javaclientsdk.models.operations.GetApisRequest request) throws Exception {
        String baseUrl = this.sdkConfiguration.serverUrl;
        String url = dev.speakeasyapi.javaclientsdk.utils.Utils.generateURL(baseUrl, "/v1/apis");
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);

        req.addHeader("Accept", "application/json;q=1, application/json;q=0");
        req.addHeader("user-agent", String.format("speakeasy-sdk/%s %s %s %s", this.sdkConfiguration.language, this.sdkConfiguration.sdkVersion, this.sdkConfiguration.genVersion, this.sdkConfiguration.openapiDocVersion));
        java.util.List<NameValuePair> queryParams = dev.speakeasyapi.javaclientsdk.utils.Utils.getQueryParams(dev.speakeasyapi.javaclientsdk.models.operations.GetApisRequest.class, request, null);
        if (queryParams != null) {
            for (NameValuePair queryParam : queryParams) {
                req.addQueryParam(queryParam);
            }
        }
        
        HTTPClient client = this.sdkConfiguration.securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        dev.speakeasyapi.javaclientsdk.models.operations.GetApisResponse res = new dev.speakeasyapi.javaclientsdk.models.operations.GetApisResponse(contentType, httpRes.statusCode()) {{
            apis = null;
            error = null;
        }};
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 200) {
            if (dev.speakeasyapi.javaclientsdk.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                dev.speakeasyapi.javaclientsdk.models.shared.Api[] out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), dev.speakeasyapi.javaclientsdk.models.shared.Api[].class);
                res.apis = out;
            }
        }
        else {
            if (dev.speakeasyapi.javaclientsdk.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                dev.speakeasyapi.javaclientsdk.models.shared.Error out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), dev.speakeasyapi.javaclientsdk.models.shared.Error.class);
                res.error = out;
            }
        }

        return res;
    }

    /**
     * Upsert an Api
     * Upsert an Api. If the Api does not exist, it will be created.
     * If the Api exists, it will be updated.
     * @param request the request object containing all of the parameters for the API call
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public dev.speakeasyapi.javaclientsdk.models.operations.UpsertApiResponse upsertApi(dev.speakeasyapi.javaclientsdk.models.operations.UpsertApiRequest request) throws Exception {
        String baseUrl = this.sdkConfiguration.serverUrl;
        String url = dev.speakeasyapi.javaclientsdk.utils.Utils.generateURL(dev.speakeasyapi.javaclientsdk.models.operations.UpsertApiRequest.class, baseUrl, "/v1/apis/{apiID}", request, null);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("PUT");
        req.setURL(url);
        SerializedBody serializedRequestBody = dev.speakeasyapi.javaclientsdk.utils.Utils.serializeRequestBody(request, "apiInput", "json");
        if (serializedRequestBody == null) {
            throw new Exception("Request body is required");
        }
        req.setBody(serializedRequestBody);

        req.addHeader("Accept", "application/json;q=1, application/json;q=0");
        req.addHeader("user-agent", String.format("speakeasy-sdk/%s %s %s %s", this.sdkConfiguration.language, this.sdkConfiguration.sdkVersion, this.sdkConfiguration.genVersion, this.sdkConfiguration.openapiDocVersion));
        
        HTTPClient client = this.sdkConfiguration.securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        dev.speakeasyapi.javaclientsdk.models.operations.UpsertApiResponse res = new dev.speakeasyapi.javaclientsdk.models.operations.UpsertApiResponse(contentType, httpRes.statusCode()) {{
            api = null;
            error = null;
        }};
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 200) {
            if (dev.speakeasyapi.javaclientsdk.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                dev.speakeasyapi.javaclientsdk.models.shared.Api out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), dev.speakeasyapi.javaclientsdk.models.shared.Api.class);
                res.api = out;
            }
        }
        else {
            if (dev.speakeasyapi.javaclientsdk.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                dev.speakeasyapi.javaclientsdk.models.shared.Error out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), dev.speakeasyapi.javaclientsdk.models.shared.Error.class);
                res.error = out;
            }
        }

        return res;
    }
}