package com.mirea;

public class ArrayQueueADT {
    private int maxSize;
    private int countElem;
    private int head;
    private Object[] array;

    //пред assert maxSize > 0
    public ArrayQueueADT(int maxSize) {
        assert maxSize > 0;
        this.maxSize = maxSize;
        array = new Object[maxSize];
        countElem = head = 0;
    }

    //пред assert elem != null;
    public static void enqueue(ArrayQueueADT arrayADT, Object elem) throws ArrayIndexOutOfBoundsException {
        assert elem != null;
        if (arrayADT.countElem == arrayADT.maxSize) {
            throw new ArrayIndexOutOfBoundsException("Queue is full.");
        } else {
            arrayADT.array[arrayADT.head] = elem;
            arrayADT.head++;
            arrayADT.countElem++;
        }
    }

    public static Object element(ArrayQueueADT arrayADT) {
        if (isEmpty(arrayADT)) {
            throw new ArrayStoreException("Queue is empty.");
        }
        return arrayADT.array[0];
    }

    public static Object dequeue(ArrayQueueADT arrayADT) {
        if (isEmpty(arrayADT)) {
            throw new ArrayStoreException("Queue is empty.");
        }

        Object elem = arrayADT.array[0];

        Object[] tempArr = new Object[arrayADT.countElem - 1];
        System.arraycopy(arrayADT.array, 1, tempArr, 0, arrayADT.countElem - 1);
        arrayADT.array = new Object[arrayADT.maxSize];
        System.arraycopy(tempArr, 0, arrayADT.array, 0, tempArr.length);
        arrayADT.countElem--;

        return elem;
    }

    public static int size(ArrayQueueADT arrayADT) {
        return arrayADT.countElem;
    }

    public static boolean isEmpty(ArrayQueueADT arrayADT) {
        return arrayADT.countElem == 0;
    }

    public static void clear(ArrayQueueADT arrayADT) {
        arrayADT.array = new Object[arrayADT.maxSize];
        arrayADT.countElem = 0;
    }

    public static void print(ArrayQueueADT arrayADT) {
        for (int i = 0; i < arrayADT.countElem; i++) {
            System.out.println(arrayADT.array[i]);
        }
    }
}
