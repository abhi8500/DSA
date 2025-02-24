package org.LLD.ExceptionFramework;

public class DivideByZeroException {

    public static int divide(int numerator, int denominator ){
        try {
            return numerator/denominator;
        }catch (ArithmeticException e){
            System.out.println("Divide by Zero Not Allowed ");
            return -1;
        }
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println("Result of 6 divided by 3: " + divide(6, 3));
        System.out.println("Result of 1 divided by 2: " + divide(1, 2));
        System.out.println("Result of 5 divided by 0: " + divide(5, 0));
        System.out.println("Result of 10 divided by 0: " + divide(10, 0));
        System.out.println("Result of -1 divided by 2: " + divide(-1, 2));
        System.out.println("Result of -2 divided by 0: " + divide(-2, 0));
        System.out.println("Result of 92 divided by 0: " + divide(92, 0));
        System.out.println("Result of 9 divided by 0: " + divide(9, 0));
        System.out.println("Result of -15 divided by -3: " + divide(-15, -3));
        System.out.println("Result of 20 divided by 10: " + divide(20, 10));
    }
}
