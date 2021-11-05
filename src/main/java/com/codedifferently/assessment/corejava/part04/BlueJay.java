package com.codedifferently.assessment.corejava.part04;

public class BlueJay extends Bird{

    public BlueJay(int speed, String color) {
        super(speed, color);
        this.setColor("blue");
    }

    @Override
    public String move() {
        return this.getMove();
    }

    @Override
    public int speed() {
        return this.getSpeed();
    }

    @Override
    public String color() {
        return this.getColor();
    }
}
