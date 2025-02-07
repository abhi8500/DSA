package org.DSA.Hashing;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class NoOfDistinctColors {

    public static  int[] queryResults(int limit, int[][] queries) {

        Map<Integer,Integer> colorMap = new HashMap<>();
        Map<Integer, Integer> ballColorMap = new HashMap<>();

        int n = queries.length;

        int[] ansArr = new int[n];

        for (int i = 0; i < n; i++) {
            int ball = queries[i][0];
            int color = queries[i][1];


            if (ballColorMap.containsKey(ball)) {

                int prevColor = ballColorMap.get(ball);
                colorMap.put(prevColor, colorMap.get(prevColor) - 1);

                if(colorMap.get(prevColor) ==  0){
                    colorMap.remove(prevColor);
                }
            }

            ballColorMap.put(ball,color);
            colorMap.put(color,colorMap.getOrDefault(color,0)+1);
            ansArr[i] = colorMap.size();
        }

        return ansArr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int limit = sc.nextInt();

        int n = sc.nextInt();

        int[][] queries = new int[n][2];
        for(int i=0;i<n;i++){
            queries[i][0] = sc.nextInt();
            queries[i][1] = sc.nextInt();
        }

        sc.close();

        int[] ansArr = NoOfDistinctColors.queryResults(limit,queries);
        Arrays.stream(ansArr).forEach(System.out::println);


    }
}
