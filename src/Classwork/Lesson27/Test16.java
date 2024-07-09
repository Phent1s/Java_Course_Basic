package Classwork.Lesson27;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;

public class Test16 {
    public static void main(String[] args) {
//        ArrayList <String> list = new ArrayList <>();
//        list.add("A");
//        list.add("A");                            // arreyIndexOutOfBounds exeption
//        System.out.println(list.get(3));


//        System.out.println(5/0); //arifmeticExeption


//        Doctor d = new Doctor();
//        Driver dr = new Driver();
//        Driver dr1 = new Driver();            //ClassCastExeption
//        Driver [] drs = {dr,dr1};
//        Employee [] array1 = {d,dr};
//        Driver dr2 = (Driver) array1[0];
//        Doctor d2 = (Doctor) drs[0];

//        Integer.parseInt("asdw"); //NUMBER FORMAT EXEPTION

        createPass("qwerty");

    }

    public static void createPass(String psw) {
        if (psw.length() < 6) {
            throw new IllegalArgumentException("Dlina parila malenkaya : " + psw);      //IllegalArgumentException
        }
        if (psw.length() > 12) {
            throw new IllegalArgumentException("Dlina parila bolshaya : " + psw);
        }
        System.out.println("Paroly prinyat");
    }
}

class Employee {
}

class Doctor extends Employee {
}

class Driver extends Employee {
}

class Plane {
    String planeStatus = "Waiting";// Flying, Canceled, Waiting

    public void fly() {
        planeStatus = "Flying";
        System.out.println("Plane Status : " + planeStatus);
    }

    public void waiting() {
        if (planeStatus.equals("Flying")) {
            throw new IllegalStateException("Plane is already flying");
        }
        planeStatus = "Waiting";
        System.out.println("Plane Status : " + planeStatus);
    }

    //IllegalStateException
    public void cancel() {
        if (planeStatus.equals("Flying")) {
            throw new IllegalStateException("Plane is already flying");
        }
        planeStatus = "Canceled";
        System.out.println("Plane Status : " + planeStatus);
    }

    public static void main(String[] args) {
        Plane plane = new Plane();
        plane.waiting();
        plane.fly();
        plane.cancel();

    }

}