/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package io.github.speakeasy_sdks_staging.javaclientsdk.models.operations;

import io.github.speakeasy_sdks_staging.javaclientsdk.models.shared.GithubConfigureCodeSamplesRequest;
import io.github.speakeasy_sdks_staging.javaclientsdk.models.shared.GithubConfigureMintlifyRepoRequest;
import io.github.speakeasy_sdks_staging.javaclientsdk.models.shared.GithubConfigureTargetRequest;
import io.github.speakeasy_sdks_staging.javaclientsdk.models.shared.GithubStorePublishingSecretsRequest;
import io.github.speakeasy_sdks_staging.javaclientsdk.models.shared.GithubTriggerActionRequest;
import io.github.speakeasy_sdks_staging.javaclientsdk.models.shared.PreflightRequest;
import io.github.speakeasy_sdks_staging.javaclientsdk.utils.Options;
import java.util.Optional;

public class SDKMethodInterfaces {


    public interface MethodCallDeleteApi {
        io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.DeleteApiResponse deleteApi(
            DeleteApiRequest request) throws Exception;
    }


    public interface MethodCallGenerateOpenApiSpec {
        io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GenerateOpenApiSpecResponse generateOpenApiSpec(
            GenerateOpenApiSpecRequest request) throws Exception;
    }


    public interface MethodCallGeneratePostmanCollection {
        io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GeneratePostmanCollectionResponse generatePostmanCollection(
            GeneratePostmanCollectionRequest request) throws Exception;
    }


    public interface MethodCallGetAllApiVersions {
        io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GetAllApiVersionsResponse getAllApiVersions(
            GetAllApiVersionsRequest request) throws Exception;
    }


    public interface MethodCallGetApis {
        io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GetApisResponse getApis(
            GetApisRequest request) throws Exception;
    }


    public interface MethodCallUpsertApi {
        io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.UpsertApiResponse upsertApi(
            UpsertApiRequest request) throws Exception;
    }


    public interface MethodCallDeleteApiEndpoint {
        io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.DeleteApiEndpointResponse deleteApiEndpoint(
            DeleteApiEndpointRequest request) throws Exception;
    }


    public interface MethodCallFindApiEndpoint {
        io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.FindApiEndpointResponse findApiEndpoint(
            FindApiEndpointRequest request) throws Exception;
    }


    public interface MethodCallGenerateOpenApiSpecForApiEndpoint {
        io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GenerateOpenApiSpecForApiEndpointResponse generateOpenApiSpecForApiEndpoint(
            GenerateOpenApiSpecForApiEndpointRequest request) throws Exception;
    }


    public interface MethodCallGeneratePostmanCollectionForApiEndpoint {
        io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GeneratePostmanCollectionForApiEndpointResponse generatePostmanCollectionForApiEndpoint(
            GeneratePostmanCollectionForApiEndpointRequest request) throws Exception;
    }


    public interface MethodCallGetAllApiEndpoints {
        io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GetAllApiEndpointsResponse getAllApiEndpoints(
            GetAllApiEndpointsRequest request) throws Exception;
    }


    public interface MethodCallGetAllForVersionApiEndpoints {
        io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GetAllForVersionApiEndpointsResponse getAllForVersionApiEndpoints(
            GetAllForVersionApiEndpointsRequest request) throws Exception;
    }


    public interface MethodCallGetApiEndpoint {
        io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GetApiEndpointResponse getApiEndpoint(
            GetApiEndpointRequest request) throws Exception;
    }


    public interface MethodCallUpsertApiEndpoint {
        io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.UpsertApiEndpointResponse upsertApiEndpoint(
            UpsertApiEndpointRequest request) throws Exception;
    }


    public interface MethodCallDeleteVersionMetadata {
        io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.DeleteVersionMetadataResponse deleteVersionMetadata(
            DeleteVersionMetadataRequest request) throws Exception;
    }


    public interface MethodCallGetVersionMetadata {
        io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GetVersionMetadataResponse getVersionMetadata(
            GetVersionMetadataRequest request) throws Exception;
    }


    public interface MethodCallInsertVersionMetadata {
        io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.InsertVersionMetadataResponse insertVersionMetadata(
            InsertVersionMetadataRequest request) throws Exception;
    }


    public interface MethodCallDeleteSchema {
        io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.DeleteSchemaResponse deleteSchema(
            DeleteSchemaRequest request) throws Exception;
    }


