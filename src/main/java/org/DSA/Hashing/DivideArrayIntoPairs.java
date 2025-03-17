package org.DSA.Hashing;

import java.util.HashSet;
import java.util.Set;

public class DivideArrayIntoPairs {

    public static void main(String[] args) {
        int[] nums = new int[]{3, 2, 3, 2, 2, 2};
        System.out.println(divideArray(nums));
    }

    public static boolean divideArray(int[] nums) {
        Set<Integer> hs = new HashSet<>();
        for (int num : nums) {
            if (hs.contains(num)) {
                hs.remove(num);
            } else {
                hs.add(num);
            }
        }

        return hs.isEmpty();
    }
}
