package org.LLD.MultiThreading.ArrayCreator;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

public class ArrayCreator implements Callable<List<Integer>> {

    private int n;

    public ArrayCreator(int n){
        this.n = n;
    }

    @Override
    public List<Integer> call() throws Exception {

        List<Integer> ansList = new ArrayList<>();

        for (int i=1;i<=n;i++){
            ansList.add(i);
        }
        return ansList;
    }
}
