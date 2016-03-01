package uk.ac.pride.ols.web.service.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author Yasset Perez-Riverol (ypriverol@gmail.com)
 * @date 01/03/2016
 */

@JsonIgnoreProperties(ignoreUnknown = true)
public class TermQuery extends QueryResult{

    @JsonProperty("_embedded")
    TermEmbedded termEmbedded;

    public Term[] getTerms() {
        if(termEmbedded != null)
            return termEmbedded.getTerms();
        return null;
    }

    public TermEmbedded getTermEmbedded() {
        return termEmbedded;
    }

    public void setTermEmbedded(TermEmbedded termEmbedded) {
        this.termEmbedded = termEmbedded;
    }
}
