//package com.programming.module3.twopointers;
//
//public class TripletSumClosestTwoPointers {
//    public static void main(String[] args) {
//        int[] values={-1,2,1,-4};
//        int targetSum=1;
//        int sum=isTripletWithClosestSumFoundPointers(values,targetSum, values.length);
//        System.out.println(sum);
//    }
//    public static int isTripletWithClosestSumFoundPointers(int[] arr, int target, int n) {
//        int MinDiff = Integer.MAX_VALUE;
//        int startPointer = 0;
//        int endPointer = n - 1;
//        while (startPointer < endPointer) {
//            int currentSum = arr[startPointer] + arr[endPointer];
////            System.out.println("sum found "+currentSum);
//            if (minDiff < target - currentSum) {
//                startPointer++;
//            } else if (currentSum > target) {
//                endPointer--;
//            } else {
//                int val1 = arr[startPointer];
//                int val2 = arr[endPointer];
//                if (val1 == val2) {
//                    break;
//                }
//                while (val1 == arr[startPointer]) {
//                    startPointer++;
//                }
//                while (val2 == arr[endPointer]) {
//                    endPointer--;
//                }
//            }
//
//        }
//    }
//}
