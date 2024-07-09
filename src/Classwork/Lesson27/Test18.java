package Classwork.Lesson27;

public class Test18 {
    public static void main(String[] args) {
        Test18 t = new Test18();
        t.def();
    }

    void abc() {
        System.out.println("abc");
        throw new StackOverflowError();
    }

    void def() {
        try {
            abc();
            return;
        } finally {
            System.out.println("Finaly block");
        }
    }
}
