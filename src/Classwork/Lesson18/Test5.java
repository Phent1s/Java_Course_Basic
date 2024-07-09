package Classwork.Lesson18;

public class Test5 {

    public static void maxMin(double [] array){
        double max = array[0];
        double min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max){
                max = array[i];
            }
            if (min < array[i]){
                min = array[i];
            }
        }
        System.out.println("min = " + min + " max =  " + max);
    }
}
