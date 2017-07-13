package com.epam.lab.otherPractice;


import java.util.Arrays;

public class PracticeStreamAPI {
    public static void main(String[] arg) {
        Arrays.stream(new String[]{"asdfasdfas", "sdf", "fdsg", "sdfgsdfg"})
                .filter(str -> str.length() >= 4)
                .map(String::toUpperCase)
                .forEach(el -> System.out.println(" " + el));

    }
}