package com.programming.module3.twopointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 */
public class IntersectionOfTwoArrays {
    public static void main(String[] args) {
        int m=4;
        int n=2;
        int[] arr1={1, 2, 2,1};
        int[] arr2={2,2};
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        List<Integer> sortedVal=unionOfTwoArrays(arr1,arr2,m,n);
        int[] array=new int[sortedVal.size()];
        for (int i = 0; i <sortedVal.size() ; i++) {
            System.out.println(sortedVal.get(i));
            array[i]=sortedVal.get(i);
        }
    }
    public static List<Integer> unionOfTwoArrays(int[] arr1, int[] arr2, int m, int n){
        List<Integer> uniqueValues=new ArrayList();
        int i=0;
        int j=0;
         while (i<m&&j<n){
            if(arr1[i]<arr2[j]){
                i++;
            }else if (arr1[i]>arr2[j]){
                j++;
            }else {
                if(!uniqueValues.contains(arr1[i])) {
                    uniqueValues.add(arr1[i]);
                }
                i++;
                j++;
            }
        }
        return uniqueValues;
    }
}
