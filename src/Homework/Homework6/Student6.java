package Homework.Homework6;

public class Student6 {
    Student6(int id1, String name1, String surname1, int course1, double midAref1){
        id = id1;
        name = name1;
        surname = surname1;
        course = course1;
        midlAref = midAref1;
    }
    Student6(int id2, String name2, String surname2, int course2){
        id = id2;
        name = name2;
        surname = surname2;
        course = course2;
    }
    Student6(){

    }
    int id;
    String name;
    String surname;
    int course;
    double midlAref;
}
class Student6Test{
    public static void main(String[] args) {
        Student6 s1 = new Student6();
        Student6 s2 = new Student6(1, "Andrew", "Ovcharuk", 1);
        Student6 s3 = new Student6(2, "Stella", "Demchenko", 1, 98.4);
    }
}