package com.mirea;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Research[] research = {new LabClass()};
        research[0].show();

        research[0].insertionSort();
        research[0].show();

        Scanner in = new Scanner(System.in);
        String searchName = in.nextLine();

        try {
            System.out.println(research[0].searchStudent(searchName).getAvgMark());
        } catch (EmptyStringException ex) {
            System.out.println(ex.getMessage());
        } catch (StudentNotFoundException ex) {
            System.out.println(ex.getMessage());
            System.out.println(ex.getName());
        }
    }
}