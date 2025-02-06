package org.DSA.BackTracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class LetterPhone {


    public static void main(String[] args){

        String A = "10";

        LetterPhone.letterCombinations(A);

    }


    public static ArrayList<String> letterCombinations(String A) {

        HashMap<Character,String> keypadMap = new HashMap<>();

        keypadMap.put('0',"0");
        keypadMap.put('1',"1");
        keypadMap.put('2',"abc");
        keypadMap.put('3',"def");
        keypadMap.put('4',"ghi");
        keypadMap.put('5',"jkl");
        keypadMap.put('6',"mno");
        keypadMap.put('7',"pqrs");
        keypadMap.put('8',"tuv");
        keypadMap.put('9',"wxyz");



        int n = A.length();

        String[] keypadArr = new String[n];

        for(int i=0;i< n;i++){
            keypadArr[i] = keypadMap.get(A.charAt(i));
        }

        Arrays.sort(keypadArr);


        ArrayList<String> ansList = new ArrayList<>();

        boolean[][] visitedArr = new boolean[n][4];

        letterPhone(keypadArr,ansList,"",0,visitedArr);

        return ansList;
    }


    private static void letterPhone(String[] A, ArrayList<String> finalAns, String ans, int idx, boolean[][] vistedArr){

        int n = A.length;

        if(idx == n){
            finalAns.add(ans);
            return;
        }



        for(int i=0;i<n;i++){
            int len = A[0].length();
            for(int j=0;j<len;j++){
                if(!vistedArr[i][j]){
                    vistedArr[i][j] = true;
                    if(j < A[i].length()){
                        letterPhone(A,finalAns,ans+A[i].charAt(j),idx+1,vistedArr);
                    }
                    vistedArr[i][j] = false;
                }
            }
        }
    }
}
