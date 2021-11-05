package com.codedifferently.assessment.corejava.part04;


public abstract class Bird implements Animal{
    private String move;
    private String color;
    private Integer speed;

    public Bird(String color, Integer speed) {
        this.color = color;
        this.speed = speed;
    }


}
