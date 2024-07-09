package Classwork.Lesson8;

public class car {
    String color = "blue";
    String engine = "v6";
}

class Human{
    String name = "Ivan";
  final  car c = new car();

    public static void main(String[] args) {
        Human h = new Human();
        h.c.engine="v8";
    }
}
