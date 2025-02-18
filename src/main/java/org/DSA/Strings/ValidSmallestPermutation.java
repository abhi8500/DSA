package org.DSA.Strings;

public class ValidSmallestPermutation {

    public static void main(String[] args) {
        String pattern = "IIIDIDDD";

        System.out.println(smallestNumber(pattern));
    }

    public static String smallestNumber(String pattern) {
        int n = pattern.length();
        char[] sequence = new char[n + 1];
        for (int i = 0; i <= n; i++) {
            sequence[i] = (char) ('1' + i);
        }

        while (!checkValidOrNot(pattern, new String(sequence))) {
            if (!findNextPermutation(sequence))
                break;
        }

        return new String(sequence);

    }

    private static boolean checkValidOrNot(String pattern, String sequence) {

        int len = pattern.length();
        for (int i = 0; i < len; i++) {
            if (pattern.charAt(i) == 'I') {
                if (sequence.charAt(i) > sequence.charAt(i + 1)) {
                    return false;
                }
            } else {
                if (sequence.charAt(i) < sequence.charAt(i + 1)) {
                    return false;
                }
            }
        }

        return true;
    }

    private  static boolean findNextPermutation(char[] sequence) {

        int lastIncreasingIndex = sequence.length - 2;

        while (lastIncreasingIndex >= 0 &&
                sequence[lastIncreasingIndex] >= sequence[lastIncreasingIndex + 1]) {
            lastIncreasingIndex--;
        }

        if (lastIncreasingIndex == -1)
            return false;

        // Find the rightmost character greater than numberSequence[lastIncreasingIndex]
        // and swap
        int swapIndex = sequence.length - 1;
        while (sequence[swapIndex] <= sequence[lastIncreasingIndex]) {
            swapIndex--;
        }
        swapCharacter(sequence, lastIncreasingIndex, swapIndex);

        reverseSuffix(sequence, lastIncreasingIndex + 1, sequence.length - 1);

        return true;
    }

    private  static void swapCharacter(char[] sequence, int startIdx, int endIdx) {
        char temp = sequence[startIdx];
        sequence[startIdx] = sequence[endIdx];
        sequence[endIdx] = temp;
    }

    private static void reverseSuffix(char[] sequence, int startIdx, int endIdx) {

        while (startIdx < endIdx) {
            swapCharacter(sequence, startIdx, endIdx);
            startIdx++;
            endIdx--;
        }
    }
}
