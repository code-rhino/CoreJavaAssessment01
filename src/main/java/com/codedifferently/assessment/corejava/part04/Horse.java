package com.codedifferently.assessment.corejava.part04;

public class Horse implements Animal{
    private String move;
    private String color;
    private Integer speed;

    public Horse(String color, Integer speed){
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

    @Override
    public String move() {
        return null;
    }

    public int getSpeed() { //doesn't like Integer return type
        return speed;
    }

    @Override
    public String color() {
        return null;
    }

    public void setSpeed(Integer speed) {
        this.speed = speed;
    }
}
