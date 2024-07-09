package Classwork.Lesson18;

public class Test6 {
    public static void main(String[] args) {
        char [] array = {'p','r','i','v','e','t'};
        String s = new String(array);
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(array, 2 ,3);
        System.out.println(sb);
        sb.insert(2, array, 1,3);
        System.out.println(sb);
    }
}
