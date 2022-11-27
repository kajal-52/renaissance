package com.programming.module3.bitwise;

/**
 * find minimum xor for a given integer array
 *
 */
public class MinimumXOR {
    public static void main(String[] args) {
        int[] arr={34, 2, 5,7 ,77};
        findMinimumXOR(arr,5);
    }
    private static int findMinimumXOR(int[] values, int n){
        //O(n^2) Brute force approach
        int minXor= Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                int currentXOR=values[i]^values[j];
                if(minXor>currentXOR){
                    minXor=currentXOR;

                }
                System.out.println(minXor);
            }
        }
        System.out.println(minXor);
        return minXor;
    }
    private static void findMinXORBItManipulation(int[] arr, int n){
        
    }
}
