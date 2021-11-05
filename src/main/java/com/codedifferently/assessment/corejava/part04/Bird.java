package com.codedifferently.assessment.corejava.part04;

public abstract class Bird implements Animal {
    //interface can't implement interface
    //going to follow the readme instead of the uml
    private String move;
    private String color;
    private Integer speed;

    public Bird(String color, Integer speed){
        move = "fly";
        this.color = color;
        this.speed = speed;
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

    public int getSpeed() { //doesn't like Integer return type
        return speed;
    }


    public void setSpeed(Integer speed) {
        this.speed = speed;
    }


}
