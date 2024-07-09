package Classwork.Lesson27;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;



public class Test9 {
    public static void main(String[] args) {
        System.out.println(abc());
    }

    static int abc(){
        try {
            File f = new File("test91.txt");
            FileInputStream fis = new FileInputStream(f);
        } catch (FileNotFoundException e) {
            System.out.println("Exception catched: " + e);
            return 6;
        }
        finally {
            System.out.println("Finally block");
            return 7;
        }
    }
}
