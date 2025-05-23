/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package dev.speakeasyapi.javaclientsdk.models.operations;

import dev.speakeasyapi.javaclientsdk.utils.Options;
import java.lang.Exception;
import java.util.Optional;

public class SDKMethodInterfaces {


    public interface MethodCallDeleteApi {
        DeleteApiResponse deleteApi(
            DeleteApiRequest request) throws Exception;
    }


    public interface MethodCallGenerateOpenApiSpec {
        GenerateOpenApiSpecResponse generateOpenApiSpec(
            GenerateOpenApiSpecRequest request) throws Exception;
    }


    public interface MethodCallGeneratePostmanCollection {
        GeneratePostmanCollectionResponse generatePostmanCollection(
            GeneratePostmanCollectionRequest request) throws Exception;
    }


    public interface MethodCallGetAllApiVersions {
        GetAllApiVersionsResponse getAllApiVersions(
            GetAllApiVersionsRequest request) throws Exception;
    }


    public interface MethodCallGetApis {
        GetApisResponse getApis(
            GetApisRequest request) throws Exception;
    }


    public interface MethodCallUpsertApi {
        UpsertApiResponse upsertApi(
            UpsertApiRequest request) throws Exception;
    }


    public interface MethodCallDeleteApiEndpoint {
        DeleteApiEndpointResponse deleteApiEndpoint(
            DeleteApiEndpointRequest request) throws Exception;
    }


    public interface MethodCallFindApiEndpoint {
        FindApiEndpointResponse findApiEndpoint(
            FindApiEndpointRequest request) throws Exception;
    }


    public interface MethodCallGenerateOpenApiSpecForApiEndpoint {
        GenerateOpenApiSpecForApiEndpointResponse generateOpenApiSpecForApiEndpoint(
            GenerateOpenApiSpecForApiEndpointRequest request) throws Exception;
    }


    public interface MethodCallGeneratePostmanCollectionForApiEndpoint {
        GeneratePostmanCollectionForApiEndpointResponse generatePostmanCollectionForApiEndpoint(
            GeneratePostmanCollectionForApiEndpointRequest request) throws Exception;
    }


    public interface MethodCallGetAllApiEndpoints {
        GetAllApiEndpointsResponse getAllApiEndpoints(
            GetAllApiEndpointsRequest request) throws Exception;
    }


    public interface MethodCallGetAllForVersionApiEndpoints {
        GetAllForVersionApiEndpointsResponse getAllForVersionApiEndpoints(
            GetAllForVersionApiEndpointsRequest request) throws Exception;
    }


    public interface MethodCallGetApiEndpoint {
        GetApiEndpointResponse getApiEndpoint(
            GetApiEndpointRequest request) throws Exception;
    }


    public interface MethodCallUpsertApiEndpoint {
        UpsertApiEndpointResponse upsertApiEndpoint(
            UpsertApiEndpointRequest request) throws Exception;
    }


    public interface MethodCallDeleteVersionMetadata {
        DeleteVersionMetadataResponse deleteVersionMetadata(
            DeleteVersionMetadataRequest request) throws Exception;
    }


    public interface MethodCallGetVersionMetadata {
        GetVersionMetadataResponse getVersionMetadata(
            GetVersionMetadataRequest request) throws Exception;
    }


    public interface MethodCallInsertVersionMetadata {
        InsertVersionMetadataResponse insertVersionMetadata(
            InsertVersionMetadataRequest request) throws Exception;
    }


    public interface MethodCallDeleteSchema {
        DeleteSchemaResponse deleteSchema(
            DeleteSchemaRequest request) throws Exception;
    }


    public interface MethodCallDownloadSchema {
        DownloadSchemaResponse downloadSchema(
            DownloadSchemaRequest request) throws Exception;
    }


    public interface MethodCallDownloadSchemaRevision {
        DownloadSchemaRevisionResponse downloadSchemaRevision(
            DownloadSchemaRevisionRequest request) throws Exception;
    }


    public interface MethodCallGetSchema {
        GetSchemaResponse getSchema(
            GetSchemaRequest request) throws Exception;
    }


    public interface MethodCallGetSchemaDiff {
        GetSchemaDiffResponse getSchemaDiff(
            GetSchemaDiffRequest request) throws Exception;
    }


    public interface MethodCallGetSchemaRevision {
        GetSchemaRevisionResponse getSchemaRevision(
            GetSchemaRevisionRequest request) throws Exception;
    }


    public interface MethodCallGetSchemas {
        GetSchemasResponse getSchemas(
            GetSchemasRequest request) throws Exception;
    }


    public interface MethodCallRegisterSchema {
        RegisterSchemaResponse registerSchema(
            RegisterSchemaRequest request) throws Exception;
    }


    public interface MethodCallValidateApiKey {
        ValidateApiKeyResponse validateApiKeyDirect() throws Exception;
    }


    public interface MethodCallGenerateRequestPostmanCollection {
        GenerateRequestPostmanCollectionResponse generateRequestPostmanCollection(
            GenerateRequestPostmanCollectionRequest request) throws Exception;
    }


    public interface MethodCallGetRequestFromEventLog {
        GetRequestFromEventLogResponse getRequestFromEventLog(
            GetRequestFromEventLogRequest request) throws Exception;
    }


    public interface MethodCallQueryEventLog {
        QueryEventLogResponse queryEventLog(
            QueryEventLogRequest request) throws Exception;
    }


    public interface MethodCallGetEmbedAccessToken {
        GetEmbedAccessTokenResponse getEmbedAccessToken(
            GetEmbedAccessTokenRequest request) throws Exception;
    }


    public interface MethodCallGetValidEmbedAccessTokens {
        GetValidEmbedAccessTokensResponse getValidEmbedAccessTokensDirect() throws Exception;
    }


    public interface MethodCallRevokeEmbedAccessToken {
        RevokeEmbedAccessTokenResponse revokeEmbedAccessToken(
            RevokeEmbedAccessTokenRequest request) throws Exception;
    }


    public interface MethodCallPostWorkspaceEvents {
        PostWorkspaceEventsResponse postWorkspaceEvents(
            PostWorkspaceEventsRequest request,
            Optional<Options> options) throws Exception;
    }


}
