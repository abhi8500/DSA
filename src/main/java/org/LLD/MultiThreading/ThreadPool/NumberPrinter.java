package org.LLD.MultiThreading.ThreadPool;

public class NumberPrinter implements Runnable{

    int number;

    public NumberPrinter(int number){
        this.number = number;
    }

    @Override
    public void run(){
        System.out.println(this.number+" "+Thread.currentThread().getName());
    }


}
