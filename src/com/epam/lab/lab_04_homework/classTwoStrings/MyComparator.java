package com.epam.lab.lab_04_homework.classTwoStrings;

import java.util.Comparator;

public class MyComparator implements Comparator<TwoStrings> {
    @Override
    public int compare(TwoStrings o1, TwoStrings o2) {
        return o1.capital.compareTo(o2.capital);
    }
}
