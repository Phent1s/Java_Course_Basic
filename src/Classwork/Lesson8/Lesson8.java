package Classwork.Lesson8;

import Classwork.Lesson4.Test1;

public class Lesson8 {
    public final int a; //final = nelyza meniatb

    Lesson8 (){
        a = 10;
    }
    Lesson8(boolean b){
        a = 10;
    }

    public void abc(final short s){
        final byte b;
        b = 10;
        System.out.println(a + b);
    }

    public static void main(String[] args) {
        Lesson8 t = new Lesson8();
        System.out.println(t.a);

    }
}
