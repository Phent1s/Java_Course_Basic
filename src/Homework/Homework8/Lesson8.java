package Homework.Homework8;

public class Lesson8 {

    static final double Pi = 3.14;
    double plojad(double Radius){
        double Plojad = Pi * Radius * Radius;
        return Plojad;
    }

    static double dlina(double Radius){
        double Dlina = 2*Pi*Radius;
        return Dlina;
    }

    void Info(double Radius){
        System.out.println("Radius: "+Radius+" Ploja"+dlina(Radius)+" Dlina: "+plojad(Radius));
    }
    static int First(int a, int b, int c){
        return a*b*c;
    }

    static void Second(int a, int b){
        int delenie = a/b;
        int ostatok = a%b;
        System.out.println("Celoe: "+delenie+" Ostatok: "+ostatok);
    }
}

class  Lesson8Test {
    public static void main(String[] args) {
        Lesson8 ls1 = new Lesson8();
        Lesson8.First(23, 1, 4);
        Lesson8.First(14, 12, 9);
        Lesson8.Second(53, 3);
        Lesson8.Second(24, 5);
        Lesson8.dlina(4);
        ls1.plojad(6);
        ls1.Info(2);
    }
}