    public interface MethodCallDownloadSchema {
        io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.DownloadSchemaResponse downloadSchema(
            DownloadSchemaRequest request) throws Exception;
    }


    public interface MethodCallDownloadSchemaRevision {
        io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.DownloadSchemaRevisionResponse downloadSchemaRevision(
            DownloadSchemaRevisionRequest request) throws Exception;
    }


    public interface MethodCallGetSchema {
        io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GetSchemaResponse getSchema(
            GetSchemaRequest request) throws Exception;
    }


    public interface MethodCallGetSchemaDiff {
        io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GetSchemaDiffResponse getSchemaDiff(
            GetSchemaDiffRequest request) throws Exception;
    }


    public interface MethodCallGetSchemaRevision {
        io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GetSchemaRevisionResponse getSchemaRevision(
            GetSchemaRevisionRequest request) throws Exception;
    }


    public interface MethodCallGetSchemas {
        io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GetSchemasResponse getSchemas(
            GetSchemasRequest request) throws Exception;
    }


    public interface MethodCallRegisterSchema {
        io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.RegisterSchemaResponse registerSchema(
            RegisterSchemaRequest request) throws Exception;
    }


    public interface MethodCallGetBlob {
        io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GetBlobResponse getBlob(
            GetBlobRequest request) throws Exception;
    }


    public interface MethodCallGetManifest {
        io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GetManifestResponse getManifest(
            GetManifestRequest request) throws Exception;
    }


    public interface MethodCallGetNamespaces {
        io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GetNamespacesResponse getNamespacesDirect() throws Exception;
    }


    public interface MethodCallGetOASSummary {
        io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GetOASSummaryResponse getOASSummary(
            GetOASSummaryRequest request) throws Exception;
    }


    public interface MethodCallGetRevisions {
        io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GetRevisionsResponse getRevisions(
            GetRevisionsRequest request) throws Exception;
    }


    public interface MethodCallGetTags {
        io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GetTagsResponse getTags(
            GetTagsRequest request) throws Exception;
    }


    public interface MethodCallPostTags {
        io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.PostTagsResponse postTags(
            PostTagsRequest request) throws Exception;
    }


    public interface MethodCallPreflight {
        io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.PreflightResponse preflight(
            Optional<? extends PreflightRequest> request) throws Exception;
    }


    public interface MethodCallGetAccessToken {
        io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GetAccessTokenResponse getAccessToken(
            GetAccessTokenRequest request) throws Exception;
    }


    public interface MethodCallGetUser {
        io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GetUserResponse getUserDirect() throws Exception;
    }


    public interface MethodCallGetWorkspaceAccess {
        io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GetWorkspaceAccessResponse getWorkspaceAccess(
            GetWorkspaceAccessRequest request,
            Optional<Options> options) throws Exception;
    }


    public interface MethodCallValidateApiKey {
        io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.ValidateApiKeyResponse validateApiKeyDirect() throws Exception;
    }


    public interface MethodCallGenerateRequestPostmanCollection {
        io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GenerateRequestPostmanCollectionResponse generateRequestPostmanCollection(
            GenerateRequestPostmanCollectionRequest request) throws Exception;
    }


    public interface MethodCallGetRequestFromEventLog {
        io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GetRequestFromEventLogResponse getRequestFromEventLog(
            GetRequestFromEventLogRequest request) throws Exception;
    }


    public interface MethodCallQueryEventLog {
        io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.QueryEventLogResponse queryEventLog(
            QueryEventLogRequest request) throws Exception;
    }


    public interface MethodCallCheckAccess {
        io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.CheckAccessResponse checkAccess(
            CheckAccessRequest request) throws Exception;
    }


    public interface MethodCallConfigureCodeSamples {
        io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.ConfigureCodeSamplesResponse configureCodeSamples(
            GithubConfigureCodeSamplesRequest request) throws Exception;
    }


    public interface MethodCallConfigureMintlifyRepo {
        io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.ConfigureMintlifyRepoResponse configureMintlifyRepo(
            GithubConfigureMintlifyRepoRequest request) throws Exception;
    }


    public interface MethodCallConfigureTarget {
        io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.ConfigureTargetResponse configureTarget(
            GithubConfigureTargetRequest request) throws Exception;
    }


    public interface MethodCallFetchPublishingPRs {
        io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.FetchPublishingPRsResponse fetchPublishingPRs(
            FetchPublishingPRsRequest request) throws Exception;
    }


