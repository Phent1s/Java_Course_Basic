package Classwork.Lesson6;

public class Overloading {
    void show(int a) {
        System.out.println(a);
    }

    void show(boolean b1){
        System.out.println(b1);
    }

    void show(String s1){
        System.out.println(s1);
    }
}

class OverloadingTest{
    public static void main(String[] args) {
        Overloading o1 = new Overloading();
        int a = 100;
        o1.show(a);
        boolean b = true;
        o1.show(b);
        String s = "Hello";
        o1.show(s);
    }
}
