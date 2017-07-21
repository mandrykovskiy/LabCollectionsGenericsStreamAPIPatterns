package com.epam.lab.lab_07_homework_pattern.factory_method;

public class BundesDroid implements Droid {
    @Override
    public void move() {
        System.out.println("BundesDroid is moving");
    }

    @Override
    public void fight() {
        System.out.println("BundesDroid is fighting");
    }
}
