package com.epam.lab.lab_05_homework;

class AttackDroid extends Droid{
    private int attack;

    AttackDroid(int hp, int attack) {
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
