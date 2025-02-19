package org.LLD.FunctionalProgramming.lamdas;

public class Client {
    public static void main(String[] args) {


        /// Lambda functions means ths arrow function will direction map to the abstract method of functional interface
        Thread t = new Thread(() -> System.out.println("Inside run"));

        t.start();

        /// If my interface is having more than 1 abstract method the below line will throw compile time error
       // lambdaTest(() -> System.out.println("Inside Lambda"));

    }

    private static void lambdaTest(LamdaInterface lamdaInterface){
        System.out.println("Hi");
    }
}
