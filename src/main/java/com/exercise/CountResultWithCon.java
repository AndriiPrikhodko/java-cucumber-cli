package com.exercise;

import java.util.List;
import java.util.stream.Collectors;

public class CountResultWithCon {
    private List<CountResult> results;

    public CountResultWithCon(List<CountResult> result) {
        this.results = result;
    }

    public List<CountResult> getResults() {
        return this.results;
    }

    public void setResults(List<CountResult> results) {
        this.results = results;
    }
    
    private String removeBracket(String str) {
        int strLen = str.length();

        // removing last curly bracket
        return str.substring(0, strLen-1);
    }

    @Override
    public String toString() {
        List<String> resultsWithConsonants = this.results.stream().map(result -> {
            ConsonantsCount consonantsCountObj = new ConsonantsCount(result.getWord());
            String strResult = this.removeBracket(result.toString());
            strResult += ", consonantsCount=" + 
                consonantsCountObj.getConsonantsCount() + 
                "}";
            return strResult;
        }).collect(Collectors.toList());
        String output = resultsWithConsonants.toString();
        return output;
    }
}
