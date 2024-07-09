package Classwork.Lesson23;

public class Test2 {
}

class Employee{
    double salary = 100;
    String name;
    int age;
    int experience;
    void eat(){
        System.out.println("eat");
    }
    void sleep(){
        System.out.println("sleep");
    }
}

class Teacher extends Employee {
    int studentsNum;
    void teach(){
        System.out.println("teach");
    }
}