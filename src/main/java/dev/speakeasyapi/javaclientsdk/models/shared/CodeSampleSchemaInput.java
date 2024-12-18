/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package dev.speakeasyapi.javaclientsdk.models.shared;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import dev.speakeasyapi.javaclientsdk.utils.SpeakeasyMetadata;
import dev.speakeasyapi.javaclientsdk.utils.Utils;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;


public class CodeSampleSchemaInput {

    /**
     * A list of languages to generate code samples for
     */
    @SpeakeasyMetadata("multipartForm:name=languages")
    private List<String> languages;

    /**
     * The name of the package
     */
    @SpeakeasyMetadata("multipartForm:name=package_name")
    private Optional<String> packageName;

    /**
     * The OpenAPI file to be uploaded
     */
    @SpeakeasyMetadata("multipartForm:file,name=schema_file")
    private SchemaFile schemaFile;

    /**
     * The SDK class name
     */
    @SpeakeasyMetadata("multipartForm:name=sdk_class_name")
    private Optional<String> sdkClassName;

    @JsonCreator
    public CodeSampleSchemaInput(
            List<String> languages,
            Optional<String> packageName,
            SchemaFile schemaFile,
            Optional<String> sdkClassName) {
        Utils.checkNotNull(languages, "languages");
        Utils.checkNotNull(packageName, "packageName");
        Utils.checkNotNull(schemaFile, "schemaFile");
        Utils.checkNotNull(sdkClassName, "sdkClassName");
        this.languages = languages;
        this.packageName = packageName;
        this.schemaFile = schemaFile;
        this.sdkClassName = sdkClassName;
    }
    
    public CodeSampleSchemaInput(
            List<String> languages,
            SchemaFile schemaFile) {
        this(languages, Optional.empty(), schemaFile, Optional.empty());
    }

    /**
     * A list of languages to generate code samples for
     */
    @JsonIgnore
    public List<String> languages() {
        return languages;
    }

    /**
     * The name of the package
     */
    @JsonIgnore
    public Optional<String> packageName() {
        return packageName;
    }

    /**
     * The OpenAPI file to be uploaded
     */
    @JsonIgnore
    public SchemaFile schemaFile() {
        return schemaFile;
    }

    /**
     * The SDK class name
     */
    @JsonIgnore
    public Optional<String> sdkClassName() {
        return sdkClassName;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * A list of languages to generate code samples for
     */
    public CodeSampleSchemaInput withLanguages(List<String> languages) {
        Utils.checkNotNull(languages, "languages");
        this.languages = languages;
        return this;
    }

    /**
     * The name of the package
     */
    public CodeSampleSchemaInput withPackageName(String packageName) {
        Utils.checkNotNull(packageName, "packageName");
        this.packageName = Optional.ofNullable(packageName);
        return this;
    }

    /**
     * The name of the package
     */
    public CodeSampleSchemaInput withPackageName(Optional<String> packageName) {
        Utils.checkNotNull(packageName, "packageName");
        this.packageName = packageName;
        return this;
    }

    /**
     * The OpenAPI file to be uploaded
     */
    public CodeSampleSchemaInput withSchemaFile(SchemaFile schemaFile) {
        Utils.checkNotNull(schemaFile, "schemaFile");
        this.schemaFile = schemaFile;
        return this;
    }

    /**
     * The SDK class name
     */
    public CodeSampleSchemaInput withSDKClassName(String sdkClassName) {
        Utils.checkNotNull(sdkClassName, "sdkClassName");
        this.sdkClassName = Optional.ofNullable(sdkClassName);
        return this;
    }

    /**
     * The SDK class name
     */
    public CodeSampleSchemaInput withSDKClassName(Optional<String> sdkClassName) {
        Utils.checkNotNull(sdkClassName, "sdkClassName");
        this.sdkClassName = sdkClassName;
        return this;
    }
    
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CodeSampleSchemaInput other = (CodeSampleSchemaInput) o;
        return 
            Objects.deepEquals(this.languages, other.languages) &&
            Objects.deepEquals(this.packageName, other.packageName) &&
            Objects.deepEquals(this.schemaFile, other.schemaFile) &&
            Objects.deepEquals(this.sdkClassName, other.sdkClassName);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            languages,
            packageName,
            schemaFile,
            sdkClassName);
    }
    
    @Override
    public String toString() {
        return Utils.toString(CodeSampleSchemaInput.class,
                "languages", languages,
                "packageName", packageName,
                "schemaFile", schemaFile,
                "sdkClassName", sdkClassName);
    }
    
    public final static class Builder {
 
        private List<String> languages;
 
        private Optional<String> packageName = Optional.empty();
 
        private SchemaFile schemaFile;
 
        private Optional<String> sdkClassName = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * A list of languages to generate code samples for
         */
        public Builder languages(List<String> languages) {
            Utils.checkNotNull(languages, "languages");
            this.languages = languages;
            return this;
        }

        /**
         * The name of the package
         */
        public Builder packageName(String packageName) {
            Utils.checkNotNull(packageName, "packageName");
            this.packageName = Optional.ofNullable(packageName);
            return this;
        }

        /**
         * The name of the package
         */
        public Builder packageName(Optional<String> packageName) {
            Utils.checkNotNull(packageName, "packageName");
            this.packageName = packageName;
            return this;
        }

        /**
         * The OpenAPI file to be uploaded
         */
        public Builder schemaFile(SchemaFile schemaFile) {
            Utils.checkNotNull(schemaFile, "schemaFile");
            this.schemaFile = schemaFile;
            return this;
        }

        /**
         * The SDK class name
         */
        public Builder sdkClassName(String sdkClassName) {
            Utils.checkNotNull(sdkClassName, "sdkClassName");
            this.sdkClassName = Optional.ofNullable(sdkClassName);
            return this;
        }

        /**
         * The SDK class name
         */
        public Builder sdkClassName(Optional<String> sdkClassName) {
            Utils.checkNotNull(sdkClassName, "sdkClassName");
            this.sdkClassName = sdkClassName;
            return this;
        }
        
        public CodeSampleSchemaInput build() {
            return new CodeSampleSchemaInput(
                languages,
                packageName,
                schemaFile,
                sdkClassName);
        }
    }
}

