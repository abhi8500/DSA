package org.LLD.MultiThreading.AdderSubtractorDeadLock;

import java.util.concurrent.Callable;
import java.util.concurrent.locks.Lock;

public class Adder implements Callable<Void> {


    Value v;

    Lock lock1;
    Lock lock2;


    public Adder(Value v, Lock lock1,Lock lock2) {
        this.v = v;
        this.lock1 = lock1;
        this.lock2 = lock2;
    }

    @Override
    public Void call() throws Exception {
        for (int i=1;i<=10000;i++){

            /// Ideally critical section should be as small as possible, so that we will achieve more concurrency
            this.lock1.lock();
            this.lock2.lock();
            this.v.value += i;
            this.lock2.unlock();
            this.lock1.unlock();
        }
        return null;
    }
}
