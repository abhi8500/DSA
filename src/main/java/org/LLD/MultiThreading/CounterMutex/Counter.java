package org.LLD.MultiThreading.CounterMutex;

public class Counter {

    private int count;

    public Counter(int count){
        this.count = count;
    }

    synchronized public void incValue(int offset){
        this.count += offset;
    }

    synchronized public int getValue(){
        return this.count;
    }

    synchronized public void decValue(int offset){
        this.count -= offset;
    }
}
