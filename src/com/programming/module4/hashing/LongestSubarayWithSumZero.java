package com.programming.module4.hashing;

import java.util.HashMap;
import java.util.Map;
/*
Given an array arr of positive and negative numbers. The task is to compute the length of the largest
subarray with sum 0. If no subarray of sum 0 is present then output 0.
 */
public class LongestSubarayWithSumZero {
    public static void main(String[] args) {
        int[] arr={2,1,4,-3,-2,3,-1,-2,6};
        findMaxLengthOfSubarray(arr, arr.length);

    }
    private static void findMaxLengthOfSubarray(int[] arr, int N){
        Map<Integer, Integer> pair=new HashMap<>();
        int pSum=0;
        int maxLen=0;
        pair.put(pSum, -1);
        for (int i = 0; i <N ; i++) {
            pSum+=arr[i];
            if (!pair.containsKey(pSum)){
                pair.put(pSum, i);
            }else{
                maxLen=i-pair.get(pSum);
            }
        }
        System.out.println(maxLen);
    }
}
