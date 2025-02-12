package org.DSA.PriorityQueue;

import java.util.PriorityQueue;

public class PairWithEqualSum {

    public int maximumSum(int[] nums) {

        /// As digits sum will go max 82
       PriorityQueue<Integer>[] priorityQueues = new PriorityQueue[82];

       for(int i=0;i<82;i++){
           priorityQueues[i] = new PriorityQueue<>();
       }

       for (int num : nums){
           int digitsSum = sumDigits(num);
           priorityQueues[digitsSum].add(num);

           /// Keep only 2 max elements in each maxHeap
           if (priorityQueues[digitsSum].size() > 2){
               priorityQueues[digitsSum].poll();
           }
       }

       int maxPairSum = -1;
       for (PriorityQueue<Integer> minHeap : priorityQueues){
           if (minHeap.size() == 2) {
               int first = minHeap.poll();
               int second = minHeap.poll();
               maxPairSum = Math.max(maxPairSum, first + second);
           }
       }


        return maxPairSum;

    }

    private int sumDigits(int num){

        int sum = 0;

        while(num > 0){
            sum += num%10;
            num /= 10;
        }

        return sum;
    }
}
