package Homework.Homework14;

public class Lesson14 {
    static void clock(){
        int i = 0;
//       OUTER: for (int i = 0; i <= 6; i++) {
//           MIDDLE: for (int j = 0; j <= 59; j++) {
//                if (i > 1 && j % 10 == 0){
//                    break OUTER;
//                }
//               INNER: for (int k = 0; k <= 59; k++) {
//                    if (k*i > j){
//                        continue MIDDLE;
//                    }
//                   System.out.println(i+":"+j+":"+k);
//                }
//            }
//        }

       OUTER:
       while (i < 6){
            int j = -1;
           MIDDLE:
           do {
                int k = 0;
                j++;
                if (i > 1 && j % 10 == 0){
                    break OUTER;
                }
               INNER:
               while (k <= 59){

                    if (k*i > j){
                        continue MIDDLE;
                    }
                   System.out.println(i+":"+j+":"+k);
                    k++;
                }


            }while (j < 59);
            i++;

        }
    }


    public static void main(String[] args) {
        clock();
    }
}
