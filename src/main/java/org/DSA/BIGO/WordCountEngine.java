package org.DSA.BIGO;

import java.util.*;

class wordCountEngine {

    static String[][] wordCount(String document) {

        // your code goes here

        String proccessedDoc = document.replaceAll("[^a-zA-Z ]","").toLowerCase();
        Integer largestCount = 0;

        String[] words = proccessedDoc.split(" ");
        Map<String, Integer> wordCountMap = new LinkedHashMap<>();
        for(String word :  words) {
            if(!word.isEmpty()){
                wordCountMap.put(word,wordCountMap.getOrDefault(word,0)+1);
                if(wordCountMap.get(word).compareTo(largestCount) > 0){
                    largestCount = wordCountMap.get(word);
                }
            }
        }

        List<List<String>> counterList = new ArrayList<>(largestCount+1);
        for(int i =0; i <largestCount+1;i++){
            counterList.add(new ArrayList<>(0));
        }

        for(String word : wordCountMap.keySet() ){
            Integer counter = wordCountMap.get(word);
            List<String> wordCounterList = counterList.get(counter);

            wordCounterList.add(word);
            counterList.set(counter,wordCounterList);
        }





        String[][] result = new String[wordCountMap.size()][2];
        int index = 0;


        for(int i = counterList.size()-1;i >= 0 ; i--){

            List<String>  wordCounterList = counterList.get(i);
            if (wordCounterList.isEmpty()){
                continue;
            }
            for (String s : wordCounterList) {
                String[] wordList = new String[2];
                wordList[0] = s;
                wordList[1] = String.valueOf(i);
                result[index] = wordList;
                index++;
            }

        }

        return result;
    }

    public static void main(String[] args) {
        String document = "Practice makes perfect, you'll get perfecT by practice. just practice! just just just!";
      System.out.println(Arrays.deepToString(wordCountEngine.wordCount(document)));
    }

}