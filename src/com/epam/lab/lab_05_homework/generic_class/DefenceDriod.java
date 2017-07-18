package com.epam.lab.lab_05_homework.generic_class;

public class DefenceDriod extends Droid {
    public int defence;

    public DefenceDriod(int hp, int defence) {
        super(hp);
        this.defence = defence;
    }

    public int getDefence() {
        return defence;
    }

    public void setDefence(int defence) {
        this.defence = defence;
    }

    @Override
    public String toString() {
        return "DefenceDriod{" +
                "hp=" + hp +
                ", defence=" + defence +
                '}';
    }
}
