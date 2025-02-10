package org.LLD.MultiThreading.AddSubtractorLock;

import java.util.concurrent.Callable;
import java.util.concurrent.locks.Lock;

public class Adder implements Callable<Void> {


    Value v;

    Lock lock;

    public Adder(Value v,Lock lock) {
        this.v = v;
        this.lock = lock;
    }

    @Override
    public Void call() throws Exception {
        for (int i=1;i<=10000;i++){

            /// Ideally critical section should be as small as possible, so that we will achieve more concurrency
            this.lock.lock();
            this.v.value += i;
            this.lock.unlock();
        }
        return null;
    }
}
