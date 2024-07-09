package Classwork.Lesson27;

import java.io.*;

public class Test5 {
    void abc() throws FileNotFoundException {
        File f = new File("test9.txt");
        FileInputStream fis = new FileInputStream(f);
        System.out.println("Hello!");
    }

    void def() {
        System.out.println("privet");
        try{
            abc();
        } catch (FileNotFoundException e) {
            System.out.println("File not found catched");
        }
    }

    public static void main(String[] args) {
        Test5 test = new Test5();
        test.def();
    }
}
