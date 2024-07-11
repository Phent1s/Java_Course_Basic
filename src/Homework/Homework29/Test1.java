package Homework.Homework29;

import java.util.ArrayList;
import java.util.Objects;
import java.util.function.*;
public class Test1 {
}

class Employee{
    String name;
    String department;
    int salary;

    Employee(String name, String department, int salary){
        this.name = name;
        this.department = department;
        this.salary = salary;
    }
}

class TestEmployee {
    static void printEmployee(Employee e) {
        System.out.println("Name: " + e.name + " Department: "
                + e.department + " Salary: " + e.salary);
    }

//    void employeeOverSalary(Employee e, int salary) {
//        if (e.salary > salary){
//            printEmployee(e);
//        }
//    }

   static void filtraciaRabotnicov(Predicate<Employee> p, ArrayList<Employee> e) {
        for (Employee emp : e) {
            if (p.test(emp)) {
                printEmployee(emp);
            }
        }
    }


    public static void main(String[] args) {
        ArrayList<Employee> e = new ArrayList<>();
        Employee e1 = new Employee("Andrii", "IT", 2500);
        Employee e2 = new Employee("Ivan", " IT", 2000);
        Employee e3 = new Employee("Alexey", "PM", 1500);
        Employee e4 = new Employee("Vlad", "PM", 1850);
        Employee e5 = new Employee("Roman","Kover", -2000);
        e.add(e1);
        e.add(e2);
        e.add(e3);
        e.add(e4);
        e.add(e5);

        filtraciaRabotnicov(x -> (x.department.equals("IT") && x.salary>2000), e);
        System.out.println("------------------------------------------");

        filtraciaRabotnicov(x -> (x.name.startsWith("A") && x.salary<1850), e);
        System.out.println("------------------------------------------");
        filtraciaRabotnicov(x -> (Objects.equals(x.name, "Roman") && Objects.equals(x.department, "Kover")), e);
        System.out.println("------------------------------------------");
    }
}


