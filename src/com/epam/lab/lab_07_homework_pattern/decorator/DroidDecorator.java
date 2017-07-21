package com.epam.lab.lab_07_homework_pattern.decorator;

public class DroidDecorator implements Droid {
    protected Droid droid;

    public DroidDecorator(Droid droid) {
        this.droid = droid;
    }

    @Override
    public String move() {
        return droid.move();
    }
}
