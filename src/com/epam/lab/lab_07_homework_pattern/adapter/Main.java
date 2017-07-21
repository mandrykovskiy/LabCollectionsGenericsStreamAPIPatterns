package com.epam.lab.lab_07_homework_pattern.adapter;

public class Main {
    public static void main(String[] args) {
        NewDroid newDroid=new NewDroid();
        new DroidUser().useDroid(newDroid);

        OldDroid oldDroid = new OldDroid();
        Adapter adapter=new Adapter(oldDroid);
        new DroidUser().useDroid(adapter);

    }
}
