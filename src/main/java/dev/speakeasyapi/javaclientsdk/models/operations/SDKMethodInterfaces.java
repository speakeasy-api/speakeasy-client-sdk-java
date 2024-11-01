/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package dev.speakeasyapi.javaclientsdk.models.operations;

import dev.speakeasyapi.javaclientsdk.models.shared.GithubConfigureCodeSamplesRequest;
import dev.speakeasyapi.javaclientsdk.models.shared.GithubConfigureMintlifyRepoRequest;
import dev.speakeasyapi.javaclientsdk.models.shared.GithubConfigureTargetRequest;
import dev.speakeasyapi.javaclientsdk.models.shared.GithubStorePublishingSecretsRequest;
import dev.speakeasyapi.javaclientsdk.models.shared.GithubTriggerActionRequest;
import dev.speakeasyapi.javaclientsdk.models.shared.Organization;
import dev.speakeasyapi.javaclientsdk.models.shared.PreflightRequest;
import dev.speakeasyapi.javaclientsdk.models.shared.RemoteSource;
import dev.speakeasyapi.javaclientsdk.models.shared.SuggestItemsRequestBody;
import dev.speakeasyapi.javaclientsdk.models.shared.Workspace;
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


    public interface MethodCallCreateRemoteSource {
        CreateRemoteSourceResponse createRemoteSource(
            Optional<? extends RemoteSource> request) throws Exception;
    }


    public interface MethodCallGetBlob {
        GetBlobResponse getBlob(
            GetBlobRequest request) throws Exception;
    }


    public interface MethodCallGetManifest {
        GetManifestResponse getManifest(
            GetManifestRequest request) throws Exception;
    }


    public interface MethodCallGetNamespaces {
        GetNamespacesResponse getNamespacesDirect() throws Exception;
    }


    public interface MethodCallGetRevisions {
        GetRevisionsResponse getRevisions(
            GetRevisionsRequest request) throws Exception;
    }


    public interface MethodCallGetTags {
        GetTagsResponse getTags(
            GetTagsRequest request) throws Exception;
    }


    public interface MethodCallListRemoteSources {
        ListRemoteSourcesResponse listRemoteSources(
            ListRemoteSourcesRequest request) throws Exception;
    }


    public interface MethodCallPostTags {
        PostTagsResponse postTags(
            PostTagsRequest request) throws Exception;
    }


    public interface MethodCallPreflight {
        PreflightResponse preflight(
            Optional<? extends PreflightRequest> request) throws Exception;
    }


    public interface MethodCallGetWorkspaceAccess {
        GetWorkspaceAccessResponse getAccess(
            GetWorkspaceAccessRequest request,
            Optional<Options> options) throws Exception;
    }


    public interface MethodCallGetAccessToken {
        GetAccessTokenResponse getAccessToken(
            GetAccessTokenRequest request) throws Exception;
    }


    public interface MethodCallGetUser {
        GetUserResponse getUserDirect() throws Exception;
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


    public interface MethodCallCheckGithubAccess {
        CheckGithubAccessResponse checkAccess(
            CheckGithubAccessRequest request) throws Exception;
    }


    public interface MethodCallGithubCheckPublishingPRs {
        GithubCheckPublishingPRsResponse checkPublishingPRs(
            GithubCheckPublishingPRsRequest request) throws Exception;
    }


    public interface MethodCallGithubCheckPublishingSecrets {
        GithubCheckPublishingSecretsResponse checkPublishingSecrets(
            GithubCheckPublishingSecretsRequest request) throws Exception;
    }


    public interface MethodCallGithubConfigureCodeSamples {
        GithubConfigureCodeSamplesResponse configureCodeSamples(
            GithubConfigureCodeSamplesRequest request) throws Exception;
    }


    public interface MethodCallGithubConfigureMintlifyRepo {
        GithubConfigureMintlifyRepoResponse configureMintlifyRepo(
            GithubConfigureMintlifyRepoRequest request) throws Exception;
    }


    public interface MethodCallGithubConfigureTarget {
        GithubConfigureTargetResponse configureTarget(
            GithubConfigureTargetRequest request) throws Exception;
    }


    public interface MethodCallGetGitHubAction {
        GetGitHubActionResponse getAction(
            GetGitHubActionRequest request) throws Exception;
    }


    public interface MethodCallGithubStorePublishingSecrets {
        GithubStorePublishingSecretsResponse storePublishingSecrets(
            GithubStorePublishingSecretsRequest request) throws Exception;
    }


    public interface MethodCallGithubTriggerAction {
        GithubTriggerActionResponse triggerAction(
            GithubTriggerActionRequest request) throws Exception;
    }


    public interface MethodCallCreateOrganization {
        CreateOrganizationResponse create(
            Organization request) throws Exception;
    }


    public interface MethodCallCreateFreeTrial {
        CreateFreeTrialResponse createFreeTrialDirect() throws Exception;
    }


    public interface MethodCallGetOrganization {
        GetOrganizationResponse get(
            GetOrganizationRequest request) throws Exception;
    }


    public interface MethodCallGetOrganizations {
        GetOrganizationsResponse getAllDirect() throws Exception;
    }


    public interface MethodCallGetOrganizationUsage {
        GetOrganizationUsageResponse getUsageDirect() throws Exception;
    }


    public interface MethodCallGetChangesReportSignedUrl {
        GetChangesReportSignedUrlResponse getChangesReportSignedUrl(
            GetChangesReportSignedUrlRequest request) throws Exception;
    }


    public interface MethodCallGetLintingReportSignedUrl {
        GetLintingReportSignedUrlResponse getLintingReportSignedUrl(
            GetLintingReportSignedUrlRequest request) throws Exception;
    }


    public interface MethodCallUploadReport {
        UploadReportResponse uploadReport(
            UploadReportRequestBody request) throws Exception;
    }


    public interface MethodCallCreate {
        CreateResponse create(
            CreateRequestBody request) throws Exception;
    }


    public interface MethodCallSuggest {
        SuggestResponse suggest(
            SuggestRequest request) throws Exception;
    }


    public interface MethodCallSuggestItems {
        SuggestItemsResponse suggestItems(
            SuggestItemsRequestBody request) throws Exception;
    }


    public interface MethodCallSuggestOpenAPI {
        SuggestOpenAPIResponse suggestOpenAPI(
            SuggestOpenAPIRequest request) throws Exception;
    }


    public interface MethodCallSuggestOpenAPIRegistry {
        SuggestOpenAPIRegistryResponse suggestOpenAPIRegistry(
            SuggestOpenAPIRegistryRequest request) throws Exception;
    }


    public interface MethodCallCreateWorkspace {
        CreateWorkspaceResponse create(
            Workspace request) throws Exception;
    }


    public interface MethodCallCreateWorkspaceToken {
        CreateWorkspaceTokenResponse createToken(
            CreateWorkspaceTokenRequest request) throws Exception;
    }


    public interface MethodCallDeleteWorkspaceToken {
        DeleteWorkspaceTokenResponse deleteToken(
            DeleteWorkspaceTokenRequest request) throws Exception;
    }


    public interface MethodCallGetWorkspaceByContext {
        GetWorkspaceByContextResponse getDirect() throws Exception;
    }


    public interface MethodCallGetWorkspaces {
        GetWorkspacesResponse getAllDirect() throws Exception;
    }


    public interface MethodCallGetWorkspace {
        GetWorkspaceResponse getByID(
            GetWorkspaceRequest request) throws Exception;
    }


    public interface MethodCallGetWorkspaceFeatureFlags {
        GetWorkspaceFeatureFlagsResponse getFeatureFlags(
            GetWorkspaceFeatureFlagsRequest request) throws Exception;
    }


    public interface MethodCallGetWorkspaceSettings {
        GetWorkspaceSettingsResponse getSettings(
            GetWorkspaceSettingsRequest request) throws Exception;
    }


    public interface MethodCallGetWorkspaceTeam {
        GetWorkspaceTeamResponse getTeam(
            GetWorkspaceTeamRequest request) throws Exception;
    }


    public interface MethodCallGetWorkspaceTokens {
        GetWorkspaceTokensResponse getTokens(
            GetWorkspaceTokensRequest request) throws Exception;
    }


    public interface MethodCallGrantUserAccessToWorkspace {
        GrantUserAccessToWorkspaceResponse grantAccess(
            GrantUserAccessToWorkspaceRequest request) throws Exception;
    }


    public interface MethodCallRevokeUserAccessToWorkspace {
        RevokeUserAccessToWorkspaceResponse revokeAccess(
            RevokeUserAccessToWorkspaceRequest request) throws Exception;
    }


    public interface MethodCallUpdateWorkspaceDetails {
        UpdateWorkspaceDetailsResponse update(
            UpdateWorkspaceDetailsRequest request) throws Exception;
    }


    public interface MethodCallUpdateWorkspaceSettings {
        UpdateWorkspaceSettingsResponse updateSettings(
            UpdateWorkspaceSettingsRequest request) throws Exception;
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


    public interface MethodCallGetWorkspaceEventsByTarget {
        GetWorkspaceEventsByTargetResponse getEventsByTarget(
            GetWorkspaceEventsByTargetRequest request) throws Exception;
    }


    public interface MethodCallGetWorkspaceTargets {
        GetWorkspaceTargetsResponse getTargets(
            GetWorkspaceTargetsRequest request) throws Exception;
    }


    public interface MethodCallGetWorkspaceTargetsDeprecated {
        GetWorkspaceTargetsDeprecatedResponse getTargetsDeprecated(
            GetWorkspaceTargetsDeprecatedRequest request) throws Exception;
    }


    public interface MethodCallPostWorkspaceEvents {
        PostWorkspaceEventsResponse post(
            PostWorkspaceEventsRequest request,
            Optional<Options> options) throws Exception;
    }


    public interface MethodCallSearchWorkspaceEvents {
        SearchWorkspaceEventsResponse search(
            SearchWorkspaceEventsRequest request) throws Exception;
    }


    public interface MethodCallCreateSubscription {
        CreateSubscriptionResponse createSubscription(
            CreateSubscriptionRequest request) throws Exception;
    }


    public interface MethodCallListRegistrySubscriptions {
        ListRegistrySubscriptionsResponse listRegistrySubscriptions(
            ListRegistrySubscriptionsRequest request) throws Exception;
    }


}
