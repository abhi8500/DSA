package org.DSA.SlidingWindow;

public class AlternatingGroup2 {

    public static void main(String[] args) {
        int[] colors = new int[]{0,1,0,0,1};
        System.out.println(numberOfAlternatingGroups(colors,5));
    }

    public static  int numberOfAlternatingGroups(int[] colors, int k) {

        int n = colors.length;
        int totalAlternatingGroups = 0;

        int[] extendedArr = new int[n + k - 1];

        for (int i = 0; i < n; i++) {
            extendedArr[i] = colors[i];
        }

        for (int i = 0; i < k - 1; i++) {
            extendedArr[n + i] = colors[i];
        }

        int left = 0;
        int right = 1;

        while (right < extendedArr.length) {
            if (extendedArr[right] == extendedArr[right - 1]) {
                left = right;
                right++;
                continue;
            }

            right++;
            if (right - left < k)
                continue;

            totalAlternatingGroups++;
            left++;

        }

        return totalAlternatingGroups;

    }
}
