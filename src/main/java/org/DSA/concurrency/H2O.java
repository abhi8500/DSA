package org.DSA.concurrency;

import java.util.concurrent.Semaphore;

public class H2O {

    private final Semaphore hydrogenS ;
    private final Semaphore oxygenS;

    public H2O() {
        hydrogenS = new Semaphore(2);
        oxygenS = new Semaphore(0);
    }

    public void hydrogen(Runnable releaseHydrogen) throws InterruptedException {
        hydrogenS.acquire();
        /// releaseHydrogen.run() outputs "H". Do not change or remove this line.
        releaseHydrogen.run();
        oxygenS.release();
    }

    public void oxygen(Runnable releaseOxygen) throws InterruptedException {
        oxygenS.acquire(2);
        /// releaseOxygen.run() outputs "O". Do not change or remove this line.
        releaseOxygen.run();
        hydrogenS.release(2);
    }
}
