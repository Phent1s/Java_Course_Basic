package Classwork.Lesson8;

import Homework.Student;

public class Student1 {
    String name;
    int course;
  static   int count;
    public Student1(String name2, int course2){
        count++;
        name = name2;
        course= course2;
        System.out.println("Student # "+count+" sozdan");
    }

}

class StudentTest{
    public static void main(String[] args) {
    Student1 st1 = new Student1("Ivan", 1);
    Student1 st2 = new Student1("Alex", 4);
    Student1 st3 = new Student1("Masha", 2);

    }
}