package com.mirea;

public class InternetOrder implements Order {
    private MyLinkedList<Item> items = new MyLinkedList<>();

    public InternetOrder() { }

    public InternetOrder(Item[] items) {
        for(Item item : items){
            this.items.addNode(item);
        }
    }

    @Override
    public boolean add(Item item) {
        items.addNode(item);
        return true;
    }

    @Override
    public boolean removeItem(String name) {
        Item[] itemsList = items.asArray();
        for(Item item : itemsList){
            if (item.getNAME().equals(name)){
                items.deleteNode(item);
                return true;
            }
        }
        return false;
    }

    @Override
    public int removeAll(String name) {
        int quantity = 0;
        while(removeItem(name)){
            quantity++;
        }
        return quantity;
    }

    @Override
    public int quantity() {
        return items.size();
    }

    @Override
    public int itemQuantity(String name) {
        int quantity = 0;
        Item[] itemsList = items.asArray();
        for(Item item : itemsList){
            if (item.getNAME().equals(name)){
                quantity++;
            }
        }
        return quantity;
    }

    @Override
    public Item[] getItems() {
        return items.asArray().clone();
    }

    @Override
    public double costTotal() {
        double cost = 0;
        Item[] itemsList = items.asArray();
        for(Item item : itemsList){
            cost += item.getCOST();
        }
        return cost;
    }

    @Override
    public String[] dishesAndDrinksNames() {
        Item[] itemsList = items.asArray();
        String[] itemsNames = new String[itemsList.length];

        for (int i = 0; i < itemsNames.length; i++) {
            itemsNames[i] = itemsList[i].getNAME();
        }
        return itemsNames.clone();
    }

    @Override
    public Item[] sortedItemsByCostDesc() {
        Item[] itemsList = items.asArray().clone();

        for (int i = 1; i < itemsList.length; i++) {
            for (int j = i; j > 0; j--) {
                if (itemsList[j].getCOST() > itemsList[j - 1].getCOST()) {
                    Item temp = itemsList[j];
                    itemsList[j] = itemsList[j - 1];
                    itemsList[j - 1] = temp;
                }
            }
        }
        return itemsList;
    }

    public void show() {
        int i = 1;
        for(Item item : items.asArray()) {
            System.out.println("Item " + i + ": "
                    + item.getCOST() + " " + item.getNAME() + " " + item.getDESCRIPTION());
            i++;
        }
    }
}
