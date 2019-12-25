package mirea;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        System.out.println("ЗАДАНИЕ 10");
        System.out.println(reverse(n, 0));

        System.out.println("ЗАДАНИЕ 11");
        System.out.println(numberOfUnits());

        System.out.println("ЗАДАНИЕ 12");
        oddNumbers();

        System.out.println("ЗАДАНИЕ 13");
        oddIndex();
    }

    static int reverse(int n, int i){
        if(n == 0)
            return i;

        return reverse(n / 10, i * 10 + n % 10);
    }

    static int numberOfUnits() {
        Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();
        int num2;

        if(num1 == 1)
            return numberOfUnits() + 1;

        if(num1 == 0) {
            num2 = in.nextInt();
            if(num2 == 0)
                return 0;
        }
        return numberOfUnits();
    }

    static void oddNumbers() {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        if(n != 0) {
            if (n % 2 == 1) {
                System.out.println(n);
                oddNumbers();
            } else
                oddNumbers();
        }
    }

    static void oddIndex() {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = 0;

        if(n != 0) {
            System.out.println(n);
            m = in.nextInt();
        }

        if(m != 0)
            oddIndex();
    }
}
