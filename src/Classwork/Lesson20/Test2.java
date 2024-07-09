package Classwork.Lesson20;

import java.util.ArrayList;

public class Test2 {
    public static void main(String[] args) {
        ArrayList <String> list = new ArrayList<>();
        list.add("poka");
        list.add("privet");
        list.add("ok");
        list.add( 2, "loh");
        for (String s : list){
            System.out.print(s + " ");
        }
        System.out.println();
        System.out.println(list.get(3));
//        for (int i = 0; i < list.size(); i++) {
//            System.out.println(list.get(i));
//        }

        list.set(1, "!!!");
        ArrayList <String> list2 = new ArrayList<>();
        list2.add("Sidorov");
        list2.add("lolol");
        list.addAll(1, list2);
        for (String s : list){
            System.out.print(s + " ");
        }


    }
}
