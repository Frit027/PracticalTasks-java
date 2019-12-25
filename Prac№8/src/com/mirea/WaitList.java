package com.mirea;

import java.util.Collection;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.stream.Collectors;

public class WaitList<E> implements IWaitList<E> {
    protected ConcurrentLinkedQueue<E> content;

    /**
     * @see WaitList#WaitList(Collection)
     */
    public WaitList() {
        content = new ConcurrentLinkedQueue<>();
    }

    /**
     * @param c какая-то структура
     * @see WaitList#WaitList()
     */
    public WaitList(Collection<E> c) {
        content = new ConcurrentLinkedQueue<>(c);

    }

    public void add(E element) {
        content.offer(element);
    }

    public E remove() {
        return content.remove();
    }

    public boolean contains(E element) {
        return content.contains(element);
    }

    public boolean containsAll(Collection<E> c) {
        return content.containsAll(c);
    }

    public boolean isEmpty() {
        return content.isEmpty();
    }

    public String toString() {
        return content.stream().map(Object::toString).collect(Collectors.joining(", "));
    }
}
