package Classwork.Lesson20;

import java.util.Arrays;

//compare
//mismatch
public class Test9 {
    public static void main(String[] args) {
        int [] array1 = {1,2,3,4,5,5};
        int [] array5 = {1,2,3,4,5,5};
        int [] array2 = {1,2,3,5};

        char [] array3 = {'p', 'r','i','v','e','t'};
        char [] array4 = {'p', 'r','i','v','o','z','i','k'};

        System.out.println(Arrays.compare(array1, array2));
        System.out.println(Arrays.compare(array4, array3));
        System.out.println(Arrays.mismatch(array1, array2)); // покажет где первое расїождение
    }
}
