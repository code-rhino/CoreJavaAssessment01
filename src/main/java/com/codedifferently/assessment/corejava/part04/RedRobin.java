package com.codedifferently.assessment.corejava.part04;

public class RedRobin extends Bird {

    public RedRobin(int speed,String color) {
        super(speed, color);
        this.setColor("red");
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
