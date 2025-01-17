/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package dev.speakeasyapi.javaclientsdk.models.operations;

import dev.speakeasyapi.javaclientsdk.models.shared.RemoteSource;
import dev.speakeasyapi.javaclientsdk.utils.Utils;
import java.util.Optional;

public class CreateRemoteSourceRequestBuilder {

    private Optional<? extends RemoteSource> request = Optional.empty();
    private final SDKMethodInterfaces.MethodCallCreateRemoteSource sdk;

    public CreateRemoteSourceRequestBuilder(SDKMethodInterfaces.MethodCallCreateRemoteSource sdk) {
        this.sdk = sdk;
    }
                
    public CreateRemoteSourceRequestBuilder request(RemoteSource request) {
        Utils.checkNotNull(request, "request");
        this.request = Optional.of(request);
        return this;
    }

    public CreateRemoteSourceRequestBuilder request(Optional<? extends RemoteSource> request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public CreateRemoteSourceResponse call() throws Exception {

        return sdk.createRemoteSource(
            request);
    }
}
