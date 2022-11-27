package com.programming.module3.sorting;

import java.util.Comparator;
/*
custom comparator implementation for sorting array values in the order of decreasing frequency
 */
public class CustomComparator implements Comparator<Frequency> {

    @Override
    public int compare(Frequency o1, Frequency o2) {
        if(o1.getFrequency()!=o2.getFrequency())
            return -Integer.compare(o1.getFrequency(),o2.getFrequency());
        else if(o1.getElement()!=o2.getElement())
            return Integer.compare(o1.getElement(),o2.getElement());
        else if(o1.getIndex()!=o2.getIndex())
            return Integer.compare(o1.getIndex(),o2.getIndex());
        return -1;
    }
}
