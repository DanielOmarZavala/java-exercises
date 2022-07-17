package javaPractice;

import java.util.List;

public class LonelyInteger {

    public static int lonelyInteger(List<Integer> a) {

        a.add(2);
        a.add(3);
        a.add(4);
        a.add(2);
        a.add(4);
        a.add(3);
        a.add(5);

        int arLen = a.size();

        int res = a.get(0);
        for (int i = 1; i < arLen; i++){
            System.out.println("res BEFORE XOR = " + res);
            System.out.println("Element at index " + i + " is " + a.get(i));

            res = res ^ a.get(i);

            System.out.println("res AFTER XOR = " + res);
            System.out.println("========");
        }

        return res;
    }
}
