package org.DSA.SlidingWindow;

import java.util.HashMap;
import java.util.Map;

public class NumberOfSubstrings {

    public static void main(String[] args) {
        System.out.println(numberOfSubstrings("abcabc"));
    }

    public static int numberOfSubstrings(String s) {

        int n = s.length();
        int left = 0;
        int right = 0;

        int count = 0;
        boolean rightChanged = true;

        Map<Character, Integer> hm = new HashMap<>();

        while (left <= n - 3) {
            char ch = s.charAt(right);
            if (rightChanged) {
                hm.put(ch, hm.getOrDefault(ch, 0) + 1);
            }

            if (hm.size() == 3 || right == n - 1) {
                rightChanged = false;
                if (hm.size() == 3) {
                    count += n - right;
                }

                char leftChar = s.charAt(left);
                hm.put(leftChar, hm.get(leftChar) - 1);
                if (hm.get(leftChar) == 0) {
                    hm.remove(leftChar);
                }
                left++;

            } else {
                rightChanged = true;
                right++;
            }

            if (right == n) {
                right = n - 1;
            }

        }

        return count;

    }
}
