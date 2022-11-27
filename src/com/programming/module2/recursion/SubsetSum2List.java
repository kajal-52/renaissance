package com.programming.module2.recursion;

import java.util.ArrayList;
import java.util.List;

/**
 * Given an array of distinct integers candidates and a target integer target,
 * return a list of all unique combinations of candidates where the chosen numbers sum to target.
 * You may return the combinations in any order.
 */
public class SubsetSum2List {
    private static List<List<Integer>> LIST_OF_SUBSETS=new ArrayList<>();

    public static void main(String[] args) {
        int[] arr= {2,3,6,7};
        int sum =7;
        SubsetSum2List sum1=new SubsetSum2List();
        sum1.ListOfSubsets(0, sum,arr);
        for (List<Integer> l:LIST_OF_SUBSETS
             ) {
            System.out.println(l);
        }
    }
    private void ListOfSubsets(int i, int targetSum, int[] arr){
        List<Integer> list=new ArrayList<>();
        if(targetSum==0){
            LIST_OF_SUBSETS.add(list);
            list=new ArrayList<>();
        }
        if (targetSum<0||i==arr.length){
            list=new ArrayList<>();
        }
        if (targetSum>0&&i<arr.length){
            list.add(arr[i]);
        }
        ListOfSubsets(i,targetSum-arr[i],arr);
        ListOfSubsets(i+1,targetSum,arr);
    }
}
