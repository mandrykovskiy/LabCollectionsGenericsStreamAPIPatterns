package com.epam.lab.lab_05_homework;

class DefenceDriod extends Droid {
    private int defence;

    DefenceDriod(int hp, int defence) {
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
