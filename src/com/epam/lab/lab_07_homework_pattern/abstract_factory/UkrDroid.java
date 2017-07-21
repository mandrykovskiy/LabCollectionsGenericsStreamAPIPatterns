package com.epam.lab.lab_07_homework_pattern.abstract_factory;

public class UkrDroid implements MoveDroid {
    @Override
    public void move() {
        System.out.println("UkrDroid is moving");
    }

    @Override
    public void stop() {
        System.out.println("UkrDroid stop");
    }
}
