package com.codedifferently.assessment.corejava.part04;

public abstract class Bird implements Animal {

    private String move;
    private int speed;
    private String color;

    public String getMove() {
        return move;
    }

    public void setMove(String move) {
        this.move = move;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Bird(int speed, String color) {
        this.move = "fly";
        this.speed = speed;
        this.color = color;

    }
}
