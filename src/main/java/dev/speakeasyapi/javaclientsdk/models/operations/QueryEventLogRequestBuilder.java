/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package dev.speakeasyapi.javaclientsdk.models.operations;

import dev.speakeasyapi.javaclientsdk.utils.Utils;

public class QueryEventLogRequestBuilder {

    private QueryEventLogRequest request;
    private final SDKMethodInterfaces.MethodCallQueryEventLog sdk;

    public QueryEventLogRequestBuilder(SDKMethodInterfaces.MethodCallQueryEventLog sdk) {
        this.sdk = sdk;
    }

    public QueryEventLogRequestBuilder request(dev.speakeasyapi.javaclientsdk.models.operations.QueryEventLogRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public QueryEventLogResponse call() throws Exception {

        return sdk.queryEventLog(
            request);
    }
}