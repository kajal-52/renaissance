package com.programming.module3.bitwise;

/**
 * Given an integer array nums where every element appears three times except for one,
 * which appears exactly once. Find the single element and return it.
 */
public class OddOneOut2 {

    public static void main(String[] args) {
        int[] arr={11,3,10,11,11,3,3,10,10,9};
        findOddOeOutUsingBitManipulation(arr);
    }
    private static void findOddOeOutUsingBitManipulation(int[] arr) {
        //O(32)*O(N)- TC
        long mask= (1l<<31);
        int ans=0;
        for (int i = 31; i >=0 ; i--) {
            int cnt=0;
            for (int j=0;j<arr.length;j++){
                if((arr[j]&mask)!=0){
                    cnt++;
                }
            }
            if (cnt%3!=0){
                ans+=mask;
            }
            mask>>=1;
        }
        System.out.println(ans);
        }
    }