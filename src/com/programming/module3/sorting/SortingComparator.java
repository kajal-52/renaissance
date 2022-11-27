package com.programming.module3.sorting;

import java.util.*;
/*
given an array sort such that values with max frequency comes first , if two values have
 same frequency then the smaller value comes first
 for example:
 arr =[2,3,2,5,5]
 output= [2, 2, 5, 5, 3]
 */
public class SortingComparator {
    public static void main(String[] args) {
        //abstraction level L
        int[] arr= {2,3,2,5,5};
        SortingComparator sortingComparator=new SortingComparator();
        List<Frequency> frequencies=sortingComparator.countFrequencyOfValues(arr);
        List<Frequency> sortedFrequencies =sortingComparator.sortByFrequency(frequencies);
        sortingComparator.printAllValues(sortedFrequencies);
    }
    public List<Frequency> countFrequencyOfValues(int[] arr){
        //abstraction level L-1
        List<Frequency> frequencies= new ArrayList<>();
        Map<Integer, Integer> frequenciesOfValues=new HashMap<>();
        for(int k=0;k< arr.length;k++){
            if(!frequenciesOfValues.containsKey(arr[k])){
                frequenciesOfValues.put(arr[k], 1);
            }else{
                frequenciesOfValues.put(arr[k], frequenciesOfValues.get(arr[k])+1);
            }
        }
        for (int i = 0; i <arr.length ; i++)
            frequencies.add(new Frequency(frequenciesOfValues.get(arr[i]),arr[i], i));
        return frequencies;
    }
    public List<Frequency> sortByFrequency(List<Frequency> frequency){
        //abstraction level L-1
        Collections.sort(frequency, new CustomComparator());
        return frequency;
    }
    public void printAllValues(List<Frequency> list){
        //abstraction level L-1
        for (Frequency f:list){
            System.out.print(f.getElement()+" ");
        }
    }
}
