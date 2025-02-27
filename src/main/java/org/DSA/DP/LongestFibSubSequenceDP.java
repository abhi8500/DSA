package org.DSA.DP;

import java.util.HashMap;
import java.util.Map;

public class LongestFibSubSequenceDP {

    public static void main(String[] args) {

        int[] arr = new int[]{1,3,7,11,12,14,18};
        System.out.println(lenLongestFibSubseq(arr));
    }

    /**
     * <b>Hashing with DP Approach</b>
     * <p>
     *     <b>Time Complexity : </b> O(n2)
     *     <br>
     *     <b>Space Complexity : </b> O(n)
     * </p>
     * @param arr Array to process
     * @return Longest Fibonacci sub sequence
     */
    public static int lenLongestFibSubseq(int[] arr) {

        int n = arr.length;
        int maxLen = 0;

        int[][] dp = new int[n][n];

        Map<Integer,Integer> valIdxMap = new HashMap<>();

        for(int curr = 0;curr<n;curr++){
            valIdxMap.put(arr[curr],curr);
            for(int prev = 0;prev<curr;prev++){
                int diff = arr[curr] - arr[prev];
                int prevIdx = valIdxMap.getOrDefault(diff,-1);

                if(diff < arr[prev] && prevIdx >= 0){
                    dp[prev][curr] = 1 + dp[prevIdx][prev];
                }else{
                    dp[prev][curr] = 2;
                }
                maxLen = Math.max(maxLen,dp[prev][curr]);
            }
        }


        return maxLen > 2 ? maxLen : 0;

    }
}
