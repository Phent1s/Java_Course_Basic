package Classwork.Generics;

import java.util.ArrayList;

public class Test1 {

    public static void main(String[] args) {
        Info<String> info1 = new Info<String>("Hello World");
        System.out.println(info1);
        Info<Integer> info2 = new Info<Integer>(100);
        System.out.println(info1);

        Integer i = info2.getValue();
        String s = info1.getValue();
    }

//    public void abc(Info <Integer> info) {
//        Integer i = info.getValue();
//    }
}


class Info<T> {
    private T value;

    public Info(T value) {
        this.value = value;
    }

    public String toString() {
        return "[{ " + value + "}]";
    }

    public T getValue() {
        return value;
    }
}


//class Parent {
//    public void abc(Info<String> info) {
//        String s = info.getValue();
//    }
//}
//
//class Child extends Parent {
//    public void abc(Info<Integer> info) {
//        Integer s = info.getValue();
//    }
//}