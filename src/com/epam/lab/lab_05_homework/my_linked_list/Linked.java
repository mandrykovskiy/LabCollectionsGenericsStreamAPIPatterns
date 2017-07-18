package com.epam.lab.lab_05_homework.my_linked_list;

public interface Linked<E> {
    void addLast(E e);
    void addFirst(E e);
    int size();
    E getElementByIndex(int counter);
}
