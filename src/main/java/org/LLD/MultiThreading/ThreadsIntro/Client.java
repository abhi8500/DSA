package org.LLD.MultiThreading.ThreadsIntro;

public class Client {

    public static void main(String[] args) {
        System.out.println("I am the main class");

        Runnable adderRunnable = new Adder();
        Thread t1 = new Thread(adderRunnable);
        t1.start();

        Thread t2 = new Subtractor();
        t2.start();
    }
}
