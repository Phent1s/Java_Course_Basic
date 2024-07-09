package Homework.Lesson18;

import java.util.Arrays;

public class Test1 {
//    static void sortirovka(int [] array){
//        Arrays.sort(array);
//        for (int i = 0; i < array.length; i++) {
//            System.out.println(array[i] + " ");
//        }
//    }

    public static int [] sortirovka(int [] array){
        int a;
        for (int i = 0; i < array.length; i++) {
            int min = array[i];
            int index = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < min){
                 min = array[j];
                 index = j;
                }
            }
            if (i != index){
                a = array[i];
                array[i] = min;
                array[index] = a;
            }

        }
        return array;
    }

    public static void showArray(String [][] array){
        System.out.print("{    ");
        for (int i = 0; i < array.length; i++) {
            System.out.print("{ ");
            for (int j = 0; j < array[i].length; j++) {
                if (j != array[i].length - 1){
                    System.out.print(array[i][j] + ", ");
                }
                else {
                    System.out.print(array[i][j]);
                }
            }
            if (i!=array.length-1){
                System.out.print(" },  ");
            } else {
                System.out.print(" }");
            }
        }
        System.out.println("    }");
    }


    public static void main(String[] args) {
        int [] array = {-3,56,2,6,1,-32,0};
        sortirovka(array);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        String array1[][] = {{"apple", "orange"}, {"Hello", "bye", "ok"},{"Car"}};
        showArray(array1);
        showArray(new String[][]{{"man", "woman"}, {"male", "female"}});
    }
}
