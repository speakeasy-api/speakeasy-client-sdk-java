/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package io.github.speakeasy_sdks_staging.javaclientsdk;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.github.speakeasy_sdks_staging.javaclientsdk.models.errors.SDKError;
import io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.SDKMethodInterfaces.*;
import io.github.speakeasy_sdks_staging.javaclientsdk.utils.HTTPClient;
import io.github.speakeasy_sdks_staging.javaclientsdk.utils.HTTPRequest;
import io.github.speakeasy_sdks_staging.javaclientsdk.utils.Hook.AfterErrorContextImpl;
import io.github.speakeasy_sdks_staging.javaclientsdk.utils.Hook.AfterSuccessContextImpl;
import io.github.speakeasy_sdks_staging.javaclientsdk.utils.Hook.BeforeRequestContextImpl;
import io.github.speakeasy_sdks_staging.javaclientsdk.utils.JSON;
import io.github.speakeasy_sdks_staging.javaclientsdk.utils.Retries.NonRetryableException;
import io.github.speakeasy_sdks_staging.javaclientsdk.utils.SerializedBody;
import io.github.speakeasy_sdks_staging.javaclientsdk.utils.Utils;
import java.io.InputStream;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.util.Optional;
import org.apache.http.NameValuePair;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * REST APIs for managing LLM OAS suggestions
 */
