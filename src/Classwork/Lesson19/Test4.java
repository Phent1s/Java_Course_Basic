package Classwork.Lesson19;

public class Test4 {
    public static void main(String[] args) {
        String[] Students = {"Ivanov", "Fedorov", "Ilonich"};
        String[] Exams = {"math", "english"};
        for(String s1 : Students){
            for (String s2 : Exams){
                System.out.println(s1 + " " + s2);
            }
        }
    }
}
