package Homework;

public class Lesson9 {
    String color;
    String engine;
    static int count;

    Lesson9(String color1, String engine1) {
        count++;
        color = color1;
        engine = engine1;
    }
}
class Lesson9Test {

    public static void main(String[] args) {
        Lesson9 le1 = new Lesson9("black", "v6");
        Lesson9 le2 = new Lesson9("green", "v6");
        Lesson9 le3 = new Lesson9("yellow", "v6");
        Lesson9 le4 = new Lesson9("orange", "v6");
        Lesson9 le5 = new Lesson9("blue", "v6");
        Lesson9 le6 = new Lesson9("purple", "v6");
        Lesson9 le7 = new Lesson9("white", "v6");
        Lesson9 le8 = new Lesson9("red", "v6");
        le2 = null;
        le3 = null;
        le5 = new Lesson9("21", "12");
        le6 = null;
        le7 = null;
        le8 = null;
    }
}