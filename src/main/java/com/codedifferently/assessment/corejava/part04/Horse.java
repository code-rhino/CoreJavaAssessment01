package com.codedifferently.assessment.corejava.part04;

public class Horse {
    private String move;
    private String color;
    private Integer speed;

    public Horse(String color, Integer speed) {
        this.color = color;
        this.speed = speed;
        this.move = "gallop";
    }

    public String getColor() {
        return color;
    }

    public String getMove() {
        return move;
    }

    public void setMove(String move) {
        this.move = move;
    }

    public Integer getSpeed() {
        return speed;
    }

    public void setSpeed(Integer speed) {
        this.speed = speed;
    }
}
