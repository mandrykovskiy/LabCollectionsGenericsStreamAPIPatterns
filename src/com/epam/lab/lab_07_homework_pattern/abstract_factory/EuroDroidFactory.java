package com.epam.lab.lab_07_homework_pattern.abstract_factory;

public class EuroDroidFactory implements DroidFactory {
    @Override
    public MoveDroid createMoveDroid() {

        return new UkrDroid();
    }

    @Override
    public FlyDroid createFlyDroid() {
        return new BundesDroid();
    }
}
