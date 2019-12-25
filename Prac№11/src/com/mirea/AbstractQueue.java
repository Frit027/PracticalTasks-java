package com.mirea;

public abstract class AbstractQueue {
    private int countElem;

    public AbstractQueue() {
        countElem = 0;
    }

    public void countInc() {
        countElem++;
    }

    public void countDec() {
        countElem--;
    }

    public int getCountElem() {
        return countElem;
    }

    public void throwException() {
        throw new ArrayStoreException("Queue is empty.");
    }

    public int size() {
        return countElem;
    }

    public boolean isEmpty() {
        return countElem == 0;
    }
}
