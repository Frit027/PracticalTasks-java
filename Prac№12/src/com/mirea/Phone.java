package com.mirea;

public class Phone {
    char plus = '+';
    private String code;
    private String threeNumbers1;
    private String threeNumbers2;
    private String fourNumbers;

    public Phone(String num) {
        StringBuilder strBuffer = new StringBuilder(num);

        fourNumbers = strBuffer.substring(num.length() - 4);
        threeNumbers2 = strBuffer.substring(num.length() - 7, num.length() - 4);
        threeNumbers1 = strBuffer.substring(num.length() - 10, num.length() - 7);

        if (strBuffer.charAt(0) == '8') {
            code = "7";
        } else {
            code = strBuffer.substring(1, num.length() - 10);
        }
    }

    public void print() {
        System.out.println(plus + code + threeNumbers1 + threeNumbers2 + fourNumbers);
    }
}
