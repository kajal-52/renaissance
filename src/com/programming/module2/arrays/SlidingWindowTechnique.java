package com.programming.module2.arrays;

public class SlidingWindowTechnique {
    public static void main(String[] args) {
        int[] arr={1, 2, -2,0,4};
        findSumOfAllSubarraysOfSizeK(arr,3,5);
    }
    private static void findSumOfAllSubarraysOfSizeK(int[] arr, int K, int N){
        int sum1=0;
        for (int i = 0; i < K; i++) {
            sum1+=arr[i];
        }
        System.out.println(sum1);
        for (int j = 0; j <N-K ; j++) {
            sum1=sum1+arr[j+K]-arr[j];
            System.out.println(sum1);
        }
    }
}
