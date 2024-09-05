/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package dev.speakeasyapi.javaclientsdk.models.shared;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import dev.speakeasyapi.javaclientsdk.utils.Utils;
import java.lang.Long;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

/**
 * Manifest - Returns the requested manifest file
 */

public class Manifest {

    /**
     * Annotations
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("annotations")
    private Optional<? extends Annotations> annotations;

    /**
     * Type of artifact
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("artifactType")
    private Optional<String> artifactType;

    /**
     * List of V2 image layer information
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("layers")
    private Optional<? extends List<V2Descriptor>> layers;

    /**
     * Media type usually application/vnd.docker.distribution.manifest.v2+json if this is in the accept header
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("mediaType")
    private Optional<String> mediaType;

    /**
     * Schema version
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("schemaVersion")
    private Optional<Long> schemaVersion;

    @JsonCreator
    public Manifest(
            @JsonProperty("annotations") Optional<? extends Annotations> annotations,
            @JsonProperty("artifactType") Optional<String> artifactType,
            @JsonProperty("layers") Optional<? extends List<V2Descriptor>> layers,
            @JsonProperty("mediaType") Optional<String> mediaType,
            @JsonProperty("schemaVersion") Optional<Long> schemaVersion) {
        Utils.checkNotNull(annotations, "annotations");
        Utils.checkNotNull(artifactType, "artifactType");
        Utils.checkNotNull(layers, "layers");
        Utils.checkNotNull(mediaType, "mediaType");
        Utils.checkNotNull(schemaVersion, "schemaVersion");
        this.annotations = annotations;
        this.artifactType = artifactType;
        this.layers = layers;
        this.mediaType = mediaType;
        this.schemaVersion = schemaVersion;
    }
    
    public Manifest() {
        this(Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty());
    }

    /**
     * Annotations
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Annotations> annotations() {
        return (Optional<Annotations>) annotations;
    }

    /**
     * Type of artifact
     */
    @JsonIgnore
    public Optional<String> artifactType() {
        return artifactType;
    }

    /**
     * List of V2 image layer information
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<List<V2Descriptor>> layers() {
        return (Optional<List<V2Descriptor>>) layers;
    }

    /**
     * Media type usually application/vnd.docker.distribution.manifest.v2+json if this is in the accept header
     */
    @JsonIgnore
    public Optional<String> mediaType() {
        return mediaType;
    }

    /**
     * Schema version
     */
    @JsonIgnore
    public Optional<Long> schemaVersion() {
        return schemaVersion;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Annotations
     */
    public Manifest withAnnotations(Annotations annotations) {
        Utils.checkNotNull(annotations, "annotations");
        this.annotations = Optional.ofNullable(annotations);
        return this;
    }

    /**
     * Annotations
     */
    public Manifest withAnnotations(Optional<? extends Annotations> annotations) {
        Utils.checkNotNull(annotations, "annotations");
        this.annotations = annotations;
        return this;
    }

    /**
     * Type of artifact
     */
    public Manifest withArtifactType(String artifactType) {
        Utils.checkNotNull(artifactType, "artifactType");
        this.artifactType = Optional.ofNullable(artifactType);
        return this;
    }

    /**
     * Type of artifact
     */
    public Manifest withArtifactType(Optional<String> artifactType) {
        Utils.checkNotNull(artifactType, "artifactType");
        this.artifactType = artifactType;
        return this;
    }

    /**
     * List of V2 image layer information
     */
    public Manifest withLayers(List<V2Descriptor> layers) {
        Utils.checkNotNull(layers, "layers");
        this.layers = Optional.ofNullable(layers);
        return this;
    }

    /**
     * List of V2 image layer information
     */
    public Manifest withLayers(Optional<? extends List<V2Descriptor>> layers) {
        Utils.checkNotNull(layers, "layers");
        this.layers = layers;
        return this;
    }

    /**
     * Media type usually application/vnd.docker.distribution.manifest.v2+json if this is in the accept header
     */
    public Manifest withMediaType(String mediaType) {
        Utils.checkNotNull(mediaType, "mediaType");
        this.mediaType = Optional.ofNullable(mediaType);
        return this;
    }

    /**
     * Media type usually application/vnd.docker.distribution.manifest.v2+json if this is in the accept header
     */
    public Manifest withMediaType(Optional<String> mediaType) {
        Utils.checkNotNull(mediaType, "mediaType");
        this.mediaType = mediaType;
        return this;
    }

    /**
     * Schema version
     */
    public Manifest withSchemaVersion(long schemaVersion) {
        Utils.checkNotNull(schemaVersion, "schemaVersion");
        this.schemaVersion = Optional.ofNullable(schemaVersion);
        return this;
    }

    /**
     * Schema version
     */
    public Manifest withSchemaVersion(Optional<Long> schemaVersion) {
        Utils.checkNotNull(schemaVersion, "schemaVersion");
        this.schemaVersion = schemaVersion;
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
        Manifest other = (Manifest) o;
        return 
            Objects.deepEquals(this.annotations, other.annotations) &&
            Objects.deepEquals(this.artifactType, other.artifactType) &&
            Objects.deepEquals(this.layers, other.layers) &&
            Objects.deepEquals(this.mediaType, other.mediaType) &&
            Objects.deepEquals(this.schemaVersion, other.schemaVersion);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            annotations,
            artifactType,
            layers,
            mediaType,
            schemaVersion);
    }
    
