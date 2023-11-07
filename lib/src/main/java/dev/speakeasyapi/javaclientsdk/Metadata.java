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

/**
 * REST APIs for managing Version Metadata entities
 */
public class Metadata {
	
	private SDKConfiguration sdkConfiguration;

	public Metadata(SDKConfiguration sdkConfiguration) {
		this.sdkConfiguration = sdkConfiguration;
	}

    /**
     * Delete metadata for a particular apiID and versionID.
     * @param request the request object containing all of the parameters for the API call
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public dev.speakeasyapi.javaclientsdk.models.operations.DeleteVersionMetadataResponse deleteVersionMetadata(dev.speakeasyapi.javaclientsdk.models.operations.DeleteVersionMetadataRequest request) throws Exception {
        String baseUrl = this.sdkConfiguration.serverUrl;
        String url = dev.speakeasyapi.javaclientsdk.utils.Utils.generateURL(dev.speakeasyapi.javaclientsdk.models.operations.DeleteVersionMetadataRequest.class, baseUrl, "/v1/apis/{apiID}/version/{versionID}/metadata/{metaKey}/{metaValue}", request, null);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("DELETE");
        req.setURL(url);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", this.sdkConfiguration.userAgent);
        
        HTTPClient client = this.sdkConfiguration.securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        dev.speakeasyapi.javaclientsdk.models.operations.DeleteVersionMetadataResponse res = new dev.speakeasyapi.javaclientsdk.models.operations.DeleteVersionMetadataResponse(contentType, httpRes.statusCode()) {{
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
     * Get all metadata for a particular apiID and versionID.
     * @param request the request object containing all of the parameters for the API call
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public dev.speakeasyapi.javaclientsdk.models.operations.GetVersionMetadataResponse getVersionMetadata(dev.speakeasyapi.javaclientsdk.models.operations.GetVersionMetadataRequest request) throws Exception {
        String baseUrl = this.sdkConfiguration.serverUrl;
        String url = dev.speakeasyapi.javaclientsdk.utils.Utils.generateURL(dev.speakeasyapi.javaclientsdk.models.operations.GetVersionMetadataRequest.class, baseUrl, "/v1/apis/{apiID}/version/{versionID}/metadata", request, null);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", this.sdkConfiguration.userAgent);
        
        HTTPClient client = this.sdkConfiguration.securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        dev.speakeasyapi.javaclientsdk.models.operations.GetVersionMetadataResponse res = new dev.speakeasyapi.javaclientsdk.models.operations.GetVersionMetadataResponse(contentType, httpRes.statusCode()) {{
            classes = null;
            error = null;
        }};
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 200) {
            if (dev.speakeasyapi.javaclientsdk.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                dev.speakeasyapi.javaclientsdk.models.shared.VersionMetadata[] out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), dev.speakeasyapi.javaclientsdk.models.shared.VersionMetadata[].class);
                res.classes = out;
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
     * Insert metadata for a particular apiID and versionID.
     * @param request the request object containing all of the parameters for the API call
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public dev.speakeasyapi.javaclientsdk.models.operations.InsertVersionMetadataResponse insertVersionMetadata(dev.speakeasyapi.javaclientsdk.models.operations.InsertVersionMetadataRequest request) throws Exception {
        String baseUrl = this.sdkConfiguration.serverUrl;
        String url = dev.speakeasyapi.javaclientsdk.utils.Utils.generateURL(dev.speakeasyapi.javaclientsdk.models.operations.InsertVersionMetadataRequest.class, baseUrl, "/v1/apis/{apiID}/version/{versionID}/metadata", request, null);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("POST");
        req.setURL(url);
        SerializedBody serializedRequestBody = dev.speakeasyapi.javaclientsdk.utils.Utils.serializeRequestBody(request, "versionMetadata", "json");
        if (serializedRequestBody == null) {
            throw new Exception("Request body is required");
        }
        req.setBody(serializedRequestBody);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", this.sdkConfiguration.userAgent);
        
        HTTPClient client = this.sdkConfiguration.securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        dev.speakeasyapi.javaclientsdk.models.operations.InsertVersionMetadataResponse res = new dev.speakeasyapi.javaclientsdk.models.operations.InsertVersionMetadataResponse(contentType, httpRes.statusCode()) {{
            versionMetadata = null;
            error = null;
        }};
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 200) {
            if (dev.speakeasyapi.javaclientsdk.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                dev.speakeasyapi.javaclientsdk.models.shared.VersionMetadata out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), dev.speakeasyapi.javaclientsdk.models.shared.VersionMetadata.class);
                res.versionMetadata = out;
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