package com.practice.java;

public class PatternCount {

    public static void main(String[] args) {
        String s = "([?)[]";
        int count = 0;
        char[] sCharArr = s.toCharArray();

        for (char first : sCharArr) {
            int iterateCount = 1;

            for (char second : sCharArr) {
                if (first == '(' && second == ')') {
                    count++;
                } else if (first == '(' && second == '?') {
                    count++;
                } else if (first == ')' && second == '(') {
                    count++;
                } else if (first == ')' && second == '?') {
                    count++;
                } else if (first == '[' && second == ']') {
                    count++;
                } else if (first == '[' && second == '?') {
                    count++;
                } else if (first == ']' && second == '[') {
                    count++;
                } else if (first == ']' && second == '?') {
                    count++;
                } else {
                    iterateCount++;
                }
            }
        }
        System.out.println(count);
    }

}
