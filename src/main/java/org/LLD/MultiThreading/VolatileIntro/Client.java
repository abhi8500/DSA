package org.LLD.MultiThreading.VolatileIntro;

public class Client {

    public static void main(String[] args) {

        SharedResource sharedResource = new SharedResource();

        Thread threadA = new Thread( () -> {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            sharedResource.toggleFlag();
            System.out.println(" Thread A , Flag is "+sharedResource.getFlag());
        });

        Thread threadB = new Thread( () -> {
           /// busy -- wait
           while (!sharedResource.getFlag()){

           }
            System.out.println(" In Thread B, Flag is "+sharedResource.getFlag());
        });

        threadA.start();
        threadB.start();
    }
}
