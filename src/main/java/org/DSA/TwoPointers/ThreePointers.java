package org.DSA.TwoPointers;

import java.util.Arrays;

public class ThreePointers {

    public static void main(String[] args){
        int[] arr = {-4,-8,-10,-9,-1,1,-2,0,-8,-2};

        System.out.println(ThreePointers.threeSumClosest(arr,0));
    }
    public static int threeSumClosest(int[] A, int B) {

        Arrays.sort(A);

        int n = A.length;
        int ans = 0;
        int minAbsDiff = Integer.MAX_VALUE;

        if(n <=3){
            for(int i=0;i<n;i++){
                ans += A[i];
            }
            return ans;
        }

        for(int i=0;i<n-2;i++){
            int diff = B - A[i];
            int twoSum = twoSum(A,diff,i+1);
            int totalSum =  A[i] + twoSum;
            System.out.println("I "+A[i]+" Two Sum "+twoSum+" Total Sum "+totalSum);
            if(totalSum == B){
                return totalSum;
            }else{

                int absDiff = Math.abs(B - totalSum);
                if(absDiff < minAbsDiff){
                    // System.out.println("MIN Abs Val "+minAbsDiff);
                    minAbsDiff = absDiff;
                    ans = totalSum;
                }
            }
        }

        return ans;

    }

    private  static int twoSum(int[] A, int B,int pointer){
        int n = A.length;
        int p1 = pointer;
        int p2 = n-1;

        int ans = 0;

        while(p1 < p2){
            // System.out.println("P1 "+p1+" P2 "+p2);
            int sum = A[p1]+A[p2];
            // System.out.println("P1 "+p1+" P2 "+p2+" Sum "+sum);
            if(sum == B){
                return sum;
            }else if(sum < B){
                ans = A[p1]+A[p2];
                p1++;
            }else{
                ans = A[p1]+A[p2];
                p2--;
            }
        }

        return ans;
    }
}
