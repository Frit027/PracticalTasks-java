package mirea;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Student[] students = new Student[5];
        Student student1 = new Student("Name1", 1);
        Student student2 = new Student("Name2", 6);
        Student student3 = new Student("Name3", 7);
        Student student4 = new Student("Name4", 4);
        Student student5 = new Student("Name5", 11);

        students[0] = student1;
        students[1] = student2;
        students[2] = student3;
        students[3] = student4;
        students[4] = student5;

        /*Задание 1*/
        System.out.println("ЗАДАНИЕ 1");
        insertionSort(students);
        Arrays.stream(students).forEach(e -> System.out.println("Name: " + e.getName() + " Mark: " + e.getMark()));

        /*Задание 2*/
        System.out.print("ЗАДАНИЕ 2");
        ArrayList<Student> list = new ArrayList<>();
        list.add(student1);
        list.add(student2);
        list.add(student3);
        list.add(student4);
        list.add(student5);

        SortingStudentsByGPA studentsByGPA = new SortingStudentsByGPA(list);
        studentsByGPA.quickSort(0, studentsByGPA.getSize() - 1);
        studentsByGPA.show();

        /*Задание 3*/
        System.out.println("\nЗАДАНИЕ 3");
        List<Student> list1 = new ArrayList<>();
        List<Student> list2 = new ArrayList<>();

        list1.add(student1);
        list1.add(student2);
        list1.add(student3);

        list2.add(student4);
        list2.add(student5);

        merge(mergeSort(list1), mergeSort(list2)).forEach(e -> System.out.println("Name: " + e.getName() + " Mark: " + e.getMark()));
    }

    /*Задание 1*/
    static void insertionSort(Student[] students) {
        for (int left = 0; left < students.length; left++) {
            Student value = students[left];

            int i;
            for (i = left - 1; i >= 0 ; i--) {
                if(value.compareTo(students[i]) > 0)
                    students[i + 1] = students[i];
                else
                    break;
            }
            students[i + 1] = value;
        }
    }

    /*Задание 3*/
    static List<Student> mergeSort(List<Student> list) {
        int size = list.size();

        if(size < 2)
            return list;

        int middle = size / 2;
        return merge(mergeSort(list.subList(0, middle)),
                mergeSort(list.subList(middle, size)));
    }

    static List<Student> merge(List<Student> list1, List<Student> list2) {
        int size1 = list1.size();
        int size2 = list2.size();
        int a = 0, b = 0, size = size1 + size2;
        List<Student> listRes = new ArrayList<>(size);

        for (int i = 0; i < size; i++) {
            if (b < size2 && a < size1) {

                if (list1.get(a).compareTo(list2.get(b)) > 0) {
                    listRes.add(i, list2.get(b));
                    b++;
                }
                else {
                    listRes.add(i, list1.get(a));
                    a++;
                }
            }
            else if (b < size2) {
                listRes.add(i, list2.get(b));
                b++;
            }
            else {
                listRes.add(i, list1.get(a));
                a++;
            }
        }

        return listRes;
    }
}

