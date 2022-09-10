package com.practice.java;

import java.util.ArrayList;
import java.util.List;

public class CompareCollectionElement {

    /*----- Compare 2 arrays and return two unique ArrayLists filled with values that do not repeat between the two -----*/
    public static List<Integer> compareCollectionElement(List<Integer> coll1, List<Integer> coll2) {

        List<Integer> sanitizedList = new ArrayList<>();

        /*----- iterate over arr1 and compare each element to every arr2 element -----*/
        for (int i : coll1) {

            boolean flag = false;

            System.out.println(i);

            for (int j : coll2) {
                System.out.println(j);

                if (i == j) {

                    flag = true;
                }
            }

            if (!flag) {

                sanitizedList.add(i);

                System.out.println(sanitizedList);

            }

        }

        return sanitizedList;
    }
}
