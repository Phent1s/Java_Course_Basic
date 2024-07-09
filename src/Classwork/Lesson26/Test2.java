package Classwork.Lesson26;

import java.util.ArrayList;

public class Test2 {

    Test2(){
        System.out.println("Konstructor1");
    }
    Test2(String s){
        System.out.println("Konstructor2");
    }
    {
        System.out.println("init block 1");
    }
    static {
        System.out.println("static block 1");
    }
    {
        System.out.println("init block 2");
    }
    static {
        System.out.println("static block 2");
    }

    public static void main(String[] args) {
        Test2 t1 = new Test2();
        Test2 t2 = new Test2();

    }
}
