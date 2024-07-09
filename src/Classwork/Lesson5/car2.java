package Classwork.Lesson5;

public class car2 {
    String color;
    String engine;
    int speed;

    int SpeedIncrease(int a){
        speed += a;
        return speed;
    }
    int SpeedDown(int a){
        speed-=a;
        return speed;
    }
    void showInfo(){
        System.out.println("Dvizhok: " + engine
                + " color: " + color
                + " speed: " + speed);
    }
}

class Car2test{

public static void main(String[] args) {
    car2 c1 = new car2();
    c1.speed = 50;
    c1.engine = "v6";
    c1.color = "red";

    c1.showInfo();

    c1.SpeedIncrease(100);

    c1.showInfo();

    c1.SpeedDown(40);

    c1.showInfo();
}
        }