package org.LLD.FunctionalProgramming.anonymusClass;

public class Client {

    public static void main(String[] args) {
        SampleInterface si = new SampleInterface() {

            @Override
            public void fun() {
                System.out.println("Inside fun");
            }

            @Override
            public void bun() {
                System.out.println("Inside bun");
            }
        };

        si.fun();

        Runnable ri = new Runnable() {
            @Override
            public void run() {
                System.out.println("Inside run "+Thread.currentThread());
            }
        };
        Thread thread = new Thread(ri);
        thread.start();

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Inside Thread 2 "+Thread.currentThread());
            }
        });
        thread1.start();
    }
}
