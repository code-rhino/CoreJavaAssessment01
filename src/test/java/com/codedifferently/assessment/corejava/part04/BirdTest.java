package com.codedifferently.assessment.corejava.part04;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BirdTest {

        Bird bird;

        @BeforeEach
        private void setUp() {
        }

        @Test
        public void moveTest() {

            String expected = "fly";
            String actual = bird.getMove();

            Assertions.assertEquals(expected, actual);

        }
    }
