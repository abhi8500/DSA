package org.LLD.MultiThreading.ThreadCallable;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Client {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        Node leftNode = new Node(null,null,2);
        Node rightNode = new Node(null,null,5);
        Node rootNode = new Node(leftNode,rightNode,10);


        ExecutorService es = Executors.newCachedThreadPool();
        TreeSizeCalculator treeSizeCalculator = new TreeSizeCalculator(rootNode,es);
        Future<Integer> treeSize = es.submit(treeSizeCalculator);

        System.out.println(treeSize.get());

        es.shutdown();
    }
}
