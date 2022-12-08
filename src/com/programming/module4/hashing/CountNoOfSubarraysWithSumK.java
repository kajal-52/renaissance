package com.programming.module4.hashing;

import java.util.HashMap;
import java.util.Map;

public class CountNoOfSubarraysWithSumK {
    public static void main(String[] args) {
        int[] arr={1,2,3};
        int K=3;
        findIfSubarrayWithSumK(arr, arr.length, K );
    }
    private static void findIfSubarrayWithSumK(int[] arr, int N, int K){
        Map<Integer,Integer> prefixSPair=new HashMap<>();
        int prefixSum=0;
        int cnt=0;
        prefixSPair.put(prefixSum,1);
        for (int i = 0; i <N ; i++) {
            System.out.println(cnt);
            prefixSum+=arr[i];
            if (prefixSPair.containsKey(prefixSum-K)) {
                Integer freq = prefixSPair.get(prefixSum-K);
                cnt+=freq;
                prefixSPair.put(prefixSum, freq+1);
            }
            else
                prefixSPair.put(prefixSum,1);
        }
        System.out.println(prefixSPair);
        System.out.println(cnt);
    }

}
