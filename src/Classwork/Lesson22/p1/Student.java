package Classwork.Lesson22.p1;

import Classwork.Lesson22.*;

public class Student extends Human2 {
    public static void main(String[] args) {
        Student s = new Student();
        System.out.println(s.name);
        System.out.println(Student.salary);
        s.work();
        Student.rest();
    }
}
