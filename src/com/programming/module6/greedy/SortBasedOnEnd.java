package com.programming.module6.greedy;

import java.util.Comparator;

public class SortBasedOnEnd implements Comparator<Activity> {

    @Override
    public int compare(Activity a1, Activity a2) {
        return a1.getE()-a2.getE();
    }
}
