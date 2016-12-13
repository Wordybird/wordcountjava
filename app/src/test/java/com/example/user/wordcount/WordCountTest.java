package com.example.user.wordcount;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class WordCountTest {

    WordCount wordCount;
    WordCount words;

    @Before
    public void before() {
        wordCount = new WordCount();
        words = new WordCount();
    }

    @Test
    public void testSplitWords() {
        words.splitWords("This is the end.");
        assertEquals(4, wordCount.length());
    }



}
