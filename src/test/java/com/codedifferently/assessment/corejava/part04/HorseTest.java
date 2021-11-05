package com.codedifferently.assessment.corejava.part04;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class HorseTest {

    Horse horse;

    @BeforeEach
    private void setUp(){
        horse = new Horse("gallop", 67889, "brown");
    }


    @Test
    public void moveTest() {

        String expected = "gallop";
        String actual = horse.getMove();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void colorTest() {

        String expected = "brown";
        String actual = horse.getColor();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void speedTest() {

        int expected = 67889;
        int actual = horse.getSpeed();

        Assertions.assertEquals(expected, actual);
    }
}
