# Core Java Assessment (Let's Go!!)

## Part 1

In part one you have a class called `PredicateUtilities`, the method's are all returning null. You have to complete all of these classes so that the test in `PredicateUtilitiesTest` all pass!

### Problem 01 : isEven 

```
    /**
     * @param value - the value to be evaluated
     * @return true if `value` is a multiple of 2
     */
    public Boolean isEven(Integer value) {
        return null;
    }
```

### Problem 02 : isOdd

```
    /**
     * @param value - the value to be evaluated
     * @return true if `value` is not a multiple of 2
     */
    public Boolean isOdd(Integer value) {
        return null;
    }
```

### Problem 03 : isMultipleOf3

```
    /**
     * @param value - the value to be evaluated
     * @return true if `value` is a multiple of 3
     */
    public Boolean isMultipleOf3(Integer value) {
        return null;
    }
```

### Problem 04 : isMultipleOfN

```
    /**
     *
     * @param value - the value to be evaluated
     * @param multiple - the multiple to test `value` against
     * @return true if `value` is a multiple of `multiple`
     */
    public Boolean isMultipleOfN(Integer value, Integer multiple) {
        return null;
    }
```

### Problem 05 : startsWithCapitalLetter

```
    /**
     * @param string - the string to be evaluated
     * @return true if `string` starts with a capital letter
     */
    public Boolean startsWithCapitalLetter(String string) {
        return null;
    }
```

## Part 2

In part one you have a class called `IntegerArrayUtils`, the method's are all returning null. You have to complete all of these classes so that the test in `IntegerArrayUtilsTest` all pass!

### Problem 01 : add 

    /**
     * @param integerArray - array to have value added to it
     * @param valueToBeAdded - value to be added to the end of the array
     * @return - identical array with one additional element of `valueToBeAdded` at the end of the array
     */
    public static Integer[] add(Integer[] integerArray, Integer valueToBeAdded) {
        return null;
    }

### Problem 02 : replace

```
    /**
     * @param integerArray - array to be manipulated
     * @param indexToInsertAt - index of the element to be inserted at
     * @param valueToBeInserted - value of the element to be inserted
     * @return `integerArray` with `valueToBeInserted` at index number `indexToInsertAt`
     */
    public static Integer[] replace(Integer[] integerArray, int indexToInsertAt, Integer valueToBeInserted) {
        return null;
    }
```

### Problem 03 : get

```
    /**
     * @param integerArray - array to be evaluated
     * @param indexToFetch - index of element to be returned
     * @return element located at `indexToFetch`
     */
    public static Integer get(Integer[] integerArray, Integer indexToFetch) {
        return null;
    }
```

### Problem 04 : incrementEvenDecrementOdd

```
    /**
     * @param integerArray - array to be evaluated
     * @return identical array with even-values incremented by 1 and odd-values decremented by 1
     */
    public static Integer[] incrementEvenDecrementOdd(Integer[] integerArray) {
        return null;
    }
```

### Problem 05 : incrementEven

```
    /**
     * @param integerArray - array to be evaluated
     * @return identical array with even-values incremented by 1
     */
    public static Integer[] incrementEven(Integer[] integerArray) {
        return null;
    }
```

### Problem 06 : decrementOdd

```
    /**
     * @param input - array to be evaluated
     * @return identical array with odd-values decremented by 1
     */
    public static Integer[] decrementOdd(Integer[] input) {
        return null;
    }
```

## Part 3

### Problem 01 : deleteEvens

```
    /**
     * @param ints array of Integer objects
     * @return all ints which are not divisible by 2
     * given an array of integers, named `ints` return an identical array with evens removed
     */
    public Integer[] deleteEvens(Integer[] ints) {
        return null;
    }
```

### Problem 02 : deleteOdds

```
    /**
     * @param ints array of Integer objects
     * @return all ints which are divisible by 2
     * given an array of integers, named `ints` return an identical array with odds removed
     */
    public Integer[] deleteOdds(Integer[] ints) {
        return null;
    }
```

### Problem 03 : deleteMultiplesOf3

```
    /**
     * @param ints array of Integer objects
     * @return all ints which are not divisible by 3
     * given an array of integers, named `ints` return an identical array with numbers indivisible by 3 removed
     */
    public Integer[] deleteMultiplesOf3(Integer[] ints) {
        return null;
    }
```

### Problem 04 : deleteMultiplesOfN

```
    /**
     * @param ints array of Integer objects
     * @param multiple the multiple to evaluate divisibility against
     * @return all ints which are not divisible by the `multiple` specified
     * given an array of integers, named `ints` return an identical array with numbers indivisible by `multiple` removed
     */
    public Integer[] deleteMultiplesOfN(Integer[] ints, int multiple) {
        return null;
    }
```
## Part 4

Create the following animals, with UNIT TEST!!!!!:

1. Create `Horse` is a concrete class which implements Animal.
    - `move` will return the string `"gallop"`
    - `color` will return the string `"brown"` (Yes I am aware not all horses are brown.)
    - `getSpeed` will return `40`
2. Create `Bird` is an abstract class that implements Animal.
    - `move` will return the string `"fly"` (Yes I am aware not all birds fly.)
3. Create `BlueJay` is a concrete class which extends from Bird
    - `color` will return the string `"blue"`
    - `speed` will return `13`
4. Create `RedRobin` is a concrete class which extends from Bird
    - `color` will return the string `"red"`
    - `speed` will return `10`
    - Add a `String migrationMonth` field. Add a getter and setter for it.

## Part 5 - The harmless ransom note

The harmless ransom note is simply a note made of words cut out from a magazine text, Imagine that a kidnapper wants to write a ransom note and he doesn't want it to be handwritten and be traced back to him so he got a magazine and cuts off a whole word and use them to create an untraceable replica of his ransom note.

Note that the words are case-sensitive and must use only whole words available in the magazine, you cannot use substrings or concatenation to create the words and cannot use repeat the words unless there is an available replica of the word.

```
Example 1 :
ransome_note = "this is a secret note for you from a secret admirer";
magazine_text= "puerto rico is a great place you must hike far from "
+"town to find a secret waterfall that i am an admirer of but note that"
+" it is not as hard as it seems this is my advice for you"
```

The harmless ransom note will return false because the word "secret" is used twice and it's found once in the magazine text.

```
Example 2 :
ransome_note = "this is a note for you from a secret admirer";
magazine_text= "puerto rico is a great place you must hike far from "
+"town to find a secret waterfall that i am an admirer of but note that"
+" it is not as hard as it seems this is my advice for you"
```

The harmless ransom note will return true because the word "secret" is used once and it's found once in the magazine text.
