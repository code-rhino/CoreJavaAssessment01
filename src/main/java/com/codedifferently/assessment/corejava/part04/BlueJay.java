package com.codedifferently.assessment.corejava.part04;

public class BlueJay extends Bird{
    private Integer speed;


    public BlueJay(String color, Integer speed) {
        super(color, speed);

    }

    @Override
    public String move() {
        return "fly";
    }

    @Override
    public int getSpeed() {
        return 0;
    }

    @Override
    public String color() {
        return null;
    }
}
