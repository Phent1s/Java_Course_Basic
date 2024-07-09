package Classwork.Lesson13;

public class lesson13 {
}

class Student{
    int grade;
    Student(int grade){
        this.grade = grade;
    }

    public static void main(String[] args) {
        Student st1 = new Student(3);
        Student st2 = new Student(4);
        if (st1.grade == 2){
            System.out.println("Student lox ebaniy");
        }
        else  if (st1.grade == 3){
            System.out.println(" Student ne tak ploh");
        } else if (st1.grade == 4){
            System.out.println("Norm");
        }
        else if (st1.grade == 5){
            System.out.println("Horosh muzik");
        }
        else {
            System.out.println("Sho az huinia");
        }

        

        switch (st1.grade){
            case 2:
                System.out.println("Loh galimiy");
                break;
            case 3:
                System.out.println("triochka");
                break;
            case 4:
                System.out.println("Not bad nigga");
                break;
            case 5:
                System.out.println("DAMN");
                break;
            default:
                System.out.println("sho to ne to");
                break;
        }
    }
}