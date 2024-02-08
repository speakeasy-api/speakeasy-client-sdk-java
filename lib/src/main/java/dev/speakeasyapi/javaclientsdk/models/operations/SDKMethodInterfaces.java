/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package dev.speakeasyapi.javaclientsdk.models.operations;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;


public class SDKMethodInterfaces {

    public interface MethodCallValidateApiKeyDirect { 
        dev.speakeasyapi.javaclientsdk.models.operations.ValidateApiKeyResponse validateApiKeyDirect() throws Exception;
    }


    public interface MethodCallDeleteApi { 
        dev.speakeasyapi.javaclientsdk.models.operations.DeleteApiResponse deleteApi(
            dev.speakeasyapi.javaclientsdk.models.operations.DeleteApiRequest request) throws Exception;
    }


    public interface MethodCallGenerateOpenApiSpec { 
        dev.speakeasyapi.javaclientsdk.models.operations.GenerateOpenApiSpecResponse generateOpenApiSpec(
            dev.speakeasyapi.javaclientsdk.models.operations.GenerateOpenApiSpecRequest request) throws Exception;
    }


    public interface MethodCallGeneratePostmanCollection { 
        dev.speakeasyapi.javaclientsdk.models.operations.GeneratePostmanCollectionResponse generatePostmanCollection(
            dev.speakeasyapi.javaclientsdk.models.operations.GeneratePostmanCollectionRequest request) throws Exception;
    }


    public interface MethodCallGetAllApiVersions { 
        dev.speakeasyapi.javaclientsdk.models.operations.GetAllApiVersionsResponse getAllApiVersions(
            dev.speakeasyapi.javaclientsdk.models.operations.GetAllApiVersionsRequest request) throws Exception;
    }


    public interface MethodCallGetApis { 
        dev.speakeasyapi.javaclientsdk.models.operations.GetApisResponse getApis(
            dev.speakeasyapi.javaclientsdk.models.operations.GetApisRequest request) throws Exception;
    }


    public interface MethodCallUpsertApi { 
        dev.speakeasyapi.javaclientsdk.models.operations.UpsertApiResponse upsertApi(
            dev.speakeasyapi.javaclientsdk.models.operations.UpsertApiRequest request) throws Exception;
    }


    public interface MethodCallDeleteApiEndpoint { 
        dev.speakeasyapi.javaclientsdk.models.operations.DeleteApiEndpointResponse deleteApiEndpoint(
            dev.speakeasyapi.javaclientsdk.models.operations.DeleteApiEndpointRequest request) throws Exception;
    }


    public interface MethodCallFindApiEndpoint { 
        dev.speakeasyapi.javaclientsdk.models.operations.FindApiEndpointResponse findApiEndpoint(
            dev.speakeasyapi.javaclientsdk.models.operations.FindApiEndpointRequest request) throws Exception;
    }


    public interface MethodCallGenerateOpenApiSpecForApiEndpoint { 
        dev.speakeasyapi.javaclientsdk.models.operations.GenerateOpenApiSpecForApiEndpointResponse generateOpenApiSpecForApiEndpoint(
            dev.speakeasyapi.javaclientsdk.models.operations.GenerateOpenApiSpecForApiEndpointRequest request) throws Exception;
    }


    public interface MethodCallGeneratePostmanCollectionForApiEndpoint { 
        dev.speakeasyapi.javaclientsdk.models.operations.GeneratePostmanCollectionForApiEndpointResponse generatePostmanCollectionForApiEndpoint(
            dev.speakeasyapi.javaclientsdk.models.operations.GeneratePostmanCollectionForApiEndpointRequest request) throws Exception;
    }


    public interface MethodCallGetAllApiEndpoints { 
        dev.speakeasyapi.javaclientsdk.models.operations.GetAllApiEndpointsResponse getAllApiEndpoints(
            dev.speakeasyapi.javaclientsdk.models.operations.GetAllApiEndpointsRequest request) throws Exception;
    }


    public interface MethodCallGetAllForVersionApiEndpoints { 
        dev.speakeasyapi.javaclientsdk.models.operations.GetAllForVersionApiEndpointsResponse getAllForVersionApiEndpoints(
            dev.speakeasyapi.javaclientsdk.models.operations.GetAllForVersionApiEndpointsRequest request) throws Exception;
    }


    public interface MethodCallGetApiEndpoint { 
        dev.speakeasyapi.javaclientsdk.models.operations.GetApiEndpointResponse getApiEndpoint(
            dev.speakeasyapi.javaclientsdk.models.operations.GetApiEndpointRequest request) throws Exception;
    }


    public interface MethodCallUpsertApiEndpoint { 
        dev.speakeasyapi.javaclientsdk.models.operations.UpsertApiEndpointResponse upsertApiEndpoint(
            dev.speakeasyapi.javaclientsdk.models.operations.UpsertApiEndpointRequest request) throws Exception;
    }


    public interface MethodCallDeleteVersionMetadata { 
        dev.speakeasyapi.javaclientsdk.models.operations.DeleteVersionMetadataResponse deleteVersionMetadata(
            dev.speakeasyapi.javaclientsdk.models.operations.DeleteVersionMetadataRequest request) throws Exception;
    }


