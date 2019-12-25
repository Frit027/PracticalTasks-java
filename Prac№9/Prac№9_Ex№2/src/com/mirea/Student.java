package com.mirea;

public class Student implements Comparable<Student> {
    private String name;
    private double avgMark;

    public Student(String name, double avgMark) {
        this.name = name;
        this.avgMark = avgMark;
    }

    public double getAvgMark() {
        return avgMark;
    }

    public String getName() {
        return name;
    }

    @Override
    public int compareTo(Student o) {
        return (int)(Math.ceil(o.getAvgMark() - this.avgMark));
    }
}