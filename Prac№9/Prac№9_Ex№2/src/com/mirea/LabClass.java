package com.mirea;

import java.util.ArrayList;

public class LabClass implements Research{
    private ArrayList<Student> students;

    public LabClass() {
        students = new ArrayList<>();

        students.add(new Student("name1", 3.4));
        students.add(new Student("name2", 5.0));
        students.add(new Student("name3", 2.2));
        students.add(new Student("name4", 5.0));
        students.add(new Student("name5", 4.5));
    }

    public void show() {
        System.out.println();
        for(Student student : students) {
            System.out.println("Name: " + student.getName()
            + " Average mark: " + student.getAvgMark());
        }
    }

    @Override
    public void insertionSort() {
        for (int left = 0; left < students.size(); left++) {
            Student value = students.get(left);
            int i;
            for (i = left - 1; i >= 0; i--) {
                if(value.compareTo(students.get(i)) > 0) {
                    students.set(i + 1, students.get(i));
                } else {
                    break;
                }
            }
            students.set(i + 1, value);
        }
    }

    @Override
    public Student searchStudent(String name) throws EmptyStringException, StudentNotFoundException {
        if (name.length() == 0) {
            throw new EmptyStringException("You input an empty string.");
        }

        Student student = students.stream()
                .filter(s -> name.equals(s.getName()))
                .findAny()
                .orElse(null);

        if (student == null) {
            throw new StudentNotFoundException("Student not found.", name);
        } else {
            return student;
        }
    }
}