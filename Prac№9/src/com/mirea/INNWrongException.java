package com.mirea;

public class INNWrongException extends Exception {
    private String inn;

    public INNWrongException(String message, String inn) {
        super(message);
        this.inn = inn;
    }

    public String getInn() {
        return inn;
    }
}
