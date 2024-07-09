package Classwork.Lesson24;

import javax.sound.midi.Soundbank;

public class Test1 {

}

abstract class Figura{
    int KolvoStoron;
    abstract void Perimetr();
    abstract void Ploja();
}

class Kvadrat extends Figura{
    int KolvoStoron = 4;
    int storona = 10;
    @Override
    public void Perimetr() {
        System.out.println("Perimeter: " + KolvoStoron*storona);
    }

    @Override
    void Ploja() {
        System.out.println("Ploja :" + storona*storona);
    }
}

class Triangle extends Figura{
    int KolvoStoron = 3;
    int storona = 10;
    @Override
    public void Perimetr() {
        System.out.println("Perimeter: " + KolvoStoron*storona);
    }

    @Override
    void Ploja() {
        System.out.println("Ploja :" + storona*storona);
    }
}

class Circle extends Figura{
    int KolvoStoron = 3;
    int radius = 10;
    @Override
    public void Perimetr() {
        System.out.println("Perimeter: " + KolvoStoron*radius);
    }

    @Override
    void Ploja() {
        System.out.println("Ploja :" + radius*radius);
    }
}