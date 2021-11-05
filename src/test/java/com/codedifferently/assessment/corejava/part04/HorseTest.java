package com.codedifferently.assessment.corejava.part04;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class HorseTest {
    public Horse testHorse;


@BeforeEach
    public void setup(){
       testHorse= new Horse("gallop","Black",25);
    }

@Test
    public void setTestHorseColor(){
    testHorse.setColor("Black");
    String expected = "Black";
    String actual = testHorse.getColor();
    Assertions.assertEquals(expected,actual);
}
@Test
    public void setTestHorseMove(){
        testHorse.setMove("gallop");
        String expected = "gallop";
        String actual = testHorse.getMove();
        Assertions.assertEquals(expected,actual);
    }
    @Test
    public void setTestHorseSpeed(){
        testHorse.setSpeed(25);
        Integer expected = 25;
        Integer actual = testHorse.getSpeed();
        Assertions.assertEquals(expected,actual);
    }
}



