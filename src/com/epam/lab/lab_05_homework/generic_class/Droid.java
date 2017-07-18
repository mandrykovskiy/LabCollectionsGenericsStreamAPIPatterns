package com.epam.lab.lab_05_homework.generic_class;

public class Droid {
    public int hp;

    public Droid(int hp) {
        this.hp = hp;
    }

    public void move(){
        System.out.println("Droid move");
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }


}
