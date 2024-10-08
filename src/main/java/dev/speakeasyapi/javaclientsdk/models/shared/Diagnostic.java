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
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;


public class Diagnostic {

    /**
     * Help message for how to fix the issue
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("helpMessage")
    private Optional<String> helpMessage;

    /**
     * Message describing the issue
     */
    @JsonProperty("message")
    private String message;

    /**
     * Schema path to the issue
     */
    @JsonProperty("path")
    private List<String> path;

    /**
     * Issue type
     */
    @JsonProperty("type")
    private String type;

    @JsonCreator
    public Diagnostic(
            @JsonProperty("helpMessage") Optional<String> helpMessage,
            @JsonProperty("message") String message,
            @JsonProperty("path") List<String> path,
            @JsonProperty("type") String type) {
        Utils.checkNotNull(helpMessage, "helpMessage");
        Utils.checkNotNull(message, "message");
        Utils.checkNotNull(path, "path");
        Utils.checkNotNull(type, "type");
        this.helpMessage = helpMessage;
        this.message = message;
        this.path = path;
        this.type = type;
    }
    
    public Diagnostic(
            String message,
            List<String> path,
            String type) {
        this(Optional.empty(), message, path, type);
    }

    /**
     * Help message for how to fix the issue
     */
    @JsonIgnore
    public Optional<String> helpMessage() {
        return helpMessage;
    }

    /**
     * Message describing the issue
     */
    @JsonIgnore
    public String message() {
        return message;
    }

    /**
     * Schema path to the issue
     */
    @JsonIgnore
    public List<String> path() {
        return path;
    }

    /**
     * Issue type
     */
    @JsonIgnore
    public String type() {
        return type;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Help message for how to fix the issue
     */
    public Diagnostic withHelpMessage(String helpMessage) {
        Utils.checkNotNull(helpMessage, "helpMessage");
        this.helpMessage = Optional.ofNullable(helpMessage);
        return this;
    }

    /**
     * Help message for how to fix the issue
     */
    public Diagnostic withHelpMessage(Optional<String> helpMessage) {
        Utils.checkNotNull(helpMessage, "helpMessage");
        this.helpMessage = helpMessage;
        return this;
    }

    /**
     * Message describing the issue
     */
    public Diagnostic withMessage(String message) {
        Utils.checkNotNull(message, "message");
        this.message = message;
        return this;
    }

    /**
     * Schema path to the issue
     */
    public Diagnostic withPath(List<String> path) {
        Utils.checkNotNull(path, "path");
        this.path = path;
        return this;
    }

    /**
     * Issue type
     */
    public Diagnostic withType(String type) {
        Utils.checkNotNull(type, "type");
        this.type = type;
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
        Diagnostic other = (Diagnostic) o;
        return 
            Objects.deepEquals(this.helpMessage, other.helpMessage) &&
            Objects.deepEquals(this.message, other.message) &&
            Objects.deepEquals(this.path, other.path) &&
            Objects.deepEquals(this.type, other.type);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            helpMessage,
            message,
            path,
            type);
    }
    
    @Override
    public String toString() {
        return Utils.toString(Diagnostic.class,
                "helpMessage", helpMessage,
                "message", message,
                "path", path,
                "type", type);
    }
    
    public final static class Builder {
 
        private Optional<String> helpMessage = Optional.empty();
 
        private String message;
 
        private List<String> path;
 
        private String type;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Help message for how to fix the issue
         */
        public Builder helpMessage(String helpMessage) {
            Utils.checkNotNull(helpMessage, "helpMessage");
            this.helpMessage = Optional.ofNullable(helpMessage);
            return this;
        }

        /**
         * Help message for how to fix the issue
         */
        public Builder helpMessage(Optional<String> helpMessage) {
            Utils.checkNotNull(helpMessage, "helpMessage");
            this.helpMessage = helpMessage;
            return this;
        }

        /**
         * Message describing the issue
         */
        public Builder message(String message) {
            Utils.checkNotNull(message, "message");
            this.message = message;
            return this;
        }

        /**
         * Schema path to the issue
         */
        public Builder path(List<String> path) {
            Utils.checkNotNull(path, "path");
            this.path = path;
            return this;
        }

        /**
         * Issue type
         */
        public Builder type(String type) {
            Utils.checkNotNull(type, "type");
            this.type = type;
            return this;
        }
        
        public Diagnostic build() {
            return new Diagnostic(
                helpMessage,
                message,
                path,
                type);
        }
    }
}

