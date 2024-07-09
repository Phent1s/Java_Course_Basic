package Classwork.Lesson23;

public class Test3 {
    void abc(Animal a){
        System.out.println("a");
    }
    void abc(Mouse m){
        System.out.println("M");
    }

    public static void main(String[] args) {
        Test3 t = new Test3();
        Animal am = new Mouse();
        t.abc(am);
    }
}

class Animal{
    void getName(){
        System.out.println("Animal");
    }
}

class Mouse extends Animal{
    void getName(){
        System.out.println("mouse");
    }
}
