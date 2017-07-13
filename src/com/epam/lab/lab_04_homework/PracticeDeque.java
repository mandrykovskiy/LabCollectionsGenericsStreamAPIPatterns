package com.epam.lab.lab_04_homework;

import java.util.ArrayDeque;

public class PracticeDeque {
    public static void main(String[] args) {
        ArrayDeque<String> names = new ArrayDeque<>();
        names.add("Ivan");
        names.add("Ralf");
        names.add("Semuel");
        System.out.println(names);
        System.out.println("________________");
        names.push("Kostans");
        System.out.println(names);
        System.out.println("________________");
        System.out.println(names.getFirst());
        System.out.println(names.getLast());
        System.out.println("________________");
        while (names.peek() != null) {
            // извлечение c начала
            System.out.println(names.pop());
        }
        System.out.printf("Deque size: %d \n", names.size());

    }
}
