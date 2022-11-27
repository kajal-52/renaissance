package com.programming.module3.twopointers;

import java.util.ArrayList;
import java.util.List;

/*
1 2 3 4 5
1 2 3
 */
public class UnionOfTwoSortedArrays {
    public static void main(String[] args) {
        int m=5;
        int n=3;
        int[] arr1={1, 2, 3, 4, 5};
        int[] arr2={1, 2, 3};
        List<Integer> sortedVal=unionOfTwoArrays(arr1,arr2,m,n);
        for (Integer i:sortedVal) {
            System.out.println(i);
        }
    }
    public static List<Integer> unionOfTwoArrays(int[] arr1, int[] arr2, int m, int n){
        List<Integer> uniqueValues=new ArrayList();
        int i=0;
        int j=0;
        while (i<m&&j<n){
            if(arr1[i]<arr2[j]){
                uniqueValues.add(arr1[i]);
                i++;
            }else if (arr1[i]>arr2[j]){
                uniqueValues.add(arr2[i]);
                j++;
            }else {
                uniqueValues.add(arr1[i]);
                i++;
                j++;
            }
        }
        if (m<n){
            copyValues(arr2, j, uniqueValues);
        }else {
            copyValues(arr1, i, uniqueValues);
        }
        return uniqueValues;
    }
    public static void copyValues(int[] arr, int idx, List<Integer> unionOfValues){
        for (int i = idx; i < arr.length; i++) {
            System.out.println(arr[i]);
            unionOfValues.add(arr[i]);
        }
    }
}
