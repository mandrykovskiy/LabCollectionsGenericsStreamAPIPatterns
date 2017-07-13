package com.epam.lab.lab_04_homework.myArraylist;

import java.util.Arrays;

public class MyArrayList {
    private String[] strings ;
    private int index;
    private int size;
    private static final int DEFAULT_CAPACITY = 10;
    public MyArrayList(){
        strings =new String[DEFAULT_CAPACITY];
    }
    public void add(String value) {
        if (index == strings.length){
            growArray();
        }
        strings[index] = value;
        index++;
        size++;
    }
    public String get(int index) {
        if (index >= size || index < 0){
            throw new IndexOutOfBoundsException("Index: " + index + ", Size " + size);
        }
        return strings[index];
    }
    private void growArray(){
        String[] newArray = new String[strings.length * 2];
        System.arraycopy(strings, 0, newArray, 0, index - 1);
        strings = newArray;
    }
    public int size() {
        return size;
    }


    @Override
    public String toString() {
        return "MyArrayList{" +
                "strings=" + Arrays.toString(strings) +
                ", index=" + index +
                '}';
    }
}
