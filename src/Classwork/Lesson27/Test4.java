package Classwork.Lesson27;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Test4 {
    public static void main(String[] args) {
        File f = new File( "test10.txt" );

        try {
            FileInputStream fis = new FileInputStream(f);
            System.out.println("vsem horozhego dnya");
        } catch (FileNotFoundException e) {
            System.out.println("Array index out of bounds catched ");
        }
        finally  {
            System.out.println("finally block");
        }

        System.out.println("Nothing");
    }
}