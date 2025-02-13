package org.LLD.AsynchronousProgramming.threadExample;

public class ThreadExample {

    private static int factorial(int num){

        System.out.println(Thread.currentThread().getName()+" is started");

        /// Adding 2sec delay
        try{
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        int ans =1;
        for (int i=1;i<=num;i++){
            ans *= i;
        }

        System.out.println(Thread.currentThread().getName()+" is finished");

        return ans;
    }

    public static void main(String[] args) {

        int num = 5;
        Thread thread = new Thread( () -> {
            System.out.println("Factorial "+factorial(num));
        });
        thread.start();

        System.out.println("Main is still running");
    }
}
