package com.mirea;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	    /*Task 1*/
        System.out.println("ЗАДАНИЕ 1");
        Person man = new Person("Ivan", "Ivanov", "Ivanovich");
        System.out.println(man.getFullName());

        /*Task 2*/
        System.out.println("ЗАДАНИЕ 2");
        Address address1 = new Address("Russia-Yakutia-Yakutsk-Street-7-1-24");
        Address address2 = new Address("Russia;Yakutia;Yakutsk;Street;6;3;25");
        Address address3 = new Address("Russia,Yakutia,Tver,Street;4;5;6");
        Address address4 = new Address("Russia.Yakutia.Yakutsk.Street.7.8.9");

        address1.print();
        address2.print();
        address3.print();
        address4.print();

        /*Task 3*/
        System.out.println("ЗАДАНИЕ 3");
        String[] shirts = new String[11];
        shirts[0] = "S001,Black Polo Shirt,Black,XL";
        shirts[1] = "S002,Black Polo Shirt,Black,L";
        shirts[2] = "S003,Blue Polo Shirt,Blue,XL";
        shirts[3] = "S004,Blue Polo Shirt,Blue,M";
        shirts[4] = "S005,Tan Polo Shirt,Tan,XL";
        shirts[5] = "S006,Black T-Shirt,Black,XL";
        shirts[6] = "S007,White T-Shirt,White,XL";
        shirts[7] = "S008,White T-Shirt,White,L";
        shirts[8] = "S009,Green T-Shirt,Green,S";
        shirts[9] = "S010,Orange T-Shirt,Orange,S";
        shirts[10] = "S011,Maroon Polo Shirt,Maroon,S";

        Shirt shirt = new Shirt(shirts);
        System.out.println(shirt.print(3));

        /*Task 4*/
        System.out.println("ЗАДАНИЕ 4");
        Phone phone1 = new Phone("+79175655655");
        Phone phone2 = new Phone("+104289652211");
        Phone phone3 = new Phone("89175655655");

        phone1.print();
        phone2.print();
        phone3.print();

        /*Task 5*/
        System.out.println("ЗАДАНИЕ 5");
        String line = "";

        for(String str : args) {
            line += str + " ";
        }

        System.out.println(getLine(line).toString());
    }

    private static StringBuilder getLine(String line) {
        StringBuilder res = new StringBuilder();
        String[] words = line.toLowerCase().split(" ");
        System.out.println(Arrays.toString(words));
        ArrayList<String> list = new ArrayList<>(Arrays.asList(words));

        while (isYes(list)) {
            Collections.shuffle(list);
        }
        for (String word: list){
            res.append(word).append(" ");
        }

        res.deleteCharAt(res.length()-1);

        return res;
    }

    private static boolean isYes(ArrayList<String> wordsList) {
        for (int i = 0; i < wordsList.size() - 1; i++) {
            String firstWord = wordsList.get(i).toLowerCase();
            String secondWord = wordsList.get(i + 1).toLowerCase();

            if (firstWord.charAt(firstWord.length() - 1) != secondWord.charAt(0)) {
                return true;
            }
        }
        return false;
    }
}
