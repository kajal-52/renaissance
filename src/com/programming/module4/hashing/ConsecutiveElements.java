package com.programming.module4.hashing;

import java.util.HashMap;
import java.util.Map;

public class ConsecutiveElements {
    public static void main(String[] args) {
        int[] arr={6,4,3,7,2};
        boolean res=ifConsecutiveElements(arr);
        System.out.println(res);
    }
    private static boolean ifConsecutiveElements(int[] arr){
        Map<Integer, Integer> values=new HashMap<>();
        int min=Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            values.put(arr[i],1);
            min=Math.min(min,arr[i]);
        }
        System.out.println(min);
        for (int j = min; j <min+ arr.length ; j++) {
            if (!values.containsKey(j)){
                System.out.println(j);
                return false;
            }
        }
        return true;
    }
}