    @Override
    public String toString() {
        return Utils.toString(Manifest.class,
                "annotations", annotations,
                "artifactType", artifactType,
                "layers", layers,
                "mediaType", mediaType,
                "schemaVersion", schemaVersion);
    }
    
    public final static class Builder {
 
        private Optional<? extends Annotations> annotations = Optional.empty();
 
        private Optional<String> artifactType = Optional.empty();
 
        private Optional<? extends List<V2Descriptor>> layers = Optional.empty();
 
        private Optional<String> mediaType = Optional.empty();
 
        private Optional<Long> schemaVersion = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Annotations
         */
        public Builder annotations(Annotations annotations) {
            Utils.checkNotNull(annotations, "annotations");
            this.annotations = Optional.ofNullable(annotations);
            return this;
        }

        /**
         * Annotations
         */
        public Builder annotations(Optional<? extends Annotations> annotations) {
            Utils.checkNotNull(annotations, "annotations");
            this.annotations = annotations;
            return this;
        }

        /**
         * Type of artifact
         */
        public Builder artifactType(String artifactType) {
            Utils.checkNotNull(artifactType, "artifactType");
            this.artifactType = Optional.ofNullable(artifactType);
            return this;
        }

        /**
         * Type of artifact
         */
        public Builder artifactType(Optional<String> artifactType) {
            Utils.checkNotNull(artifactType, "artifactType");
            this.artifactType = artifactType;
            return this;
        }

        /**
         * List of V2 image layer information
         */
        public Builder layers(List<V2Descriptor> layers) {
            Utils.checkNotNull(layers, "layers");
            this.layers = Optional.ofNullable(layers);
            return this;
        }

        /**
         * List of V2 image layer information
         */
        public Builder layers(Optional<? extends List<V2Descriptor>> layers) {
            Utils.checkNotNull(layers, "layers");
            this.layers = layers;
            return this;
        }

        /**
         * Media type usually application/vnd.docker.distribution.manifest.v2+json if this is in the accept header
         */
        public Builder mediaType(String mediaType) {
            Utils.checkNotNull(mediaType, "mediaType");
            this.mediaType = Optional.ofNullable(mediaType);
            return this;
        }

        /**
         * Media type usually application/vnd.docker.distribution.manifest.v2+json if this is in the accept header
         */
        public Builder mediaType(Optional<String> mediaType) {
            Utils.checkNotNull(mediaType, "mediaType");
            this.mediaType = mediaType;
            return this;
        }

        /**
         * Schema version
         */
        public Builder schemaVersion(long schemaVersion) {
            Utils.checkNotNull(schemaVersion, "schemaVersion");
            this.schemaVersion = Optional.ofNullable(schemaVersion);
            return this;
        }

        /**
         * Schema version
         */
        public Builder schemaVersion(Optional<Long> schemaVersion) {
            Utils.checkNotNull(schemaVersion, "schemaVersion");
            this.schemaVersion = schemaVersion;
            return this;
        }
        
        public Manifest build() {
            return new Manifest(
                annotations,
                artifactType,
                layers,
                mediaType,
                schemaVersion);
        }
    }
}

