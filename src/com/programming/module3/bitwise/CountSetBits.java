package com.programming.module3.bitwise;

/**
 * Counting set bit with
 * 1st remainder method ----> O(logn)
 * 2nd bit manipulation
 */
public class CountSetBits {
    public static void main(String[] args) {
        int n = 14;
        countSetBits(n);
        countSetBitsByBitManipulation(n);
        countSetBitsByBitOptimized(n);
    }

    private static int countSetBits(int num) {
        //O(log N)
        int count = 0;
        while (num > 0) {
            int bit = num % 2;
            num /= 2;
            if (bit == 1) {
                count++;
            }
        }
        System.out.println("Number of set bits with remainder method: " + count);
        return count;
    }

    private static int countSetBitsByBitManipulation(int num) {
        //O(Number of bits)
        int count = 0;
        int mask = 1;
        while (mask <= num) {
            if ((num & mask) != 0) {
                count++;
            }
            mask <<= 1;
        }
        System.out.println("Number of set bits with bit manipulation method: " + count);
        return count;
    }

    private static int countSetBitsByBitOptimized(int num) {
        //O(Number set of bits)
        int count = 0;
        while (num > 0) {
            num = (num & (num - 1));
            count++;
        }
        System.out.println("Number of set bits with bit manipulation method optimized: " + count);
        return count;
    }
}
