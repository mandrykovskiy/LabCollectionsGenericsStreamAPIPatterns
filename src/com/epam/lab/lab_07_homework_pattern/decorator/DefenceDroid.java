package com.epam.lab.lab_07_homework_pattern.decorator;

public class DefenceDroid extends DroidDecorator {
    public DefenceDroid(Droid droid) {
        super(droid);
    }

    public String defence(){
        return "Droid defence ";
    }

    @Override
    public String move() {
        return super.move()+defence();
    }
}
