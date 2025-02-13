package org.DSA.concurrency;

import java.util.concurrent.Semaphore;

public class PrintFooBar {

    private int n;
    private Semaphore fooSem;
    private Semaphore barSem;

    public PrintFooBar(int n) {
        this.n = n;
        this.fooSem = new Semaphore(1);
        this.barSem = new Semaphore(0);
    }

    public void foo(Runnable printFoo) throws InterruptedException {

        for (int i = 0; i < n; i++) {
            fooSem.acquire();
            // printFoo.run() outputs "foo". Do not change or remove this line.
            printFoo.run();
            barSem.release();
        }
    }

    public void bar(Runnable printBar) throws InterruptedException {

        for (int i = 0; i < n; i++) {
            barSem.acquire();
            // printBar.run() outputs "bar". Do not change or remove this line.
            printBar.run();
            fooSem.release();
        }
    }
}
