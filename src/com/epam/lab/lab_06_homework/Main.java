package com.epam.lab.lab_06_homework;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Main {
    public static void main(String[] args) {
        Droid droid = new Droid("GHH", 123);
        try {
            ObjectOutputStream outputStream= new ObjectOutputStream(new FileOutputStream("droid.txt"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
