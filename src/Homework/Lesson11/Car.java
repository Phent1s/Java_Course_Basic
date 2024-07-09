package Homework.Lesson11;

public class Car {
    public String color;
    public String engine;
    public int doorsNum;

    Car(String color, String engine, int doorsNum){
        this.color = color;
        this.engine = engine;
        this.doorsNum = doorsNum;
    }
}

class CarTest{
    void doorsChange(Car c,int a){
        c.doorsNum = a;
    }

    void colorChange(Car a, Car b){
        String color = a.color;
        a.color = b.color;
        b.color = color;
    }

    public static void main(String[] args) {
        CarTest ct1 = new CarTest();
        Car car1 = new Car("White", "v8", 5);
        Car car2 = new Car("Black", "v6", 3);
        System.out.println(car2.doorsNum);
        ct1.doorsChange(car2, 5);
        System.out.println(car2.doorsNum);
        ct1.colorChange(car1, car2);
        System.out.println(car1.color);
        System.out.println(car2.color);
    }
}
