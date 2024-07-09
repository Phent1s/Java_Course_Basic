package Classwork.Lesson20;

import java.util.HashMap;
import java.util.Map;

public class Test12 {
    public static void main(String[] args) {
        Map<Integer, String> map1 = new HashMap<>();
        map1.put(777, "Misha");
        map1.put(778, "Misha2");
        map1.put(779, "Misha3");
        map1.put(780, "Misha4");
        map1.put(778, "ROBERTO");
        map1.put(781, "zaur");
        map1.remove(778);
        System.out.println("map =" + map1);

    }
}
