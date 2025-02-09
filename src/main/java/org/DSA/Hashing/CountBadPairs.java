package org.DSA.Hashing;

import java.util.HashMap;
import java.util.Map;

public class CountBadPairs {

    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3,4,5};
        System.out.println(CountBadPairs.badPairs(nums));
    }

    private static long badPairs(int[] nums) {

        long ans = 0;
        int n = nums.length;

        Map<Integer, Integer> diffMap = new HashMap<>();

        for (int pos = 0; pos < n; pos++) {
            int diff = pos - nums[pos];
            int goodPairs = diffMap.getOrDefault(diff, 0);

            ans += pos - goodPairs;
            diffMap.put(diff, goodPairs + 1);
        }

        return  ans;
    }
}
