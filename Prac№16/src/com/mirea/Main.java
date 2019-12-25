package com.mirea;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        /*Task 1*/
        Drink soda = new Drink(3.0, "Soda", "Сarbonated drink");
        Drink cola = new Drink(2.0, "Cola", "Сarbonated drink");
        Drink cola2 = new Drink(5.0, "Cola", "Сarbonated drink");
        Drink pepsi = new Drink(15.9,"Pepsi", "Сarbonated drink");
        Drink[] drinks = {soda, cola, cola2, pepsi};

        /*Task 2*/
        Dish fish = new Dish(17.5, "Fish", "Fried fish");
        Dish meat = new Dish(12.5, "Meat", "Fried meat");
        Dish dish = new Dish(15.0, "Dish1", "Beautiful dish");
        Dish dish2 = new Dish(19.0, "Dish2", "Beautiful dish");
        Dish dish3 = new Dish("Dish2", "Beautiful dish");
        Dish[] dishes = {fish, meat, dish, dish2, dish3};

        /*Task 4*/
        RestaurantOrder order = new RestaurantOrder(dishes, drinks);

        order.add(new Dish(5.0, "Dish2", "Beautiful dish"));
        order.add(new Drink(1.1, "Milk", "Cold"));
        order.removeItem("Meat");

        System.out.println("Составленный заказ:");
        order.show();

        OrderManager orderManager = new OrderManager();

        try {
            orderManager.add(order, 7);
        } catch (OrderAlreadyAddedException ex) {
            ex.getMessage();
        }

        System.out.println("Кол-во блюд \"Dish2\": " + orderManager.dishQuantity("Dish2"));
        System.out.println("Сумма заказа: " + orderManager.orderCostSummary());

        order.removeAll("Dish2");
        System.out.println("Заказ после удлаения блюд с именем \"Dish2\":");
        order.show();

        System.out.println("Кол-во позиций в заказе: " + order.quantity());
        System.out.println("Кол-во напитков Cola в заказе: " + order.itemQuantity("Cola"));
        System.out.println("Имена позиций в заказе: " + Arrays.toString(order.dishesAndDrinksNames()));

        /*Task 3*/
        InternetOrder internetOrder = new InternetOrder(order.getItems());
        internetOrder.add(new Dish(100.0, "Crab", "Fresh"));
        internetOrder.show();

        /*Task 5*/
        Dish pork = new Dish(11.0, "Pork", "Very testy");
        Drink milk = new Drink(1.5, "Milk", "Very cold");
        Dish[] arrDish = { pork };
        Drink[] arrDrink = { milk };

        try {
            orderManager.add("Address", new RestaurantOrder(arrDish, arrDrink));
        } catch (OrderAlreadyAddedException ex) {
            ex.getMessage();
        }

        System.out.println("Заказ для стола №7:");
        orderManager.getOrder(7).show();

        System.out.println("Заказ для адресса Address:");
        orderManager.getOrder("Address").show();

        System.out.println("Весь заказ:");
        orderManager.show();
        System.out.println("Свободные номера столиков: " + Arrays.toString(orderManager.freeTableNumbers()));


    }
}
