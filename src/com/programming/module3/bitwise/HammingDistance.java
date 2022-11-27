package com.programming.module3.bitwise;

/**
 * The Hamming distance between two integers is the number of positions at which the
 * corresponding bits are different.
 * Given an integer array nums, return the sum of Hamming distances between all
 * the pairs of the integers in nums.
 */
public class HammingDistance {
    public static void main(String[] args) {
        int[] arr={4, 5, 2};
        hammingDistanceBitManipulation(arr);
    }
//    private static int hammingDistanceForArray(int[] arr){
//        int ans =0;
//        for (int i = 0; i <arr.length ; i++) {
//            for (int j = i+1; j <arr.length ; j++) {
//                ans+=hammingDistance(arr[i],arr[j]);
//            }
//        }
//    }
//
//    private static int hammingDistance(int a, int b) {
//
//    }
    private static void hammingDistanceBitManipulation(int[] arr){
        //TC -- O(32)*O(N)
        int n=arr.length;
        int ans=0;
        long mask=(1l<<31);
        for (int i = 31; i >=0 ; i--) {
            int count=0;
            for (int j = 0; j < n; j++) {
                if((mask&arr[j])!=0){
                    count++;
                }
            }
            ans+=count*(n-count);
            mask>>=1;
        }
        System.out.println(ans);
    }
}
