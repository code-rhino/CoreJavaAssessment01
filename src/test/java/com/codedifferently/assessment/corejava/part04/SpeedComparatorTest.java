package com.codedifferently.assessment.corejava.part04;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SpeedComparatorTest {
BlueJay testBlueJay;
RedRobin testRedRobin;
SpeedComparator testSpeedComparator;
    @BeforeEach
    void setUp() {
        testBlueJay = new BlueJay("blue",5);
        testRedRobin = new RedRobin("blue",7);
        testSpeedComparator = new SpeedComparator();
    }

    @Test
    void compare() {
        Integer expected = -1;
        Integer actual = testSpeedComparator.compare(testRedRobin,testBlueJay);
        Assertions.assertEquals(expected,actual);
    }
}