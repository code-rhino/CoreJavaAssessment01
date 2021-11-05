package com.codedifferently.assessment.corejava.part02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IntegerArrayUtils {
    /**
     * @param integerArray - array to have value added to it
     * @param valueToBeAdded - value to be added to the end of the array
     * @return - identical array with one additional element of `valueToBeAdded` at the end of the array
     */
    public static Integer[] add(Integer[] integerArray, Integer valueToBeAdded) {

        Integer[] actual = new Integer[integerArray.length -1];
        for(int i = 0; i < integerArray.length; i++){
            actual[i] = integerArray[i];
        }
        actual[actual.length-1] = valueToBeAdded;
        return actual;
    }

    /**
     * @param integerArray - array to be manipulated
     * @param indexToInsertAt - index of the element to be inserted at
     * @param valueToBeInserted - value of the element to be inserted
     * @return `integerArray` with `valueToBeInserted` at index number `indexToInsertAt`
     */
    public static Integer[] replace(Integer[] integerArray, int indexToInsertAt, Integer valueToBeInserted) {
        List<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(integerArray));
        list.add(indexToInsertAt, valueToBeInserted);

       //Converts back the list into array object and return the new values.
        integerArray = list.toArray(new Integer[list.size()]);

       return integerArray;
    }

    /**
     * @param integerArray - array to be evaluated
     * @param indexToFetch - index of element to be returned
     * @return element located at `indexToFetch`
     */
    public static Integer get(Integer[] integerArray, Integer indexToFetch) {
//To access the indexOf() function, we first create an array of Integer
// and then convert it to a list using Arrays.asList()
        int getIndex = Arrays.asList(integerArray).indexOf(indexToFetch);
        return getIndex;
    }


    /**
     * @param integerArray - array to be evaluated
     * @return identical array with even-values incremented by 1 and odd-values decremented by 1
     */
    public static Integer[] incrementEvenDecrementOdd(Integer[] integerArray) {
        int n = 0;
        for (int i = 0; i < n; i++)
            // If current element is odd positioned
            if ((i + 1) % 2 == 1)
                integerArray[i]--;
                // If even positioned
            else
                integerArray[i]++;

       return integerArray;
    }

    /**
     * @param integerArray - array to be evaluated
     * @return identical array with even-values incremented by 1
     */
    public static Integer[] incrementEven(Integer[] integerArray) {
        int n = 0;
        for (int i = 0; i < n; i++)
            // If current element is even positioned
            if ((i + 1) % 2 == 0)
                integerArray[i]++;
        return integerArray;
    }

    /**
     * @param input - array to be evaluated
     * @return identical array with odd-values decremented by 1
     */
    public static Integer[] decrementOdd(Integer[] input) {
        int n = 0;
        for (int i = 0; i < n; i++)
            // If current element is odd positioned
            if ((i + 1) % 2 == 1)
                input[i]--;
        return input;
    }
}
