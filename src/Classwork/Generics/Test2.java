package Classwork.Generics;

import java.util.ArrayList;

public class Test2 {

    public static void main(String[] args) {

        ArrayList <Integer> integerArrayList = new ArrayList <>();
        integerArrayList.add(10);
        integerArrayList.add(15);
        int a = gebMethod.getSecondElement(integerArrayList);

        ArrayList <String> al1 = new ArrayList<>();
        al1.add("String");
        al1.add("generic");

        String s = gebMethod.getSecondElement(al1);
    }
}


class gebMethod{
    public static <T> T getSecondElement(ArrayList<T> list){
        return list.get(1);
    }
}