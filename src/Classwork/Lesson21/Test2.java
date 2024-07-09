package Classwork.Lesson21;

import Classwork.Lesson20.Test3;

public class Test2 {
     void Test2(){
        System.out.println("sozdalsiya obyect");
    }
}

class A{
    public static void main(String[] args) {
        Test2 t = new Test2();
        int a = 7;
        System.out.println(a > 2 ? a < 5 ? 3 : 6 : 9);
    }
}
