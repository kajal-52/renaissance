package com.programming.module2.arrays;

public class SlidingWindowTechniqueForFrequency {
    public static void main(String[] args) {
        int[] arr={2,2,1,2,4,6,2};
        int K=4;
        int x=2;
        findFreqOfElementInSizeKSubarray(arr,x,K);
    }
    private static void findFreqOfElementInSizeKSubarray(int[] arr, int x, int K){
        int freq=0;
        for (int i = 0; i < K; i++) {
            if (x==arr[i]){
                freq++;
            }
        }
        System.out.println(freq);
        for (int j = K; j < arr.length ; j++) {
            if (arr[j]==x){
                freq++;
            }
            if (arr[j-K]==x){
                freq--;
            }
            System.out.println(freq);
        }
    }
}
