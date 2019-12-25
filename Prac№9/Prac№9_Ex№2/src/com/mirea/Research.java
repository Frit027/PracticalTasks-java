package com.mirea;

public interface Research {
    void insertionSort();
    void show();
    Student searchStudent(String name) throws EmptyStringException, StudentNotFoundException;
}