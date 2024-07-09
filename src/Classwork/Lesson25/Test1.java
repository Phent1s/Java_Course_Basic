package Classwork.Lesson25;

public class Test1 {
    public static void main(String[] args) {
        Driver [] array1 = {new Driver(), new Driver()};
        Employee [] array2 = {new Driver(), new Driver(), new Teacher(), new Doctor()};
        Employee em1 = new Teacher();
        Employee em2 = new Doctor();
        Employee em3 = new Driver();
        Help_able h1 = new Teacher();
        h1.help();
        em1.work();
        em2.work();
        em3.work();
    }
}

abstract class Employee {
    void sleep() {
        System.out.println("employee spleeps");
    }
    abstract void work();
}
class Teacher extends Employee implements Help_able{
    void work(){
        System.out.println("Teacher works");
    }

    @Override
    public void help() {
        System.out.println("teacher helps");
    }
}
class Driver extends Employee{
    void work(){
        System.out.println("Driver works");
    }
}
class Doctor extends Employee{
    void work(){
        System.out.println("Doctor works");
    }
}

interface Help_able{
    void help();
}