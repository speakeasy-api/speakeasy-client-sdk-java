/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package dev.speakeasyapi.javaclientsdk.models.operations;

import dev.speakeasyapi.javaclientsdk.utils.Utils;
import java.lang.Exception;

public class GetRequestFromEventLogRequestBuilder {

    private GetRequestFromEventLogRequest request;
    private final SDKMethodInterfaces.MethodCallGetRequestFromEventLog sdk;

    public GetRequestFromEventLogRequestBuilder(SDKMethodInterfaces.MethodCallGetRequestFromEventLog sdk) {
        this.sdk = sdk;
    }

    public GetRequestFromEventLogRequestBuilder request(GetRequestFromEventLogRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public GetRequestFromEventLogResponse call() throws Exception {

        return sdk.getRequestFromEventLog(
            request);
    }
}
