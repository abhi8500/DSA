package org.DSA.BitManupulation;

public class LongestNiceSubArray {

    public static void main(String[] args) {
        int[] nums = new int[]{1, 3, 8, 48, 10};
        System.out.println(longestNiceSubArray(nums));

    }

    /**
     * Brute force approach -
     * We will consider every element as starting point and check the max nice sub array with the starting point
     * First, let's understand what makes a subarray "nice"
     * according to the given definition. A nice subarray is one where the bitwise
     * AND of any two distinct elements equals zero. This means that for any pair of numbers in our subarray,
     * their binary representations must not have any overlapping set bits (1s in the same positions).
     * When two numbers have no overlapping set bits, we can say they are "bit-disjoint."
     * For example, 5 (101 in binary) and 7 (111 in binary) are not bit-disjoint since they both have a 1 in the first and
     * third positions from the right. However, 5 (101) and 8 (1000) are bit-disjoint since they have no 1s in the same bit positions.
     * Using above approach of bit masking we can maintain the sub array bits in a int.
     * Time Complexity : O(n2)
     * Space Complexity : O(1)
     *
     * @param nums
     * @return Longest Nice sub array length
     */
    public static int longestNiceSubArray(int[] nums) {

        int n = nums.length;

        int maxLen = 0;

        for (int start = 0; start < n - maxLen; start++) {

            int currentLen = 1;
            int usedBits = nums[start];
            for (int end = start + 1; end < n; end++) {
                if ((usedBits & nums[end]) == 0) {
                    usedBits |= nums[end];
                    currentLen++;
                } else {
                    break;
                }
            }
            maxLen = Math.max(maxLen, currentLen);
        }
        return maxLen;
    }

    /**
     * Sliding Window Technique
     * Time Complexity : O(n)
     * Space Complexity : O(1)
     *
     * @param nums
     * @return
     */

    public static int longestNiceSubArrayOptimized(int[] nums) {
        int n = nums.length;

        int maxLen = 0;
        int usedBits = 0;

        int start = 0;

        for (int end = 0; end < n; end++) {

            while ((usedBits & nums[end]) != 0) {
                usedBits ^= nums[start];
                start++;
            }

            usedBits |= nums[end];

            maxLen = Math.max(maxLen, end - start + 1);
        }

        return maxLen;
    }
}
