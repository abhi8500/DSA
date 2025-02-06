package org.DSA.TwoPointers;

import java.util.stream.Stream;

public class ClosestPair {

    public static void main(String[] args){
        int[] arr1 = {1,3,5,7,9};
        int[] arr2 = {2,4,6,8,10};

        System.out.println(ClosestPair.solve(arr1,arr2,10));
    }
    public static  int[] solve(int[] A, int[] B, int C) {

        int sum1 = Stream.iterate(new int[]{0,1}, x -> new int[]{x[1],x[0]+x[1]})
                .limit(8)
                .map(x -> x[0])
                .toList()
                .stream()
                .distinct()
                .filter(i -> i%2 == 0)
                .mapToInt(i -> i)
                .sum();

        System.out.println("SUM "+sum1);

        int[] ansArr = new int[2];

        ansArr[0] = Integer.MAX_VALUE;
        ansArr[1] = Integer.MAX_VALUE;

        int n = A.length;
        int m = B.length;

        int minDiff = Integer.MAX_VALUE;
        int p1 = 0;
        int p2 = m-1;
        while(p1 < n && p2 >= 0){
            int sum = A[p1] + B[p2];
            if(sum == C){
                ansArr[0] = A[p1];
                ansArr[1] = B[p2];
                return ansArr;
            }else if(sum < C){
                int diff = Math.abs(C-sum);
                if(diff < minDiff){
                    minDiff = diff;
                    ansArr[0] = A[p1];
                    ansArr[1] = B[p2];
                }else if(diff == minDiff){
                    if(A[p1] < ansArr[0]){
                        ansArr[0] = A[p1];
                        ansArr[1] = B[p2];
                    }else if (A[p1] == ansArr[0] && B[p2] < ansArr[1]){
                        ansArr[1] = B[p2];
                    }
//                    ansArr[0] = Math.min(ansArr[0],A[p1]);
//                    ansArr[1] =  Math.min(ansArr[1],B[p2]);
                }

                p1++;
            }else{
                int diff = Math.abs(C-sum);
                if(diff < minDiff){
                    minDiff = diff;
                    ansArr[0] = A[p1];
                    ansArr[1] = B[p2];
                }else if(diff == minDiff){
                    ansArr[0] = Math.min(ansArr[0],A[p1]);
                    ansArr[1] =  Math.min(ansArr[1],B[p2]);
                }
                p2--;

            }
        }

        return ansArr;
    }
}
