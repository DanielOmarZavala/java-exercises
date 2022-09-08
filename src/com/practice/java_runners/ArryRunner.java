package com.practice.java_runners;

import com.practice.java.*;
import com.practice.lists.ArryList;

public class ArryRunner {

    public static void arryRunner(){

        CompareArryElement.sanitizedListOne(ArryList.arryListOne(), ArryList.arryListTwo());
        CompareArryElement.sanitizedListTwo(ArryList.arryListOne(), ArryList.arryListTwo());
    }
}
