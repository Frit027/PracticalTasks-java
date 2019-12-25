package com.mirea;

public interface Order {
    boolean add(Item item);
    boolean removeItem(String itemName);
    int removeAll(String itemName);

    int quantity();
    double costTotal();
    int itemQuantity(String itemName);

    Item[] getItems();
    Item[] sortedItemsByCostDesc();
    String[] dishesAndDrinksNames();
}
