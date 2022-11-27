package com.programming.module3.twopointers;

public class TargetDifferenceByBruteForce {
    public static void main(String[] args) {
        int[] values={5, 20, 3, 2, 5, 80};
        int targetDiff =75;
        boolean isPairFound=ifPairExists(values,targetDiff);
        System.out.println("If any such pair exists: "+isPairFound);
    }
    public static boolean ifPairExists(int[] values, int givenDiff){
        for (int i = 0; i <values.length ; i++) {
            for (int j = 0; j < values.length; j++) {
                int currentPairDiff=values[i]-values[j];
                if (i!=j&&currentPairDiff==givenDiff){
                    return true;
                }
            }
        }
        return false;
    }
}
