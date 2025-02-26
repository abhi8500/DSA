package org.LLD.MultiThreading.TreeSizeCalculator;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

    public class TreeSizeCalculator implements Callable<Integer> {

        private Node root;

        ExecutorService es;

        public TreeSizeCalculator(Node root,ExecutorService es){
            this.root = root;
            this.es = es;
        }


        @Override
        public Integer call() throws ExecutionException, InterruptedException {
            if (root == null){
                return 0;
            }
            TreeSizeCalculator leftTree = new TreeSizeCalculator(root.getLeft(),es);
            TreeSizeCalculator rightTree = new TreeSizeCalculator(root.getRight(),es);

            Future<Integer> leftTreeFuture = es.submit(leftTree);
            Future<Integer> rightTreeFuture = es.submit(rightTree);

            return leftTreeFuture.get() + rightTreeFuture.get() + 1;

        }
    }
