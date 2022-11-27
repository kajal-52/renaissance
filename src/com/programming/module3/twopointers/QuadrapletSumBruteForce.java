package com.programming.module3.twopointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class QuadrapletSumBruteForce {
    public static void main(String[] args) {
        int[] values={-9, 1,2, 3, 3, 5, 5,10};
        List<List<Integer>> quadraples=isQuadrapletsExists(values,8 );
        for (List<Integer> integers:quadraples
        ) {
            System.out.println(integers.toString());
        }
    }
    public static List<List<Integer>> isQuadrapletsExists(int[] arr, int n){
        List<List<Integer>> quadraplets=new ArrayList<>();
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                for (int k = j+1; k <n ; k++) {
                    for (int l = k+1; l < n; l++) {
                        if (arr[i] + arr[j] + arr[k] + arr[l] == 0) {
                            List<Integer> res = Arrays.asList(arr[i], arr[j], arr[k], arr[l]);
                            if (!quadraplets.contains(res)) {
                                quadraplets.add(res);
                            }
                        }
                    }
                }
            }
        }
        return quadraplets;
    }

}
