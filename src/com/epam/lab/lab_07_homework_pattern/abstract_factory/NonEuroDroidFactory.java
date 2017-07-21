package com.epam.lab.lab_07_homework_pattern.abstract_factory;

public class NonEuroDroidFactory implements DroidFactory {
    @Override
    public MoveDroid createMoveDroid() {
        return new SiryDroid();
    }

    @Override
    public FlyDroid createFlyDroid() {
        return new BrasilDroid();
    }
}
