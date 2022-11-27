package com.programming.module2.recursion;

/**
 * Given an array of distinct integers candidates and a target integer target,
 * return a number of unique combinations of candidates where the chosen numbers sum to target.
 */
public class SubsetSum2 {
    public static void main(String[] args) {
        int[] arr= {2,3,6,7};
        int sum =7;
        SubsetSum2 sum1=new SubsetSum2();
        int output=sum1.countSubsets(0,sum,arr);
        System.out.println(output);
    }
    private int countSubsets(int i, int targetSum, int[] arr){
        if(targetSum==0){
            return 1;
        }
        if (targetSum<0||i==arr.length){
            return 0;
        }
        return countSubsets(i,targetSum-arr[i],arr)+countSubsets(i+1,targetSum,arr);
    }
}
