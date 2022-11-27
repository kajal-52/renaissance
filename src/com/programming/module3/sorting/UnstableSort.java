package com.programming.module3.sorting;

import java.util.Scanner;

/**
 *
 *
 */
public class UnstableSort {
    public static void main (String[] args) throws Exception
    {
        // Take input
        Scanner s= new Scanner(System.in);
        System.out.println("Enter number of test cases");
        int T= s.nextInt();
        for(int i=0;i<T;i++){
            int N= s.nextInt();
            int[] arr=new int[N];
            int[] indices= new int[N];
            for(int j=0;j<arr.length;j++){
                arr[j]=s.nextInt();
                indices[j]=j+1;
            }
            int[] res=unstableInsertionSort(arr, N,indices);
            for (int j = 0; j < N; j++) {
                System.out.print(res[j]+" ");
            }
            }
        }
        public static int[] unstableInsertionSort(int[] unsortedValues,int N, int[] indices){
            for(int k=1;k<N;k++){
                int l=k;
                while(l>0&& unsortedValues[l]<=unsortedValues[l-1]){
                    int temp=unsortedValues[l-1];
                    unsortedValues[l-1]=unsortedValues[l];
                    unsortedValues[l]=temp;
                    int tempIdx=indices[l-1];
                    indices[l-1]=indices[l];
                    indices[l]=tempIdx;
                    l--;
                }
            }
            return indices;
        }

}
// if we have two same values their indices will not be same in the output array as in input array
