package org.DSA.DP;

import java.util.HashMap;
import java.util.Map;

public class ShortestCommonSuperSequence {

    public static void main(String[] args) {
        String str1 = "abac";
        String str2 = "cab";

        System.out.println(shortestCommonSuperSequence(str1, str2));
    }


    public static String shortestCommonSuperSequence(String str1, String str2) {

        Map<String, String> memoMap = new HashMap<>();
        return shortestCommonSuperSequenceBottomUpDP(str1, str2);
    }


    /**
     * <b>Backtracking - Brute Force approach</b>
     * <p>
     * <b>Time Complexity : </b> O(2^(M+N)* M+N)
     * <br>
     * <b>Space Complexity : </b> O((M+N)^2)
     * </p>
     *
     * @param str1 String 1 to process
     * @param str2 String 2 to process
     * @return Shortest Common super sequence
     */
    public static String shortestCommonSuperSequenceBT(String str1, String str2) {

        if (str1.isEmpty() && str2.isEmpty()) {
            return "";
        }

        if (str1.isEmpty()) {
            return str2;
        }
        if (str2.isEmpty()) {
            return str1;
        }


        if (str1.charAt(0) == str2.charAt(0)) {
            return (str1.charAt(0) + shortestCommonSuperSequenceBT(str1.substring(1), str2.substring(1)));
        } else {

            String pickStr1 = (str1.charAt(0) + shortestCommonSuperSequenceBT(str1.substring(1), str2));
            String pickStr2 = (str2.charAt(0) + shortestCommonSuperSequenceBT(str1, str2.substring(1)));

            return (pickStr1.length() < pickStr2.length()) ? pickStr1 : pickStr2;
        }
    }


    /**
     * <b>Dynamic Programming - Memoization</b>
     * <p>
     * <b>Time Complexity : </b> O(M*N*(M+N))
     * <br>
     * <b>Space Complexity : </b> O(M*N*(M+N))
     * </p>
     *
     * @param str1 String 1 to process
     * @param str2 String 2 to process
     * @return Shortest Common super sequence
     */
    public static String shortestCommonSuperSequenceMemoDP(String str1, String str2, Map<String, String> memoMap) {

        String memoKey = str1 + " " + str2;

        if (memoMap.containsKey(memoKey)) {
            return memoMap.get(memoKey);
        }

        if (str1.isEmpty() && str2.isEmpty()) {
            return "";
        }

        if (str1.isEmpty()) {
            return str2;
        }
        if (str2.isEmpty()) {
            return str1;
        }


        if (str1.charAt(0) == str2.charAt(0)) {
            String result = (str1.charAt(0) + shortestCommonSuperSequenceBT(str1.substring(1), str2.substring(1)));
            memoMap.put(memoKey, result);
            return result;
        } else {

            String pickStr1 = (str1.charAt(0) + shortestCommonSuperSequenceBT(str1.substring(1), str2));
            String pickStr2 = (str2.charAt(0) + shortestCommonSuperSequenceBT(str1, str2.substring(1)));

            String result = (pickStr1.length() < pickStr2.length()) ? pickStr1 : pickStr2;
            memoMap.put(memoKey, result);
            return result;
        }
    }


    public static String shortestCommonSuperSequenceBottomUpDP(String str1, String str2) {

        int n = str1.length();
        int m = str2.length();
        int[][] dp = new int[n + 1][m + 1];

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (str1.charAt(i - 1) == str2.charAt(j - 1)) {
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        int i = n;
        int j = m;
        while (i > 0 && j > 0) {
            if (str1.charAt(i - 1) == str2.charAt(j - 1)) {
                sb.append(str1.charAt(i - 1));
                i--;
                j--;
            } else {
                if (dp[i - 1][j] > dp[i][j - 1]) {
                    sb.append(str1.charAt(i - 1));
                    i--;
                } else {
                    sb.append(str2.charAt(j - 1));
                    j--;
                }
            }
        }

        while (i > 0) {
            sb.append(str1.charAt(i - 1));
            i--;
        }
        while (j > 0) {
            sb.append(str2.charAt(j - 1));
            j--;
        }

        return sb.reverse().toString();

    }

}
