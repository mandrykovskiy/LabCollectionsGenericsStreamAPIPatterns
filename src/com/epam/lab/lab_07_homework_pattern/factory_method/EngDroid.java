package com.epam.lab.lab_07_homework_pattern.factory_method;

public class EngDroid implements Droid {
    @Override
    public void move() {
        System.out.println("EngDroid is moving");
    }

    @Override
    public void fight() {
        System.out.println("EngDroid is fighting");
    }
}
