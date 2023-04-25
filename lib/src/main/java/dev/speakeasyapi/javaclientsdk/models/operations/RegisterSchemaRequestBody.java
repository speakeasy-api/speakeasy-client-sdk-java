/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package dev.speakeasyapi.javaclientsdk.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import dev.speakeasyapi.javaclientsdk.utils.SpeakeasyMetadata;

/**
 * RegisterSchemaRequestBody - The schema file to upload provided as a multipart/form-data file segment.
 */
public class RegisterSchemaRequestBody {
    @SpeakeasyMetadata("multipartForm:file")
    public RegisterSchemaRequestBodyFile file;
    public RegisterSchemaRequestBody withFile(RegisterSchemaRequestBodyFile file) {
        this.file = file;
        return this;
    }
    
    public RegisterSchemaRequestBody(@JsonProperty("file") RegisterSchemaRequestBodyFile file) {
        this.file = file;
  }
}
