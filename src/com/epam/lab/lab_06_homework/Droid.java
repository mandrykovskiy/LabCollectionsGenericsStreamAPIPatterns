package com.epam.lab.lab_06_homework;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Droid implements Serializable {
    String name;
     transient int hp;

    public Droid(String name, int hp) {
        this.name = name;
        this.hp = hp;
    }
}
