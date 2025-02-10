package org.LLD.MultiThreading.AddSubtractorSyncMethod;

import java.util.concurrent.Callable;

public class Subtractor implements Callable<Void> {

    Value v;

    public Subtractor(Value v){
        this.v = v;
    }


    @Override
    public Void call() throws Exception {
        for (int i=1;i<=10000;i++){
            this.v.decreamentBy(i);
        }
        return null;
    }
}
