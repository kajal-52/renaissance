package com.programming.module4.hashing;

import java.util.Scanner;
/*
Given a boolean matrix of size R x C where each cell contains either 0 or 1, modify it such that
if a matrix cell matrix[i][j] is 1 then all the cells in its ith row and jth column will become 1.
 */
public class BooleanMatrix {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t= sc.nextInt();
        for (int i = 0; i <t ; i++) {
            int R= sc.nextInt();
            int C= sc.nextInt();
            int[][] inputMatrix= new int[R][C];
            for (int j = 0; j < R; j++) {
                for (int k = 0; k < C; k++) {
                    inputMatrix[j][k]=sc.nextInt();
                }
            }
            int[][] outmatrix=transformMatrix(inputMatrix,R,C);
            for (int x = 0; x < outmatrix.length; x++) {
                for (int y = 0; y < outmatrix[0].length; y++) {
                    System.out.print(outmatrix[x][y]+" ");
                }
                System.out.println();
            }
            sc.close();
        }
    }
    private static int[][] transformMatrix(int[][] mat, int m, int n){
        int[] rowArr=new int[m];
        int[] colArr=new int[n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if(mat[i][j]==1){
                    rowArr[i]=1;
                    colArr[j]=1;
                }
            }
        }
        for (int k = 0; k < m; k++) {
            for (int l = 0; l < n; l++) {
                if(rowArr[k]==1||colArr[l]==1){
                    mat[k][l]=1;
                }
            }
        }
        return mat;
    }

}
