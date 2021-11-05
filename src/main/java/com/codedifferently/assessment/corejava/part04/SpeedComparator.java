package com.codedifferently.assessment.corejava.part04;

import java.util.Comparator;

public class SpeedComparator implements Comparator<Animal> {

    @Override
    public int compare(Animal o1, Animal o2) {

        int result = 10;
        if(o1.getSpeed() == o2.getSpeed()){
            result= 0;
        } else if(o1.getSpeed() > o2.getSpeed()){
             result = -10;
        }
        return result;
    }

}
