package com.programming.module3.sorting;

import java.util.Comparator;
/*
custom comparator for comparing distance of point p1 from origin
and distance of another point p2 from origin

 */
public class DistanceComparator implements Comparator<Point> {

    @Override
    public int compare(Point o1, Point o2) {
        long d1= o1.getX()*o1.getX()+o1.getY()*o1.getY();
        long d2= o2.getX()*o2.getX()+o2.getY()*o2.getY();
        if(d1!=d2)
            return Long.compare(d1,d2);
        return 0;
    }
}
