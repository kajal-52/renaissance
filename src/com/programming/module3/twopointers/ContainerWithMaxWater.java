package com.programming.module3.twopointers;

import java.util.Arrays;

public class ContainerWithMaxWater {
    public static void main(String[] args) {
        int heights[]={};

    }
    private void findMaxArea(int[] heights){
        int maxArea=0;
        int breadth= heights[0];
        int i=0;
        int j=1;
        while(j<heights.length){
            int currentBreadth= heights[j]-heights[i];
            int currentLength=j-i;
            int currentArea=currentLength*currentBreadth;
            if (currentArea>maxArea){
                maxArea=currentArea;

            }

        }
    }
}
