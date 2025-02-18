package org.DSA.Recursion;

public class SmallestNumFromDIStr {

    public static void main(String[] args) {
        String pattern = "IIIDIDDD";

        System.out.println(smallestNumber(pattern));
    }

    public static String smallestNumber(String pattern) {

        return String.valueOf(findSmallestNumber(pattern, 0, 0, 0));
    }

    /// Recurssion
    private static int findSmallestNumber(String pattern, int currentIndex, int usedDigitMask,
                                          int currentNum) {
        /// Base case
        if (currentIndex > pattern.length()) {
            return currentNum;
        }
        int result = Integer.MAX_VALUE;

        int lastDigit = currentNum % 10;
        boolean shouldIncreament = currentIndex == 0 ||
                pattern.charAt(currentIndex - 1) == 'I';

        for (int i = 1; i <= 9; i++) {
            if ((usedDigitMask & (1 << i)) == 0 && i > lastDigit == shouldIncreament) {
                result = Math.min(result, findSmallestNumber(
                        pattern, currentIndex + 1, usedDigitMask | (1 << i), currentNum * 10 + i
                ));
            }
        }

        return result;
    }
}
