package com.epam.lab.lab_07_homework_pattern.prototype;

public class Main {
    public static void main(String[] args) {
        Droid droid=new Droid("Altron",6000,500,800);
        DroidCopyFactory copyFactory = new DroidCopyFactory(droid);
        Droid copyDroid = copyFactory.copyDroid();
        System.out.println(droid);
        copyDroid.setAttack(1500);
        System.out.println(copyDroid);
        System.out.println(droid);

    }
}
