package javaPractice;

import java.util.ArrayList;
import java.util.List;

import static javaPractice.Solutions.lonelyInteger;

public class Runner {

    public static void main (String[] args) {

        List<Integer> arr = new ArrayList<>();

        System.out.println("The number that does not repeat is: " + lonelyInteger(arr));
    }
}
