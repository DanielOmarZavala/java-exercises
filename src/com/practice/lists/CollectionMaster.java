package com.practice.lists;

import java.util.ArrayList;
import java.util.List;

public class CollectionMaster {

    static List<String> strLst = new ArrayList<>();

    public static List<String> collListOne() {

        strLst.add("A");
        strLst.add("B");
        strLst.add("C");
        strLst.add("D");
        strLst.add("E");

        return strLst;
    }

    public static List<String> collListTwo() {
        return strLst;
    }
}
