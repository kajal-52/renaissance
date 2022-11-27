package com.programming.module3.twopointers;

import java.util.Arrays;

/*
Finding pairs for a given sum in array using binary search
(i) -whether such pair exists or not
(ii)- how many such pairs exist in the array
for every value in array, we loop and search for its complementary to get given sum
for example:
if given sum is 6 and first value in array is 2
then in subarray we will do binary serach for 6-2 =4
 */
public class TargetSumUsingBinarySearch {
    public static void main(String[] args) {
        int[] values = {54, 963, 585, 735, 655, 973, 458, 370, 533, 964, 608, 484, 912, 636, 68, 849, 676, 939, 224, 143, 755, 512, 742, 176, 460, 826, 222, 871, 627, 935, 206, 784, 851, 399, 280, 702, 194, 735, 638, 535, 557, 994, 177, 706 ,963 ,549, 882, 301, 414, 642, 856,856,143,463,612,878,425,679,753,444,297,674,41,314,876,73,819,611,18,933,113,696,170,832,41,489,686,91,498,590,991,146,354,315,652,741,45,259,336,760,193,606,265,182,504,830,776};
        int targetSum = 1356;
        Arrays.sort(values);
        System.out.println(ifPairFound(values,targetSum));
    }
    public static boolean ifPairFound(int[] values, int targetSum){
        for (int i = 0; i < values.length-1; i++) {
            int complementaryValue=targetSum-values[i];
            boolean isFound=binarySearchForComplement(values, i+1,complementaryValue);
            if (isFound){
                return true;
            }
        }
        return false;
    }
    public static boolean binarySearchForComplement(int[] values, int lowIndex, int valueTobeFound){
        int highIndex= values.length-1;
        while (lowIndex<=highIndex){
            int midIndex=(lowIndex+highIndex)/2;
            int valueAtMidIndex=values[midIndex];
            if (valueAtMidIndex<valueTobeFound){
                lowIndex=midIndex+1;
            } else if (valueAtMidIndex>valueTobeFound) {
                highIndex=midIndex-1;
            }else {
                return true;
            }
        }
        return false;
    }
}
