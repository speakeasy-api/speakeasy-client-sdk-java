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
import java.lang.SuppressWarnings;
import java.util.List;
import java.util.Objects;
import java.util.Optional;


public class SuggestOptsOld {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("diagnostics")
    private Optional<? extends List<Diagnostic>> diagnostics;

    @JsonProperty("suggestion_type")
    private SuggestionType suggestionType;

    @JsonCreator
    public SuggestOptsOld(
            @JsonProperty("diagnostics") Optional<? extends List<Diagnostic>> diagnostics,
            @JsonProperty("suggestion_type") SuggestionType suggestionType) {
        Utils.checkNotNull(diagnostics, "diagnostics");
        Utils.checkNotNull(suggestionType, "suggestionType");
        this.diagnostics = diagnostics;
        this.suggestionType = suggestionType;
    }
    
    public SuggestOptsOld(
            SuggestionType suggestionType) {
        this(Optional.empty(), suggestionType);
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<List<Diagnostic>> diagnostics() {
        return (Optional<List<Diagnostic>>) diagnostics;
    }

    @JsonIgnore
    public SuggestionType suggestionType() {
        return suggestionType;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public SuggestOptsOld withDiagnostics(List<Diagnostic> diagnostics) {
        Utils.checkNotNull(diagnostics, "diagnostics");
        this.diagnostics = Optional.ofNullable(diagnostics);
        return this;
    }

    public SuggestOptsOld withDiagnostics(Optional<? extends List<Diagnostic>> diagnostics) {
        Utils.checkNotNull(diagnostics, "diagnostics");
        this.diagnostics = diagnostics;
        return this;
    }

    public SuggestOptsOld withSuggestionType(SuggestionType suggestionType) {
        Utils.checkNotNull(suggestionType, "suggestionType");
        this.suggestionType = suggestionType;
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
        SuggestOptsOld other = (SuggestOptsOld) o;
        return 
            Objects.deepEquals(this.diagnostics, other.diagnostics) &&
            Objects.deepEquals(this.suggestionType, other.suggestionType);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            diagnostics,
            suggestionType);
    }
    
    @Override
    public String toString() {
        return Utils.toString(SuggestOptsOld.class,
                "diagnostics", diagnostics,
                "suggestionType", suggestionType);
    }
    
    public final static class Builder {
 
        private Optional<? extends List<Diagnostic>> diagnostics = Optional.empty();
 
        private SuggestionType suggestionType;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder diagnostics(List<Diagnostic> diagnostics) {
            Utils.checkNotNull(diagnostics, "diagnostics");
            this.diagnostics = Optional.ofNullable(diagnostics);
            return this;
        }

        public Builder diagnostics(Optional<? extends List<Diagnostic>> diagnostics) {
            Utils.checkNotNull(diagnostics, "diagnostics");
            this.diagnostics = diagnostics;
            return this;
        }

        public Builder suggestionType(SuggestionType suggestionType) {
            Utils.checkNotNull(suggestionType, "suggestionType");
            this.suggestionType = suggestionType;
            return this;
        }
        
        public SuggestOptsOld build() {
            return new SuggestOptsOld(
                diagnostics,
                suggestionType);
        }
    }
}

