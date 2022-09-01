package com.practice.java;

import java.util.Arrays;

public class ArryManipulation {

/*
asked with creating a method that will take in two ordered lists of the same length and
return a new ordered list of unique elements that are shared between the lists.
Write the pseudocode for a method that will take in two lists, returning a new ordered list with unique elements that are in both lists.
*/

    public static void newArr(int[] arr1, int[] arr2) {

        int[] uniqueArry = {0, 0, 0, 0};

        int arrLen = arr1.length;
        int arrLen2 = arr2.length;

        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));


        for (int i = 0; i < arrLen; i++) {

            boolean flag = false;

            System.out.println(arr1[i]);

            for (int j = 0; j < arrLen2; j++) {
                System.out.println(arr2[j]);

                if (arr1[i] == arr2[j]) {

                    flag = true;
                    continue;
                }
            }

            if (flag == false) {

                uniqueArry[i] = arr1[i];

                System.out.println(Arrays.toString(uniqueArry));

//            Arrays.stream(arr1).toArray(uniqueArry);
            }

        }
    }

}
