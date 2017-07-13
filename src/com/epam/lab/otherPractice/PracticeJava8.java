package com.epam.lab.otherPractice;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class PracticeJava8 {
    public static void main(String[] arg) {
        List<Integer> list = new ArrayList<Integer>();
        Random random = new Random();
        //random.ints().limit(10).forEach(System.out::println);
        random.ints().limit(10).sorted().forEach(System.out::println);


    }
}

