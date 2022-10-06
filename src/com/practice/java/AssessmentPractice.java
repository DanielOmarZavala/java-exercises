package com.practice.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.lang.Integer.parseInt;

public class AssessmentPractice {

    public static void main(String[] args) {

        String[] arr = {"99 88 300", "3 23 80", "8 3 40"};
//        String[] trimmedArr = new String[2];
        List<String> newColl = new ArrayList<>();

        System.out.println(newColl);
        System.out.println(Arrays.toString(arr));


        for (String s : arr) {

            String[] trimmedArr = s.split(" ");

//            System.out.println(arr[i].replaceAll("\\s", ""));

            System.out.println(Arrays.toString(trimmedArr));

            newColl.addAll(Arrays.asList(trimmedArr).subList(0, 2));

            System.out.println(newColl);

//            newColl[i] = arr[i].split(" ");

        }
//        System.out.println(Arrays.toString(arr));
    }
}
