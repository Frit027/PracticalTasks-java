package com.mirea;

import java.math.BigInteger;

public class Client {
    private String name;
    private BigInteger inn;

    public Client(String name, String inn) throws INNWrongException {
        this.name = name;
        if (isINN(inn)) {
            this.inn = new BigInteger(inn);
        } else {
            throw new INNWrongException("This is wrong INN", inn);
        }
    }

    public boolean isINN(String inn) {
        if(inn.length() != 12 && inn.length() != 10) {
            return false;
        }
        for (char c : inn.toCharArray()) {
            if (!Character.isDigit(c)) {
                return false;
            }
        }
        return true;
    }

    public String toString() {
        return  "Name: " + name + "\nINN: " + inn;
    }
}
