package com.epam.lab.lab_07_homework_pattern.decorator;

public class AttackDroid  extends DroidDecorator{
    public AttackDroid(Droid droid) {
        super(droid);
    }

    public String attack(){
        return "Droid Attack ";
    }

    @Override
    public String move() {
        return super.move()+attack();
    }
}
