package com.programming.module3.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 */
public class RelativeSorting {
    public static void main(String[] args) {
        int N= 11;
        int M= 6;
        int[] arr1={2,3,1,3,2,4,6,7,9,2,19};
        int[] arr2={2 ,1,4,3,9,6};
        int maximumValueInArr1=findMax(N,arr1);
        rankInitialized(maximumValueInArr1,arr1,arr2);
    }

    public static int findMax(int n, int[] arr1){
        //this code only finds maximum in array
        int maxVal=arr1[0];
        for (int i = 1; i <n ; i++) {
            if(arr1[i]>maxVal)
                maxVal=arr1[i];
        }
        return maxVal;
    }
    public static void rankInitialized(int maximumValueInArr1, int[] arr1, int[] arr2){
        int[] rank= new int[maximumValueInArr1+1]; //rank array initialized with max values
        for (int i = 0; i <=maximumValueInArr1 ; i++) {
            //rank array initialised with INT_MAX value for max value in arr1
            rank[i]=Integer.MAX_VALUE;
        }
        System.out.println("rank array: ");
        for (int j = 0; j <arr2.length ; j++) { //
            int idx=arr2[j];
            rank[idx]=j;
        }
        for (int l = 0; l <=maximumValueInArr1 ; l++) {
            //rank array initialised with INT_MAX value for max value in arr1
            System.out.print(rank[l]+" ");
        }

        List<ValueIndexPair> valueIndexPairs=new ArrayList<>();// list of pairs
        for (int k = 0; k < arr1.length; k++) {
            valueIndexPairs.add(new ValueIndexPair( arr1[k],rank[arr1[k]]));
        }
        Collections.sort(valueIndexPairs,new IndexComparator());
//        for (ValueIndexPair indexPairs: valueIndexPairs) {
//            System.out.println(indexPairs.getIndex()+" "+ indexPairs.getValue());
//        }
        System.out.println("relative sorted array");
        for (ValueIndexPair v:valueIndexPairs) {
            System.out.print(v.getValue()+ " ");
        }
    }


}


