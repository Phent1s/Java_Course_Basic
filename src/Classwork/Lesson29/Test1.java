package Classwork.Lesson29;

import java.util.ArrayList;

public class Test1 {
}

class Student {
    String name;
    char sex;
    int age;
    int course;
    double avgGrade;

    Student(String name, char sex, int age, int course, double avgGrade) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.course = course;
        this.avgGrade = avgGrade;
    }
}


class StudentInfo {
    void printStudentInfo(Student s) {
        System.out.println("Name: " + s.name + ", Sex: " + s.sex + ", Age: " + s.age +
                ", Course: " + s.course + ", Avg Grade: " + s.avgGrade);

    }

    void printStudentsOverGrade(ArrayList<Student> students, double avgGrade) {
        for (Student s : students) {
            if (s.avgGrade > avgGrade) {
                printStudentInfo(s);
            }
        }
    }

    void printStudentsUnderGrade(ArrayList<Student> students, double avgGrade) {
        for (Student s : students) {
            if (s.avgGrade < avgGrade) {
                printStudentInfo(s);
            }
        }
    }

    void printStudentsOverAge(ArrayList<Student> students, int age) {
        for (Student s : students) {
            if (s.age > age) {
                printStudentInfo(s);
            }
        }
    }
    void printStudentsUnderAge(ArrayList<Student> students, int age){
        for (Student s : students) {
            if (s.age < age) {
                printStudentInfo(s);
            }
        }
    }
    void printStudentsBySex(ArrayList<Student> students, char sex){
        for (Student s : students) {
            if (s.sex == sex) {
                printStudentInfo(s);
            }
        }
    }
    void printStudentsMixedConditions(ArrayList<Student> students, double avgGrade, int age, char sex){
        for (Student s : students) {
            if (s.avgGrade > avgGrade && s.age > age && s.sex == sex) {
                printStudentInfo(s);
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        Student st1 = new Student("John", 'M', 10, 5, 0.5);
        Student st2 = new Student("Andrew", 'M', 11, 6, 0.9);
        Student st3 = new Student("Stella", 'W', 9, 4, 0.8);
        Student st4 = new Student("Christine", 'W', 12, 7, 0.7);
        Student st5 = new Student("Michail", 'M', 10, 5, 0.4);

        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);
        students.add(st5);

        StudentInfo studentInfo = new StudentInfo();
        studentInfo.printStudentsOverGrade(students,0.6);
        System.out.println("-------------------------------------");
        studentInfo.printStudentsUnderGrade(students,0.6);
        System.out.println("-------------------------------------");
        studentInfo.printStudentsOverAge(students, 10);
        System.out.println("-------------------------------------");
        studentInfo.printStudentsUnderAge(students, 11);
        System.out.println("-------------------------------------");
        studentInfo.printStudentsBySex(students, 'W');
        System.out.println("-------------------------------------");
        studentInfo.printStudentsMixedConditions(students,0.7,10,'M');
    }
}