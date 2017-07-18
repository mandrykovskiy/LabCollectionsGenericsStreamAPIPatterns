package com.epam.lab.lab_05_homework.generic_class;

public class Main {
    public static void main(String[] args) {
        ShipWithDroid<Droid> ship = new ShipWithDroid<>();
        ship.putDroids(new DefenceDriod(400,200));
        ship.putDroids(new AttackDroid(250,150));
        ship.putDroids(new RepairDroid(160,80));
        System.out.println(ship.toString());
        System.out.println(ship.getDroids(2));

    }
}
