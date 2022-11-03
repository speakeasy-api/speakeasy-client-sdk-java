package pkg.models.operations;

import pkg.models.shared.API;
import pkg.models.shared.Error;
public class GetApisResponse {
    public API Apis;
    public String contentType;
    public Error error;
    public int statusCode;
}
