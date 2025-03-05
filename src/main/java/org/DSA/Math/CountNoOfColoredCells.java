package org.DSA.Math;

public class CountNoOfColoredCells {

    public static void main(String[] args) {
        System.out.println(coloredCells(5));
    }

    public static long coloredCells(int n) {

        return 1 + (long) n * (n - 1) * 2;

    }

}
