package Homework;

public class lesson2 {
    public static void main(String[] args){

        byte b1 = 12;

        byte b2 = 0xC;

        byte b3 = 014;

        byte b4 = 0b1100;

        System.out.printf("%s %s %s %s %n", b1, b2, b3, b4);

        short s1 = 1300;

        short s2 = 0x514;

        short s3 = 02424;

        short s4 = 0b010100010100;

        System.out.printf("%s %s %s %s%n", s1, s2, s3, s4);

        int i1 = 0;

        int i2 = 0x0;

        int i3 = 0b0;

        int i4 = 00;

        System.out.printf("%s %s %s %s%n", i1, i2,i3,i4);

        long l1 = 123456789;

        long l2 = 0x75BCD15;

        long l3 = 0726746425;

        long l4 = 0b0111010110111100110100010101;

        System.out.printf("%s %s %s %s%n", l1,l2,l3,l4);

        float f1 = 13.14f;

        float f2 = 15.34f;

        double d1 = 32.2;

        double d2 = 32.2;

        boolean bool1 = false;

        boolean bool2 = true;

        System.out.printf("%s %s %s %s %s %s%n", f1, f2, d1, d2, bool1, bool2);

        char c1 = '2';

        char c2 = 425;

        char c3 = '\u4215';

        System.out.printf("%s %s %s%n", c1, c2 ,c3);
    }
}
