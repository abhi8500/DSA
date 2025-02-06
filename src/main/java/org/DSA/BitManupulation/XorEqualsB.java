package org.DSA.BitManupulation;

public class XorEqualsB {

    public int solve(int[]  A, int B){

        int xor = 0;
        int ans = 0;

        for (int j : A) {
            xor ^= j;
        }

        System.out.println("XOR "+xor);

        for(int i=0;i<32;i++){
            if((B & (1 << i )) == 0){
                if((xor & (1 << i )) > 0){
                    ans = (ans | (1 << i));
                }
            }else{
                if((xor & (1 << i )) == 0){
                    ans = (ans | (1 << i));
                }
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] A = {2,5,7,9};
        int B = 6;
        XorEqualsB xorEqualsB = new XorEqualsB();
        System.out.println(xorEqualsB.solve(A,B));
    }
}
