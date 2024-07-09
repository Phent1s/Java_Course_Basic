package Classwork.Lesson24;

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

class Driver extends Employee implements Help_able, Swim_able{
    String carMark;
    void drive(){
        System.out.println("Drive");
    }

    @Override
    public void firstAid() {

    }

    @Override
    public void tushitPoshar() {

    }

    @Override
    public void swim() {

    }
}

class Teacher extends Employee implements Help_able{
    int studentsNum;
    void teach(){
        System.out.println("teach");
    }

    @Override
    public void firstAid() {

    }

    @Override
    public void tushitPoshar() {

    }
}

interface Help_able {
    void firstAid();
    void tushitPoshar();
}

interface Swim_able{
    void swim();
}