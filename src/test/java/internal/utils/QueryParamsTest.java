package internal.utils;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pkg.models.operations.GetApiQueryParams;
import pkg.models.operations.GetApisOp;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static internal.utils.QueryParams.populateQueryParams;
import static org.junit.jupiter.api.Assertions.assertEquals;

class QueryParamsTest {

    @Test
    @DisplayName("populateQueryParams should parse the query params from the queryParams object")
    void populateQueryParamsShouldParseTheQueryParamsFromTheQueryParamsObject() throws IllegalAccessException {
        GetApiQueryParams getApiQueryParams = new GetApiQueryParams(
            Map.of(
                "test-label-key",
                List.of("test-label-value", "value2")
            ), new GetApisOp(true)
        );
        assertEquals("metadata%5Btest-label-key%5D=test-label-value&metadata%5Btest-label-key%5D=value2&op%5Band%5D=true", populateQueryParams(getApiQueryParams, new HashMap<>()));
    }
}