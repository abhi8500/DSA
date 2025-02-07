package org.LLD.MultiThreading.ArrayCreator;

import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Client {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        ArrayCreator arrayCreator = new ArrayCreator(n);
        ExecutorService es = Executors.newFixedThreadPool(1);

        Future<List<Integer>> futureAnsList = es.submit(arrayCreator);
        System.out.println(futureAnsList.get());

        es.shutdown();

    }
}
