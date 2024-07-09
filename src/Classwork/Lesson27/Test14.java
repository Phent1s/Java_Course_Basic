package Classwork.Lesson27;

import java.io.*;

public class Test14 {
    static FileInputStream fis1,fis2;

    public static void main(String[] args) {
        try{
            fis1 = new FileInputStream("test10.txt");
            System.out.println("File test9 expends");
            try {
                fis2.close();
            }catch (IOException e){
                System.out.println("Error closing file");
            }
        }catch (FileNotFoundException e){
            System.out.println("File test 9 not found");
        } catch (NullPointerException e){
            System.out.println("Null pointer exception");
        }
    }
}
