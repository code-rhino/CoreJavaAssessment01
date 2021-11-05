package com.codedifferently.assessment.corejava.part02;
import java.util.ArrayList;
import java.util.Arrays;

import static java.util.Arrays.asList;

public class IntegerArrayUtils {
    /**
     * @param integerArray   - array to have value added to it
     * @param valueToBeAdded - value to be added to the end of the array
     * @return - identical array with one additional element of `valueToBeAdded` at the end of the array
     */
    public static Integer[] add(Integer[] integerArray, Integer valueToBeAdded) {
        Integer[] newIntArray;
        newIntArray = new Integer[integerArray.length + 1];
        for(int i = 0; i < integerArray.length; i ++){
            newIntArray[i] = integerArray[i];
        }
        newIntArray[newIntArray.length-1] = valueToBeAdded;

        return newIntArray;
    }
    /**
     * @param integerArray      - array to be manipulated
     * @param indexToInsertAt   - index of the element to be inserted at
     * @param valueToBeInserted - value of the element to be inserted
     * @return `integerArray` with `valueToBeInserted` at index number `indexToInsertAt`
     */
    public static Integer[] replace(Integer[] integerArray, int indexToInsertAt, Integer valueToBeInserted) {
        integerArray[indexToInsertAt] = valueToBeInserted;
        return integerArray;
    }

    /**
     * @param integerArray - array to be evaluated
     * @param indexToFetch - index of element to be returned
     * @return element located at `indexToFetch`
     */
    public static Integer get(Integer[] integerArray, Integer indexToFetch) {
        int a = integerArray[indexToFetch];
        return a;
    }

    /**
     * @param integerArray - array to be evaluated
     * @return identical array with even-values incremented by 1 and odd-values decremented by 1
     */
    public static Integer[] incrementEvenDecrementOdd(Integer[] integerArray) {
        for (int i = 1; i < integerArray.length; i++) {
            if (integerArray[i] % 2 == 0) {
                integerArray[i] += 1;
            } else if (integerArray[i] % 2 != 0) {
                integerArray[i] -= 1;
            }
        }

        return integerArray;

    }

    /**
     * @param integerArray - array to be evaluated
     * @return identical array with even-values incremented by 1
     */
    public static Integer[] incrementEven(Integer[] integerArray) {
        for (int i = 0; i < integerArray.length; i++) {
            if (integerArray[i] % 2 == 0) {
                integerArray[i] += 1;
            }
        }
        return integerArray;
    }


        /**
         * @param input - array to be evaluated
         * @return identical array with odd-values decremented by 1
         */
        public static Integer[] decrementOdd (Integer[]input){

            for (int i = 0; i < input.length; i++) {
                if (input[i] % 2 == 0) {
                    input[i] += 1;
                }
            }
                return input;


        }

}
