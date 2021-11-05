package com.codedifferently.assessment.corejava.part04;

abstract class Bird implements Animal {

    private String move;
    private String color;
    private Integer speed;

    public Bird(String move, String color, Integer speed) {
        this.move = move;
        this.color = color;
        this.speed = speed;
    }


    public String getMove() {
        return move;
    }

    public void setMove(String move) {
        this.move = move;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setSpeed(Integer speed) {
        this.speed = speed;
    }

    public Integer getSpeed(){
        return speed;
    }


    public Bird(String move) {
        this.move = move;
    }

    @Override
    public String toString() {
        return "Bird{" +
                "move='" + move + '\'' +
                '}';
    }
}