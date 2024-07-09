package Classwork.Lesson27;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Test11 {
    FileInputStream fis1, fis2;
    public void abc(){
        try{
            fis1 = new FileInputStream("test9.txt");
            try{
                fis2 = new FileInputStream("Test10.txt");
            }catch(FileNotFoundException e){
                System.out.println("File not found1");
            }
        }catch(FileNotFoundException e){
            System.out.println("File not found2");
        }
        finally {
            System.out.println("Eto vneshniy finaly block");
            try{
                fis1.close();
                fis2.close();
            }catch(IOException e){
                System.out.println("Error closing file");
            }
        }
    }

    public static void main(String[] args) {
        Test11 t = new Test11();
        t.abc();
    }
}
