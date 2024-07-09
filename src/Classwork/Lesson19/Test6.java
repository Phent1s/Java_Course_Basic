package Classwork.Lesson19;

public class Test6 {
    public static void main(String[] args) {

        StringBuilder sb1 = new StringBuilder("privet");
        StringBuilder sb2 = new StringBuilder("poka");
        StringBuilder sb3 = new StringBuilder("ok");
        StringBuilder [] array = {sb1,sb2,sb3};

        for (StringBuilder sb : array){
            sb.append("Apendend"); // работате
        }

//        for (int i = 0; i < array.length; i++) {
//            array[i] = 3;
//        }

//        for (int a : array){
//            a = 3; НЕ РАБОТАЕТ
//        }

//        for (int i = 0; i < array.length; i++) {
//            System.out.print(array[i] + " ");
//        }
    }
}
