package Homework.Homework22;

public class Dog extends Pet{
    Dog(String name){
        this.name = name;
        System.out.println("I am a dog and my name is: " + name);
    }
    void play(){
        System.out.println("Dog plays");
    }

}
