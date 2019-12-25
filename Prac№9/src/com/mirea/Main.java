package com.mirea;

public class Main {

    public static void main(String[] args) {

        try {
            Client client = new Client("Yurov Ilya Igorevich", "123456789000");
            System.out.println(client.toString());
        } catch (INNWrongException ex) {
            System.out.println(ex.getMessage());
            System.out.println(ex.getInn());
        }
    }
}
