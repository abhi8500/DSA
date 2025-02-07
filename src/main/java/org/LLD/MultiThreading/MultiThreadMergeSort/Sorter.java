package org.LLD.MultiThreading.MultiThreadMergeSort;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class Sorter implements Callable<List<Integer>> {

    private final List<Integer> arrayToSort;
    private ExecutorService es;

    public Sorter(List<Integer> arrayToSort,ExecutorService es){
        this.arrayToSort = arrayToSort;
        this.es = es;
    }

    @Override
    public List<Integer> call() throws ExecutionException, InterruptedException {

        if (arrayToSort.size() <= 1){
            return arrayToSort;
        }
        int mid = arrayToSort.size()/2;

        List<Integer> leftArray = new ArrayList<>();
        List<Integer> rightArray = new ArrayList<>();

        for (int i=0;i<mid;i++){
            leftArray.add(arrayToSort.get(i));
        }

        for (int i=mid;i<arrayToSort.size();i++){
            rightArray.add(arrayToSort.get(i));
        }

        Sorter leftArraySorter = new Sorter(leftArray,es);
        Sorter rightArraySorter = new Sorter(rightArray,es);

        /// Creating new executor service everytime is overhead .
        // ExecutorService es = Executors.newFixedThreadPool(2);


        /// Runnable --> execute
        /// Callable --> submit
        Future<List<Integer>> sortedLeftArrayFuture = es.submit(leftArraySorter);
        Future<List<Integer>> sortedRightArrayFuture = es.submit(rightArraySorter);

        List<Integer> sortedLeftArr = sortedLeftArrayFuture.get();
        List<Integer> sortedRightArr = sortedRightArrayFuture.get();

        es.shutdown();

        return getIntegers(sortedLeftArr, sortedRightArr);
    }

    /// Merge logic
    private static List<Integer> getIntegers(List<Integer> sortedLeftArr, List<Integer> sortedRightArr) {
        List<Integer> mergedArr = new ArrayList<>();
        int i=0;
        int j=0;

        while (i < sortedLeftArr.size() && j < sortedRightArr.size()){
            if (sortedLeftArr.get(i) <= sortedRightArr.get(j)){
                mergedArr.add(sortedLeftArr.get(i++));
            }else {
                mergedArr.add(sortedRightArr.get(j++));
            }
        }

        while (i < sortedLeftArr.size()){
            mergedArr.add(sortedLeftArr.get(i++));
        }

        while (j < sortedRightArr.size()){
            mergedArr.add(sortedRightArr.get(j++));
        }
        return mergedArr;
    }
}
