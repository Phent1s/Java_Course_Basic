package Classwork.Lesson27;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Test8 {
    public static void main(String[] args) {
        StringBuilder result = new StringBuilder(" ");
        try{
            File f = new File("test9.txt");
            System.out.println("File sozdan");
            FileInputStream fis = new FileInputStream(f);
            System.out.println("Stream sozdan");
            int counter = 0;
            while(true){
                counter ++;
                result.append(fis.read());
                System.out.println("Information reads");
                if(counter == 3){fis.close();}
            }
        } catch (FileNotFoundException e) {
            System.out.println("Exception occured");
        }catch (IOException e){
            System.out.println("Exception occured 2");
        }
        finally {
            System.out.println("Eto finaly");
        }
    }
}
