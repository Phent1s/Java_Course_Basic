package Classwork.Lesson5;

public class Human {
    String name;
    car3 car;
    BankAccount bA;

    void info(){
        System.out.println("Ima: " + name + " car color: " + car.color + " balance " + bA.Balance);
    }

}

class HumanTest{
    public static void main(String[] args) {
        Human h = new Human();
        h.name = "David";
        h.car = new car3("red", "v6");
        h.bA = new BankAccount(1, 450.2);
        h.info();
    }
}
class car3{
    car3(String a, String b){
    color = a;
    engine = b;
    }
    String color;
    String engine;
}

class BankAccount{
    BankAccount(int a, double b){
        ID = a;
        Balance = b;
    }
    int ID;
    double Balance;
}