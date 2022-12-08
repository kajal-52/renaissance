package com.programming.module2.arrays;

public class SearchingInMatrix {
    public static void main(String[] args) {
        int m=4;
        int n=4;
        int[][] mat={{10,20,30,40},{15,25,35,45},{20,29,30,48},{32,33,39,50}};
        binarySearchInMatrix(mat,m,n,29);

    }
    private static void binarySearchInMatrix(int[][] mat, int m, int n, int key){
        int i=0;
        int j=mat[0].length-1;
        while(i<m && j>0){
            if (key<mat[i][j])
                j=j-1;
            else if(key>mat[i][j])
                i=i+1;
            else{
                System.out.println(i+" "+j);
                break;
            }
        }

    }
}
