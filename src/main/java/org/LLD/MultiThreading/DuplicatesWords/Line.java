package org.LLD.MultiThreading.DuplicatesWords;

import java.util.concurrent.Callable;

public class Line implements Callable<Line> {

    private String sentence;

    private int lineNo;

    public Line(String sentence, int lineNo) {
        this.sentence = sentence;
        this.lineNo = lineNo;
    }

    public int getLineNo(){
        return lineNo;
    }

    public String getSentence(){
        return sentence;
    }

    @Override
    public Line call() {

        this.sentence = removeDuplicateFromSentence(sentence);
        return this;
    }


    private String removeDuplicateFromSentence(String sentence) {
        if(sentence != null){
            sentence = sentence.toLowerCase().trim();
            StringBuilder nonDuplicateSentence = new StringBuilder();

            for (String word : sentence.split(" ")) {
                if (!isWordDuplicate(word)) {
                    nonDuplicateSentence.append(word);
                    nonDuplicateSentence.append(" ");
                }
            }
            return nonDuplicateSentence.toString();
        }else{
            return "";
        }

    }

    private boolean isWordDuplicate(String word) {

        int[] charFreq = new int[26];

        for (char ch : word.toCharArray()) {
            int charAscii = ch - 'a';
            if (charFreq[charAscii] > 0) {
                return true;
            }
            charFreq[charAscii]++;
        }

        return false;
    }


}
