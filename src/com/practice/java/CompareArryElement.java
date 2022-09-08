package com.practice.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CompareArryElement {

    /*
    asked with creating a method that will take in two ordered lists of the same length and
    return a new ordered list of unique elements that are shared between the lists.
    Write the pseudocode for a method that will take in two lists, returning a new ordered list with unique elements that are in both lists.
    */

    public static void sanitizedLists(int[] arr1, int[] arr2){

        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));

        List<Integer> sanitizedListOne = sanitizedListOne(arr1, arr2);
        List<Integer> sanitizedListTwo = sanitizedListOne(arr2, arr1);

        List<Integer> uniqueList = new ArrayList<>(sanitizedListOne);

        uniqueList.addAll(sanitizedListTwo);

        System.out.println(uniqueList);
    }

    /*----- Compare 2 arrays and return two unique ArrayLists filled with values that do not repeat between the two -----*/
    public static List<Integer> sanitizedListOne(int[] arr1, int[] arr2) {

        List<Integer> sanitizedListOne = new ArrayList<>();

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

                sanitizedListOne.add(i);

                System.out.println(sanitizedListOne);

            }

        }

        return sanitizedListOne;
    }

    /*----- Compare 2 arrays and return two unique ArrayLists filled with values that do not repeat between the two -----*/
//    public static void sanitizedListTwo(int[] arr1, int[] arr2) {
//
//        List<Integer> sanitizedListTwo = new ArrayList<>();
//
//        System.out.println("made it to sanitizedListTwo method");
//
//        /*----- iterate over arr2 and compare each element to every arr1 element -----*/
//        for (int i : arr2) {
//
//            boolean flag = false;
//
//            System.out.println(i);
//
//            for (int j : arr1) {
//                System.out.println(j);
//
//                if (i == j) {
//
//                    flag = true;
//                }
//            }
//
//            if (!flag) {
//
//                sanitizedListTwo.add(i);
//
//                System.out.println(sanitizedListTwo);
//
//            }
//
//        }
//    }

}
