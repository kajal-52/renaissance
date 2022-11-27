package com.programming.module3.twopointers;

import java.util.Arrays;

public class TargetDifferenceUsingBinarySearch {
    public static void main(String[] args) {
        int[] values={5, 20, 3, 2, 5, 80};
        int targetDiff =75;
        Arrays.sort(values);
        boolean found =ifPairFound(values,targetDiff);
        System.out.println("Found pair with given difference: "+found);
    }
    public static boolean ifPairFound(int[] values, int difference){
        for (int i = 0; i < values.length-1; i++) {
            int complementaryValue;
            if(difference>0){
                complementaryValue=difference+values[i];
            }else {
                complementaryValue=values[i]-difference;
            }
            boolean isFound=binarySearchForComplement(values, i+1,complementaryValue);
            if (isFound){
                return true;
            }
        }
        return false;
    }
    public static boolean binarySearchForComplement(int[] values, int lowIndex, int valueTobeFound){
        int highIndex= values.length-1;
        while (lowIndex<=highIndex){
            int midIndex=(lowIndex+highIndex)/2;
            int valueAtMidIndex=values[midIndex];
            if (valueAtMidIndex<valueTobeFound){
                lowIndex=midIndex+1;
            } else if (valueAtMidIndex>valueTobeFound) {
                highIndex=midIndex-1;
            }else {
                return true;
            }
        }
        return false;
    }

}
