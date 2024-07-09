package Homework.Homework22;

public class Cat extends Pet{
    Cat(String name){
        this.name = name;
        System.out.println("I am a cat and my name is: " + name);
    }
    void sleep(){
        System.out.println("Cat sleep");
    }
}
