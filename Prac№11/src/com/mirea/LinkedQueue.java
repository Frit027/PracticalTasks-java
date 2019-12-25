package com.mirea;

import java.util.LinkedList;

public class LinkedQueue<T> extends AbstractQueue {
    private LinkedList<T> list;

    public LinkedQueue() {
        super();
        list = new LinkedList<>();
    }

    public void add(T elem) {
        list.add(elem);
        countInc();
    }

    public T remove() {
        countDec();
        return list.remove(0);
    }

    public T element() {
        return list.element();
    }

    public void clear() {
        list.clear();
    }

    public void print() {
        System.out.println(list.toString());
    }
}
