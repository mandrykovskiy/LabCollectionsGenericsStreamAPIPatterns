package com.epam.lab.lab_04_classwok;

public enum Level {
    NAME("1"), TYPE("2"), LOCATION("3");
    private String buttonNumber;

    Level(String buttonNumber) {
        this.buttonNumber = buttonNumber;
    }

    public String getButtonNumber() {
        return buttonNumber;
    }
}
