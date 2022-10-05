package com.practice.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AssessmentPractice {

    public static void main(String[] args) {

        String[] arr = {"99 88 300", "3 23 80", "8 3 40"};
        List<String> newArr1 = new ArrayList<>();



        System.out.println(newArr1);

        System.out.println(Arrays.toString(arr));

        for(int i = 0; i < arr.length; i++) {

            System.out.println(arr[i]);

            String[] newArr2 = arr[i].split(" ");

            System.out.println(Arrays.toString(newArr2));
        }
    }
}
