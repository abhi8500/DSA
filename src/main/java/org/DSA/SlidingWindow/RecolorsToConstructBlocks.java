package org.DSA.SlidingWindow;

public class RecolorsToConstructBlocks {

    public static void main(String[] args) {

        System.out.println(minimumRecolors("WBBWWBBWBW",7));
    }

    public static int minimumRecolors(String blocks, int k) {

        int n = blocks.length();

        // Worst case
        if (k > n) {
            return 0;
        }

        int minOperations = Integer.MAX_VALUE;
        int left = 0;
        int numWhites = 0;
        for (int right = 0; right < n; right++) {
            if (blocks.charAt(right) == 'W') {
                numWhites++;
            }
            if (right - left + 1 == k) {
                minOperations = Math.min(minOperations, numWhites);

                if (blocks.charAt(left) == 'W') {
                    numWhites--;
                }
                left++;
            }
        }

        return minOperations;
    }
}
