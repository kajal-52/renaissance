package com.programming.module6.greedy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ActivitySelection{
    public static void main(String[] args) {
        List<Activity> list=new ArrayList<>();
        list.add(new Activity(3,4));
        list.add(new Activity(0,6));
        list.add(new Activity(1,2));
        list.add(new Activity(5,7));
        list.add(new Activity(5,9));
        list.add(new Activity(8,9));
        Collections.sort(list,new SortBasedOnEnd());
        findMaxNumOfActivity(list);

    }

    private static int findMaxNumOfActivity(List<Activity> activities){
        int count=1;
        int endTime= activities.get(0).getE();
        for (int i = 1; i < activities.size(); i++) {
            if(activities.get(i).getS()>=endTime){
                endTime=activities.get(i).getE();
                count++;
            }
        }
        System.out.println(count);
        return count;
    }
}