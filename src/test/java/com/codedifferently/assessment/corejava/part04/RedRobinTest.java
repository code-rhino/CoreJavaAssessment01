package com.codedifferently.assessment.corejava.part04;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class RedRobinTest {
    RedRobin redRobin;

    @BeforeEach
    private void setUp(){
        redRobin = new RedRobin(123, "red");
    }

    @Test
    public void colorTest() {

        String expected = "red";
        String actual = redRobin.getColor();

        Assertions.assertEquals(expected, actual);
    }

}
