package com.epam.lab.lab_07_homework_pattern.factory_method;

public class UkraineDriod implements Droid {
    @Override
    public void move() {
        System.out.println("UkrDroid is moving");
    }

    @Override
    public void fight() {
        System.out.println("UkrDroid is fighting");
    }
}
