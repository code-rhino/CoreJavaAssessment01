package com.codedifferently.assessment.corejava.part04;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class SpeedComparatorTest {

    SpeedComparator speedComparator;
    Horse mal1;
    Horse mal2;
    int result;

    @BeforeEach
    public void setUp() {
          mal1.setSpeed(10);
          mal2.setSpeed(10);
    }


    @Test
    @DisplayName("Compare Test - Same speed")
    public void compare01(){

result = speedComparator.compare(mal1, mal2);
        Assertions.assertTrue(result == 0,"be equal");

    }



}
