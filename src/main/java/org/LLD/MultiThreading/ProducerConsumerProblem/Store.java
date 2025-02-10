package org.LLD.MultiThreading.ProducerConsumerProblem;

import java.util.ArrayList;
import java.util.List;

public class Store {
    int maxSize;
    List<Object> items;

    public Store(int maxSize){
        this.maxSize = maxSize;
        this.items = new ArrayList<>();
    }

    public int getMaxSize() {
        return maxSize;
    }

    public List<Object> getItems() {
        return items;
    }

    public void addItem(){
        System.out.println("Producer production time, current size "+this.items.size());
        items.add(new Object());
    }
    public void deleteItem(){
        System.out.println("Consumer deletion time, current size "+this.items.size());
        items.remove(items.size()-1);
    }
}
