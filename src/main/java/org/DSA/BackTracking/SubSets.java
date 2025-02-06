package org.DSA.BackTracking;

import java.util.ArrayList;

public class SubSets {

    public static void main(String[] args){
        ArrayList<Integer> A = new ArrayList<>();
        A.add(1);
        A.add(2);
        A.add(3);
        System.out.println(SubSets.subsets(A,20));
    }

    public static int subsets(ArrayList<Integer> A,int B) {

        ArrayList<ArrayList<Integer>> finalArr = new ArrayList<>();

        ArrayList<Integer> ansArr = new ArrayList<>();

        return subSets(A,ansArr,0,B) ? 1 : 0;
    }


    private static boolean subSets(ArrayList<Integer> A,
                                ArrayList<Integer> ansArr, int idx,int B){

        int n = A.size();

        if(idx == n){
            int sum = 0;
            for (Integer integer : ansArr) {
                sum += integer;
            }
            return sum == B;
        }

        ansArr.add(A.get(idx));
        boolean ans = subSets(A,ansArr,idx+1,B);

        if(!ans){
            ansArr.removeLast();
            ans = subSets(A,ansArr,idx+1,B);
        }

        return  ans;

    }
}