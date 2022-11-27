package com.programming.module3.twopointers;

import java.util.ArrayList;
import java.util.List;
/*
Given an unsorted array A of size N that contains only non-negative integers,
find a continuous sub-array which adds to a given number S.
In case of multiple subarrays, return the subarray which comes first on moving from left to right.

 */

public class SubarrayWithGivenSumTwoPointers {
    public static void main(String[] args) {
        int[] values={5, 2,4,6, 0};
        int givenSum=15;
        List<Integer> indices=isSubArrayFound(values,givenSum);
//        if (indices.isEmpty()){
//            System.out.println("No subarray found");
//        }
        for (Integer i: indices) {
            System.out.println(i);
        }
    }
    public static List<Integer> isSubArrayFound(int[] array, int sum){
        List<Integer> indices=new ArrayList<>();
        int currentSum=array[0];
        int startPointer=0;
        int endPoiter=0;
        while (endPoiter<array.length){
            if (currentSum>sum){
                currentSum-=array[startPointer];
                startPointer++;
                if (startPointer>endPoiter){
                    endPoiter++;
                    if(endPoiter<array.length){
                        currentSum=array[endPoiter];
                    }
                }

            } else if (currentSum<sum) {
                endPoiter++;
                if (endPoiter<array.length){
                    currentSum+=array[endPoiter];
                }
            }else {
                indices.add(startPointer);
                indices.add(endPoiter);
                return indices;
            }
        }
        indices.add(-1);
        return indices;
    }
}
