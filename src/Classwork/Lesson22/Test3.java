package Classwork.Lesson22;

public class Test3 {
    void increaseSal(Employee e){
        e.salary = e.salary+100;
    }
    public static void main(String[] args) {
        Doctor doc = new Doctor();
        doc.name = "Ivan";
        doc.experience = 25;
        doc.age = 50;
        doc.eat();
        doc.heal();
        doc.specialization="surgery";
    }
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

class Doctor extends Employee{
    String specialization;
    void heal(){
        System.out.println("heal");
    }
}

class Driver extends Employee{
    String carMark;
    void drive(){
        System.out.println("Drive");
    }
}

class Teacher extends Employee{
    int studentsNum;
    void teach(){
    System.out.println("teach");
}
}
