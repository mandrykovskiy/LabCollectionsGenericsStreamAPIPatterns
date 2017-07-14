package com.epam.lab.lab_05_homework;

/*Write your generic class – ship with droids. You can put and get droids from ship.
Try to implement it using wildcards.
*/

import java.util.LinkedList;
import java.util.List;

public class ShipWithDroid<T extends Droid> {
    public List<? extends Droid> list;

    public ShipWithDroid() {
        list=new LinkedList<>();
    }
    public  void putDroids(Droid droid){
        list.add(<? extends Droid> droid);
    }


}
