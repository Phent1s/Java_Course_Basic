package Classwork.Lesson27;

public class Test17 {

//    static {
//        int a = Integer.parseInt("12e");  //ExeptionInItitializerError
//    }

//    static String s = null;
//    static int a = s.length();

    static String s = abc();

    static String abc() {
        String[] array = {"a", "b", "c", "d", "e", "f"};
        return array[100];
    }

    public static void main(String[] args) {

    }
}
//virtualMachineError