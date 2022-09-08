package com.practice.java;

import java.util.ArrayList;
import java.util.List;

public class CompareArryElement {

    /*----- Compare 2 arrays and return two unique ArrayLists filled with values that do not repeat between the two -----*/
    public static List<Integer> compareArryElement(int[] arr1, int[] arr2) {

        List<Integer> sanitizedList = new ArrayList<>();

        /*----- iterate over arr1 and compare each element to every arr2 element -----*/
        for (int i : arr1) {

            boolean flag = false;

            System.out.println(i);

            for (int j : arr2) {
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
