package Homework;

public class Student {
    int ID, year;
    int midMath, midEcon, midEng;
    String name;
    String second_name;
}

class StudentTest extends Student{
    public static void main(String[] args) {
        StudentTest S_1 = new StudentTest();
        StudentTest S_2 = new StudentTest();
        StudentTest S_3 = new StudentTest();


        S_1.midEcon = 5;
        S_1.midMath = 3;
        S_1.midEng = 5;
        double S_1_average = (S_1.midEcon+ S_1.midEng+ S_1.midMath)/3;
        S_2.midEcon = 4;
        S_2.midEng = 2;
        S_2.midMath = 5;
        double S_2_average = (S_2.midEcon+ S_2.midEng+ S_2.midMath)/3;
        S_3.midEcon = 5;
        S_3.midMath = 3;
        S_3.midEng = 4;
        double S_3_average = (S_3.midEcon+ S_3.midEng+ S_3.midMath)/3;
        System.out.println(S_1_average);
        System.out.println(S_2_average);
        System.out.println(S_3_average);
    }
}
