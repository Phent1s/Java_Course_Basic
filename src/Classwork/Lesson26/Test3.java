package Classwork.Lesson26;

public class Test3 {
    int a = 3;
    Test3(){
        a = 3;
    }
    {
        a=5;
    }

//    public static void main(String[] args) {
//        Test3 t = new Test3();
//        System.out.println(t.a);    }
}

class A{
    static final int a;
    static {
        a = 1;
    }
}

class B{
    static int c;
    static final int d;
    static final int e = 1;
    static final int f;

    static {
        c = 4;
        d = 5;
        f = 14;
    }
}

class C{
    String s = "ok";
    {
        System.out.println("Hello");
    }
    static int a = 0;
    static {
        System.out.println(a);
    }
    static {
        a = a + 1;
        System.out.println(a);
    }
    C(){
        System.out.println("Eto konstruktor");
    }

    public static void main(String[] args) {
        C c = new C();
    }
}