package org.DSA.SlidingWindow;

public class AlternatingGroups1 {

    public static void main(String[] args) {
        int[] colors = new int[]{0,1,0,0,1};
        System.out.println(numberOfAlternatingGroups(colors));
    }

    public static  int numberOfAlternatingGroups(int[] colors) {

        int n = colors.length;
        int alternatingGroupsLength = 0;

        for (int i = 0; i < n; i++) {
            if (colors[(i) % n] != colors[(i + 1) % n] && colors[(i + 1) % n] != colors[(i + 2) % n]) {
                alternatingGroupsLength++;
            }
        }

        return alternatingGroupsLength;

    }

}
