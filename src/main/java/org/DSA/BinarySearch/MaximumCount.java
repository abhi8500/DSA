package org.DSA.BinarySearch;

public class MaximumCount {

    private int positiveElementsCount(int[] nums){
        int n = nums.length;
        int l = 0;
        int r = n-1;

        int pos = -1;

        while(l <=r){
            int mid = l + (r-l)/2;
            if(nums[mid] > 0){
                pos = mid;
                r = mid-1;
            }else{
                l = mid + 1;
            }
        }



        return pos == -1 ? 0 : n - pos ;

    }

    private int negativeElementsCount(int[] nums){
        int n = nums.length;
        int l = 0;
        int r = n-1;

        int pos = -1;

        while(l <= r){
            int mid = l + (r-l)/2;
            if(nums[mid] < 0){
                pos = mid;
                l = mid+1;
            }else{
                r = mid - 1;
            }
        }


        return  pos + 1;

    }
    public int maximumCount(int[] nums) {

        int postiveElements = positiveElementsCount(nums);
        int negativeElements = negativeElementsCount(nums);

        return Math.max(postiveElements,negativeElements);
    }
}
