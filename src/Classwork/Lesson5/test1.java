package Classwork.Lesson5;
public class test1 {
    int sum(int x, int y, int z){
     int result = x+y+z;
     return result;
    }

    int midAverage(int a, int b, int c){
        int result2 = sum(a,b,c)/3;
        return result2;
    }
}

class test2{
    public static void main(String[] args) {
        test1 t = new test1();
        int result = t.sum(5,14,2);
        System.out.println(result);
    }
}