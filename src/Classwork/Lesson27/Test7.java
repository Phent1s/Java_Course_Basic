package Classwork.Lesson27;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Test7 {
    public static void main(String[] args) {
        try{
            File f = new File("test9.txt");
            FileInputStream fis = new FileInputStream(f);
        } //catch (IOException e) {}
        catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (NullPointerException e) {
            System.out.println("Null pointer");
        }
    }
}
