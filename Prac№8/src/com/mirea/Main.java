package com.mirea;
/**
 * Создание различных видов списка ожидания
 * @author Ilya Yurov
 * @version 1.0
*/

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        BoundedWaitList<Integer> boundedWaitList = new BoundedWaitList<>(5);

        System.out.println("Size: " + boundedWaitList.getCapacity());
        boundedWaitList.add(12);
        boundedWaitList.add(23);
        boundedWaitList.add(69);
        boundedWaitList.add(80);
        boundedWaitList.add(-45);
        System.out.println("Remove: " + boundedWaitList.remove());
        System.out.println("BoundedWaitList: " + boundedWaitList.toString());

        UnfairWaitList<String> unfairWaitList = new UnfairWaitList<>();

        unfairWaitList.add("Book");
        unfairWaitList.add("Glass");
        unfairWaitList.add("Pen");
        unfairWaitList.remove("Glass");
        unfairWaitList.add("Pencil");
        unfairWaitList.moveToBack("Pen");
        System.out.println("UnfairWaitList: " + unfairWaitList.toString());

        ArrayList<String> arr = new ArrayList<>();
        arr.add("Dog");
        arr.add("Cat");
        arr.add("Bear");

        WaitList<String> waitList = new WaitList<>(arr);

        System.out.println(waitList.isEmpty());
        waitList.add("Duck");
        System.out.println(waitList.contains("Horse"));
        System.out.println(waitList.containsAll(arr));

        System.out.println("WaitList: " + waitList.toString());
        System.out.println("Arr: " + arr.toString());
    }
}
