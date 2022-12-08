package com.programming.module2.arrays;
/*
Given a matrix mat with n*m elements , you need to find the sum all sub matrices of the given matrix.
 Since the sum could be very large print the sum modulo 109+7
*/
import java.util.Scanner;

public class SumOfAllSubMatricesReverseLookup {
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner sc=new Scanner(System.in);
        int m= sc.nextInt();
        int n=sc.nextInt();
        long[][] mat=new long[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                mat[i][j]= sc.nextLong();
            }
        }
        findAllSubmatricesSum(mat,m,n);

    }
    private static void findAllSubmatricesSum(long[][] arr, int m, int n){
        //O(N)
        long moduloNum= 1000000007;
        long sum=0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                long cont1 = (((i + 1) % moduloNum) * ((j + 1) % moduloNum) )% moduloNum;
                long cont2 = (((m - i) % moduloNum) * ((n - j) % moduloNum)) % moduloNum;
                long cont3 = ((cont1 % moduloNum) * (cont2 % moduloNum) % moduloNum);
                long cont=((cont3%moduloNum)*(arr[i][j]%moduloNum))%moduloNum;
                sum = ((sum % moduloNum) + (cont % moduloNum)) % moduloNum;

            }
        }
        System.out.println(sum);
    }
}
