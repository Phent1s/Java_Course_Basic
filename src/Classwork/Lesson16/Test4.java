package Classwork.Lesson16;

public class Test4 {

}

class Employee{
    double salary;
    boolean isManager;

    Employee(double salary, boolean isManager){
        this.isManager = isManager;
        this.salary =salary;
    }


}

class TestEmployee{
    public static void main(String[] args) {
        Employee e1 = new Employee(100.4, true);
        System.out.println("On manager? " + e1.isManager + "Ego zar[lata: " + e1.salary);
    }
}