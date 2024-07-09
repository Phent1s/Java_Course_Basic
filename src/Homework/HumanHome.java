package Homework;

public class HumanHome {

}

class BankAccount {
    BankAccount(int a, double b){
        ID = a;
        Balance = b;
    }
    int ID;
    double Balance;
    double popolnenieScheta(int a){
        Balance += a;
        return Balance;
    }
    double snyatieSoScheta(int a){
        Balance -= a;
        return Balance;
    }
}

class Student1 {
    Student1(double a, double b, double c){
        avgEcon = c;
        avgEng = b;
        avgMath = a;
    }
    void showInfo() {
        System.out.println("Student grades: ");
        System.out.println("Math: " + avgMath);
        System.out.println("Eng: " + avgEng);
        System.out.println("Econ: " + avgEcon);
    }
    double avgMath;
    double avgEng;
    double avgEcon;
    double avgGrade(Student1 st1){
        double avgArif = (st1.avgEcon + st1.avgEng + st1.avgMath)/3;
        System.out.println("Avg Grade: " + avgArif);
        return avgArif;
    }

}

class StudentTest1 {
    public static void main(String[] args) {
        Student1 Student_1 = new Student1(9.5, 7.3, 10);
        Student_1.showInfo();
    }
}

class Employee {
    Employee(int a, String b, int c, double d, String e){
        ID = a;
        Surname = b;
        age = c;
        salary = d;
        department = e;
    }
    int ID;
    String Surname;
    int age;
    double salary;
    String department;

    void x2Salary (){
        salary *= 2;
    }
    void Info() {
        System.out.println("ID: " + ID);
        System.out.println("Surname: " + Surname + ", age: " + age + ", salary: " + salary + ", department: " + department);
    }
}

class EmployeeTest{
    public static void main(String[] args) {
        Employee e1 = new Employee(1, "Malinow", 32, 2300, "naebalovo");
        Employee e2 = new Employee(2, " Ovcharuk", 18, 5000, "Geniy");
        e1.x2Salary();
        e2.x2Salary();
        e1.Info();
        e2.Info();
    }
}