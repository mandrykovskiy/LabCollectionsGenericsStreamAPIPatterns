package com.epam.lab.lab_05_homework.my_linked_list;


import com.epam.lab.lab_05_homework.generic_class.Droid;

import java.util.Iterator;

public class Droids<T extends Droid> implements Iterable<T>{
    public MyLinkedList<T> list;
    Droid droid;

    public Droids() {
        list = new MyLinkedList<T>();
    }

    public void putDroids(T droid) {
        list.addLast(droid);
    }

    public T getDroids(int index) {
        return list.getElementByIndex(index);

    }

    @Override
    public String toString() {
        return "Droids{" +
                "list=" + list +
                ", droid=" + droid +
                '}';
    }

    @Override
    public Iterator<T> iterator() {
        return  list.iterator();
    }
}
