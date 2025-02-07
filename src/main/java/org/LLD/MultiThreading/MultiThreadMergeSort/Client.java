package org.LLD.MultiThreading.MultiThreadMergeSort;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Client {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        List<Integer> arr = List.of(4,2,1,23,2,45,1);

        /// As the thread size varies based on Array size that's why better create CachedThread pool here
        /// instead of fixedThread poll.
        ExecutorService es = Executors.newCachedThreadPool();
        Sorter sorter = new Sorter(arr,es);

        Future<List<Integer>> futureAns = es.submit(sorter);

        System.out.println(futureAns.get());

        es.shutdown();
    }
}
