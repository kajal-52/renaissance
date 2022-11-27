package com.programming.module3.twopointers;

import java.util.Arrays;

public class NumberOfPairsWithDifference {
    public static void main(String[] args) {
        int[] values={5, 20, 3, 2, 5, 80};
        int targetDiff =75;
        sortGivenValues(values);
        int numberOfPairs=isPairWithGivenDiffFound(values,targetDiff);
        System.out.println("Number of pairs with given sum : "+numberOfPairs);
    }
    public static void sortGivenValues(int[] values){
        Arrays.sort(values);
    }
    public static int isPairWithGivenDiffFound(int[] values, int targetDiff){
        int numberOfPairs=0;
        int firstPointer=0;
        int secondPointer= 1;
        while (secondPointer<values.length){
            System.out.println(firstPointer+" "+secondPointer);
            int currentPairDiff=values[secondPointer]-values[firstPointer];
            System.out.println(currentPairDiff);
            if (currentPairDiff<targetDiff){
                secondPointer++;
            }else if(currentPairDiff>targetDiff){
                firstPointer++;
                if (firstPointer==secondPointer){
                    secondPointer++;
                }
            }else {
                int c1=0;
                int val1=values[firstPointer];
                int val2=values[secondPointer];
                if(targetDiff==0){
                    System.out.println("inside diff 0");
                    while (val1==values[firstPointer]){
                        c1++;
                        firstPointer++;
                        secondPointer++;
                    }
                    numberOfPairs+=c1*(c1-1)/2;
                    break;
                }else {
                    System.out.println(firstPointer+" "+ secondPointer);
                    int count1=0;
                    int count2=0;
                    while (val1==values[firstPointer]){
                        firstPointer++;
                        count1++;
                    }
                    while (val2==values[secondPointer]){
                        count2++;
                    }
                    numberOfPairs+=count1*count2;
                }
            }
        }
        return numberOfPairs;
    }
}
