package com.programming.module3.twopointers;
/*
Finding pairs for a given sum in array using brute force approach i.e. considering all possible pairs and its sum
(i) -whether such pair exists or not
(ii)- how many such pairs exist in the array
Time complexity -O(N^2)
 */
public class TargetSumBruteForce {
    public static void main(String[] args) {
        int[] values={1, 5, 7, 1, 9};
        int targetSum =11;
        boolean isPairFound=ifPairExists(values,targetSum);
        System.out.println("If any such pair exists: "+isPairFound);
    }
    public static boolean ifPairExists(int[] values, int givenSum){
        for (int i = 0; i <values.length ; i++) {
            for (int j = i+1; j < values.length; j++) {
                int currentPairSum=values[i]+values[j];
                if (currentPairSum==givenSum){
                    return true;
                }
            }
        }
        return false;
    }
}
