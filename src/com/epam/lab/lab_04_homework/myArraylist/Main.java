package com.epam.lab.lab_04_homework.myArraylist;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        long mSt, mEnd, sSt, sEnd, myTime, systemTime;
        MyArrayList myArrayList = new MyArrayList();
        mSt = System.currentTimeMillis();
        for (int i = 1; i <= 1000000; i++) {
            myArrayList.add("saasdf");
        }
        mEnd = System.currentTimeMillis();
        myTime = mEnd - mSt;
        System.out.println("MyArray size: " + myArrayList.size());
        System.out.println("myArrayList time " + myTime);

        List<String> list = new ArrayList<>();
        sSt = System.currentTimeMillis();
        for (int i = 1; i <= 1000000; i++) {
            list.add("saasdf");
        }
        sEnd = System.currentTimeMillis();
        systemTime = sEnd - sSt;
        System.out.println("SystemArray size: " + myArrayList.size());
        System.out.println("SystemArrayList time " + systemTime);
        if (myTime < systemTime) {
            System.out.println("Your arraylist better, efficiency = " + ((double) systemTime) / (double) myTime);
        } else {
            System.out.println("System arraylist better, efficiency = " + ((double) myTime / (double) systemTime));
        }

    }
}
