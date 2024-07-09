package Classwork.Lesson20;

import java.util.ArrayList;

public class Test4 {
    public static void main(String[] args) {
        ArrayList <StringBuilder> list = new ArrayList<>();
        list.add(new StringBuilder("Hello"));
        list.add(new StringBuilder("Privet"));
        list.add(new StringBuilder("Ok"));
        list.add(new StringBuilder("URA"));
        for (StringBuilder sb : list){
            System.out.print(sb + " ");
        }
        System.out.println(list.toString());
        System.out.println();
        System.out.println(list.indexOf(new StringBuilder("URA")));
    }
}
