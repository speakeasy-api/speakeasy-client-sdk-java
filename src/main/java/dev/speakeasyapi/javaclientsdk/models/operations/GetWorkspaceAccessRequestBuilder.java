/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package dev.speakeasyapi.javaclientsdk.models.operations;

import dev.speakeasyapi.javaclientsdk.utils.Options;
import dev.speakeasyapi.javaclientsdk.utils.RetryConfig;
import dev.speakeasyapi.javaclientsdk.utils.Utils;
import java.util.Optional;

public class GetWorkspaceAccessRequestBuilder {

    private GetWorkspaceAccessRequest request;
    private Optional<RetryConfig> retryConfig = Optional.empty();
    private final SDKMethodInterfaces.MethodCallGetWorkspaceAccess sdk;

    public GetWorkspaceAccessRequestBuilder(SDKMethodInterfaces.MethodCallGetWorkspaceAccess sdk) {
        this.sdk = sdk;
    }

    public GetWorkspaceAccessRequestBuilder request(dev.speakeasyapi.javaclientsdk.models.operations.GetWorkspaceAccessRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }
                
    public GetWorkspaceAccessRequestBuilder retryConfig(dev.speakeasyapi.javaclientsdk.utils.RetryConfig retryConfig) {
        Utils.checkNotNull(retryConfig, "retryConfig");
        this.retryConfig = Optional.of(retryConfig);
        return this;
    }

    public GetWorkspaceAccessRequestBuilder retryConfig(java.util.Optional<dev.speakeasyapi.javaclientsdk.utils.RetryConfig> retryConfig) {
        Utils.checkNotNull(retryConfig, "retryConfig");
        this.retryConfig = retryConfig;
        return this;
    }

    public GetWorkspaceAccessResponse call() throws Exception {
        Optional<Options> options = Optional.of(Options.builder()
                                                    .retryConfig(retryConfig)
                                                    .build());
        return sdk.getWorkspaceAccess(
            request,
            options);
    }
}
