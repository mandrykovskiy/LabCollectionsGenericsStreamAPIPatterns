package com.epam.lab.lab_05_homework.generic_class;

public class AttackDroid extends Droid{
    public int attack;

    public AttackDroid(int hp, int attack) {
        super(hp);
        this.attack = attack;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    @Override
    public String toString() {
        return "AttackDroid{" +
                "hp=" + hp +
                ", attack=" + attack +
                '}';
    }
}
