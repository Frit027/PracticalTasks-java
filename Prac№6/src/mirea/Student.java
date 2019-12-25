package mirea;

public class Student implements Comparable<Student> {
    private int mark;
    private String name;

    public Student(String name, int mark) {
        this.mark = mark;
        this.name = name;
    }

    public int getMark() {
        return mark;
    }

    public String getName() {
        return name;
    }

    @Override
    public int compareTo(Student o) {
        return o.getMark() - this.mark;
    }
}
