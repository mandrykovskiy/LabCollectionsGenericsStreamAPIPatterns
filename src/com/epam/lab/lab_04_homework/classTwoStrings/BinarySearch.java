package com.epam.lab.lab_04_homework.classTwoStrings;

import java.util.Collections;
import java.util.List;

public class BinarySearch {

    public int binarySearch(List<TwoStrings> list, String s){
        int index;
        index= Collections.binarySearch(list, new TwoStrings(s), new MyComparator());
        return index;
    }
}
