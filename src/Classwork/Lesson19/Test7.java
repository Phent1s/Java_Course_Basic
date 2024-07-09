package Classwork.Lesson19;

public class Test7 {
    public static void main(String[] args) {
        int [] array= new int [4];
        for (int a : array){
            a = 10;
        }
                            // невозможно просети динасическую инициализацию
        for (int a : array){
            System.out.print(a + " ");
        }
    }
}
