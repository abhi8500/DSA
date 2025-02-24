package org.LLD.ExceptionFramework;

public class ThreadExample {

    public static void main(String[] args) {
        Thread thread = new Thread(() -> {
            try {
                Thread.sleep(5000);
                System.out.println("Task completed.");
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted while sleeping.");
            }
        });


        thread.start();


        try {
            Thread.sleep(2000);
            thread.interrupt();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
