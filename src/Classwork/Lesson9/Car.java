package Classwork.Lesson9;

public class Car {
    String color;
    String engine;
    static int count;

    Car(String color1, String engine1){
    count++;
    color = color1;
    engine = engine1;
    }

    public void showColor(){
        System.out.println("Cvet mashini: "+color);
    }

    public void changeColor(String color2){
        System.out.println("Cvet mashini izmenilsia");
        int price = 5000;
        color = color2;
        price +=1000;
    }
}
