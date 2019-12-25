package com.mirea;

public class StudentNotFoundException extends Exception {
    private String name;

    public StudentNotFoundException(String message, String name) {
        super(message);
        this.name = name;
    }

    public String getName() {
        return name;
    }
}