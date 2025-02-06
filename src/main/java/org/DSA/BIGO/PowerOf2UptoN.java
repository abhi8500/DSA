package org.DSA.BIGO;

public class PowerOf2UptoN {

    public static int PowerOf2UptoNbyRecur(int n) {
        if(n < 0){
            return 0;
        } else if (n == 1) {
            System.out.println(1);
            return 1;
        }else {
            int prev = PowerOf2UptoNbyRecur(n / 2);
            int curr = prev *2;
            System.out.println(curr);
            return  curr;
        }
    }
}
