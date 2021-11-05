package com.codedifferently.assessment.corejava.part04;

public class Horse implements Animal{

    private String move;
    private int speed;
    private String color;

    public Horse(String move, int getSpeed, String color) {
        this.move = "gallop";
        this.speed = 67889;
        this.color ="brown";


    }
    public String getMove() {
        return move;
    }

    public void setMove(String move) {
        this.move = move;
    }
    public int getSpeed() {
        return speed;
    }

    public void setGetSpeed(int getSpeed) {
        this.speed = speed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


    @Override
    public String move() {
        return this.move;
    }

    @Override
    public int speed() {
        return this.speed;
    }

    @Override
    public String color() {
        return this.color;
    }

}
