package com.epam.lab.lab_05_homework;

import java.util.LinkedList;

public class ShipWithDroid<T extends Droid> {
     public LinkedList<T> droids;

    public ShipWithDroid(LinkedList<T> droids) {
        this.droids = droids;
    }

//    public void putDroid(ShipWithDroid shipWithDroid, Droid<? extends Droid> droid){
//
//    }
}
