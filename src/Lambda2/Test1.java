package Lambda2;

import java.util.ArrayList;

public class Test1 {
    public static void main(String[] args) {
        var t1 = new testInferenceType();
        var i = 10;
        var w = 1.5F;
        var array = new String[]{"a", "b"};
        var result = abc();
        Object obj = "Privet";
        var obj2 = obj;
        ArrayList<String> list = new ArrayList<>();
        list.add("a");
        for (var s : list) {
            System.out.println(s);
        }

    }
static    double abc(){return 3.14;}
}

class testInferenceType{

}

interface testInference{
    void abc();

    default void def(){
        System.out.println("def");
    }

    default void ghi(){}

}