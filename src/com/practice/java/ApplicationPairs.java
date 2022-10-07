package com.practice.java;

import java.util.ArrayList;
import java.util.List;

public class ApplicationPairs {

    public static List<List<Integer>> applicationPairs(int deviceCapacity, List<List<Integer>> foregroundAppList, List<List<Integer>> backgroundAppList) {

        int twoDimCount = foregroundAppList.size();
        List<List<Integer>> combos = new ArrayList<>(twoDimCount);

        System.out.println("This is the memory capacity: " + deviceCapacity);

        for (int i = 0; i < twoDimCount; i++) {

            int count = combos.get(i).size();
            System.out.println("Getting 1st dimension elements: " + foregroundAppList.get(i));

            for (int j = 0; j < count; j++) {

                int start = i;
                int end = combos.get(i).get(j);
            }
        }

        return foregroundAppList;
    }
}
