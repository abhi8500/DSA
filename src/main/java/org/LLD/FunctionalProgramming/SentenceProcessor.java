package org.LLD.FunctionalProgramming;

import java.util.Arrays;
import java.util.List;

public class SentenceProcessor {

    public static int processSentences(List<String> sentences) {
        //code here
        double result = sentences.stream().filter(sentence -> sentence.contains("Java")).mapToInt(String::length)
                .average().orElse(0);
        return (int)result;
    }

    public static void main(String[] args) {
        List<String> sentences = Arrays.asList(
                "Java is a programming language.",
                "Python is also a good language.",
                "Java stream processing is powerful.",
                "C++ is not as popular as Java."
        );

        int averageLength = SentenceProcessor.processSentences(sentences);
        System.out.println(averageLength);

        sentences = Arrays.asList(
                "Python is a programming language.",
                "JS is used for web development.",
                "Ruby is known for its simplicity.",
                "java is good"
        );

        averageLength = SentenceProcessor.processSentences(sentences);
        System.out.println(averageLength);
    }
}
