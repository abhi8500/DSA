package org.DSA.DP;

public class MaxAbsSumOfSubArray {

    public static void main(String[] args) {
        int[] nums = new int[]{2, -5, 1, -4, 3, -2};
        System.out.println(maxAbsoluteSum(nums));
    }

    /**
     * <b>kadane's Algorithm</b>
     * <p>
     * Using kadane's algorithm maintain maximum positive sum using current sum variable
     * and maximum negative sum and return maximum of absolute of both maximums
     * </p>
     *
     * @param nums - Array to process
     * @return maximum absolute sub array sum
     */
    public static int maxAbsoluteSum(int[] nums) {

        int maxPositiveSum = 0;
        int currentPositiveSum = 0;

        int maxNegativeSum = 0;
        int currentNegativeSum = 0;

        for (int num : nums) {
            currentPositiveSum += num;
            currentNegativeSum += num;
            if (currentPositiveSum < 0) {
                currentPositiveSum = 0;
            }
            if (currentNegativeSum > 0) {
                currentNegativeSum = 0;
            }
            maxNegativeSum = Math.min(maxNegativeSum, currentNegativeSum);
            maxPositiveSum = Math.max(maxPositiveSum, currentPositiveSum);
        }

        return Math.max(maxPositiveSum, Math.abs(maxNegativeSum));
    }
}
