/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package dev.speakeasyapi.javaclientsdk.models.operations;

import dev.speakeasyapi.javaclientsdk.utils.Utils;

public class GetWorkspaceTargetsRequestBuilder {

    private GetWorkspaceTargetsRequest request;
    private final SDKMethodInterfaces.MethodCallGetWorkspaceTargets sdk;

    public GetWorkspaceTargetsRequestBuilder(SDKMethodInterfaces.MethodCallGetWorkspaceTargets sdk) {
        this.sdk = sdk;
    }

    public GetWorkspaceTargetsRequestBuilder request(GetWorkspaceTargetsRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public GetWorkspaceTargetsResponse call() throws Exception {

        return sdk.getTargets(
            request);
    }
}
