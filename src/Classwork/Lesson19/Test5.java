package Classwork.Lesson19;

public class Test5 {
    public static void main(String[] args) {
        int [][] array = {{1,5,2}, {2,6}, {9,2,6,1,89,2}};
//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array[i].length; j++) {
//                System.out.print(array[i][j] + " ");
//            }
//        }

        for (int [] array2 : array){
            for (int a : array2){
                System.out.print(a + " ");
            }
        }
    }
}
