package org.DSA.ArrayList;

public class SubArraysWithOddSum {

    public static void main(String[] args) {

        int[] nums = new int[]{2,4,6};
        System.out.println(numOfSubArrays(nums));
    }


    private static int numOfSubArrays(int[] nums) {

        final int MOD = 1_000_000_007;
        int n = nums.length;

        int totalCount = 0;

        /// Converting whole array elements to either 1 or not to track even or odd
        for (int i = 0; i < n; i++) {
            nums[i] = nums[i] % 2;
        }

        int[] dpEvenArr = new int[n];
        int[] dpOddArr = new int[n];

        if (nums[0] == 0) {
            dpEvenArr[0]++;
        } else {
            dpOddArr[0]++;
        }

        for (int i = 1; i < n; i++) {
            if (nums[i] == 1) {
                dpOddArr[i] = (1 + dpEvenArr[i - 1]);
                dpEvenArr[i] = dpOddArr[i - 1];
            } else {
                dpEvenArr[i] = (1 + dpEvenArr[i - 1]);
                dpOddArr[i] = dpOddArr[i - 1];
            }
        }

        for (int oddCount : dpOddArr){
            totalCount += oddCount;
            totalCount %= MOD;
        }

        return totalCount;
    }
}
