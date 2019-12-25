package com.mirea;

public class Main {

    public static void main(String[] args) {
        /*Task 1*/
        System.out.println("ЗАДАНИЕ 1");
        ArrayQueueModule arrayQM = new ArrayQueueModule(5);

        arrayQM.enqueue(1);
        System.out.println("Size: " + arrayQM.size());
        arrayQM.enqueue(2);
        arrayQM.enqueue(3);
        arrayQM.enqueue(4);
        arrayQM.enqueue(5);
        System.out.println("Is empty? " + arrayQM.isEmpty());
        System.out.println("Size: " + arrayQM.size());

        arrayQM.dequeue();
        arrayQM.dequeue();
        arrayQM.dequeue();
        arrayQM.print();
        System.out.println("Head: " + arrayQM.element());

        arrayQM.clear();
        arrayQM.print();

        //ArrayQueueADT
        ArrayQueueADT arrayQADT = new ArrayQueueADT(4);
        for (int i = 0; i < 4; i++) {
            ArrayQueueADT.enqueue(arrayQADT, i);
        }

        while (!ArrayQueueADT.isEmpty(arrayQADT)) {
            System.out.println(ArrayQueueADT.dequeue(arrayQADT));
        }

        //ArrayQueue
        ArrayQueue arrayQueue = new ArrayQueue(5);
        arrayQueue.enqueue("Tom");
        arrayQueue.enqueue("Tim");
        arrayQueue.enqueue("Tym");
        System.out.println(arrayQueue.size());
        System.out.println(arrayQueue.isEmpty());
        arrayQueue.print();
        arrayQueue.dequeue();
        arrayQueue.print();

        /*Task 2*/
        System.out.println("ЗАДАНИЕ 2");
        LinkedQueue<Integer> linkedQueue = new LinkedQueue<>();
        linkedQueue.add(10);
        linkedQueue.add(20);
        linkedQueue.add(30);
        linkedQueue.add(40);
        linkedQueue.remove();
        System.out.println(linkedQueue.isEmpty());
        linkedQueue.print();
    }
}