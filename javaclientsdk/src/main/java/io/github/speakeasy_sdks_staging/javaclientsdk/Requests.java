/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package io.github.speakeasy_sdks_staging.javaclientsdk;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.github.speakeasy_sdks_staging.javaclientsdk.utils.HTTPClient;
import io.github.speakeasy_sdks_staging.javaclientsdk.utils.HTTPRequest;
import io.github.speakeasy_sdks_staging.javaclientsdk.utils.JSON;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.apache.http.NameValuePair;

/**
 * REST APIs for retrieving request information
 */
public class Requests {
	
	private SDKConfiguration sdkConfiguration;

	public Requests(SDKConfiguration sdkConfiguration) {
		this.sdkConfiguration = sdkConfiguration;
	}

    /**
     * Generate a Postman collection for a particular request.
     * Generates a Postman collection for a particular request. 
     * Allowing it to be replayed with the same inputs that were captured by the SDK.
     * @param request the request object containing all of the parameters for the API call
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GenerateRequestPostmanCollectionResponse generateRequestPostmanCollection(io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GenerateRequestPostmanCollectionRequest request) throws Exception {
        String baseUrl = this.sdkConfiguration.serverUrl;
        String url = io.github.speakeasy_sdks_staging.javaclientsdk.utils.Utils.generateURL(io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GenerateRequestPostmanCollectionRequest.class, baseUrl, "/v1/eventlog/{requestID}/generate/postman", request, this.sdkConfiguration.globals);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);

        req.addHeader("Accept", "application/json;q=1, application/octet-stream;q=0");
        req.addHeader("user-agent", this.sdkConfiguration.userAgent);
        
        HTTPClient client = this.sdkConfiguration.securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");
        
        io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GenerateRequestPostmanCollectionResponse res = new io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GenerateRequestPostmanCollectionResponse(contentType, httpRes.statusCode(), httpRes) {{
            postmanCollection = null;
            error = null;
        }};
        
        if (httpRes.statusCode() == 200) {
            if (io.github.speakeasy_sdks_staging.javaclientsdk.utils.Utils.matchContentType(contentType, "application/octet-stream")) {
                byte[] out = httpRes.body();
                res.postmanCollection = out;
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
     * Get information about a particular request.
     * @param request the request object containing all of the parameters for the API call
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GetRequestFromEventLogResponse getRequestFromEventLog(io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GetRequestFromEventLogRequest request) throws Exception {
        String baseUrl = this.sdkConfiguration.serverUrl;
        String url = io.github.speakeasy_sdks_staging.javaclientsdk.utils.Utils.generateURL(io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GetRequestFromEventLogRequest.class, baseUrl, "/v1/eventlog/{requestID}", request, this.sdkConfiguration.globals);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", this.sdkConfiguration.userAgent);
        
        HTTPClient client = this.sdkConfiguration.securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");
        
        io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GetRequestFromEventLogResponse res = new io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GetRequestFromEventLogResponse(contentType, httpRes.statusCode(), httpRes) {{
            unboundedRequest = null;
            error = null;
        }};
        
        if (httpRes.statusCode() == 200) {
            if (io.github.speakeasy_sdks_staging.javaclientsdk.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                io.github.speakeasy_sdks_staging.javaclientsdk.models.shared.UnboundedRequest out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), io.github.speakeasy_sdks_staging.javaclientsdk.models.shared.UnboundedRequest.class);
                res.unboundedRequest = out;
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
     * Query the event log to retrieve a list of requests.
     * Supports retrieving a list of request captured by the SDK for this workspace.
     * Allows the filtering of requests on a number of criteria such as ApiID, VersionID, Path, Method, etc.
     * @param request the request object containing all of the parameters for the API call
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.QueryEventLogResponse queryEventLog(io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.QueryEventLogRequest request) throws Exception {
        String baseUrl = this.sdkConfiguration.serverUrl;
        String url = io.github.speakeasy_sdks_staging.javaclientsdk.utils.Utils.generateURL(baseUrl, "/v1/eventlog/query");
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", this.sdkConfiguration.userAgent);
        java.util.List<NameValuePair> queryParams = io.github.speakeasy_sdks_staging.javaclientsdk.utils.Utils.getQueryParams(io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.QueryEventLogRequest.class, request, this.sdkConfiguration.globals);
        if (queryParams != null) {
            for (NameValuePair queryParam : queryParams) {
                req.addQueryParam(queryParam);
            }
        }
        
        HTTPClient client = this.sdkConfiguration.securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");
        
        io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.QueryEventLogResponse res = new io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.QueryEventLogResponse(contentType, httpRes.statusCode(), httpRes) {{
            boundedRequests = null;
            error = null;
        }};
        
        if (httpRes.statusCode() == 200) {
            if (io.github.speakeasy_sdks_staging.javaclientsdk.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                io.github.speakeasy_sdks_staging.javaclientsdk.models.shared.BoundedRequest[] out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), io.github.speakeasy_sdks_staging.javaclientsdk.models.shared.BoundedRequest[].class);
                res.boundedRequests = out;
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
}