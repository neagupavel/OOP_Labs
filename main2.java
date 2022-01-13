package com.lab1.task2;

public class Main {

    public static void main(String[] args) {
        University university1 = new University();
        university1.name = "UTM";
        university1.foundationYear = 1972;
        Student student1_1 = new Student("name1_1 surname1_1", 20, 8.1f);
        Student student1_2 = new Student("name1_2 surname1_2", 20, 8.2f);
        university1.students = new Student[]{student1_1, student1_2};

        University university2 = new University();
        university2.name = "USM";
        university2.foundationYear = 1946;
        Student student2_1 = new Student("name2_1 surname2_1", 20, 8.3f);
        Student student2_2 = new Student("name2_2 surname2_2", 20, 8.4f);
        university2.students = new Student[]{student2_1, student2_2};

        University university3 = new University();
        university3.name = "ULIM";
        university3.foundationYear = 1992;
        Student student3_1 = new Student("name3_1 surname3_1", 20, 8.5f);
        Student student3_2 = new Student("name3_2 surname3_2", 20, 8.6f);
        university3.students = new Student[]{student3_1, student3_2};

        University[] univs = new University[]{university1, university2, university3};
        double sum = 0;
        int countStudents = 0;
        for (University i : univs) {
            for (Student j : i.students) {
                sum += j.mark;
                countStudents++;
            }
        }
        System.out.print(sum / countStudents);
    }
}