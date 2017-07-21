package com.epam.lab.lab_07_homework_pattern.abstract_factory;

public class SiryDroid implements MoveDroid {
    @Override
    public void move() {
        System.out.println("SiryDroid is moving");
    }

    @Override
    public void stop() {
        System.out.println("SiryDroid stop");
    }
}
