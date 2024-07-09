package Classwork.Lesson27;

public class Test6 {
    void abc() throws ArrayIndexOutOfBoundsException{
        int [] arr = {1,2};
        System.out.println(arr[5]);
    }

    void def() throws ArrayIndexOutOfBoundsException{
        abc();
    }

    public static void main(String[] args) {
        Test6 t = new Test6();
        try{
            t.def();
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Exception catched");
            System.out.println(e);
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        }
    }

