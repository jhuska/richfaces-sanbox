package org.richfaces.demo.common;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class TestBean {
    
    private String suggestion;
    
    public String action() {
        return "";
    }
    
    public List<String> suggest(String prefix) {
        List<String> suggestions = new ArrayList<String>();
        suggestions.add("Travel like a boss!");
        suggestions.add("Choose your destiny!");
        suggestions.add("Never say never!");
        return suggestions;
    }

    public String getSuggestion() {
        return suggestion;
    }

    public void setSuggestion(String suggestion) {
        this.suggestion = suggestion;
    }
}
