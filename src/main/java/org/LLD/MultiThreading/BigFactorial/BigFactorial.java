package org.LLD.MultiThreading.BigFactorial;

import java.math.BigInteger;

public class BigFactorial extends Thread{

    private final int number;

    private BigInteger factorial;

    public BigFactorial(int number){
        this.number = number;
    }

    @Override
    public void run(){
        factorial = BigInteger.valueOf(1);

        for(int i=1;i<=number;i++){
            factorial = factorial.multiply(BigInteger.valueOf(i));
        }
    }

    public BigInteger getFactorial(){
        return this.factorial;
    }

    public static void main(String[] args) throws InterruptedException {
        BigFactorial bigFactorial = new BigFactorial(100);

        bigFactorial.start();
        bigFactorial.join();

        System.out.println("Factorial of 100: " + bigFactorial.getFactorial());
    }
}
