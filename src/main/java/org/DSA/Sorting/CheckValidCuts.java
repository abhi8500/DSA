package org.DSA.Sorting;

import java.util.Arrays;
import java.util.Comparator;

public class CheckValidCuts {

    public boolean checkValidCuts(int n, int[][] rectangles) {

        int rectanglesCount = rectangles.length;
        int cuts = 0;

        // Sorting once by x (column 0), and for same x, sorting by x2 (column 2)
        Arrays.sort(rectangles, Comparator.comparingInt((int[] r) -> r[0])
                .thenComparingInt(r -> r[2]));

        int end = rectangles[0][2];

        for (int i = 1; i < rectanglesCount; i++) {
            int currentStart = rectangles[i][0];
            int currentEnd = rectangles[i][2];

            if (currentStart == end) {
                cuts++;
            }
            end = Math.max(end, currentEnd);

            if (cuts >= 2)
                return true;
        }

        cuts = 0;

        // Reusing sorted array, sorting only if necessary (by y instead of x)
        Arrays.sort(rectangles, Comparator.comparingInt((int[] r) -> r[1])
                .thenComparingInt(r -> r[3]));

        end = rectangles[0][3];

        for (int i = 1; i < rectanglesCount; i++) {
            int currentStart = rectangles[i][1];
            int currentEnd = rectangles[i][3];

            if (currentStart == end) {
                cuts++;
            }
            end = Math.max(end, currentEnd);

            if (cuts >= 2)
                return true;
        }

        return false;
    }
}
