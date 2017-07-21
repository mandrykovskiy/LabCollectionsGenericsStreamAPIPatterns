package com.epam.lab.lab_07_homework_pattern.abstract_factory;

public class Application {
    public Application() {
        run();
    }

    private void run() {
        EuroDroidFactory euroDroidFactory = new EuroDroidFactory();
        euroDroidFactory.createFlyDroid().fly();

        NonEuroDroidFactory nonEuroDroidFactory = new NonEuroDroidFactory();
        nonEuroDroidFactory.createMoveDroid().move();
    }
}
