package org.DSA.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class ProductOfLastKNums {

    List<Integer> nums;
    int totalProduct;
    int lastZero;
    int size;

    /// Initialization constructor
    public ProductOfLastKNums(){
        nums = new ArrayList<>();
        totalProduct = 1;
        lastZero = -1;
        size = 0;
    }


    public void add(int num) {
        size++;
        if (num == 0){
            totalProduct = 1;
            lastZero = size-1;
            nums.add(0);
        }else {
            totalProduct *= num;
            nums.add(totalProduct);
        }

    }

    public int getProduct(int k) {

        int startIndex = size - k;
        if (startIndex <= lastZero)
            return 0;

        return lastZero == startIndex-1 ? totalProduct : totalProduct/nums.get(startIndex-1);
    }

}
