package com.programming.module3.twopointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/*
Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that
i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.
Notice that the solution set must not contain duplicate triplets.
Time complexity = O(NlogN+N*2N)
               = O(N^2)
 */
public class TripletSumTwoPointers {
    public static void main(String[] args) {
        int[] arr={-1,0,1,2,-1,-4};
        int N=6;
        Arrays.sort(arr);
        List<List<Integer>> tripletsPairs =getTriplets(arr,N);
        for (List<Integer> l:tripletsPairs) {
            System.out.println(l.toString());
        }
    }
    public static List<List<Integer>> getTriplets(int[] arr, int n){
        List<List<Integer>> triplets=new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int complementSum=-arr[i];
            if(i>0 && arr[i]==arr[i-1]){
                continue;
            }
            pairsWithGivenSum(i+1,arr,complementSum, triplets);
        }
        return triplets;
    }
    public static void pairsWithGivenSum(int idx,int[] arr, int sum, List<List<Integer>> triplets){
        int startPointer=idx;
        int endPointer=arr.length-1;
        while (startPointer<endPointer){
            int currentSum=arr[startPointer]+arr[endPointer];
//            System.out.println("sum found "+currentSum);
            if (currentSum<sum){
                startPointer++;
            }else if(currentSum>sum){
                endPointer--;
            }else {
                int val1=arr[startPointer];
                int val2=arr[endPointer];
                List<Integer> res= Arrays.asList(val1,val2,-sum);
                if(!res.isEmpty()){
                    triplets.add(res);
                }
                if (val1==val2){
                    break;
                }
                while (val1==arr[startPointer]){
                    startPointer++;
                }
                while (val2==arr[endPointer]){
                    endPointer--;
                }
            }
        }
    }
}
