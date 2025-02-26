package org.LLD.FunctionalProgramming;

import java.util.Arrays;
import java.util.List;

public class WordCounter {

    public static long countWords(List<String> sentences) {
        long words = sentences.stream().filter(sentence -> !sentence.contains("Java"))
               .flatMap(sentence -> Arrays.stream(sentence.split(" ")))
                .distinct()
                .count();
        return words;
    }

    public static void main(String[] args) {
        List<String> sentences = Arrays.asList(
                "Python is a programming language.",
                "JavaScript is used for web development.",
                "Ruby is known for its simplicity."
        );

        long wordCount = WordCounter.countWords(sentences);
        System.out.println(wordCount);
    }
}
