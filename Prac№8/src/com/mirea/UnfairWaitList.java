package com.mirea;

public class UnfairWaitList<E> extends WaitList<E> {
    public UnfairWaitList() {
        super();
    }

    public void remove(E element) {
        content.remove(element);
    }

    /**
     * Функция перемещения элемента в конец очереди {@link UnfairWaitList#moveToBack(E)}
     */

    public void moveToBack(E element) {
        remove(element);
        super.add(element);
    }
}
