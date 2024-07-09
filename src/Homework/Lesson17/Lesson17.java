package Homework.Lesson17;

public class Lesson17 {
    public static boolean ravenstvo(StringBuilder sb1, StringBuilder sb2){
        String s1 = new String(sb1);
        String s2 = new String(sb2);
        return s1.equals(s2);
    }

    public static boolean ravenstvo2(StringBuilder sb1, StringBuilder sb2){
       boolean result = true;
       if (sb1.length() == sb2.length()){
           for (int i = 0; i < sb1.length(); i++) {
               if (sb1.charAt(i) != sb2.charAt(i)){
                   result = false;
                   break;
               }
           }
       }
       else{
           result = false;
       }
       return result;
    }

    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("String");
        StringBuilder sb2 = new StringBuilder("String");
        StringBuilder sb3 = new StringBuilder("Stringue");
        System.out.println(ravenstvo(sb1, sb2));
        System.out.println(ravenstvo2(sb1, sb2));
        System.out.println(ravenstvo(sb1, sb3));
        System.out.println(ravenstvo2(sb1, sb3));
    }
}
