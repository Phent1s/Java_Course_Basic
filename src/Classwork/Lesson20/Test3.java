package Classwork.Lesson20;

import java.util.ArrayList;

public class Test3 {
    public static void main(String[] args) {
        ArrayList <StringBuilder> list = new ArrayList<>();
        ArrayList <StringBuilder> list2 = new ArrayList<>();
        StringBuilder sb1 = new StringBuilder("Hello");
        StringBuilder sb2 = new StringBuilder("Privet");
        StringBuilder sb3 = new StringBuilder("Ok");

        StringBuilder sb4 = new StringBuilder("Sidorov");
        StringBuilder sb5 = new StringBuilder("leonov");
        list.add(sb1);
        list.add(sb2);
        list.add(sb3);
        list2.add(sb4);
        list2.add(sb5);
//        for (int i = 0; i < list.size(); i++) {
//            list.get(i).append("!!!");
//        }
        for (StringBuilder sb : list){
            System.out.print(sb + " ");
        }
        System.out.println();
//        list.remove(sb1);
        list.addAll(list2);
        for (StringBuilder sb : list){
            System.out.print(sb + " ");
        }
        System.out.println();
        list2.get(1).append("!"); // обьект в лист 1 тзминился потому что мы меняем сам обьект, а не создаеём новый и ссылаемся на него.
        for (StringBuilder sb : list){
            System.out.print(sb + " ");
        }
//        list.clear();
//        System.out.println();
//        for (StringBuilder sb : list){
//            System.out.print(sb + " ");
//        }


    }
}
