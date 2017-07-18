package com.epam.lab.lab_05_homework.generic_class;

public class RepairDroid extends Droid {
    public int repairPower;

    public RepairDroid(int hp, int repairPower) {
        super(hp);
        this.repairPower = repairPower;
    }

    @Override
    public String toString() {
        return "RepairDroid{" +
                "hp=" + hp +
                ", repairPower=" + repairPower +
                '}';
    }

    public int getRepairPower() {
        return repairPower;
    }

    public void setRepairPower(int repairPower) {
        this.repairPower = repairPower;
    }
}
