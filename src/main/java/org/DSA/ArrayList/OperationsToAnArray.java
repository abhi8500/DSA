package org.DSA.ArrayList;

import java.util.Arrays;

public class OperationsToAnArray {

    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 2, 1, 1, 0};
        arr = applyOperationsOptimized(arr);
        System.out.println(Arrays.toString(arr));
    }


    /**
     * <b> Brute Force approach</b>
     * <p>
     * <b>Time Complexity : </b> O(n^2+n)
     * <br>
     * <b>Space Complexity : </b> O(1)
     * </p>
     *
     * @param arr Array to process
     * @return array of processing
     */
    public static int[] applyOperationsBF(int[] arr) {
        int n = arr.length;

        /// TC - O(N)
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                arr[i] = 2 * arr[i];
                arr[i + 1] = 0;
            }
        }

        /// TC - O(n2)
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] == 0) {
                int j = i + 1;
                while (j < n - 1 && arr[j] == 0) {
                    j++;
                }
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        return arr;
    }

    /**
     * <b> Optimized approach</b>
     * <p>
     * <b>Time Complexity : </b> O(n)
     * <br>
     * <b>Space Complexity : </b> O(n)
     * </p>
     *
     * @param arr Array to process
     * @return array of processing
     */
    public static int[] applyOperationsOptimized(int[] arr) {

        int n = arr.length;
        int[] ansArr = new int[n];

        int numPointer = 0;

        int i = 0;

        while (numPointer < n - 1) {
            if (arr[numPointer] == 0) {
                numPointer++;
            } else if (arr[numPointer] == arr[numPointer + 1]) {
                ansArr[i++] = 2 * arr[numPointer];
                numPointer += 2;

            } else {
                ansArr[i++] = arr[numPointer];
                numPointer++;
            }
        }

        /// Base case
        if (numPointer < n && arr[numPointer] != 0) {
            ansArr[i] = arr[numPointer];
        }


        return ansArr;
    }
}   
