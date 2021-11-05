package com.codedifferently.assessment.corejava.part04;

import java.util.Comparator;

public class SpeedComparator implements Comparator<Animal> {
    @Override
    public int compare(Animal animal1, Animal animal2) {
        return animal1.getSpeed()
    }

}



