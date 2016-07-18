package com.directi.collections;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Collections {

    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<Integer>();
        integers.add(7);
        integers.add(2);
        integers.add(5);
        integers.add(2);
        integers.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if (o1 < o2)
                    return -1;
                if (o1 > o2)
                    return 1;
                else {
                    return 0;
                }
            }
        });
        System.out.println(integers);
    }




}
