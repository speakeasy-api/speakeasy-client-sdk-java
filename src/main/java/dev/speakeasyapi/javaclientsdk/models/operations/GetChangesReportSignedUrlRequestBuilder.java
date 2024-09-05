/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package dev.speakeasyapi.javaclientsdk.models.operations;

import dev.speakeasyapi.javaclientsdk.utils.Utils;

public class GetChangesReportSignedUrlRequestBuilder {

    private GetChangesReportSignedUrlRequest request;
    private final SDKMethodInterfaces.MethodCallGetChangesReportSignedUrl sdk;

    public GetChangesReportSignedUrlRequestBuilder(SDKMethodInterfaces.MethodCallGetChangesReportSignedUrl sdk) {
        this.sdk = sdk;
    }

    public GetChangesReportSignedUrlRequestBuilder request(dev.speakeasyapi.javaclientsdk.models.operations.GetChangesReportSignedUrlRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public GetChangesReportSignedUrlResponse call() throws Exception {

        return sdk.getChangesReportSignedUrl(
            request);
    }
}
