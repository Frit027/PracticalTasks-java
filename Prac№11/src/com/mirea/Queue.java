package com.mirea;

public interface Queue {
    //предусловие: element != null
    //постусловие: size = size + 1,
    //      element inserted at the end of queue
    void enqueue(Object element);

    //предусловие: size > 0
    //постусловие: R = first element in queue;
    Object element();

    //предусловие: size > 0;
    //постусловие: size = size - 1,
    //      first element of queue deleted
    Object dequeue();

    //постусловие: R = size
    int size();

    //постусловие: R = (size == 0)
    boolean isEmpty();

    //постусловие: size = 0
    //      delete all queue elements
    void clear();
}

