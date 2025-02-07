package org.LLD.MultiThreading.ThreadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Client {

    public static void main(String[] args) {

        /// Provide no of threads you want to create,as a parameter to newFixedThreadPool method then executor will create those many threads.
        ExecutorService es  = Executors.newFixedThreadPool(10);

        /// If we want to create threads dynamically based on no of tasks then use cachedThread pool
        ExecutorService cacheEs = Executors.newCachedThreadPool();

        for (int i=1;i<=100;i++){
            if (i == 80){
                continue;
            }
            NumberPrinter numberPrinter = new NumberPrinter(i);
            es.execute(numberPrinter);
        }

        /// If we don't write shutdown then Jvm keep it until we stop the JVM
        es.shutdown();
    }
}
