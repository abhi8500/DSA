package org.DSA.BIGO;

public class StringPalin {

    public static boolean isPalindrome(int x) {
        String str = String.valueOf(x);
        String revStr = new StringBuilder(str).reverse().toString();
        return str.equals(revStr);
    }

    public static void main(String[] args){
        System.out.println(StringPalin.isPalindrome(121));
    }
}