    public interface MethodCallGetVersionMetadata { 
        dev.speakeasyapi.javaclientsdk.models.operations.GetVersionMetadataResponse getVersionMetadata(
            dev.speakeasyapi.javaclientsdk.models.operations.GetVersionMetadataRequest request) throws Exception;
    }


    public interface MethodCallInsertVersionMetadata { 
        dev.speakeasyapi.javaclientsdk.models.operations.InsertVersionMetadataResponse insertVersionMetadata(
            dev.speakeasyapi.javaclientsdk.models.operations.InsertVersionMetadataRequest request) throws Exception;
    }


    public interface MethodCallDeleteSchema { 
        dev.speakeasyapi.javaclientsdk.models.operations.DeleteSchemaResponse deleteSchema(
            dev.speakeasyapi.javaclientsdk.models.operations.DeleteSchemaRequest request) throws Exception;
    }


    public interface MethodCallDownloadSchema { 
        dev.speakeasyapi.javaclientsdk.models.operations.DownloadSchemaResponse downloadSchema(
            dev.speakeasyapi.javaclientsdk.models.operations.DownloadSchemaRequest request) throws Exception;
    }


    public interface MethodCallDownloadSchemaRevision { 
        dev.speakeasyapi.javaclientsdk.models.operations.DownloadSchemaRevisionResponse downloadSchemaRevision(
            dev.speakeasyapi.javaclientsdk.models.operations.DownloadSchemaRevisionRequest request) throws Exception;
    }


    public interface MethodCallGetSchema { 
        dev.speakeasyapi.javaclientsdk.models.operations.GetSchemaResponse getSchema(
            dev.speakeasyapi.javaclientsdk.models.operations.GetSchemaRequest request) throws Exception;
    }


    public interface MethodCallGetSchemaDiff { 
        dev.speakeasyapi.javaclientsdk.models.operations.GetSchemaDiffResponse getSchemaDiff(
            dev.speakeasyapi.javaclientsdk.models.operations.GetSchemaDiffRequest request) throws Exception;
    }


    public interface MethodCallGetSchemaRevision { 
        dev.speakeasyapi.javaclientsdk.models.operations.GetSchemaRevisionResponse getSchemaRevision(
            dev.speakeasyapi.javaclientsdk.models.operations.GetSchemaRevisionRequest request) throws Exception;
    }


    public interface MethodCallGetSchemas { 
        dev.speakeasyapi.javaclientsdk.models.operations.GetSchemasResponse getSchemas(
            dev.speakeasyapi.javaclientsdk.models.operations.GetSchemasRequest request) throws Exception;
    }


    public interface MethodCallRegisterSchema { 
        dev.speakeasyapi.javaclientsdk.models.operations.RegisterSchemaResponse registerSchema(
            dev.speakeasyapi.javaclientsdk.models.operations.RegisterSchemaRequest request) throws Exception;
    }


    public interface MethodCallGenerateRequestPostmanCollection { 
        dev.speakeasyapi.javaclientsdk.models.operations.GenerateRequestPostmanCollectionResponse generateRequestPostmanCollection(
            dev.speakeasyapi.javaclientsdk.models.operations.GenerateRequestPostmanCollectionRequest request) throws Exception;
    }


    public interface MethodCallGetRequestFromEventLog { 
        dev.speakeasyapi.javaclientsdk.models.operations.GetRequestFromEventLogResponse getRequestFromEventLog(
            dev.speakeasyapi.javaclientsdk.models.operations.GetRequestFromEventLogRequest request) throws Exception;
    }


    public interface MethodCallQueryEventLog { 
        dev.speakeasyapi.javaclientsdk.models.operations.QueryEventLogResponse queryEventLog(
            dev.speakeasyapi.javaclientsdk.models.operations.QueryEventLogRequest request) throws Exception;
    }


    public interface MethodCallGetPluginsDirect { 
        dev.speakeasyapi.javaclientsdk.models.operations.GetPluginsResponse getPluginsDirect() throws Exception;
    }


    public interface MethodCallRunPlugin { 
        dev.speakeasyapi.javaclientsdk.models.operations.RunPluginResponse runPlugin(
            dev.speakeasyapi.javaclientsdk.models.operations.RunPluginRequest request) throws Exception;
    }


    public interface MethodCallUpsertPlugin { 
        dev.speakeasyapi.javaclientsdk.models.operations.UpsertPluginResponse upsertPlugin(
            dev.speakeasyapi.javaclientsdk.models.shared.Plugin request) throws Exception;
    }


    public interface MethodCallGetEmbedAccessToken { 
        dev.speakeasyapi.javaclientsdk.models.operations.GetEmbedAccessTokenResponse getEmbedAccessToken(
            dev.speakeasyapi.javaclientsdk.models.operations.GetEmbedAccessTokenRequest request) throws Exception;
    }


    public interface MethodCallGetValidEmbedAccessTokensDirect { 
        dev.speakeasyapi.javaclientsdk.models.operations.GetValidEmbedAccessTokensResponse getValidEmbedAccessTokensDirect() throws Exception;
    }


    public interface MethodCallRevokeEmbedAccessToken { 
        dev.speakeasyapi.javaclientsdk.models.operations.RevokeEmbedAccessTokenResponse revokeEmbedAccessToken(
            dev.speakeasyapi.javaclientsdk.models.operations.RevokeEmbedAccessTokenRequest request) throws Exception;
    }

}