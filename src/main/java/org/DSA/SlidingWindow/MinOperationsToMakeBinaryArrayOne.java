package org.DSA.SlidingWindow;

public class MinOperationsToMakeBinaryArrayOne {

    public static void main(String[] args) {
        int[] nums = new int[]{0,1,1,1,0,0};
        System.out.println(minOperations(nums));
    }

    public static int minOperations(int[] nums) {

        int n = nums.length;

        int i = 0;

        int minOperations = 0;
        while (i < n - 2) {
            if (nums[i] == 0) {
                nums[i] = 1;
                nums[i + 1] ^= 1;
                nums[i + 2] ^= 1;

                minOperations++;
            }
            i++;
        }

        return nums[n - 1] == 1 && nums[n - 2] == 1 ? minOperations : -1;
    }
}
