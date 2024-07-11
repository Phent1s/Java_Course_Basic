package Lambda2;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Test2 {

    public static void main(String[] args) {
        List<String> list = List.of("Privet", "Poka", "Ok", "How are you", "Im ok");
//        for (String s : list) {
//            System.out.println(s);
//        }

        list.forEach(s -> System.out.println(s));


        ArrayList <Integer> l1 = new ArrayList<>();
        l1.add(1);
        l1.add(6);
        l1.add(2);
        l1.add(4);
        l1.add(3);
        l1.add(5);
        l1.add(7);
//        l1.removeIf(x -> x%3 == 0);
        Predicate<Integer> p = x -> x % 3 == 0;
        System.out.println(l1);

        l1.sort((x, y) -> x.compareTo(y));
        System.out.println(l1);
    }
}
