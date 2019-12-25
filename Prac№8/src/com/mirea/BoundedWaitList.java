package com.mirea;

public class BoundedWaitList<E> extends WaitList<E> {
    private int capacity;

    public BoundedWaitList(int capacity) {
        super();
        this.capacity = capacity;
    }

    /**
     * Функция добавления элемента {@link BoundedWaitList#add(E)}
     * @param element - добавляемое значение
     */

    @Override
    public void add(E element) {
        if(capacity == -1) {
            throw new IndexOutOfBoundsException("Queue size exceeded.");
        }

        super.add(element);
        capacity--;
    }

    @Override
    public E remove() {
        capacity++;
        return super.remove();
    }

    public int getCapacity() {
        return capacity;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
