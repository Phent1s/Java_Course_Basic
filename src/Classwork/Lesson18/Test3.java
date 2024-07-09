package Classwork.Lesson18;
import java.util.Arrays;
public class Test3 {
    public static void main(String[] args) {
        int array1 [] = {1, 9 ,3 ,3 ,4 ,1, 2, 5, 6,6,13,1};
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + " ");
        }
        Arrays.sort(array1); //SORTIROVKA
        System.out.println();
        for (int i = 0; i < array1.length; i++) {
            System.out.println(array1[i] + " ");
        }

        int index1 =Arrays.binarySearch(array1, 4);
        System.out.println(index1);
    }
}
