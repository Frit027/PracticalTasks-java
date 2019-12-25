package com.mirea;

public class ArrayQueue extends AbstractQueue {
    private int maxSize;
    private int head;
    private Object[] array;

    public ArrayQueue(int maxSize) {
        super();
        assert maxSize > 0;
        this.maxSize = maxSize;
        array = new Object[maxSize];
        head = 0;
    }

    public void enqueue(Object elem) throws ArrayIndexOutOfBoundsException {
        assert elem != null;
        if (getCountElem() == maxSize) {
            throw new ArrayIndexOutOfBoundsException("Queue is full.");
        } else {
            array[head] = elem;
            head++;
            countInc();
        }
    }

    public Object element() {
        if (isEmpty()) {
            throwException();
        }
        return array[0];
    }

    public Object dequeue() {
        if (isEmpty()) {
            throwException();
        }

        Object elem = array[0];

        Object[] tempArr = new Object[getCountElem() - 1];
        System.arraycopy(array, 1, tempArr, 0, getCountElem() - 1);
        array = new Object[maxSize];
        System.arraycopy(tempArr, 0, array, 0, tempArr.length);
        countDec();

        return elem;
    }

    public void clear() {
        array = new Object[maxSize];
        countDec();
    }

    public void print() {
        for (int i = 0; i < getCountElem(); i++) {
            System.out.println(array[i]);
        }
    }
}
