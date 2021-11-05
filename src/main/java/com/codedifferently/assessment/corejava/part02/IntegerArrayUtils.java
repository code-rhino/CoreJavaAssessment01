package com.codedifferently.assessment.corejava.part02;

public class IntegerArrayUtils {
    /**
     * @param integerArray   - array to have value added to it
     * @param valueToBeAdded - value to be added to the end of the array
     * @return - identical array with one additional element of `valueToBeAdded` at the end of the array
     */
    public static Integer[] add(Integer[] integerArray, Integer valueToBeAdded) {

        Integer[] loveNumbs = new Integer[integerArray.length + 1];
        for (int i = 0; i < integerArray.length; i++) {
            loveNumbs[i] = integerArray[i];
        }
        loveNumbs[loveNumbs.length - 1] = valueToBeAdded;
        return loveNumbs;
    }

    /**
     * @param integerArray      - array to be manipulated
     * @param indexToInsertAt   - index of the element to be inserted at
     * @param valueToBeInserted - value of the element to be inserted
     * @return `integerArray` with `valueToBeInserted` at index number `indexToInsertAt`
     */
    public static Integer[] replace(Integer[] integerArray, int indexToInsertAt, Integer valueToBeInserted) {

        Integer[] loveMoreNumbs = new Integer[integerArray.length + 1];
        for (int i = 0; i < integerArray.length; i++) {
            loveMoreNumbs[i] = integerArray[i];
        }
        loveMoreNumbs[loveMoreNumbs.length - 1] = indexToInsertAt;
        return loveMoreNumbs;
    }


    /**
     * @param integerArray - array to be evaluated
     * @param indexToFetch - index of element to be returned
     * @return element located at `indexToFetch`
     */
    public static Integer get(Integer[] integerArray, Integer indexToFetch) {


//        Integer[] moreNumbs = new Integer[integerArray.length + 1];
//        for (int i = 0; i < integerArray.length; i++) {
//            moreNumbs[i] = integerArray[i];
//        }
//        moreNumbs[moreNumbs.length - 1] = indexToFetch;
//        return moreNumbs;
//    }





    /**
     * @param integerArray - array to be evaluated
     * @return identical array with even-values incremented by 1 and odd-values decremented by 1
     */
    public static Integer[] incrementEvenDecrementOdd(Integer[] integerArray) {
        return null;
    }

    /**
     * @param integerArray - array to be evaluated
     * @return identical array with even-values incremented by 1
     */
    public static Integer[] incrementEven(Integer[] integerArray) {
        return null;
    }

    /**
     * @param input - array to be evaluated
     * @return identical array with odd-values decremented by 1
     */
    public static Integer[] decrementOdd(Integer[] input) {
        return null;
    }

    int [] lovenums = {1,2,3,4,5,6,7,10};
}
