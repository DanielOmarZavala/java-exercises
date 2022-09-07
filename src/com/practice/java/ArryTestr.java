package com.practice.java;

import java.util.Arrays;

public class ArryTestr {

    public static void arryTestr() {
        //Defining mergedArray with combined size of arrayA and arrayB

        int[] mergedArray = new int[arrayA.length + arrayB.length];

//Initializing pointers of arrayA, arrayB and mergedArray with 0

        int i = 0, j = 0, k = 0;

//Inserting all elements of arrayA into mergedArray

        while (i < arrayA.length) {
            mergedArray[k] = arrayA[i];
            k++;
            i++;
        }

//Inserting all elements of arrayB into mergedArray

        while (j < arrayB.length) {
            mergedArray[k] = arrayB[j];
            k++;
            j++;
        }

        //Defining one HashSet object called setWithNoDuplicates
//Remember, HashSet allows only unique elements

        Set setWithNoDuplicates = new HashSet<>();

//Adding all elements of mergedArray into setWithNoDuplicates

        for (int m = 0; m < mergedArray.length; m++) {
            setWithNoDuplicates.add(mergedArray[m]);
        }

//Now, setWithNoDuplicates will have only unique elements of mergedArray

//So, now iterate setWithNoDuplicates and
//add its elements into new array called mergedArrayWithNoDuplicates

        Iterator it = setWithNoDuplicates.iterator();

        int[] mergedArrayWithNoDuplicates = new int[setWithNoDuplicates.size()];

        int n = 0;

//Adding all elements of setWithNoDuplicates into mergedArrayWithNoDuplicates

        while (it.hasNext()) {
            mergedArrayWithNoDuplicates[n] = it.next();
            n++;
        }

        Arrays.sort(mergedArrayWithNoDuplicates);
    }
}
