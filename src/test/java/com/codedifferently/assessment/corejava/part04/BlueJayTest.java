package com.codedifferently.assessment.corejava.part04;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BlueJayTest {

    BlueJay blueJay;

        @BeforeEach
        private void setUp(){
            blueJay = new BlueJay(123, "blue");
        }

        @Test
        public void colorTest() {

            String expected = "blue";
            String actual = blueJay.getColor();

            Assertions.assertEquals(expected, actual);
        }

    }
