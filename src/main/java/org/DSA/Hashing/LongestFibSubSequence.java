package org.DSA.Hashing;

import java.util.HashSet;
import java.util.Set;

public class LongestFibSubSequence {

    public static void main(String[] args) {

        int[] arr = new int[]{1,3,7,11,12,14,18};
        System.out.println(lenLongestFibSubseq(arr));
    }

    /**
     * <b>Hashing - Brute Force Approach</b>
     * <p>
     *     <b>Time Complexity : </b> O(n2logM)
     *     <br>
     *     <b>Space Complexity : </b> O(n)
     * </p>
     * @param arr Array to process
     * @return Longest Fibonacci sub sequence
     */
    public static int lenLongestFibSubseq(int[] arr) {

        int n = arr.length;
        int maxLen = 0;

        Set<Integer> numSet = new HashSet<>();

        for (int num : arr) {
            numSet.add(num);
        }

        for (int start = 0; start < n - 1; start++) {
            for (int next = start + 1; next < n; next++) {
                int len = 2;
                int prev = arr[next];
                int curr = arr[next] + arr[start];
                while (numSet.contains(curr)) {
                    int temp = curr;
                    curr += prev;
                    prev = temp;
                    maxLen = Math.max(maxLen, ++len);
                }
            }
        }

        return maxLen;
    }

}
