package com.codedifferently.assessment.corejava.part04;

public class RedRobin extends Bird{
   private Integer speed;

    public RedRobin(String color, Integer speed) {
        super(color, speed);
    }

    @Override
    public String move() {
        return null;
    }

    @Override
    public int getSpeed() {
        return 0;
    }

    @Override
    public String color() {
        return "blue";
    }
}
