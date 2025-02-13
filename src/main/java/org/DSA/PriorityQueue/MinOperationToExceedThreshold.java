package org.DSA.PriorityQueue;

import java.util.PriorityQueue;

public class MinOperationToExceedThreshold {

    public int minOperations(int[] nums, int k) {

        int minOperations = 0;

        PriorityQueue<Long> pq = new PriorityQueue<>();

        for (long num : nums) {
            pq.add(num);
        }

        while (!pq.isEmpty() && pq.peek() < k) {
            long firstMin = pq.remove();
            if (!pq.isEmpty()) {
                long secondMin = pq.remove();

                long addNum = firstMin * 2 + secondMin;
                pq.add(addNum);
                minOperations++;
            }

        }

        return minOperations;

    }
}
