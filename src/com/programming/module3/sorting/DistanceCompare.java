package com.programming.module3.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DistanceCompare {
    public static void main(String[] args) {
        int[][] mat= {{1,3},{ -2,2}};
        int k=1;
        List<Point> pointList=new ArrayList<>();
        for (int i = 0; i < mat.length; i++) {
            pointList.add(new Point(mat[i][0],mat[i][1]));
        }
        int[][] res=new int[k][2];
        Collections.sort(pointList,new DistanceComparator());
        for (int j = 0; j < k; j++) {
            res[j][0]=pointList.get(j).getX();
            res[j][1]=pointList.get(j).getY();
        }
        System.out.println(res[0][0]);
        System.out.println(res[0][1]);
    }

}
