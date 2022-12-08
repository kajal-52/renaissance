package com.programming.module4.hashing;

import java.util.HashMap;
import java.util.Map;
/*
Given an array arr of N integers, and an integer K,
Determine whether or not there exist two elements in arr whose sum is exactly K.
 */
public class PairSumInArray {
    public static void main(String[] args) {
        int[] arr={2,7,9,4,-3};
        int sum=14;
        boolean val=ifFoundPairFound(arr,sum);
        System.out.println(val);
    }
    private static boolean ifFoundPairFound(int[] arr, int target){
        Map<Integer, Integer> pair=new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (!pair.containsKey(arr[i])){
                pair.put(arr[i], 1);
            }else
                pair.put(arr[i], pair.get(arr[i])+1);
        }
        for (int j = 0; j < arr.length; j++) {
            if (pair.containsKey(target-arr[j])){
                int val=target-arr[j];
                if (val==arr[j] && pair.get(arr[j])>1)
                    return true;
                else if(val!=arr[j])
                    return true;
            }
        }
        return false;
    }
}
