<!-- Start SDK Example Usage [usage] -->
```java
package hello.world;

import dev.speakeasyapi.javaclientsdk.RyanTest;
import dev.speakeasyapi.javaclientsdk.models.errors.Error;
import dev.speakeasyapi.javaclientsdk.models.operations.GenerateCodeSamplePreviewResponse;
import dev.speakeasyapi.javaclientsdk.models.shared.CodeSampleSchemaInput;
import dev.speakeasyapi.javaclientsdk.models.shared.SchemaFile;
import dev.speakeasyapi.javaclientsdk.models.shared.Security;
import java.lang.Exception;
import java.nio.charset.StandardCharsets;
import java.util.List;

public class Application {

    public static void main(String[] args) throws Error, Exception {

        RyanTest sdk = RyanTest.builder()
                .security(Security.builder()
                    .apiKey("<YOUR_API_KEY_HERE>")
                    .build())
            .build();

        CodeSampleSchemaInput req = CodeSampleSchemaInput.builder()
                .languages(List.of(
                    "<value>",
                    "<value>"))
                .schemaFile(SchemaFile.builder()
                    .content("0xc3dD8BfBef".getBytes(StandardCharsets.UTF_8))
                    .fileName("example.file")
                    .build())
                .build();

        GenerateCodeSamplePreviewResponse res = sdk.generateCodeSamplePreview()
                .request(req)
                .call();

        if (res.twoHundredApplicationJsonResponseStream().isPresent()) {
            // handle response
        }
    }
}
```
<!-- End SDK Example Usage [usage] -->