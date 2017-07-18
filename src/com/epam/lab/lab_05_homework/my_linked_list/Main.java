package com.epam.lab.lab_05_homework.my_linked_list;

import com.epam.lab.lab_05_homework.generic_class.AttackDroid;
import com.epam.lab.lab_05_homework.generic_class.DefenceDriod;
import com.epam.lab.lab_05_homework.generic_class.Droid;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        Droids<Droid> droids = new Droids<Droid>();
        droids.putDroids(new AttackDroid(123, 125));
        droids.putDroids(new DefenceDriod(256, 586));
        Iterator iterator = droids.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("_______________________________");
        System.out.println(droids.getDroids(1));
    }

}
