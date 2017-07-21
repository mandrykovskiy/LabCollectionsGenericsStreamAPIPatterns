package com.epam.lab.lab_07_homework_pattern.adapter;

public class NewDroid implements NewComunicator {
    private String name;
    private int health;
    private int damage;

    @Override
    public void multilateralCommunication() {
        System.out.println("multilateralCommunication");
    }
}
