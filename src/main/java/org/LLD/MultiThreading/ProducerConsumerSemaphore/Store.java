package org.LLD.MultiThreading.ProducerConsumerSemaphore;

import java.util.concurrent.ConcurrentLinkedDeque;

public class Store {
    int maxSize;

    ConcurrentLinkedDeque<Object> items;
    //List<Object> items;


    public Store(int maxSize) {
        this.maxSize = maxSize;
        this.items = new ConcurrentLinkedDeque<>();
    }

    public int getMaxSize() {
        return maxSize;
    }

    public ConcurrentLinkedDeque<Object> getItems() {
        return items;
    }

    public void addItem() {
        System.out.println("Producer production time, current size " + this.items.size());
        items.add(new Object());
    }

    public void deleteItem() {
        System.out.println("Consumer deletion time, current size " + this.items.size());
        items.remove(items.size() - 1);
    }
}
