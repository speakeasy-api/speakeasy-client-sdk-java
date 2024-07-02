/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package io.github.speakeasy_sdks_staging.javaclientsdk.models.operations;

import io.github.speakeasy_sdks_staging.javaclientsdk.utils.Options;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;


public class SDKMethodInterfaces {

    public interface MethodCallDeleteApi {
        io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.DeleteApiResponse deleteApi(
            io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.DeleteApiRequest request) throws Exception;
    }


    public interface MethodCallGenerateOpenApiSpec {
        io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GenerateOpenApiSpecResponse generateOpenApiSpec(
            io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GenerateOpenApiSpecRequest request) throws Exception;
    }


    public interface MethodCallGeneratePostmanCollection {
        io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GeneratePostmanCollectionResponse generatePostmanCollection(
            io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GeneratePostmanCollectionRequest request) throws Exception;
    }


    public interface MethodCallGetAllApiVersions {
        io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GetAllApiVersionsResponse getAllApiVersions(
            io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GetAllApiVersionsRequest request) throws Exception;
    }


    public interface MethodCallGetApis {
        io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GetApisResponse getApis(
            io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GetApisRequest request) throws Exception;
    }


    public interface MethodCallUpsertApi {
        io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.UpsertApiResponse upsertApi(
            io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.UpsertApiRequest request) throws Exception;
    }


    public interface MethodCallDeleteApiEndpoint {
        io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.DeleteApiEndpointResponse deleteApiEndpoint(
            io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.DeleteApiEndpointRequest request) throws Exception;
    }


    public interface MethodCallFindApiEndpoint {
        io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.FindApiEndpointResponse findApiEndpoint(
            io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.FindApiEndpointRequest request) throws Exception;
    }


    public interface MethodCallGenerateOpenApiSpecForApiEndpoint {
        io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GenerateOpenApiSpecForApiEndpointResponse generateOpenApiSpecForApiEndpoint(
            io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GenerateOpenApiSpecForApiEndpointRequest request) throws Exception;
    }


    public interface MethodCallGeneratePostmanCollectionForApiEndpoint {
        io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GeneratePostmanCollectionForApiEndpointResponse generatePostmanCollectionForApiEndpoint(
            io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GeneratePostmanCollectionForApiEndpointRequest request) throws Exception;
    }


    public interface MethodCallGetAllApiEndpoints {
        io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GetAllApiEndpointsResponse getAllApiEndpoints(
            io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GetAllApiEndpointsRequest request) throws Exception;
    }


    public interface MethodCallGetAllForVersionApiEndpoints {
        io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GetAllForVersionApiEndpointsResponse getAllForVersionApiEndpoints(
            io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GetAllForVersionApiEndpointsRequest request) throws Exception;
    }


    public interface MethodCallGetApiEndpoint {
        io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GetApiEndpointResponse getApiEndpoint(
            io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GetApiEndpointRequest request) throws Exception;
    }


    public interface MethodCallUpsertApiEndpoint {
        io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.UpsertApiEndpointResponse upsertApiEndpoint(
            io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.UpsertApiEndpointRequest request) throws Exception;
    }


    public interface MethodCallDeleteVersionMetadata {
        io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.DeleteVersionMetadataResponse deleteVersionMetadata(
            io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.DeleteVersionMetadataRequest request) throws Exception;
    }


    public interface MethodCallGetVersionMetadata {
        io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GetVersionMetadataResponse getVersionMetadata(
            io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GetVersionMetadataRequest request) throws Exception;
    }


    public interface MethodCallInsertVersionMetadata {
        io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.InsertVersionMetadataResponse insertVersionMetadata(
            io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.InsertVersionMetadataRequest request) throws Exception;
    }


    public interface MethodCallDeleteSchema {
        io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.DeleteSchemaResponse deleteSchema(
            io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.DeleteSchemaRequest request) throws Exception;
    }


    public interface MethodCallDownloadSchema {
        io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.DownloadSchemaResponse downloadSchema(
            io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.DownloadSchemaRequest request) throws Exception;
    }


    public interface MethodCallDownloadSchemaRevision {
        io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.DownloadSchemaRevisionResponse downloadSchemaRevision(
            io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.DownloadSchemaRevisionRequest request) throws Exception;
    }


