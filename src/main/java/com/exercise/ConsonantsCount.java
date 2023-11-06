package com.exercise;

import java.util.Arrays;

public class ConsonantsCount {
    private String word;
    private final String consonants = "[bcdfghjklmnpqrstvwxyz]";

    public ConsonantsCount(String str) {
        this.word = str;
    }

    public String getWord() {
        return this.word;
    }

    public void setWord(String word) {
        this.word = word;
    }
    
    public int getConsonantsCount() {
        int count = this.calculateConsonantsCount(this.word);
        return count;
    }

    private Integer calculateConsonantsCount(String input) {
        // converting input string to lower case 
        // because matcher checks with lower case
        String inputLowerCase = input.toLowerCase();

        String[] inputChars = inputLowerCase.split("");

        // type conversion from long to int needed because it assigned to int var
        int count = (int) Arrays.stream(inputChars)
            .filter(inputChar -> inputChar.matches(this.consonants))
            .count();

        return count;
    }
}
