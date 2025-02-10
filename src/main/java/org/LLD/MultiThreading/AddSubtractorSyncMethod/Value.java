package org.LLD.MultiThreading.AddSubtractorSyncMethod;

public class Value {

    int value = 0;

    synchronized void increamentBy(int i){
        value += i;
    }

    synchronized void decreamentBy(int i){
        value -= i;
    }
}
