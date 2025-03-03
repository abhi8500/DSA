package org.DSA.ArrayList;

import java.util.Arrays;

public class PivotArray {

    public static void main(String[] args) {
        int[] nums = new int[]{9,12,5,10,14,3,10};
        System.out.println(Arrays.toString(pivotArray(nums,10)));
    }

    public static int[] pivotArray(int[] nums, int pivot) {

        int n = nums.length;

        int i = 0;
        int j = n - 1;

        int[] ansArr = new int[n];

        for (int num : nums) {
            if (num < pivot) {
                ansArr[i++] = num;
            } else if (num > pivot) {
                ansArr[j--] = num;
            }
        }

        /// Step - 2
        for (int idx = i; idx <= j; idx++) {
            ansArr[idx] = pivot;
        }

        /// Step 3 reverse the elements after pivot(j)
        reverseElements(ansArr, j + 1, n - 1);

        return ansArr;
    }

    private static void reverseElements(int[] arr, int i, int j) {

        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
}
