package com.programming.module2.arrays;

public class SumOfAllSubArraysReverseLookup {
    public static void main(String[] args) {
        int[] arr={1,2,3};
        findAllSubArraySum(arr, arr.length);
    }
    private static void findAllSubArraySum(int[] arr, int N){
        //O(N)
        long m= 10000007;
        long sum=0;
        for (int i = 0; i < N; i++) {
            long contri = (((i+1)%m*(N-i)%m)%m*(arr[i]%m))%m;
            sum=(sum%m+contri%m)%m;
        }
        System.out.println("Sum of all possible subarrays is: "+ sum);
    }
}
