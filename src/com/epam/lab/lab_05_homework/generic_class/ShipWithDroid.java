package com.epam.lab.lab_05_homework.generic_class;

/*Write your generic class – ship with droids. You can put and get droids from ship.
Try to implement it using wildcards.
*/

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ShipWithDroid<T extends Droid> implements Iterable {
    public List<T> list;
    Droid droid;

    public ShipWithDroid() {
        list = new LinkedList<T>();
    }

    public void putDroids(T droid) {
        list.add(droid);
    }

    public T getDroids(int i) {
        try {
            return list.get(i);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Такого елементу не існує");            ;
        }
        return null;
    }

    @Override
    public String toString() {
        return "ShipWithDroid{" +
                "list=" + list +
                ", droid=" + droid +
                '}';
    }

    @Override
    public Iterator iterator() {
        return null;
    }
}
