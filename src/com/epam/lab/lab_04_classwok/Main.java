package com.epam.lab.lab_04_classwok;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
//        String text = sc.next();
//        System.out.println(Level.valueOf(text).getButtonNumber());
        Map<String, String> menu = new HashMap();
        menu.put("1", "Hello");
        menu.put("2", "Hello1");
        menu.put("3", "Hello3");
        String command = sc.nextLine();
        System.out.println(menu.get(command));
    }
}
