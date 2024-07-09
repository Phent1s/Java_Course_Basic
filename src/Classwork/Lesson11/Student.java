package Classwork.Lesson11;


public class Student {
    public String name;
    public int course;
    public double grade;
   public Student(String name, int course, double grade){
        this.name = name;
        this.course = course;
        this.grade = grade;
    }
    public static void swap(Student s1, Student s2){
        Student s3 =s1;
        s1 = s2;
        s2 = s3;
    }

    public static void changeName(Student s1){
        s1.name = "vasiliy";
    }

//    public static void main(String[] args) {
//        Student st1 = new Student("Stella", 2, 12.2);
//        Student st2 = new Student("Ivan", 3, 5.32);
//        swap(st1, st2);
//        System.out.println(st1.name);
//        System.out.println(st2.name);
//        changeName(st2);
//        System.out.println(st2.name);
//    }
}

class StudentTest{
    public static void sravnenie(Student st1, Student st2){
        if (st1.name.equals(st2.name) && st1.course == st2.course && st1.grade == st2.grade){
            System.out.println("Studenti ravni");
        }
        else {
            System.out.println("Studenti ne ravni");
        }
    }

    public static void sravnenie2(Student st1, Student st2){
        if (st1.name.equals(st2.name)){
             if (st1.grade == st2.grade){
                 if (st1.course == st2.course){
                     System.out.println("Students are same!");
                 }
                 else {
                     System.out.println("Course are different");
                 }
             }
             else {
                 System.out.println("Grades are different!");
             }
        }
        else {
            System.out.println("Names are different!");
        }
    }

    public static void main(String[] args) {
        Student st1 = new Student("Andrii", 3, 91.34);
        Student st2 = new Student("Andrii", 3, 91.34);

        sravnenie(st1, st2);
        sravnenie2(st1, st2);
    }
}
