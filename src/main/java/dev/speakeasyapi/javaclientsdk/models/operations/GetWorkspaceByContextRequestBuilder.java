/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package dev.speakeasyapi.javaclientsdk.models.operations;


public class GetWorkspaceByContextRequestBuilder {

    private final SDKMethodInterfaces.MethodCallGetWorkspaceByContext sdk;

    public GetWorkspaceByContextRequestBuilder(SDKMethodInterfaces.MethodCallGetWorkspaceByContext sdk) {
        this.sdk = sdk;
    }

    public GetWorkspaceByContextResponse call() throws Exception {

        return sdk.getDirect();
    }
}
