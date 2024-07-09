package Classwork.Lesson19;

public class Test1 {
    static void summa(String s, int ... a){
        int summa = 0;
        for (int i = 0; i < a.length; i++) {
            summa += a[i];
        }
        System.out.print(s);
        System.out.print(summa);

    }

    public static void main(String[] args) {
        summa("Summa: ",3,5,1,25,1);
    }
}

