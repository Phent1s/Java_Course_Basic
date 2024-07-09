package Classwork.Lesson20;
import java.util.ArrayList;
import java.util.List;

public class Test1 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("privet");
        Car c = new Car();
        list.add(c);
        Student s = new Student();
        list.add(s);
        list.add(new StringBuilder("ok"));

        ArrayList <String> list2 = new ArrayList<String>(30);
        list2.add("poka");
//        list2.add(s);
        List <StringBuilder> list3 = new ArrayList<>();
        List <String> list4 = new ArrayList<>(list2);
    }
}


class Car{

}
class Student{}