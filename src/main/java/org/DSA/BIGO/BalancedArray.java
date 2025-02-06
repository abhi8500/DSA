package org.DSA.BIGO;

public class BalancedArray {

    public static void main(String[] args){

        int[] A =  {1,2,3};
        System.out.println(BalancedArray.solve(A));

    }



    public static int solve(int[] A) {

        int count = 0;
        int[] preOdd = new int[A.length];
        int[] preEven = new int[A.length];
        int[] suffOdd = new int[A.length];
        int[] suffEven = new int[A.length];

        int odd = 0;
        int even = 0;

        for(int i=0;i < A.length; i++ ){

            if(i%2 == 0)
                even += A[i];
            else
                odd += A[i];
            preOdd[i] = odd;
            preEven[i] = even;
        }





        odd = 0;
        even = 0;

        for(int i= A.length-1;i >=0; i-- ){

            if(i%2 == 0)
                even += A[i];
            else
                odd += A[i];

            suffOdd[i] = odd;
            suffEven[i] = even;
        }

        for(int i = 0; i < A.length; i++){
            if(preOdd[i] + suffEven[i] == preEven[i] + suffOdd[i])
                count++;

        }
        return count;

    }
}
