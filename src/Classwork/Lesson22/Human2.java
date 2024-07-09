package Classwork.Lesson22;

public class Human2 {
    protected String name = "kolya";
    protected static int salary = 100;
    protected void work(){
        System.out.println("work");
    }
    protected static void rest(){
        System.out.println("rest");
    }
}

class Student extends Human2{
    public static void main(String[] args) {
        Student s = new Student();
        System.out.println(s.name);
        System.out.println(Student.salary);
        s.work();
        Student.rest();
    }
}
