package org.DSA.BackTracking;

import java.util.Arrays;

public class LexicographicallyLargestSequence {

    public static void main(String[] args) {
        int n = 3;

        System.out.println(Arrays.toString(LexicographicallyLargestSequence.constructDistancedSequence(n)));
    }

    public static int[] constructDistancedSequence(int n) {

        int[] resultSequence = new int[n * 2 - 1];
        boolean[] isNumberUsed = new boolean[n + 1];

        findLexicographicallyLargestSequence(0, resultSequence, isNumberUsed, n);

        return resultSequence;
    }

    private static boolean findLexicographicallyLargestSequence(int currentIndex, int[] resultSequence, boolean[] isNumberUsed, int targetNumber) {

        /// If we have filled all positions, return true indicating success
        if (currentIndex == resultSequence.length) {
            return true;
        }

        /// If the current position is already filled, move to the next index
        if (resultSequence[currentIndex] != 0) {
            return findLexicographicallyLargestSequence(currentIndex + 1, resultSequence, isNumberUsed, targetNumber);
        }

        for (int num = targetNumber; num >= 1; num--) {
            if (isNumberUsed[num]) continue;
            isNumberUsed[num] = true;
            resultSequence[currentIndex] = num;
            if (num == 1) {
                if (findLexicographicallyLargestSequence(currentIndex + 1, resultSequence, isNumberUsed, targetNumber)) {
                    return true;
                }

            }
            /// Place larger numbers at two positions if valid
            else if (currentIndex + num < resultSequence.length && resultSequence[currentIndex + num] == 0) {
                resultSequence[currentIndex + num] = num;

                if (findLexicographicallyLargestSequence(currentIndex + 1, resultSequence, isNumberUsed, targetNumber)) {
                    return true;
                }

                /// Undo the placement for backtracking
                resultSequence[currentIndex + num] = 0;
            }

            /// Undo current placement and mark the number as unused
            resultSequence[currentIndex] = 0;
            isNumberUsed[num] = false;
        }

        return false;

    }
}