public class Suggest implements
            MethodCallApplyOperationIDs,
            MethodCallSuggestOperationIDs,
            MethodCallSuggestOperationIDsRegistry {

    private final SDKConfiguration sdkConfiguration;

    Suggest(SDKConfiguration sdkConfiguration) {
        this.sdkConfiguration = sdkConfiguration;
    }


    /**
     * Apply operation ID suggestions and download result.
     * @return The call builder
     */
    public io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.ApplyOperationIDsRequestBuilder applyOperationIDs() {
        return new io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.ApplyOperationIDsRequestBuilder(this);
    }

    /**
     * Apply operation ID suggestions and download result.
     * @param request The request object containing all of the parameters for the API call.
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.ApplyOperationIDsResponse applyOperationIDs(
            io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.ApplyOperationIDsRequest request) throws Exception {
        String _baseUrl = this.sdkConfiguration.serverUrl;
        String _url = Utils.generateURL(
                _baseUrl,
                "/v1/suggest/operation_ids/apply");
        
        HTTPRequest _req = new HTTPRequest(_url, "POST");
        Object _convertedRequest = Utils.convertToShape(request, Utils.JsonShape.DEFAULT,
            new TypeReference<io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.ApplyOperationIDsRequest>() {});
        SerializedBody _serializedRequestBody = Utils.serializeRequestBody(
                _convertedRequest, "requestBody", "json", false);
        _req.setBody(Optional.ofNullable(_serializedRequestBody));
        _req.addHeader("Accept", "application/json;q=1, application/x-yaml;q=0")
            .addHeader("user-agent", 
                this.sdkConfiguration.userAgent);
        _req.addHeaders(Utils.getHeadersFromMetadata(request, this.sdkConfiguration.globals));

        Utils.configureSecurity(_req,  
                this.sdkConfiguration.securitySource.getSecurity());

        HTTPClient _client = this.sdkConfiguration.defaultClient;
        HttpRequest _r = 
            sdkConfiguration.hooks()
               .beforeRequest(
                  new BeforeRequestContextImpl("applyOperationIDs", Optional.of(java.util.List.of()), sdkConfiguration.securitySource()),
                  _req.build());
        HttpResponse<InputStream> _httpRes;
        try {
            _httpRes = _client.send(_r);
            if (Utils.statusCodeMatches(_httpRes.statusCode(), "4XX", "5XX")) {
                _httpRes = sdkConfiguration.hooks()
                    .afterError(
                        new AfterErrorContextImpl("applyOperationIDs", Optional.of(java.util.List.of()), sdkConfiguration.securitySource()),
                        Optional.of(_httpRes),
                        Optional.empty());
            } else {
                _httpRes = sdkConfiguration.hooks()
                    .afterSuccess(
                        new AfterSuccessContextImpl("applyOperationIDs", Optional.of(java.util.List.of()), sdkConfiguration.securitySource()),
                         _httpRes);
            }
        } catch (Exception _e) {
            _httpRes = sdkConfiguration.hooks()
                    .afterError(new AfterErrorContextImpl("applyOperationIDs", Optional.of(java.util.List.of()), sdkConfiguration.securitySource()), 
                        Optional.empty(),
                        Optional.of(_e));
        }
        String _contentType = _httpRes
            .headers()
            .firstValue("Content-Type")
            .orElse("application/octet-stream");
        io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.ApplyOperationIDsResponse.Builder _resBuilder = 
            io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.ApplyOperationIDsResponse
                .builder()
                .contentType(_contentType)
                .statusCode(_httpRes.statusCode())
                .rawResponse(_httpRes);
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "200") && Utils.contentTypeMatches(_contentType, "application/json")) {
            _resBuilder.twoHundredApplicationJsonSchema(_httpRes.body());
        }
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "200") && Utils.contentTypeMatches(_contentType, "application/x-yaml")) {
            _resBuilder.twoHundredApplicationXYamlSchema(_httpRes.body());
        }

        io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.ApplyOperationIDsResponse _res = _resBuilder.build();
        
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "200")) {
            if (Utils.contentTypeMatches(_contentType, "application/json")) {
                return _res;
            } else if (Utils.contentTypeMatches(_contentType, "application/x-yaml")) {
                return _res;
            } else {
                throw new SDKError(
                    _httpRes, 
                    _httpRes.statusCode(), 
                    "Unexpected content-type received: " + _contentType, 
                    Utils.toByteArrayAndClose(_httpRes.body()));
            }
        }
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "4XX", "5XX")) {
            // no content 
            throw new SDKError(
                    _httpRes, 
                    _httpRes.statusCode(), 
                    "API error occurred", 
                    Utils.toByteArrayAndClose(_httpRes.body()));
        }
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "default")) {
            if (Utils.contentTypeMatches(_contentType, "application/json")) {
                io.github.speakeasy_sdks_staging.javaclientsdk.models.errors.Error _out = Utils.mapper().readValue(
                    Utils.toUtf8AndClose(_httpRes.body()),
                    new TypeReference<io.github.speakeasy_sdks_staging.javaclientsdk.models.errors.Error>() {});
                _res.withError(java.util.Optional.ofNullable(_out));
                return _res;
            } else {
                throw new SDKError(
                    _httpRes, 
                    _httpRes.statusCode(), 
                    "Unexpected content-type received: " + _contentType, 
                    Utils.toByteArrayAndClose(_httpRes.body()));
            }
        }
        throw new SDKError(
            _httpRes, 
            _httpRes.statusCode(), 
            "Unexpected status code received: " + _httpRes.statusCode(), 
            Utils.toByteArrayAndClose(_httpRes.body()));
    }



    /**
     * Generate operation ID suggestions.
     * Get suggestions from an LLM model for improving the operationIDs in the provided schema.
     * @return The call builder
     */
    public io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.SuggestOperationIDsRequestBuilder suggestOperationIDs() {
        return new io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.SuggestOperationIDsRequestBuilder(this);
    }

    /**
     * Generate operation ID suggestions.
     * Get suggestions from an LLM model for improving the operationIDs in the provided schema.
     * @param request The request object containing all of the parameters for the API call.
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.SuggestOperationIDsResponse suggestOperationIDs(
            io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.SuggestOperationIDsRequest request) throws Exception {
        String _baseUrl = this.sdkConfiguration.serverUrl;
        String _url = Utils.generateURL(
                _baseUrl,
                "/v1/suggest/operation_ids");
        
        HTTPRequest _req = new HTTPRequest(_url, "POST");
        Object _convertedRequest = Utils.convertToShape(request, Utils.JsonShape.DEFAULT,
            new TypeReference<io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.SuggestOperationIDsRequest>() {});
        SerializedBody _serializedRequestBody = Utils.serializeRequestBody(
                _convertedRequest, "requestBody", "multipart", false);
        if (_serializedRequestBody == null) {
            throw new Exception("Request body is required");
        }
        _req.setBody(Optional.ofNullable(_serializedRequestBody));
        _req.addHeader("Accept", "application/json")
            .addHeader("user-agent", 
                this.sdkConfiguration.userAgent);

        _req.addQueryParams(Utils.getQueryParams(
                io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.SuggestOperationIDsRequest.class,
                request, 
                this.sdkConfiguration.globals));
        _req.addHeaders(Utils.getHeadersFromMetadata(request, this.sdkConfiguration.globals));

        Utils.configureSecurity(_req,  
                this.sdkConfiguration.securitySource.getSecurity());

        HTTPClient _client = this.sdkConfiguration.defaultClient;
        HttpRequest _r = 
            sdkConfiguration.hooks()
               .beforeRequest(
                  new BeforeRequestContextImpl("suggestOperationIDs", Optional.of(java.util.List.of()), sdkConfiguration.securitySource()),
                  _req.build());
        HttpResponse<InputStream> _httpRes;
        try {
            _httpRes = _client.send(_r);
            if (Utils.statusCodeMatches(_httpRes.statusCode(), "4XX", "5XX")) {
                _httpRes = sdkConfiguration.hooks()
                    .afterError(
                        new AfterErrorContextImpl("suggestOperationIDs", Optional.of(java.util.List.of()), sdkConfiguration.securitySource()),
                        Optional.of(_httpRes),
                        Optional.empty());
            } else {
                _httpRes = sdkConfiguration.hooks()
                    .afterSuccess(
                        new AfterSuccessContextImpl("suggestOperationIDs", Optional.of(java.util.List.of()), sdkConfiguration.securitySource()),
                         _httpRes);
            }
        } catch (Exception _e) {
            _httpRes = sdkConfiguration.hooks()
                    .afterError(new AfterErrorContextImpl("suggestOperationIDs", Optional.of(java.util.List.of()), sdkConfiguration.securitySource()), 
                        Optional.empty(),
                        Optional.of(_e));
        }
        String _contentType = _httpRes
            .headers()
            .firstValue("Content-Type")
            .orElse("application/octet-stream");
        io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.SuggestOperationIDsResponse.Builder _resBuilder = 
            io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.SuggestOperationIDsResponse
                .builder()
                .contentType(_contentType)
                .statusCode(_httpRes.statusCode())
                .rawResponse(_httpRes);

        io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.SuggestOperationIDsResponse _res = _resBuilder.build();
        
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "200")) {
            if (Utils.contentTypeMatches(_contentType, "application/json")) {
                io.github.speakeasy_sdks_staging.javaclientsdk.models.shared.SuggestedOperationIDs _out = Utils.mapper().readValue(
                    Utils.toUtf8AndClose(_httpRes.body()),
                    new TypeReference<io.github.speakeasy_sdks_staging.javaclientsdk.models.shared.SuggestedOperationIDs>() {});
                _res.withSuggestedOperationIDs(java.util.Optional.ofNullable(_out));
                return _res;
            } else {
                throw new SDKError(
                    _httpRes, 
                    _httpRes.statusCode(), 
                    "Unexpected content-type received: " + _contentType, 
                    Utils.toByteArrayAndClose(_httpRes.body()));
            }
        }
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "4XX", "5XX")) {
            // no content 
            throw new SDKError(
                    _httpRes, 
                    _httpRes.statusCode(), 
                    "API error occurred", 
                    Utils.toByteArrayAndClose(_httpRes.body()));
        }
        throw new SDKError(
            _httpRes, 
            _httpRes.statusCode(), 
            "Unexpected status code received: " + _httpRes.statusCode(), 
            Utils.toByteArrayAndClose(_httpRes.body()));
    }



    /**
     * Generate operation ID suggestions.
     * Get suggestions from an LLM model for improving the operationIDs in the provided schema.
     * @return The call builder
     */
    public io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.SuggestOperationIDsRegistryRequestBuilder suggestOperationIDsRegistry() {
        return new io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.SuggestOperationIDsRegistryRequestBuilder(this);
    }

    /**
     * Generate operation ID suggestions.
     * Get suggestions from an LLM model for improving the operationIDs in the provided schema.
     * @param request The request object containing all of the parameters for the API call.
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.SuggestOperationIDsRegistryResponse suggestOperationIDsRegistry(
            io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.SuggestOperationIDsRegistryRequest request) throws Exception {
        String _baseUrl = this.sdkConfiguration.serverUrl;
        String _url = Utils.generateURL(
                io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.SuggestOperationIDsRegistryRequest.class,
                _baseUrl,
                "/v1/suggest/operation_ids/{namespace_name}/{revision_reference}",
                request, this.sdkConfiguration.globals);
        
        HTTPRequest _req = new HTTPRequest(_url, "POST");
        Object _convertedRequest = Utils.convertToShape(request, Utils.JsonShape.DEFAULT,
            new TypeReference<io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.SuggestOperationIDsRegistryRequest>() {});
        SerializedBody _serializedRequestBody = Utils.serializeRequestBody(
                _convertedRequest, "suggestOperationIDsOpts", "json", false);
        _req.setBody(Optional.ofNullable(_serializedRequestBody));
        _req.addHeader("Accept", "application/json")
            .addHeader("user-agent", 
                this.sdkConfiguration.userAgent);

        _req.addQueryParams(Utils.getQueryParams(
                io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.SuggestOperationIDsRegistryRequest.class,
                request, 
                this.sdkConfiguration.globals));
        _req.addHeaders(Utils.getHeadersFromMetadata(request, this.sdkConfiguration.globals));

        Utils.configureSecurity(_req,  
                this.sdkConfiguration.securitySource.getSecurity());

        HTTPClient _client = this.sdkConfiguration.defaultClient;
        HttpRequest _r = 
            sdkConfiguration.hooks()
               .beforeRequest(
                  new BeforeRequestContextImpl("suggestOperationIDsRegistry", Optional.of(java.util.List.of()), sdkConfiguration.securitySource()),
                  _req.build());
        HttpResponse<InputStream> _httpRes;
        try {
            _httpRes = _client.send(_r);
            if (Utils.statusCodeMatches(_httpRes.statusCode(), "4XX", "5XX")) {
                _httpRes = sdkConfiguration.hooks()
                    .afterError(
                        new AfterErrorContextImpl("suggestOperationIDsRegistry", Optional.of(java.util.List.of()), sdkConfiguration.securitySource()),
                        Optional.of(_httpRes),
                        Optional.empty());
            } else {
                _httpRes = sdkConfiguration.hooks()
                    .afterSuccess(
                        new AfterSuccessContextImpl("suggestOperationIDsRegistry", Optional.of(java.util.List.of()), sdkConfiguration.securitySource()),
                         _httpRes);
            }
        } catch (Exception _e) {
            _httpRes = sdkConfiguration.hooks()
                    .afterError(new AfterErrorContextImpl("suggestOperationIDsRegistry", Optional.of(java.util.List.of()), sdkConfiguration.securitySource()), 
                        Optional.empty(),
                        Optional.of(_e));
        }
        String _contentType = _httpRes
            .headers()
            .firstValue("Content-Type")
            .orElse("application/octet-stream");
        io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.SuggestOperationIDsRegistryResponse.Builder _resBuilder = 
            io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.SuggestOperationIDsRegistryResponse
                .builder()
                .contentType(_contentType)
                .statusCode(_httpRes.statusCode())
                .rawResponse(_httpRes);

        io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.SuggestOperationIDsRegistryResponse _res = _resBuilder.build();
        
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "200")) {
            if (Utils.contentTypeMatches(_contentType, "application/json")) {
                io.github.speakeasy_sdks_staging.javaclientsdk.models.shared.SuggestedOperationIDs _out = Utils.mapper().readValue(
                    Utils.toUtf8AndClose(_httpRes.body()),
                    new TypeReference<io.github.speakeasy_sdks_staging.javaclientsdk.models.shared.SuggestedOperationIDs>() {});
                _res.withSuggestedOperationIDs(java.util.Optional.ofNullable(_out));
                return _res;
            } else {
                throw new SDKError(
                    _httpRes, 
                    _httpRes.statusCode(), 
                    "Unexpected content-type received: " + _contentType, 
                    Utils.toByteArrayAndClose(_httpRes.body()));
            }
        }
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "4XX", "5XX")) {
            // no content 
            throw new SDKError(
                    _httpRes, 
                    _httpRes.statusCode(), 
                    "API error occurred", 
                    Utils.toByteArrayAndClose(_httpRes.body()));
        }
        throw new SDKError(
            _httpRes, 
            _httpRes.statusCode(), 
            "Unexpected status code received: " + _httpRes.statusCode(), 
            Utils.toByteArrayAndClose(_httpRes.body()));
    }

}
