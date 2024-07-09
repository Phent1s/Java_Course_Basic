package Classwork.Lesson27;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Test19 {

    public static void main(String[] args) {
//        Animal2 a = new mouse();
//        try {
//            a.run();
//        } catch (IOException e) {
//            System.out.println(e);
//        }

    }
}

class Animal2 {
    Animal2() throws FileNotFoundException {

    }
}

class mouse extends Animal2 {
    mouse() throws FileNotFoundException {

    }
}

class Human{
    int age;
    String name;
    Human(int age , String name) throws IllegalArgumentException {
        if (age < 0){
            throw new IllegalArgumentException("Age must be a positive integer");
        }
        this.name = name;
        this.age = age;
    }
}

//
//class Animal2 {
//    void run() throws IOException {
//        System.out.println("Animal2 run");
//    }
//}
//
//class mouse extends Animal2 {
//    void run() {
//        System.out.println("mouse run");
//    }
//}