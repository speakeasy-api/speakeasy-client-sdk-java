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
import java.time.OffsetDateTime;
import java.util.Optional;
import org.apache.http.NameValuePair;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * REST APIs for managing Api entities
 */
public class Apis implements
            MethodCallDeleteApi,
            MethodCallGenerateOpenApiSpec,
            MethodCallGeneratePostmanCollection,
            MethodCallGetAllApiVersions,
            MethodCallGetApis,
            MethodCallUpsertApi {

    private final SDKConfiguration sdkConfiguration;

    Apis(SDKConfiguration sdkConfiguration) {
        this.sdkConfiguration = sdkConfiguration;
    }

    /**
     * Delete an Api.
     * Delete a particular version of an Api. The will also delete all associated ApiEndpoints, Metadata, Schemas &amp; Request Logs (if using a Postgres datastore).
     * @return The call builder
     */
    public io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.DeleteApiRequestBuilder deleteApi() {
        return new io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.DeleteApiRequestBuilder(this);
    }

    /**
     * Delete an Api.
     * Delete a particular version of an Api. The will also delete all associated ApiEndpoints, Metadata, Schemas &amp; Request Logs (if using a Postgres datastore).
     * @param request The request object containing all of the parameters for the API call.
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.DeleteApiResponse deleteApi(
            io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.DeleteApiRequest request) throws Exception {
        String _baseUrl = this.sdkConfiguration.serverUrl;
        String _url = Utils.generateURL(
                io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.DeleteApiRequest.class,
                _baseUrl,
                "/v1/apis/{apiID}/version/{versionID}",
                request, this.sdkConfiguration.globals);
        
        HTTPRequest _req = new HTTPRequest(_url, "DELETE");
        _req.addHeader("Accept", "application/json")
            .addHeader("user-agent", 
                this.sdkConfiguration.userAgent);

        Utils.configureSecurity(_req,  
                this.sdkConfiguration.securitySource.getSecurity());

        HTTPClient _client = this.sdkConfiguration.defaultClient;
        HttpRequest _r = 
            sdkConfiguration.hooks()
               .beforeRequest(
                  new BeforeRequestContextImpl("deleteApi", sdkConfiguration.securitySource()),
                  _req.build());
        HttpResponse<InputStream> _httpRes;
        try {
            _httpRes = _client.send(_r);
            if (Utils.statusCodeMatches(_httpRes.statusCode(), "4XX", "5XX")) {
                _httpRes = sdkConfiguration.hooks()
                    .afterError(
                        new AfterErrorContextImpl("deleteApi", sdkConfiguration.securitySource()),
                        Optional.of(_httpRes),
                        Optional.empty());
            } else {
                _httpRes = sdkConfiguration.hooks()
                    .afterSuccess(
                        new AfterSuccessContextImpl("deleteApi", sdkConfiguration.securitySource()),
                         _httpRes);
            }
        } catch (Exception _e) {
            _httpRes = sdkConfiguration.hooks()
                    .afterError(new AfterErrorContextImpl("deleteApi", sdkConfiguration.securitySource()), 
                        Optional.empty(),
                        Optional.of(_e));
        }
        String _contentType = _httpRes
            .headers()
            .firstValue("Content-Type")
            .orElse("application/octet-stream");
        io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.DeleteApiResponse.Builder _resBuilder = 
            io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.DeleteApiResponse
                .builder()
                .contentType(_contentType)
                .statusCode(_httpRes.statusCode())
                .rawResponse(_httpRes);

        io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.DeleteApiResponse _res = _resBuilder.build();
        
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "200")) {
            // no content 
            return _res;
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
                ObjectMapper _mapper = JSON.getMapper();
                io.github.speakeasy_sdks_staging.javaclientsdk.models.errors.Error _out = _mapper.readValue(
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
     * Generate an OpenAPI specification for a particular Api.
     * This endpoint will generate any missing operations in any registered OpenAPI document if the operation does not already exist in the document.
     * Returns the original document and the newly generated document allowing a diff to be performed to see what has changed.
     * @return The call builder
     */
    public io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GenerateOpenApiSpecRequestBuilder generateOpenApiSpec() {
        return new io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GenerateOpenApiSpecRequestBuilder(this);
    }

    /**
     * Generate an OpenAPI specification for a particular Api.
     * This endpoint will generate any missing operations in any registered OpenAPI document if the operation does not already exist in the document.
     * Returns the original document and the newly generated document allowing a diff to be performed to see what has changed.
     * @param request The request object containing all of the parameters for the API call.
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GenerateOpenApiSpecResponse generateOpenApiSpec(
            io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GenerateOpenApiSpecRequest request) throws Exception {
        String _baseUrl = this.sdkConfiguration.serverUrl;
        String _url = Utils.generateURL(
                io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GenerateOpenApiSpecRequest.class,
                _baseUrl,
                "/v1/apis/{apiID}/version/{versionID}/generate/openapi",
                request, this.sdkConfiguration.globals);
        
        HTTPRequest _req = new HTTPRequest(_url, "GET");
        _req.addHeader("Accept", "application/json")
            .addHeader("user-agent", 
                this.sdkConfiguration.userAgent);

        Utils.configureSecurity(_req,  
                this.sdkConfiguration.securitySource.getSecurity());

        HTTPClient _client = this.sdkConfiguration.defaultClient;
        HttpRequest _r = 
            sdkConfiguration.hooks()
               .beforeRequest(
                  new BeforeRequestContextImpl("generateOpenApiSpec", sdkConfiguration.securitySource()),
                  _req.build());
        HttpResponse<InputStream> _httpRes;
        try {
            _httpRes = _client.send(_r);
            if (Utils.statusCodeMatches(_httpRes.statusCode(), "4XX", "5XX")) {
                _httpRes = sdkConfiguration.hooks()
                    .afterError(
                        new AfterErrorContextImpl("generateOpenApiSpec", sdkConfiguration.securitySource()),
                        Optional.of(_httpRes),
                        Optional.empty());
            } else {
                _httpRes = sdkConfiguration.hooks()
                    .afterSuccess(
                        new AfterSuccessContextImpl("generateOpenApiSpec", sdkConfiguration.securitySource()),
                         _httpRes);
            }
        } catch (Exception _e) {
            _httpRes = sdkConfiguration.hooks()
                    .afterError(new AfterErrorContextImpl("generateOpenApiSpec", sdkConfiguration.securitySource()), 
                        Optional.empty(),
                        Optional.of(_e));
        }
        String _contentType = _httpRes
            .headers()
            .firstValue("Content-Type")
            .orElse("application/octet-stream");
        io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GenerateOpenApiSpecResponse.Builder _resBuilder = 
            io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GenerateOpenApiSpecResponse
                .builder()
                .contentType(_contentType)
                .statusCode(_httpRes.statusCode())
                .rawResponse(_httpRes);

        io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GenerateOpenApiSpecResponse _res = _resBuilder.build();
        
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "200")) {
            if (Utils.contentTypeMatches(_contentType, "application/json")) {
                ObjectMapper _mapper = JSON.getMapper();
                io.github.speakeasy_sdks_staging.javaclientsdk.models.shared.GenerateOpenApiSpecDiff _out = _mapper.readValue(
                    Utils.toUtf8AndClose(_httpRes.body()),
                    new TypeReference<io.github.speakeasy_sdks_staging.javaclientsdk.models.shared.GenerateOpenApiSpecDiff>() {});
                _res.withGenerateOpenApiSpecDiff(java.util.Optional.ofNullable(_out));
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
                ObjectMapper _mapper = JSON.getMapper();
                io.github.speakeasy_sdks_staging.javaclientsdk.models.errors.Error _out = _mapper.readValue(
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
     * Generate a Postman collection for a particular Api.
     * Generates a postman collection containing all endpoints for a particular API. Includes variables produced for any path/query/header parameters included in the OpenAPI document.
     * @return The call builder
     */
    public io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GeneratePostmanCollectionRequestBuilder generatePostmanCollection() {
        return new io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GeneratePostmanCollectionRequestBuilder(this);
    }

    /**
     * Generate a Postman collection for a particular Api.
     * Generates a postman collection containing all endpoints for a particular API. Includes variables produced for any path/query/header parameters included in the OpenAPI document.
     * @param request The request object containing all of the parameters for the API call.
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GeneratePostmanCollectionResponse generatePostmanCollection(
            io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GeneratePostmanCollectionRequest request) throws Exception {
        String _baseUrl = this.sdkConfiguration.serverUrl;
        String _url = Utils.generateURL(
                io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GeneratePostmanCollectionRequest.class,
                _baseUrl,
                "/v1/apis/{apiID}/version/{versionID}/generate/postman",
                request, this.sdkConfiguration.globals);
        
        HTTPRequest _req = new HTTPRequest(_url, "GET");
        _req.addHeader("Accept", "application/json;q=1, application/octet-stream;q=0")
            .addHeader("user-agent", 
                this.sdkConfiguration.userAgent);

        Utils.configureSecurity(_req,  
                this.sdkConfiguration.securitySource.getSecurity());

        HTTPClient _client = this.sdkConfiguration.defaultClient;
        HttpRequest _r = 
            sdkConfiguration.hooks()
               .beforeRequest(
                  new BeforeRequestContextImpl("generatePostmanCollection", sdkConfiguration.securitySource()),
                  _req.build());
        HttpResponse<InputStream> _httpRes;
        try {
            _httpRes = _client.send(_r);
            if (Utils.statusCodeMatches(_httpRes.statusCode(), "4XX", "5XX")) {
                _httpRes = sdkConfiguration.hooks()
                    .afterError(
                        new AfterErrorContextImpl("generatePostmanCollection", sdkConfiguration.securitySource()),
                        Optional.of(_httpRes),
                        Optional.empty());
            } else {
                _httpRes = sdkConfiguration.hooks()
                    .afterSuccess(
                        new AfterSuccessContextImpl("generatePostmanCollection", sdkConfiguration.securitySource()),
                         _httpRes);
            }
        } catch (Exception _e) {
            _httpRes = sdkConfiguration.hooks()
                    .afterError(new AfterErrorContextImpl("generatePostmanCollection", sdkConfiguration.securitySource()), 
                        Optional.empty(),
                        Optional.of(_e));
        }
        String _contentType = _httpRes
            .headers()
            .firstValue("Content-Type")
            .orElse("application/octet-stream");
        io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GeneratePostmanCollectionResponse.Builder _resBuilder = 
            io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GeneratePostmanCollectionResponse
                .builder()
                .contentType(_contentType)
                .statusCode(_httpRes.statusCode())
                .rawResponse(_httpRes);
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "200") && Utils.contentTypeMatches(_contentType, "application/octet-stream")) {
            _resBuilder.postmanCollection(_httpRes.body());
        }

        io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GeneratePostmanCollectionResponse _res = _resBuilder.build();
        
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "200")) {
            if (Utils.contentTypeMatches(_contentType, "application/octet-stream")) {
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
                ObjectMapper _mapper = JSON.getMapper();
                io.github.speakeasy_sdks_staging.javaclientsdk.models.errors.Error _out = _mapper.readValue(
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
     * Get all Api versions for a particular ApiEndpoint.
     * Get all Api versions for a particular ApiEndpoint.
     * Supports filtering the versions based on metadata attributes.
     * @return The call builder
     */
    public io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GetAllApiVersionsRequestBuilder getAllApiVersions() {
        return new io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GetAllApiVersionsRequestBuilder(this);
    }

    /**
     * Get all Api versions for a particular ApiEndpoint.
     * Get all Api versions for a particular ApiEndpoint.
     * Supports filtering the versions based on metadata attributes.
     * @param request The request object containing all of the parameters for the API call.
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GetAllApiVersionsResponse getAllApiVersions(
            io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GetAllApiVersionsRequest request) throws Exception {
        String _baseUrl = this.sdkConfiguration.serverUrl;
        String _url = Utils.generateURL(
                io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GetAllApiVersionsRequest.class,
                _baseUrl,
                "/v1/apis/{apiID}",
                request, this.sdkConfiguration.globals);
        
        HTTPRequest _req = new HTTPRequest(_url, "GET");
        _req.addHeader("Accept", "application/json")
            .addHeader("user-agent", 
                this.sdkConfiguration.userAgent);

        _req.addQueryParams(Utils.getQueryParams(
                io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GetAllApiVersionsRequest.class,
                request, 
                this.sdkConfiguration.globals));

        Utils.configureSecurity(_req,  
                this.sdkConfiguration.securitySource.getSecurity());

        HTTPClient _client = this.sdkConfiguration.defaultClient;
        HttpRequest _r = 
            sdkConfiguration.hooks()
               .beforeRequest(
                  new BeforeRequestContextImpl("getAllApiVersions", sdkConfiguration.securitySource()),
                  _req.build());
        HttpResponse<InputStream> _httpRes;
        try {
            _httpRes = _client.send(_r);
            if (Utils.statusCodeMatches(_httpRes.statusCode(), "4XX", "5XX")) {
                _httpRes = sdkConfiguration.hooks()
                    .afterError(
                        new AfterErrorContextImpl("getAllApiVersions", sdkConfiguration.securitySource()),
                        Optional.of(_httpRes),
                        Optional.empty());
            } else {
                _httpRes = sdkConfiguration.hooks()
                    .afterSuccess(
                        new AfterSuccessContextImpl("getAllApiVersions", sdkConfiguration.securitySource()),
                         _httpRes);
            }
        } catch (Exception _e) {
            _httpRes = sdkConfiguration.hooks()
                    .afterError(new AfterErrorContextImpl("getAllApiVersions", sdkConfiguration.securitySource()), 
                        Optional.empty(),
                        Optional.of(_e));
        }
        String _contentType = _httpRes
            .headers()
            .firstValue("Content-Type")
            .orElse("application/octet-stream");
        io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GetAllApiVersionsResponse.Builder _resBuilder = 
            io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GetAllApiVersionsResponse
                .builder()
                .contentType(_contentType)
                .statusCode(_httpRes.statusCode())
                .rawResponse(_httpRes);

        io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GetAllApiVersionsResponse _res = _resBuilder.build();
        
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "200")) {
            if (Utils.contentTypeMatches(_contentType, "application/json")) {
                ObjectMapper _mapper = JSON.getMapper();
                java.util.List<io.github.speakeasy_sdks_staging.javaclientsdk.models.shared.Api> _out = _mapper.readValue(
                    Utils.toUtf8AndClose(_httpRes.body()),
                    new TypeReference<java.util.List<io.github.speakeasy_sdks_staging.javaclientsdk.models.shared.Api>>() {});
                _res.withApis(java.util.Optional.ofNullable(_out));
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
                ObjectMapper _mapper = JSON.getMapper();
                io.github.speakeasy_sdks_staging.javaclientsdk.models.errors.Error _out = _mapper.readValue(
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
     * Get a list of Apis for a given workspace
     * Get a list of all Apis and their versions for a given workspace.
     * Supports filtering the APIs based on metadata attributes.
     * @return The call builder
     */
    public io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GetApisRequestBuilder getApis() {
        return new io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GetApisRequestBuilder(this);
    }

    /**
     * Get a list of Apis for a given workspace
     * Get a list of all Apis and their versions for a given workspace.
     * Supports filtering the APIs based on metadata attributes.
     * @param request The request object containing all of the parameters for the API call.
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GetApisResponse getApis(
            io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GetApisRequest request) throws Exception {
        String _baseUrl = this.sdkConfiguration.serverUrl;
        String _url = Utils.generateURL(
                _baseUrl,
                "/v1/apis");
        
        HTTPRequest _req = new HTTPRequest(_url, "GET");
        _req.addHeader("Accept", "application/json")
            .addHeader("user-agent", 
                this.sdkConfiguration.userAgent);

        _req.addQueryParams(Utils.getQueryParams(
                io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GetApisRequest.class,
                request, 
                this.sdkConfiguration.globals));

        Utils.configureSecurity(_req,  
                this.sdkConfiguration.securitySource.getSecurity());

        HTTPClient _client = this.sdkConfiguration.defaultClient;
        HttpRequest _r = 
            sdkConfiguration.hooks()
               .beforeRequest(
                  new BeforeRequestContextImpl("getApis", sdkConfiguration.securitySource()),
                  _req.build());
        HttpResponse<InputStream> _httpRes;
        try {
            _httpRes = _client.send(_r);
            if (Utils.statusCodeMatches(_httpRes.statusCode(), "4XX", "5XX")) {
                _httpRes = sdkConfiguration.hooks()
                    .afterError(
                        new AfterErrorContextImpl("getApis", sdkConfiguration.securitySource()),
                        Optional.of(_httpRes),
                        Optional.empty());
            } else {
                _httpRes = sdkConfiguration.hooks()
                    .afterSuccess(
                        new AfterSuccessContextImpl("getApis", sdkConfiguration.securitySource()),
                         _httpRes);
            }
        } catch (Exception _e) {
            _httpRes = sdkConfiguration.hooks()
                    .afterError(new AfterErrorContextImpl("getApis", sdkConfiguration.securitySource()), 
                        Optional.empty(),
                        Optional.of(_e));
        }
        String _contentType = _httpRes
            .headers()
            .firstValue("Content-Type")
            .orElse("application/octet-stream");
        io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GetApisResponse.Builder _resBuilder = 
            io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GetApisResponse
                .builder()
                .contentType(_contentType)
                .statusCode(_httpRes.statusCode())
                .rawResponse(_httpRes);

        io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GetApisResponse _res = _resBuilder.build();
        
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "200")) {
            if (Utils.contentTypeMatches(_contentType, "application/json")) {
                ObjectMapper _mapper = JSON.getMapper();
                java.util.List<io.github.speakeasy_sdks_staging.javaclientsdk.models.shared.Api> _out = _mapper.readValue(
                    Utils.toUtf8AndClose(_httpRes.body()),
                    new TypeReference<java.util.List<io.github.speakeasy_sdks_staging.javaclientsdk.models.shared.Api>>() {});
                _res.withApis(java.util.Optional.ofNullable(_out));
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
                ObjectMapper _mapper = JSON.getMapper();
                io.github.speakeasy_sdks_staging.javaclientsdk.models.errors.Error _out = _mapper.readValue(
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
     * Upsert an Api
     * Upsert an Api. If the Api does not exist, it will be created.
     * If the Api exists, it will be updated.
     * @return The call builder
     */
    public io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.UpsertApiRequestBuilder upsertApi() {
        return new io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.UpsertApiRequestBuilder(this);
    }

    /**
     * Upsert an Api
     * Upsert an Api. If the Api does not exist, it will be created.
     * If the Api exists, it will be updated.
     * @param request The request object containing all of the parameters for the API call.
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.UpsertApiResponse upsertApi(
            io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.UpsertApiRequest request) throws Exception {
        String _baseUrl = this.sdkConfiguration.serverUrl;
        String _url = Utils.generateURL(
                io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.UpsertApiRequest.class,
                _baseUrl,
                "/v1/apis/{apiID}",
                request, this.sdkConfiguration.globals);
        
        HTTPRequest _req = new HTTPRequest(_url, "PUT");
        Object _convertedRequest = Utils.convertToShape(request, Utils.JsonShape.DEFAULT,
            new TypeReference<io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.UpsertApiRequest>() {});
        SerializedBody _serializedRequestBody = Utils.serializeRequestBody(
                _convertedRequest, "api", "json", false);
        if (_serializedRequestBody == null) {
            throw new Exception("Request body is required");
        }
        _req.setBody(Optional.ofNullable(_serializedRequestBody));
        _req.addHeader("Accept", "application/json")
            .addHeader("user-agent", 
                this.sdkConfiguration.userAgent);

        Utils.configureSecurity(_req,  
                this.sdkConfiguration.securitySource.getSecurity());

        HTTPClient _client = this.sdkConfiguration.defaultClient;
        HttpRequest _r = 
            sdkConfiguration.hooks()
               .beforeRequest(
                  new BeforeRequestContextImpl("upsertApi", sdkConfiguration.securitySource()),
                  _req.build());
        HttpResponse<InputStream> _httpRes;
        try {
            _httpRes = _client.send(_r);
            if (Utils.statusCodeMatches(_httpRes.statusCode(), "4XX", "5XX")) {
                _httpRes = sdkConfiguration.hooks()
                    .afterError(
                        new AfterErrorContextImpl("upsertApi", sdkConfiguration.securitySource()),
                        Optional.of(_httpRes),
                        Optional.empty());
            } else {
                _httpRes = sdkConfiguration.hooks()
                    .afterSuccess(
                        new AfterSuccessContextImpl("upsertApi", sdkConfiguration.securitySource()),
                         _httpRes);
            }
        } catch (Exception _e) {
            _httpRes = sdkConfiguration.hooks()
                    .afterError(new AfterErrorContextImpl("upsertApi", sdkConfiguration.securitySource()), 
                        Optional.empty(),
                        Optional.of(_e));
        }
        String _contentType = _httpRes
            .headers()
            .firstValue("Content-Type")
            .orElse("application/octet-stream");
        io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.UpsertApiResponse.Builder _resBuilder = 
            io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.UpsertApiResponse
                .builder()
                .contentType(_contentType)
                .statusCode(_httpRes.statusCode())
                .rawResponse(_httpRes);

        io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.UpsertApiResponse _res = _resBuilder.build();
        
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "200")) {
            if (Utils.contentTypeMatches(_contentType, "application/json")) {
                ObjectMapper _mapper = JSON.getMapper();
                io.github.speakeasy_sdks_staging.javaclientsdk.models.shared.Api _out = _mapper.readValue(
                    Utils.toUtf8AndClose(_httpRes.body()),
                    new TypeReference<io.github.speakeasy_sdks_staging.javaclientsdk.models.shared.Api>() {});
                _res.withApi(java.util.Optional.ofNullable(_out));
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
                ObjectMapper _mapper = JSON.getMapper();
                io.github.speakeasy_sdks_staging.javaclientsdk.models.errors.Error _out = _mapper.readValue(
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

}
