//package Classwork.Lesson29;
//
//import java.util.ArrayList;
//
//public class Test2 {
//}
//
//class Student1 {
//    String name;
//    char sex;
//    int age;
//    int course;
//    double avgGrade;
//
//    Student1(String name, char sex, int age, int course, double avgGrade) {
//        this.name = name;
//        this.sex = sex;
//        this.age = age;
//        this.course = course;
//        this.avgGrade = avgGrade;
//    }
//}
//
//
//class StudentInfo1 {
//    void printStudentInfo(Student1 s) {
//        System.out.println("Name: " + s.name + ", Sex: " + s.sex + ", Age: " + s.age +
//                ", Course: " + s.course + ", Avg Grade: " + s.avgGrade);
//
//    }
//
//    void testStudents(ArrayList<Student1> students, StudentCheaks si) {
//        for (Student1 s : students) {
//            if (si.test(s)) {
//                printStudentInfo(s);
//            }
//        }
//    }
//
//    public static void main(String[] args) {
//        ArrayList<Student1> students = new ArrayList<>();
//        Student1 st1 = new Student1("John", 'M', 10, 5, 0.5);
//        Student1 st2 = new Student1("Andrew", 'M', 11, 6, 0.9);
//        Student1 st3 = new Student1("Stella", 'W', 9, 4, 0.8);
//        Student1 st4 = new Student1("Christine", 'W', 12, 7, 0.7);
//        Student1 st5 = new Student1("Michail", 'M', 10, 5, 0.4);
//
//        students.add(st1);
//        students.add(st2);
//        students.add(st3);
//        students.add(st4);
//        students.add(st5);
//        FindStudentsUnderGrade fsug = new FindStudentsUnderGrade();
//        FindStudentsOverAge fsoa = new FindStudentsOverAge();
//        FindStudentsUnderAge fsua = new FindStudentsUnderAge();
//        FindStudentsBySex fsbs = new FindStudentsBySex();
//        FindStudentsMixedCondition fsmc = new FindStudentsMixedCondition();
//
//        StudentInfo1 si = new StudentInfo1();
//        FindStudentOverGrade fsog = new FindStudentOverGrade();
//        si.testStudents(students, fsog);
//        System.out.println("-------------------------------------");
//
//        si.testStudents(students, fsug);
//        System.out.println("-------------------------------------");
//
//        si.testStudents(students, fsoa);
//        System.out.println("-------------------------------------");
//
//        si.testStudents(students, fsua);
//        System.out.println("-------------------------------------");
//        si.testStudents(students, fsbs);
//        System.out.println("-------------------------------------");
//        si.testStudents(students, fsmc);
//    }
//}
//
//interface StudentCheaks {
//    boolean test(Student1 s);
//}
//
//class FindStudentOverGrade implements StudentCheaks {
//
//    @Override
//    public boolean test(Student1 s) {
//        return s.avgGrade > 0.5;
//    }
//
//}
//
//class FindStudentsUnderGrade implements StudentCheaks {
//    @Override
//    public boolean test(Student1 s) {
//        return s.avgGrade < 0.5;
//    }
//}
//
//class FindStudentsOverAge implements StudentCheaks {
//    @Override
//    public boolean test(Student1 s) {
//        return s.age > 10;
//    }
//}
//
//class FindStudentsUnderAge implements StudentCheaks {
//    @Override
//    public boolean test(Student1 s) {
//        return s.age < 10;
//    }
//}
//
//class FindStudentsBySex implements StudentCheaks {
//
//    @Override
//    public boolean test(Student1 s) {
//        return s.sex == 'M';
//    }
//}
//
//class FindStudentsMixedCondition implements StudentCheaks {
//
//    @Override
//    public boolean test(Student1 s) {
//        return (s.sex == 'W' && s.age > 10) && s.avgGrade > 0.6;
//    }
//}