    public interface MethodCallGetAction {
        io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GetActionResponse getAction(
            GetActionRequest request) throws Exception;
    }


    public interface MethodCallGithubCheckPublishingSecrets {
        io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GithubCheckPublishingSecretsResponse githubCheckPublishingSecrets(
            GithubCheckPublishingSecretsRequest request) throws Exception;
    }


    public interface MethodCallGithubStorePublishingSecrets {
        io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GithubStorePublishingSecretsResponse githubStorePublishingSecrets(
            GithubStorePublishingSecretsRequest request) throws Exception;
    }


    public interface MethodCallTriggerAction {
        io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.TriggerActionResponse triggerAction(
            GithubTriggerActionRequest request) throws Exception;
    }


    public interface MethodCallCreateFreeTrial {
        io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.CreateFreeTrialResponse createFreeTrialDirect() throws Exception;
    }


    public interface MethodCallGetOrganization {
        io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GetOrganizationResponse getOrganization(
            GetOrganizationRequest request) throws Exception;
    }


    public interface MethodCallGetOrganizationUsage {
        io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GetOrganizationUsageResponse getOrganizationUsageDirect() throws Exception;
    }


    public interface MethodCallGetOrganizations {
        io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GetOrganizationsResponse getOrganizationsDirect() throws Exception;
    }


    public interface MethodCallGetChangesReportSignedUrl {
        io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GetChangesReportSignedUrlResponse getChangesReportSignedUrl(
            GetChangesReportSignedUrlRequest request) throws Exception;
    }


    public interface MethodCallGetLintingReportSignedUrl {
        io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GetLintingReportSignedUrlResponse getLintingReportSignedUrl(
            GetLintingReportSignedUrlRequest request) throws Exception;
    }


    public interface MethodCallUploadReport {
        io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.UploadReportResponse uploadReport(
            UploadReportRequestBody request) throws Exception;
    }


    public interface MethodCallCreate {
        io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.CreateResponse create(
            CreateRequestBody request) throws Exception;
    }


    public interface MethodCallApplyOperationIDs {
        io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.ApplyOperationIDsResponse applyOperationIDs(
            ApplyOperationIDsRequest request) throws Exception;
    }


    public interface MethodCallSuggestOpenAPI {
        io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.SuggestOpenAPIResponse suggestOpenAPI(
            SuggestOpenAPIRequest request) throws Exception;
    }


    public interface MethodCallSuggestOpenAPIRegistry {
        io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.SuggestOpenAPIRegistryResponse suggestOpenAPIRegistry(
            SuggestOpenAPIRegistryRequest request) throws Exception;
    }


    public interface MethodCallGetEmbedAccessToken {
        io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GetEmbedAccessTokenResponse getEmbedAccessToken(
            GetEmbedAccessTokenRequest request) throws Exception;
    }


    public interface MethodCallGetValidEmbedAccessTokens {
        io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GetValidEmbedAccessTokensResponse getValidEmbedAccessTokensDirect() throws Exception;
    }


    public interface MethodCallRevokeEmbedAccessToken {
        io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.RevokeEmbedAccessTokenResponse revokeEmbedAccessToken(
            RevokeEmbedAccessTokenRequest request) throws Exception;
    }


    public interface MethodCallGetWorkspace {
        io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GetWorkspaceResponse getWorkspace(
            GetWorkspaceRequest request) throws Exception;
    }


    public interface MethodCallGetWorkspaceEventsByTarget {
        io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GetWorkspaceEventsByTargetResponse getWorkspaceEventsByTarget(
            GetWorkspaceEventsByTargetRequest request) throws Exception;
    }


    public interface MethodCallGetWorkspaceTargets {
        io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.GetWorkspaceTargetsResponse getWorkspaceTargets(
            GetWorkspaceTargetsRequest request) throws Exception;
    }


    public interface MethodCallPostWorkspaceEvents {
        io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.PostWorkspaceEventsResponse postWorkspaceEvents(
            PostWorkspaceEventsRequest request,
            Optional<Options> options) throws Exception;
    }


    public interface MethodCallSearchWorkspaceEvents {
        io.github.speakeasy_sdks_staging.javaclientsdk.models.operations.SearchWorkspaceEventsResponse searchWorkspaceEvents(
            SearchWorkspaceEventsRequest request) throws Exception;
    }


}
