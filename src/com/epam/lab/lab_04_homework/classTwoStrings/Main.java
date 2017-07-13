package com.epam.lab.lab_04_homework.classTwoStrings;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        StringsGenerator stringsGenerator = new StringsGenerator();
        List<TwoStrings> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(new TwoStrings(stringsGenerator.stringGenerator(), stringsGenerator.stringGenerator()));
        }
        Collections.sort(list);
        list.forEach(System.out::println);
        System.out.println("____________________________________________");
        Collections.sort(list, new MyComparator());
        list.forEach(System.out::println);
        BinarySearch binarySearch = new BinarySearch();
        String s= sc.next();

        System.out.println(list.get(binarySearch.binarySearch(list, s)));
    }

}

