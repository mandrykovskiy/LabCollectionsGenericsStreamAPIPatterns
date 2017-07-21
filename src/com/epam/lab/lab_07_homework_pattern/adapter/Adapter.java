package com.epam.lab.lab_07_homework_pattern.adapter;

public class Adapter implements NewComunicator {

    private OldDroid _adaptee;
    public Adapter(OldDroid adaptee){
        _adaptee = adaptee;
    }

    @Override
    public void multilateralCommunication() {
        _adaptee.oneWayCommunication();
    }
}
