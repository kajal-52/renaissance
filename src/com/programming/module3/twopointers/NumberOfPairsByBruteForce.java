package com.programming.module3.twopointers;

/**
 * Given an array and target sum, count such pairs which have sum equal to given sum
 * Time complexity is O(n^2)
 */
public class NumberOfPairsByBruteForce {
    public static void main(String[] args) {
        int[] values={1,5,7,1, 2, 4};
        int targetSum =6;
        int numberOfPairs=countPairsWithGivenSum(values, targetSum);
        System.out.println(numberOfPairs);

    }
    public static int countPairsWithGivenSum(int[] arr, int sum){
        int count =0;
        for (int i = 0; i <arr.length ; i++) {
            for (int j = i+1; j <arr.length ; j++) {
                if(arr[i]+arr[j]==sum){
                    count++;
                }
            }
        }
        return count;
    }

}
