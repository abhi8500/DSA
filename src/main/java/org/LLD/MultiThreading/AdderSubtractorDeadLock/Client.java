package org.LLD.MultiThreading.AdderSubtractorDeadLock;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Client {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        /// Create a lock to handle critical sections
        Lock lock1 = new ReentrantLock();
        Lock lock2 = new ReentrantLock();

        /// Ideally after adding and subtracting same value object the final output should be 0
        /// Due to adder and subtract are running in 2 different threads concurrently the output is not fixed
        /// this is the side effect of concurrency
        Value v = new Value();
        Adder a = new Adder(v,lock1,lock2);
        Subtractor s = new Subtractor(v,lock1,lock2);



        ExecutorService es = Executors.newFixedThreadPool(2);
        Future<Void> adderFuture = es.submit(a);
        Future<Void> subtractorFuture = es.submit(s);

        adderFuture.get();
        subtractorFuture.get();

        es.shutdown();

        System.out.println(v.value);

    }
}
