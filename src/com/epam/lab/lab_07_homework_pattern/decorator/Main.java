package com.epam.lab.lab_07_homework_pattern.decorator;

public class Main {
    public static void main(String[] args) {
        Droid droid = new AttackDroid(new DefenceDroid(new BasicDroid()));
        System.out.println(droid.move());
    }
}
