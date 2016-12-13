package com.example.user.wordcount;

public class WordCount {

    private String words;
    private String[] wordCount;

    public WordCount() {
        this.words = new String ();
    }

    public int splitWords(String words) {
        String[] wordCount = words.split(" ");
        return wordCount.length;
    }

}
