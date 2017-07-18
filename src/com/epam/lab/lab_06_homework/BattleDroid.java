package com.epam.lab.lab_06_homework;

public class BattleDroid extends Droid {
    int attack;

    public BattleDroid(String name, int hp, int attack) {
        super(name, hp);
        this.attack = attack;
    }
}
