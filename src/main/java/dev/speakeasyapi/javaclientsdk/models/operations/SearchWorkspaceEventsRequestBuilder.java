/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package dev.speakeasyapi.javaclientsdk.models.operations;

import dev.speakeasyapi.javaclientsdk.utils.Utils;

public class SearchWorkspaceEventsRequestBuilder {

    private SearchWorkspaceEventsRequest request;
    private final SDKMethodInterfaces.MethodCallSearchWorkspaceEvents sdk;

    public SearchWorkspaceEventsRequestBuilder(SDKMethodInterfaces.MethodCallSearchWorkspaceEvents sdk) {
        this.sdk = sdk;
    }

    public SearchWorkspaceEventsRequestBuilder request(SearchWorkspaceEventsRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public SearchWorkspaceEventsResponse call() throws Exception {

        return sdk.search(
            request);
    }
}
