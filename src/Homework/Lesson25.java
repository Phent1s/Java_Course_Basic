package Homework;

public class Lesson25 {
    public static void main(String[] args) {
      Animal a1 = new Lev("Leva");
      Animal a2 = new Mechenosec("Mecha");
      Animal a3 = new Pingvin("Little Pingui");
      Lev l1 = new Lev("Leva2");
      Mechenosec m1 = new Mechenosec("Mecha2");
      Pingvin p1 = new Pingvin("Pinquiii");
      Fish f1 = new Mechenosec("Mecha3");
      Mammal mammal1 = new Lev("Leva3");
      Bird b1 = new Pingvin("Pinquiewewxads");
      Speakable s1 = new Pingvin("Speak pinqui");
      Speakable s2 = new Lev("lev speak??");
      Animal [] array1 = {a1, a2, a3, l1, m1, p1, f1, mammal1, b1};
      Speakable [] array2 = {s1, s2, l1, p1,b1, mammal1};
      for (Animal a : array1){
          if (a instanceof Mechenosec){
              Mechenosec m =(Mechenosec) a;
              System.out.println(m.name);
              m.sleep();
              m.eat();
              m.swim();
          } else if (a instanceof Pingvin) {
              Pingvin p = (Pingvin) a;
              System.out.println(p.name);
              p.eat();
              p.fly();
              p.speak();
              p.sleep();
          } else if (a instanceof Lev) {
              Lev l = (Lev) a;
              System.out.println(l.name);
              l.eat();
              l.run();
              l.speak();
              l.sleep();
          }
      }
      for (Speakable s : array2){
          if (s instanceof Pingvin){
              Pingvin p = (Pingvin) s;
              System.out.println(p.name);
              p.sleep();
              p.speak();
              p.eat();
              p.fly();
          } else if (s instanceof Lev) {
              Lev l = (Lev) s;
              System.out.println(l.name);
              l.sleep();
              l.speak();
              l.eat();
              l.run();
          }
      }
    }
}

abstract class Animal{
    Animal(String name){
    this.name = name;
    }
    String name;
    abstract void eat();
    abstract void sleep();
}

abstract class Fish extends Animal{

    Fish(String name) {
        super(name);
        this.name = name;
    }
    public void sleep(){
        System.out.println("ribki spyat sladko");
    }
    abstract void swim();
}

abstract class Bird extends Animal implements Speakable{

    Bird(String name) {
        super(name);
        this.name = name;
    }
    abstract void fly();

    @Override
    public void speak() {
        System.out.println(name + "Sings");
    }
}

abstract class Mammal extends Animal implements Speakable{

    Mammal(String name) {
        super(name);
        this.name = name;
    }
    abstract void run();
}

class Mechenosec extends Fish{

    Mechenosec(String name) {
        super(name);
        this.name = name;
    }

    @Override
    void eat() {
        System.out.println("Mechanosec ne hisnaya riba");
    }

    @Override
    void swim() {
        System.out.println("Mechanosec krasivo plavaet");
    }
}

class Pingvin extends Bird{

    Pingvin(String name) {
        super(name);
        this.name = name;
    }

    @Override
    void eat() {
        System.out.println("Pingvin eats fish");
    }

    @Override
    void sleep() {
        System.out.println("Pingvini spyat sladko");
    }

    @Override
    void fly() {
        System.out.println("Pingvin dont fly");
    }

    @Override
    public void speak() {
        System.out.println("Pingvin ne umeet pet kak solovi");
    }
}

class Lev extends Mammal{

    Lev(String name) {
        super(name);
        this.name = name;
    }

    @Override
    void eat() {
        System.out.println("lev lubit myaso");
    }

    @Override
    void sleep() {
        System.out.println("Lev mnogo spit");
    }

    @Override
    void run() {
        System.out.println("lev eto ne samaya bistraya koshka");
    }
}

interface Speakable{
    default void speak(){
        System.out.println("somebody speaks");
    };

}