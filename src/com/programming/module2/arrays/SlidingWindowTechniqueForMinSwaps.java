package com.programming.module2.arrays;

public class SlidingWindowTechniqueForMinSwaps {
    public static void main(String[] args) {
        int[] arr={2,1,5,6,3};
        int K=3;
        findMinSwapsRequired(arr,K);
    }
    private static int findMinSwapsRequired(int[] arr, int K){
        int cntLegalElements=0;
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i]<=K)
                cntLegalElements++;
        }
        System.out.println(cntLegalElements);
        int max=Integer.MIN_VALUE;
        int countElementsInSubarray=0;
        for (int j = 0; j < cntLegalElements; j++) {
            if (arr[j]<=K){
                countElementsInSubarray++;
            }
        }
        System.out.println(countElementsInSubarray);
        max=countElementsInSubarray;
        for (int j = cntLegalElements; j < arr.length; j++) {
            if (arr[j]<=K){
                countElementsInSubarray++;
            }
            if (arr[j-cntLegalElements]<=K)
                countElementsInSubarray--;
            max=Math.max(max,countElementsInSubarray);
        }
        System.out.println(cntLegalElements-max);
        return cntLegalElements-max;
    }
}
