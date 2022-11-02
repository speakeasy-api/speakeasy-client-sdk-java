package internal.utils;

import java.net.http.HttpClient;
import java.util.Map;

public class SecurityClient {
    private HttpClient client;
    private Map<String,String> headers;
    private Map<String,String> queryParams;

    public SecurityClient(HttpClient client, Map<String, String> headers, Map<String, String> queryParams) {
        this.client = client;
        this.headers = headers;
        this.queryParams = queryParams;
    }

    public HttpClient getClient() {
        return client;
    }

    public Map<String, String> getHeaders() {
        return headers;
    }

    public Map<String, String> getQueryParams() {
        return queryParams;
    }
}
