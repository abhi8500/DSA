package org.DSA.TwoPointers;

import java.util.ArrayList;
import java.util.List;

public class PartitionLabels {

    public List<Integer> partitionLabels(String s) {
        List<Integer> partitions = new ArrayList<>();

        int[] partitionLastIndexes = new int[26];

        for(int i=0;i<s.length();i++){
            partitionLastIndexes[s.charAt(i) - 'a'] = i;
        }

        int partitionStart = 0;
        int partitionEnd = 0;

        for(int i=0;i<s.length();i++){
            partitionEnd = Math.max(partitionEnd,partitionLastIndexes[s.charAt(i) - 'a']);
            if(i == partitionEnd){
                partitions.add(partitionEnd - partitionStart + 1);
                partitionStart = partitionEnd+1;
            }
        }

        return partitions;
    }
}
