package Classwork.Lesson16;

public class Test2 {
    public static void main(String[] args) {
        String s1 = new String("abcdefabcd");
        String s10 = s1.substring(3);
        System.out.println(s10);

        String s2 = s1.substring(3,5);
        System.out.println(s2);

        String s3 = s1.trim();
        System.out.println(s3);

        String s11 = new String("privet");

        String s4 = s11.replace('r', 'Z');
        System.out.println(s4);

        String s5 = s11.replace("prive","lohi");
        System.out.println(s5);

        String s6 = "drugs";
        System.out.println(s11.concat(s6));
    }
}
