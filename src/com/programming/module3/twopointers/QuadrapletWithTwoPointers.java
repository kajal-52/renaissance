package com.programming.module3.twopointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/*

 */
public class QuadrapletWithTwoPointers {
    public static void main(String[] args) {
        int[] arr={1000000000,1000000000,1000000000,1000000000};
        int n= 4;
        int target=-294967296;
        Arrays.sort(arr);
        List<List<Integer>> quadruplets=getQuadraplets(arr,n,target);
        for (List<Integer> q:quadruplets) {
            System.out.println(q);
        }
    }
    public static List<List<Integer>> getQuadraplets(int[] arr, int n, int target){
        List<List<Integer>> quadraplets=new ArrayList<>();
        for (int i= 0; i < n; i++) {
            if (i>0&&arr[i]==arr[i-1]){
                continue;
            }
            for (int j = i+1; j < n; j++) {
                long complementSum=(long) target-(arr[i]+arr[j]);
//                System.out.println(complementSum);
                if (j>i+1&&arr[j]==arr[j-1] ){
                    continue;
                }
                int startPointer=j+1;
                int endPointer=arr.length-1;
                while (startPointer<endPointer){
                    int currentSum=arr[startPointer]+arr[endPointer];
//            System.out.println("sum found "+currentSum);
                    if (currentSum<complementSum){
                        startPointer++;
                    }else if(currentSum>complementSum){
                        endPointer--;
                    }else {
                        int val1=arr[startPointer];
                        int val2=arr[endPointer];
                        List<Integer> res= Arrays.asList(val1,val2,arr[i],arr[j]);
                        if(!res.isEmpty()){
                            quadraplets.add(res);
                        }
                        if (val1==val2){
                            break;
                        }
                        while (val1==arr[startPointer]){
                            startPointer++;
                        }
                        while (val2==arr[endPointer]){
                            endPointer--;
                        }
                    }
                }
            }
            }
        return quadraplets;
        }
}

