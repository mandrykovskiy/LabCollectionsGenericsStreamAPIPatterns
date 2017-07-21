package com.epam.lab.lab_07_homework_pattern.abstract_factory;

public class BrasilDroid implements FlyDroid {
    @Override
    public void fly() {
        System.out.println("BrasilDroid is flying");
    }
}
