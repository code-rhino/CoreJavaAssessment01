package com.codedifferently.assessment.corejava.part04;

public class Horse implements Animal{
    private String move;
    private String color;
    private Integer speed;

    public Horse(String color, Integer speed) {
        this.color = color;
        this.speed = speed;
    }
    @Override
    public String move() {
        return move;
    }
    @Override
    public String color() {
        return color;
    }
    public String getColor() {
        return color;
    }


    public String setMove(String move) {
        this.move = move;
    }



    public Integer getSpeed(){
        return speed;
    }


    public void setSpeed(Integer speed){
        this.speed = speed;
    }

}


