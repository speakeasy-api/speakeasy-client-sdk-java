/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package dev.speakeasyapi.javaclientsdk.models.operations;

import dev.speakeasyapi.javaclientsdk.utils.Utils;

public class GetWorkspaceTeamRequestBuilder {

    private GetWorkspaceTeamRequest request;
    private final SDKMethodInterfaces.MethodCallGetWorkspaceTeam sdk;

    public GetWorkspaceTeamRequestBuilder(SDKMethodInterfaces.MethodCallGetWorkspaceTeam sdk) {
        this.sdk = sdk;
    }

    public GetWorkspaceTeamRequestBuilder request(GetWorkspaceTeamRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public GetWorkspaceTeamResponse call() throws Exception {

        return sdk.getTeam(
            request);
    }
}