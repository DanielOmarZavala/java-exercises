package com.practice.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MergeUniqueLists {


    /*
asked with creating a method that will take in two ordered lists of the same length and
return a new ordered list of unique elements that are shared between the lists.
Write the pseudocode for a method that will take in two lists, returning a new ordered list with unique elements that are in both lists.
*/

    /*----- Call Array comparing method compareArryElement twice, then use the two products to create a unique and sorted ArrayList -----*/
    public static void mergeUniqueLists(int[] arr1, int[] arr2){

        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));

        List<Integer> sanitizedListOne = CompareArryElement.compareArryElement(arr1, arr2);
        List<Integer> sanitizedListTwo = CompareArryElement.compareArryElement(arr2, arr1);

        List<Integer> uniqueList = new ArrayList<>(sanitizedListOne);

        System.out.println("After adding first sanitized list to unique list: " + uniqueList);

        uniqueList.addAll(sanitizedListTwo);

        System.out.println("After adding second sanitized list to unique list: " + uniqueList);

        Collections.sort(uniqueList);

        System.out.println("After sorting the unique list in standard ascending order: " + uniqueList);
    }
}
