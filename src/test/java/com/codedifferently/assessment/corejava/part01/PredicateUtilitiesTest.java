package com.codedifferently.assessment.corejava.part01;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PredicateUtilitiesTest {
    PredicateUtilities predicateUtilities;

    @BeforeEach
    public void setUp(){
        predicateUtilities = new PredicateUtilities();
    }

    @Test
    public void isEvenTest1() {
        Integer value = 0;
        Boolean expected = predicateUtilities.isEven(value);
        Assertions.assertTrue(expected);
    }

    @Test
    public void isEvenTest2() {
        Integer value = 1;
        Boolean expected = predicateUtilities.isEven(value);
        Assertions.assertFalse(expected);
    }

    @Test
    public void isEvenTest3() {
        Integer value = 2;
        Boolean expected = predicateUtilities.isEven(value);
        Assertions.assertTrue(expected);
    }

    @Test
    public void isEvenTest4() {
        Integer value = 3;
        Boolean expected = predicateUtilities.isEven(value);
        Assertions.assertFalse(expected);
    }

    @Test
    public void isMultipleOf3Test1() {
        Integer value = 1;
        Boolean expected = predicateUtilities.isMultipleOf3(value);
        Assertions.assertFalse(expected);
    }

    @Test
    public void isMultipleOf3Test2() {
        Integer value = 3;
        Boolean expected = predicateUtilities.isMultipleOf3(value);
        Assertions.assertTrue(expected);
    }

    @Test
    public void isMultipleOf3Test3() {
        Integer value = 7;
        Boolean expected = predicateUtilities.isMultipleOf3(value);
        Assertions.assertFalse(expected);
    }

    @Test
    public void isMultipleOf3Test4() {
        Integer value = 6;
        Boolean expected = predicateUtilities.isMultipleOf3(value);
        Assertions.assertTrue(expected);
    }

    @Test
    public void isMultipleOf3Test5() {
        Integer value = 9;
        Boolean expected = predicateUtilities.isMultipleOf3(value);
        Assertions.assertTrue(expected);
    }

    @Test
    public void isMultipleOfNTest1() {
        Integer value = 1;
        Integer multiple = 2;
        Boolean expected = predicateUtilities.isMultipleOfN(value, multiple);
        Assertions.assertFalse(expected);
    }

    @Test
    public void isMultipleOfNTest2() {
        Integer value = 3;
        Integer multiple = 3;
        Boolean expected = predicateUtilities.isMultipleOfN(value, multiple);
        Assertions.assertTrue(expected);
    }

    @Test
    public void test3() {
        Integer value = 7;
        Integer multiple = 5;
        Boolean expected = predicateUtilities.isMultipleOfN(value, multiple);
        Assertions.assertFalse(expected);
    }

    @Test
    public void test4() {
        Integer value = 8;
        Integer multiple = 4;
        Boolean expected = predicateUtilities.isMultipleOfN(value, multiple);
        Assertions.assertTrue(expected);
    }

    @Test
    public void test5() {
        Integer value = 12;
        Integer multiple = 6;
        Boolean expected = predicateUtilities.isMultipleOfN(value, multiple);
        Assertions.assertTrue(expected);
    }

    @Test
    public void startsWithCapitalLetterTest1() {
        String value = "The";
        Boolean expected = predicateUtilities.startsWithCapitalLetter(value);
        Assertions.assertTrue(expected);
    }

    @Test
    public void startsWithCapitalLetterTest2() {
        String value = "quick";
        Boolean expected = predicateUtilities.startsWithCapitalLetter(value);
        Assertions.assertFalse(expected);
    }

    @Test
    public void startsWithCapitalLetterTest3() {
        String value = "%^&*";
        Boolean expected = predicateUtilities.startsWithCapitalLetter(value);
        Assertions.assertFalse(expected);
    }

    @Test
    public void startsWithCapitalLetterTest4() {
        String value = "fox";
        Boolean expected = predicateUtilities.startsWithCapitalLetter(value);
        Assertions.assertFalse(expected);
    }

    @Test
    public void startsWithCapitalLetterTest5() {
        String value = "Jumps";
        Boolean expected = predicateUtilities.startsWithCapitalLetter(value);
        Assertions.assertTrue(expected);
    }


}
