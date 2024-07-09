package Homework.lesson16;

public class lesson16 {
    void email(String email){
       int a = 0;
       int b = 0;
       int c = 0;
       while (c < email.length() - 1){
           a = email.indexOf('@', c);
           b = email.indexOf('.', c);
           c = email.indexOf(';', c + 1);
           System.out.println(email.substring(a+1, b) + ";");
       }
    }

    public static void main(String[] args) {
        lesson16 l16 = new lesson16();
        l16.email("asd@gmail.com; wdsa@hotmail.fr; fasdwrsa@hobit.gore;");
    }
}
