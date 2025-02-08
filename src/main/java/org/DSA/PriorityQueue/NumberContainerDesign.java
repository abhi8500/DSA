package org.DSA.PriorityQueue;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class NumberContainerDesign {

    Map<Integer, Integer> indexesMap;
    Map<Integer, PriorityQueue<Integer>> numberContainerMap;

    public NumberContainerDesign() {
        indexesMap = new HashMap<>();
        numberContainerMap = new HashMap<>();
    }

    public void change(int index, int number) {
        indexesMap.put(index, number);
        numberContainerMap.computeIfAbsent(number, k -> new PriorityQueue<>()).add(index);
    }

    public int find(int number) {
        if (!numberContainerMap.containsKey(number)) {
            return -1;
        }
        PriorityQueue<Integer> minHeap = numberContainerMap.get(number);
        while (!minHeap.isEmpty()) {
            int index = minHeap.peek();

            if (indexesMap.get(index) == number) {
                return index;
            }

            minHeap.poll();
        }
        return -1;
    }
}
