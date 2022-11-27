package com.programming.module3.twopointers;

public class TripletSumClosestBruteForce {
    public static void main(String[] args) {
        int[] values={-1,2,1,-4};
        int targetSum=1;
        int sum=isTripletWithClosestSumFound(values,targetSum, values.length);
        System.out.println(sum);

    }
    public static int isTripletWithClosestSumFound(int[] unsortedValues, int target, int n){
        int minSum= Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j <n ; j++) {
                for (int k = j+1; k <n ; k++) {
                    int currentDifference=target-(unsortedValues[i]+unsortedValues[j]+unsortedValues[k]);
                    if (currentDifference<minSum){
                        minSum=target-currentDifference;
                    }
                }
            }
        }
        return minSum;
    }
}