    public interface MethodCallGetSchema {
        io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GetSchemaResponse getSchema(
            io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GetSchemaRequest request) throws Exception;
    }


    public interface MethodCallGetSchemaDiff {
        io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GetSchemaDiffResponse getSchemaDiff(
            io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GetSchemaDiffRequest request) throws Exception;
    }


    public interface MethodCallGetSchemaRevision {
        io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GetSchemaRevisionResponse getSchemaRevision(
            io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GetSchemaRevisionRequest request) throws Exception;
    }


    public interface MethodCallGetSchemas {
        io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GetSchemasResponse getSchemas(
            io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GetSchemasRequest request) throws Exception;
    }


    public interface MethodCallRegisterSchema {
        io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.RegisterSchemaResponse registerSchema(
            io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.RegisterSchemaRequest request) throws Exception;
    }


    public interface MethodCallGetBlob {
        io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GetBlobResponse getBlob(
            io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GetBlobRequest request) throws Exception;
    }


    public interface MethodCallGetManifest {
        io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GetManifestResponse getManifest(
            io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GetManifestRequest request) throws Exception;
    }


    public interface MethodCallGetNamespaces {
        io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GetNamespacesResponse getNamespacesDirect() throws Exception;
    }


    public interface MethodCallGetOASSummary {
        io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GetOASSummaryResponse getOASSummary(
            io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GetOASSummaryRequest request) throws Exception;
    }


    public interface MethodCallGetRevisions {
        io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GetRevisionsResponse getRevisions(
            io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GetRevisionsRequest request) throws Exception;
    }


    public interface MethodCallGetTags {
        io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GetTagsResponse getTags(
            io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GetTagsRequest request) throws Exception;
    }


    public interface MethodCallPostTags {
        io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.PostTagsResponse postTags(
            io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.PostTagsRequest request) throws Exception;
    }


    public interface MethodCallPreflight {
        io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.PreflightResponse preflight(
            Optional<? extends io.github.speakeasy_sdks_staging.javaclientsdk.models.shared.PreflightRequest> request) throws Exception;
    }


    public interface MethodCallGetAccessToken {
        io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GetAccessTokenResponse getAccessToken(
            io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GetAccessTokenRequest request) throws Exception;
    }


    public interface MethodCallGetUser {
        io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GetUserResponse getUserDirect() throws Exception;
    }


    public interface MethodCallGetWorkspaceAccess {
        io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GetWorkspaceAccessResponse getWorkspaceAccess(
            io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GetWorkspaceAccessRequest request,
            Optional<Options> options) throws Exception;
    }


    public interface MethodCallValidateApiKey {
        io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.ValidateApiKeyResponse validateApiKeyDirect() throws Exception;
    }


    public interface MethodCallGenerateRequestPostmanCollection {
        io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GenerateRequestPostmanCollectionResponse generateRequestPostmanCollection(
            io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GenerateRequestPostmanCollectionRequest request) throws Exception;
    }


    public interface MethodCallGetRequestFromEventLog {
        io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GetRequestFromEventLogResponse getRequestFromEventLog(
            io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GetRequestFromEventLogRequest request) throws Exception;
    }


    public interface MethodCallQueryEventLog {
        io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.QueryEventLogResponse queryEventLog(
            io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.QueryEventLogRequest request) throws Exception;
    }


    public interface MethodCallCheckAccess {
        io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.CheckAccessResponse checkAccess(
            io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.CheckAccessRequest request) throws Exception;
    }


    public interface MethodCallConfigureCodeSamples {
        io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.ConfigureCodeSamplesResponse configureCodeSamples(
            io.github.speakeasy_sdks_staging.javaclientsdk.models.shared.GithubConfigureCodeSamplesRequest request) throws Exception;
    }


    public interface MethodCallConfigureMintlifyRepo {
        io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.ConfigureMintlifyRepoResponse configureMintlifyRepo(
            io.github.speakeasy_sdks_staging.javaclientsdk.models.shared.GithubConfigureMintlifyRepoRequest request) throws Exception;
    }


    public interface MethodCallConfigureTarget {
        io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.ConfigureTargetResponse configureTarget(
            io.github.speakeasy_sdks_staging.javaclientsdk.models.shared.GithubConfigureTargetRequest request) throws Exception;
    }


