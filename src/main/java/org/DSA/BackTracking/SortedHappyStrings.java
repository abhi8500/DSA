package org.DSA.BackTracking;

public class SortedHappyStrings {

    public static void main(String[] args) {

        System.out.println(getHappyString(3,9));
    }

    public static  String getHappyString(int n, int k) {

        StringBuilder currentString = new StringBuilder();
        int[] indexInSortedResult = new int[1];
        String[] result = new String[1];

        generateHappyStrings(n, k,currentString,indexInSortedResult,result);

        return result[0] == null ? "" : result[0];

    }

    private static void generateHappyStrings(int n,int k,StringBuilder currentStr,int[] indexInSortedResult,String[] result){

        if (currentStr.length() == n){
            indexInSortedResult[0]++;
            if (indexInSortedResult[0] == k){
                result[0] = currentStr.toString();

            }
            return;
        }

        for (char currentChar = 'a' ; currentChar <= 'c';currentChar++){
            if (currentStr.length() > 0 && currentStr.charAt(currentStr.length()-1) == currentChar)
                continue;
            currentStr.append(currentChar);
            generateHappyStrings(n,k,currentStr,indexInSortedResult,result);

            if (result[0] != null)
                return;
            currentStr.deleteCharAt(currentStr.length()-1);
        }
    }
}
