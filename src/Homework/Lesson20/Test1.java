package Homework.Lesson20;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Test1 {
    public static ArrayList<String> abc(String ... s){
        ArrayList<String> list = new ArrayList<>();
        for (String s1 : s){
            if (!list.contains(s1)){
                list.add(s1);
            }
        }
        Collections.sort(list);
        System.out.println(list);
        return list;
    }

    public static void main(String[] args) {
        abc("Hello", "Ya ne gey", "Hello", "Lol", "Ya ne lox", "Bad trip");
    }
}
