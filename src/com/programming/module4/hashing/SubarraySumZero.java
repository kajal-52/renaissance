package com.programming.module4.hashing;

import java.util.HashMap;
import java.util.Map;
/*
Given an array arr of positive and negative numbers. Find if there is a subarray
(of size at-least one) with 0 sum.
 */
public class SubarraySumZero {
    public static void main(String[] args) {
        int[] arr={6,-1,2,1,-1};
        boolean res=findIfSubarrayWithSumZero(arr,5);
        System.out.println(res);
    }
    private static boolean findIfSubarrayWithSumZero(int[] arr, int N){
        Map<Integer,Integer> prefixSPair=new HashMap<>();
        int prefixSum=0;
        prefixSPair.put(prefixSum,1);
        for (int i = 0; i <N ; i++) {
            prefixSum+=arr[i];
            if (prefixSPair.containsKey(prefixSum))
                return true;
            else
                prefixSPair.put(prefixSum,1);
        }
        return false;
    }
}
