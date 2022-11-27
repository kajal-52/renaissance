package com.programming.module3.twopointers;

import java.util.Arrays;

public class NumberOfPairsUsingTwoPointers {
    public static void main(String[] args) {
        int[] values={1,5,7,1};
        int targetSum =6;
        sortGivenValues(values);
        int numberOfPairs=isPairWithGivenSumFound(values,targetSum);
        System.out.println("Number of pairs with given sum : "+numberOfPairs);
    }
    public static void sortGivenValues(int[] values){
        Arrays.sort(values);
    }
    public static int isPairWithGivenSumFound(int[] values, int targetSum){
        int numberofPairs=0;
        int firstPointer=0;
        int secondPointer= values.length-1;
        while (firstPointer<secondPointer){
            int currentPairSum=values[firstPointer]+values[secondPointer];
            if (currentPairSum<targetSum){
                firstPointer++;
            }else if(currentPairSum>targetSum){
                secondPointer--;
            }else {
                int val1=values[firstPointer];
                int val2=values[secondPointer];
                if(val1==val2){
                    int l=secondPointer-firstPointer+1;
                    numberofPairs+=l*(l-1)/2;
                    break;
                }else {
                    int count1=0;
                    int count2=0;
                    while (val1==values[firstPointer]){
                        firstPointer++;
                        count1++;
                    }
                    while (val2==values[secondPointer]){
                        secondPointer--;
                        count2++;
                    }
                    numberofPairs+=count1*count2;
                }
            }
        }
        return numberofPairs;
    }
}