    public interface MethodCallFetchPublishingPRs {
        io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.FetchPublishingPRsResponse fetchPublishingPRs(
            io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.FetchPublishingPRsRequest request) throws Exception;
    }


    public interface MethodCallGetAction {
        io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GetActionResponse getAction(
            io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GetActionRequest request) throws Exception;
    }


    public interface MethodCallGithubCheckPublishingSecrets {
        io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GithubCheckPublishingSecretsResponse githubCheckPublishingSecrets(
            io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GithubCheckPublishingSecretsRequest request) throws Exception;
    }


    public interface MethodCallGithubStorePublishingSecrets {
        io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GithubStorePublishingSecretsResponse githubStorePublishingSecrets(
            io.github.speakeasy_sdks_staging.javaclientsdk.models.shared.GithubStorePublishingSecretsRequest request) throws Exception;
    }


    public interface MethodCallTriggerAction {
        io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.TriggerActionResponse triggerAction(
            io.github.speakeasy_sdks_staging.javaclientsdk.models.shared.GithubTriggerActionRequest request) throws Exception;
    }


    public interface MethodCallCreateFreeTrial {
        io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.CreateFreeTrialResponse createFreeTrialDirect() throws Exception;
    }


    public interface MethodCallGetOrganizationUsage {
        io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GetOrganizationUsageResponse getOrganizationUsageDirect() throws Exception;
    }


    public interface MethodCallGetOrganizations {
        io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GetOrganizationsResponse getOrganizationsDirect() throws Exception;
    }


    public interface MethodCallGetChangesReportSignedUrl {
        io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GetChangesReportSignedUrlResponse getChangesReportSignedUrl(
            io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GetChangesReportSignedUrlRequest request) throws Exception;
    }


    public interface MethodCallGetLintingReportSignedUrl {
        io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GetLintingReportSignedUrlResponse getLintingReportSignedUrl(
            io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GetLintingReportSignedUrlRequest request) throws Exception;
    }


    public interface MethodCallUploadReport {
        io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.UploadReportResponse uploadReport(
            io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.UploadReportRequestBody request) throws Exception;
    }


    public interface MethodCallApplyOperationIDs {
        io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.ApplyOperationIDsResponse applyOperationIDs(
            io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.ApplyOperationIDsRequest request) throws Exception;
    }


    public interface MethodCallSuggestOperationIDs {
        io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.SuggestOperationIDsResponse suggestOperationIDs(
            io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.SuggestOperationIDsRequest request) throws Exception;
    }


    public interface MethodCallSuggestOperationIDsRegistry {
        io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.SuggestOperationIDsRegistryResponse suggestOperationIDsRegistry(
            io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.SuggestOperationIDsRegistryRequest request) throws Exception;
    }


    public interface MethodCallGetEmbedAccessToken {
        io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GetEmbedAccessTokenResponse getEmbedAccessToken(
            io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GetEmbedAccessTokenRequest request) throws Exception;
    }


    public interface MethodCallGetValidEmbedAccessTokens {
        io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GetValidEmbedAccessTokensResponse getValidEmbedAccessTokensDirect() throws Exception;
    }


    public interface MethodCallRevokeEmbedAccessToken {
        io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.RevokeEmbedAccessTokenResponse revokeEmbedAccessToken(
            io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.RevokeEmbedAccessTokenRequest request) throws Exception;
    }


    public interface MethodCallGetWorkspaceEventsByTarget {
        io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GetWorkspaceEventsByTargetResponse getWorkspaceEventsByTarget(
            io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GetWorkspaceEventsByTargetRequest request) throws Exception;
    }


    public interface MethodCallGetWorkspaceTargets {
        io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GetWorkspaceTargetsResponse getWorkspaceTargets(
            io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GetWorkspaceTargetsRequest request) throws Exception;
    }


    public interface MethodCallPostWorkspaceEvents {
        io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.PostWorkspaceEventsResponse postWorkspaceEvents(
            io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.PostWorkspaceEventsRequest request,
            Optional<Options> options) throws Exception;
    }


    public interface MethodCallSearchWorkspaceEvents {
        io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.SearchWorkspaceEventsResponse searchWorkspaceEvents(
            io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.SearchWorkspaceEventsRequest request) throws Exception;
    }

}
