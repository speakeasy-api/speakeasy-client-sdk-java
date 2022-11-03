package pkg.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Error {
    @JsonProperty("message")
    public String message;
    @JsonProperty("status_code")
    public int statusCode;
}
