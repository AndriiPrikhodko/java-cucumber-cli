package com.exercise;

public class Main {

    public static void main(String[] args) {
        VowelCounter counter = new VowelCounter();
        var result = counter.getVowelListWithCount(args);
        CountResultWithCon CountResultWithCon = new CountResultWithCon(result);
        System.out.println(CountResultWithCon);
    }
}
