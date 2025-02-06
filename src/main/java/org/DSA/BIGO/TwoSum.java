package org.DSA.BIGO;

import java.util.*;

class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> resultMap = new HashMap<>();
        for(int i=0;i < nums.length;i++){
            if(resultMap.containsKey(Integer.valueOf(target - nums[i]))){
                return new int[]{i,resultMap.get(target - nums[i] )};
            }
            resultMap.put(nums[i],i);
        }
        return new int[]{};
    }

    public static void main(String[] args){
        int[] nums = {2,7,11,15};
        int target = 9;
        System.out.println(Arrays.toString(TwoSum.twoSum(nums, target)));

    }
}