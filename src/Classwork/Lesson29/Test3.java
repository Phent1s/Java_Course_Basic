package Classwork.Lesson29;

import java.util.ArrayList;
import java.util.function.*;

public class Test3 {
}

class Student1 {
    String name;
    char sex;
    int age;
    int course;
    double avgGrade;

    Student1(String name, char sex, int age, int course, double avgGrade) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.course = course;
        this.avgGrade = avgGrade;
    }
}


class StudentInfo1 {
    void printStudentInfo(Student1 s) {
        System.out.println("Name: " + s.name + ", Sex: " + s.sex + ", Age: " + s.age +
                ", Course: " + s.course + ", Avg Grade: " + s.avgGrade);

    }

    void testStudents(ArrayList<Student1> students, StudentCheaks si) {
        for (Student1 s : students) {
            if (si.test(s)) {
                printStudentInfo(s);
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<Student1> students = new ArrayList<>();
        Student1 st1 = new Student1("John", 'M', 10, 5, 0.5);
        Student1 st2 = new Student1("Andrew", 'M', 11, 6, 0.9);
        Student1 st3 = new Student1("Stella", 'W', 9, 4, 0.8);
        Student1 st4 = new Student1("Christine", 'W', 12, 7, 0.7);
        Student1 st5 = new Student1("Michail", 'M', 10, 5, 0.4);
        StudentInfo1 si = new StudentInfo1();
        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);
        students.add(st5);

        si.testStudents(students, (Student1 st) -> {
            return st.avgGrade > 0.6;
        });
        System.out.println("-------------------------------------");

        si.testStudents(students, st -> st.avgGrade < 0.6);
        System.out.println("-------------------------------------");

        si.testStudents(students, (Student1 st) -> st.age > 10);
        System.out.println("-------------------------------------");

        si.testStudents(students, (Student1 st) -> st.age < 10);
        System.out.println("-------------------------------------");
        si.testStudents(students, (Student1 st) -> st.sex == 'M');
        System.out.println("-------------------------------------");
        si.testStudents(students, (Student1 st) -> st.avgGrade > 0.6 && st.age > 10 && st.sex == 'W');

    }
}


interface StudentCheaks {
    boolean test(Student1 s);
}

