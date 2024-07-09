package Classwork.Lesson4;

public class car {
    String color = "red";
    String engine = "V6";
}

class NewCar{
    public static void main(String[] args) {
        car car1 = new car();
        car car2 = car1;
        System.out.println(car2.engine);
    }
}
