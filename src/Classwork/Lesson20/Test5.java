package Classwork.Lesson20;

import java.util.ArrayList;

public class Test5 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("Ok");
        list.add("Ok");
        list.add("URA");
        for (String s : list){
            System.out.print(s + " ");
        }
        System.out.println();
        System.out.println(list.indexOf("Ok"));
        System.out.println(list.lastIndexOf("Ok"));
        System.out.println(list.size());
//        list.clear();
        System.out.println(list.isEmpty());
        System.out.println(list.contains("Ok"));
        System.out.println(list.toString());
        System.out.println(list);
    }
}
