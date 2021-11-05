package com.codedifferently.assessment.corejava.part03;

public class MultiplesDeleter {
    /**
     * @param ints array of Integer objects
     * @return all ints which are not divisible by 2
     * given an array of integers, named `ints` return an identical array with evens removed
     */
    public Integer[] deleteEvens(Integer[] ints) {

        //First, loop through in to see how many will be odd(not even). This number will be the length of out.
        // Then using the same code, have to populate out.
        int actualLength = 0;
        for (int i = 0; i < ints.length; i++) {
            if (ints[i] % 2 != 0) {
                actualLength++;
            }
        }
        Integer[] actual = new Integer[actualLength];
        int counter = 0;
        for (int i = 0; i < ints.length; i++) {
            if (ints[i] % 2 != 0) {
                actual[counter] = ints[i];
                counter++;
            }
        }
        return actual;
    }

    /**
     * @param ints array of Integer objects
     * @return all ints which are divisible by 2
     * given an array of integers, named `ints` return an identical array with odds removed
     */
    public Integer[] deleteOdds(Integer[] ints) {
        int actualLength = 0;
        for (int i = 0; i < ints.length; i++) {
            if (ints[i] % 2 == 0) {
                actualLength++;
            }
        }
        Integer[] actual = new Integer[actualLength];
        int counter = 0;
        for (int i = 0; i < ints.length; i++) {
            if (ints[i] % 2 == 0) {
                actual[counter] = ints[i];
                counter++;
            }
        }
        return actual;
    }

    /**
     * @param ints array of Integer objects
     * @return all ints which are not divisible by 3
     * given an array of integers, named `ints` return an identical array with numbers indivisible by 3 removed
     */
    public Integer[] deleteMultiplesOf3(Integer[] ints) {
        int actualLength = 0;
        for (int i = 0; i < ints.length; i++) {
            if (ints[i] % 3 == 0) {
                actualLength++;
            }
        }
        Integer[] actual = new Integer[actualLength];
        int counter = 0;
        for (int i = 0; i < ints.length; i++) {
            if (ints[i] % 3 == 0) {
                actual[counter] = ints[i];
                counter++;
            }
        }
        return actual;
    }

    /**
     * @param ints array of Integer objects
     * @param multiple the multiple to evaluate divisibility against
     * @return all ints which are not divisible by the `multiple` specified
     * given an array of integers, named `ints` return an identical array with numbers indivisible by `multiple` removed
     */
    public Integer[] deleteMultiplesOfN(Integer[] ints, int multiple) {
        int actualLength = 0;
        for (int i = 0; i < ints.length; i++) {
            if (ints[i] % multiple == 0) {
                actualLength++;
            }
        }
        Integer[] actual = new Integer[actualLength];
        int counter = 0;
        for (int i = 0; i < ints.length; i++) {
            if (ints[i] % multiple == 0) {
                actual[counter] = ints[i];
                counter++;
            }
        }
        return actual;
    }
}
