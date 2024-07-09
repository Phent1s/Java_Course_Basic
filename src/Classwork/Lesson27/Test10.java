package Classwork.Lesson27;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Test10 {
     void abc() throws FileNotFoundException {
        try {
            File f = new File("test91.txt");
            FileInputStream fis = new FileInputStream(f);
        } catch (FileNotFoundException e) {
            System.out.println("Exception catched: " + e);
            throw e;
        } finally {
            System.out.println("Finally block");
        }
    }

    void method(){
         try{
            abc();
         } catch (FileNotFoundException e) {
             System.out.println("Exception catched: " + e);
         }
    }

//    void def()  {
//
//        try {
//            int [] arr = {1,2,3,4,5,6,7,8,9,10};
//            System.out.println(arr[11]);
//        } catch (ArrayIndexOutOfBoundsException e) {
//            System.out.println("Exception catched: " + e);
//            throw e;
//        } finally {
//            System.out.println("Finally block");
//        }
//    }
}