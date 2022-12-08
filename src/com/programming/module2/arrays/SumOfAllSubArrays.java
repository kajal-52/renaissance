package com.programming.module2.arrays;

import java.time.Duration;
import java.time.Instant;

//Time Complexity - O(N^3)
public class SumOfAllSubArrays {
    public static void main(String[] args) {
        int[] arr={1,2,3};
        Instant start=Instant.now();
        findAllSubArraySum(arr,arr.length);
        Instant end=Instant.now();
        System.out.println(Duration.between(start,end).getNano());
        findAllSubArraySumOptimized(arr,arr.length);
        Instant end2=Instant.now();
        System.out.println(Duration.between(end,end2).getNano());
    }
    private static void findAllSubArraySum(int[] arr, int N){
        int sum=0;
        for (int i = 0; i < N; i++) {
            for (int j = i; j <N ; j++) {
//                System.out.println(sum);
                sum+=getSumOfSubarray(i, j,arr);
            }
        }
        System.out.println("Sum of all possible subarrays is: "+ sum);
    }
    private static void findAllSubArraySumOptimized(int[] arr, int N){
        //O(N^2) solution
        int ans=0;
        for (int i = 0; i < N; i++) {
            int sum=0;
            for (int j = i; j <N ; j++) {
                sum+=arr[j];
                ans+=sum;
            }
        }
        System.out.println("Sum of all possible subarrays is: "+ ans);
    }

    private static int getSumOfSubarray(int i, int j, int[] a) {
        int s=0;
        for (int k = i; k <=j ; k++) {
            s+=a[k];
        }
//        System.out.println(s);
        return s;
    }
}
