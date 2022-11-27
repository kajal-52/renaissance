package com.programming.module3.twopointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/*
Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]]
such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.
Notice that the solution set must not contain duplicate triplets.
Time Complexity =O(N^3)
 */
public class TripletSumBruteForce {
    public static void main(String[] args) {
       int[] values={-5,0,1,1,2,3,3,4,4};
       List<List<Integer>> tripletsPairs=isTripletExists(values, 9);
        for (List<Integer> integers:tripletsPairs
             ) {
            System.out.println(integers.toString());
        }
    }
    public static List<List<Integer>> isTripletExists(int[] arr, int n){
        List<List<Integer>> triplets=new ArrayList<>();
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                for (int k = j+1; k <n ; k++) {
                    if (arr[i]+arr[j]+arr[k]==0){
//                        System.out.println(arr[i]+" "+arr[j]+" " +arr[k]);
                        List<Integer> res=Arrays.asList(arr[i],arr[j],arr[k]);
                        if(!triplets.contains(res)){
                            triplets.add(res);
                        }
                    }
                }
            }
        }
        return triplets;
    }
}
