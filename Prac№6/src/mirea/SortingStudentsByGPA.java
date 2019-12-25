package mirea;
/*Задание 2*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SortingStudentsByGPA implements Comparator<Student> {
    private ArrayList<Student> list;

    public SortingStudentsByGPA(ArrayList<Student> list) {
        this.list = new ArrayList<>(list);
    }

    public int getSize() {
        return list.size();
    }

    public void quickSort(int leftBorder, int rightBorder) {
        int leftMarker = leftBorder;
        int rightMarker = rightBorder;
        Student student = list.get((leftMarker + rightMarker) / 2);

        do {
            while (compare(list.get(leftMarker), student) > 0)
                leftMarker++;
            while (compare(list.get(rightMarker), student) < 0)
                rightMarker--;

            if (leftMarker <= rightMarker) {
                if (leftMarker < rightMarker) {
                    Collections.swap(list, leftMarker, rightMarker);
                }

                leftMarker++;
                rightMarker--;
            }
        } while(leftMarker <= rightMarker);

        if (leftMarker < rightBorder)
            quickSort(leftMarker, rightBorder);

        if (leftBorder < rightMarker)
            quickSort(leftBorder, rightMarker);
    }

    @Override
    public int compare(Student o1, Student o2) {
        return o1.getMark() - o2.getMark();
    }

    public void show() {
        System.out.println();
        list.forEach(e -> System.out.println("Name: " + e.getName() + " Mark: " + e.getMark()));
    }
}
