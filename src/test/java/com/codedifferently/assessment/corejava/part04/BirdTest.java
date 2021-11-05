package com.codedifferently.assessment.corejava.part04;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

    public class BirdTest {
    public Bird testBird;
    @BeforeEach
    public void setup() {
        testBird = new Bird(null, null, 0) {
            @Override
            public String move() {
                return null;
            }

            @Override
            public Integer speed() {
                return null;
            }

            @Override
            public String color() {
                return null;
            }
        };
    }

    @Test
    public void testConstructor() {
    String move = "fly";

    String expected=  "Bird{" +
            "move='" + move + '\'' +
            '}';
    String actual = testBird.toString();
    Assertions.assertEquals(expected, actual);
}
}
