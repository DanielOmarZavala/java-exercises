package com.practice.java;

import java.util.Arrays;

public class ArryManipulation {

//asked with creating a method that will take in two ordered lists of the same length and
//return a new ordered list of unique elements that are shared between the lists.
//Write the pseudocode for a method that will take in two lists, returning a new ordered list with unique elements that are in both lists.


//    int[] arr1 = {1, 2, 3, 4};
//    int[] arr2 = {5, 6, 7, 8};

    public static void newArr(int[] arr1, int[] arr2) {

        int arrLen = arr1.length;
        int arrLen2 = arr2.length;

        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));


        for (int i = 0; i < arrLen; i++) {

            System.out.println(arr1[i]);

            for (int j = 0; j < arrLen2; j++) {
                System.out.println(arr2[j]);
            }
        }
    }

}
