package com.mirea;

public class ArrayQueueModule {
    private static int maxSize;
    private static int countElem;
    private static int head;
    private static Object[] array;

    //пред: assert maxSize > 0;
    public ArrayQueueModule(int maxSize) {
        assert maxSize > 0;
        ArrayQueueModule.maxSize = maxSize;
        array = new Object[maxSize];
        countElem = head = 0;
    }

    //пред: assert elem != null;
    public void enqueue(Object elem) throws ArrayIndexOutOfBoundsException {
        assert elem != null;
        if (countElem == maxSize) {
            throw new ArrayIndexOutOfBoundsException("Queue is full.");
        } else {
            array[head] = elem;
            head++;
            countElem++;
        }
    }

    //пред: assert array[0] != null;
    public Object element() {
        assert array[0] != null;
        if (isEmpty()) {
            throw new ArrayStoreException("Queue is empty.");
        }
        return array[0];
    }

    public Object dequeue() {
        if (isEmpty()) {
            throw new ArrayStoreException("Queue is empty.");
        }

        Object elem = array[0];

        Object[] tempArr = new Object[countElem - 1];
        System.arraycopy(array, 1, tempArr, 0, countElem - 1);
        array = new Object[maxSize];
        System.arraycopy(tempArr, 0, array, 0, tempArr.length);
        countElem--;

        return elem;
    }

    public int size() {
        return countElem;
    }

    public boolean isEmpty() {
        return countElem == 0;
    }

    public void clear() {
        array = new Object[maxSize];
        countElem = 0;
    }

    public void print() {
        for (int i = 0; i < countElem; i++) {
            System.out.println(array[i]);
        }
    }
}
