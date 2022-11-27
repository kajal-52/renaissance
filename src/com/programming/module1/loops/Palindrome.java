package com.programming.module1.loops;

import java.util.Scanner;
/*
An integer is said to be a palindrome if it is equal to its reverse. For example,
79197 and 324423 are palindromes. In this task you will be given an integer
N 1≤N≤1000000 You must find the smallest integer
M≥N such that M is a prime number and M is a palindrome.
 */

public class Palindrome {
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner s= new Scanner(System.in);
        int n=s.nextInt();
        int output=findNumber(n);
        System.out.println(output);

    }
    public static int findNumber(int N){
        int limit =Integer.MAX_VALUE;
        while (N <= limit) {
            String str= String.valueOf(N);
            int len =str.length();
            boolean isPrime = isPrime(N);
            boolean isPalindrome = isPalindrom(str, len);
            if (isPrime && isPalindrome) {
                return N;
            }
            else if(isPrime){
                N=N+2;
            }else{
                N++;
            }
        }
        return N;
    }
    public static boolean isPalindrom(String str, int N){
        for(int j=0;j<N/2;j++){
            if(str.charAt(j)!=str.charAt(N-1-j))
                return false;
        }
        return true;
    }
    public static boolean isPrime(int N){
        if(N<2){
            return false;
        }
        for(int k=2;k<N/2;k++){
            if(N%k==0){
                return false;
            }
        }return true;
    }
}