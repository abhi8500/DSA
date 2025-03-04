package org.DSA.Math;

public class CheckPowersOfThree {

    public static void main(String[] args) {
        System.out.println(checkPowersOfThree(81));
    }

    public static boolean checkPowersOfThree(int n) {

        int largestPower = 1;

        while (largestPower < n) {
            largestPower *= 3;
        }

        if (largestPower == n) {
            return true;
        }

        while (largestPower > 0) {
            int diff = n - largestPower;
            if (diff == 0) {
                return true;
            } else if (diff > 0) {
                n -= largestPower;
            }
            largestPower /= 3;
        }
        return false;

    }
}
