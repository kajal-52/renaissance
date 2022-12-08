package com.programming.module4.hashing;

import java.util.HashMap;
import java.util.Map;

/*
Given an integer array nums and an integer k, return the number of non-empty subarrays that
have a sum divisible by k.

 */
public class SubarrayWithSumDivisbleByK {
    public static void main(String[] args) {
        long[] arr={10,5,2,7,1,9};
        long sum=15;
        findMaxLengthOfSubarray(arr, arr.length,sum);

    }
    private static void findMaxLengthOfSubarray(long[] arr, int N, long K){
        Map<Long, Integer> pair=new HashMap<>();
        Long pSum=0l;
        int maxLen=0;
        pair.put(pSum, -1);
        for (int i = 0; i <N ; i++) {
            pSum+=arr[i];
            if (!pair.containsKey(pSum-K)){
                pair.put(pSum, i);
            }else{
                maxLen=i-pair.get(pSum-K);
            }
        }
        System.out.println(maxLen);
    }
}
