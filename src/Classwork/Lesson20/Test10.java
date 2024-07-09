package Classwork.Lesson20;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Test10 {
    public static void main(String[] args) {
        ArrayList <String> al1 = new ArrayList<>();
        al1.add("one");
        al1.add("two");
        al1.add("three");
        al1.add("four");
        al1.add("five");
        System.out.println("al1 = " + al1);
//        ArrayList <String> al2 = new ArrayList<>();
//        al2.add("one");
//        al2.add("three");
//        al2.add("four");

//        al1.removeAll(al2); //УДАЛЯЕТ ИЗ ПЕРВОГО ЛИСТА ВСЕ ЕЛЕМЕНТЫ КОТОРЫЕ ЕСТЬ ВО ВТОРОМ

//        al1.retainAll(al2); // СОХРАНЯЕТ ОДИНАКОВЫЕ ЕЛЕМЕНТЫ В ПЕРВОМ ЛИСТЕ И УДАЛЯЕТ ЛИШНЕЕ

//        boolean result = al1.containsAll(al2);//СОДЕРЖИТ ЛИ АЛ1 ВСЁ ИЗ АЛ2??
//        System.out.println("al1 = " + al1);

//        List <String> sublist = al1.subList(0,2); //с 0 по 2 не включ
//        System.out.println(sublist);
//        sublist.add("ten"); //добавит на место после последнего елемента саблиста
//        System.out.println("al1 = " + al1);
//        System.out.println(sublist);
//        al1.add("milion"); // не выведет саблист после добавления чего то в основной лист
//        System.out.println("al1 = " + al1);
//        System.out.println(sublist);

//        Object [] array = al1.toArray();
//        String [] array2 = al1.toArray(new String[5]);
//        for (String s : array2){
//            System.out.println(s);
//        }

//        List <String> list = List.of("odin", "dwa", "tri"); //этот литс нельзя изменить, так же не может содержать налл
//        System.out.println(list);
        List <String> list2 = List.copyOf(al1);
        System.out.println(list2);
    }
}
