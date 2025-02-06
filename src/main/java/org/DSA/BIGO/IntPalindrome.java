package org.DSA.BIGO;

public class IntPalindrome {

    public static int isPalindrome(int x) {

        if(x == 0){
            return 0;
        }else{
            int digit = x % 10;
            return digit * (int) Math.pow(10, (int) Math.floor(Math.log10(Math.abs(x)))) + isPalindrome(x / 10);


        }

    }

    public static void main(String[] args){


        System.out.println(IntPalindrome.isPalindrome(121));
    }
}
