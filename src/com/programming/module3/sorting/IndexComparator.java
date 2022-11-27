package com.programming.module3.sorting;

import java.util.Comparator;

public class IndexComparator implements Comparator<ValueIndexPair> {

    @Override
    public int compare(ValueIndexPair firstValue, ValueIndexPair secondValue) {
        int idx1 = firstValue.getIndex();
        int idx2 = secondValue.getIndex();
        if (idx1<idx2){
            if (idx1== Integer.MAX_VALUE&&idx2==Integer.MAX_VALUE){
                return Integer.compare(firstValue.getValue(),secondValue.getValue());
                }
            return Integer.compare(idx1,idx2);
        }
        return Integer.compare(idx1,idx2);
    }
    // comparing indexes
}
