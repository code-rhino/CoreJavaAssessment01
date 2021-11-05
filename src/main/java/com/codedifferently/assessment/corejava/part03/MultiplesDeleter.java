package com.codedifferently.assessment.corejava.part03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MultiplesDeleter {
    /**
     * @param ints array of Integer objects
     * @return all ints which are not divisible by 2
     * given an array of integers, named `ints` return an identical array with evens removed
     */
    public Integer[] deleteEvens(Integer[] ints)  {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(ints));
        numbers.removeIf(number -> number%2 == 0);
        Integer [] arr2 = new Integer[numbers.size()];
        for(int i = 0; i< arr2.length; i++){
            arr2[i] = numbers.get(i);
        }
        return arr2;
        //Intellij wouldn't allow "Integer[] arr2=(Integer[]) numbers.toArray();" even when it requested the casting, debugger showed correct array
    }


    /**
     * @param ints array of Integer objects
     * @return all ints which are divisible by 2
     * given an array of integers, named `ints` return an identical array with odds removed
     */
    public Integer[] deleteOdds(Integer[] ints) {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(ints));
        numbers.removeIf(number -> number%2 != 0);
        Integer [] arr2 = new Integer[numbers.size()];
        for(int i = 0; i< arr2.length; i++){
            arr2[i] = numbers.get(i);
        }
        return arr2;
    }

    /**
     * @param ints array of Integer objects
     * @return all ints which are not divisible by 3
     * given an array of integers, named `ints` return an identical array with numbers indivisible by 3 removed
     */
    public Integer[] deleteMultiplesOf3(Integer[] ints) {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(ints));
        numbers.removeIf(number -> number%3 == 0);
        Integer [] arr2 = new Integer[numbers.size()];
        for(int i = 0; i< arr2.length; i++){
            arr2[i] = numbers.get(i);
        }
        return arr2;
    }

    /**
     * @param ints array of Integer objects
     * @param multiple the multiple to evaluate divisibility against
     * @return all ints which are not divisible by the `multiple` specified
     * given an array of integers, named `ints` return an identical array with numbers indivisible by `multiple` removed
     */
    public Integer[] deleteMultiplesOfN(Integer[] ints, int multiple) {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(ints));
        numbers.removeIf(number -> number%multiple == 0);
        Integer [] arr2 = new Integer[numbers.size()];
        for(int i = 0; i< arr2.length; i++){
            arr2[i] = numbers.get(i);
        }
        return arr2;
    }
}
