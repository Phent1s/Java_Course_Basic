package Homework.Homework13;

public class Month {
    static void monthDays(int a){
        switch (a){
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                System.out.println("В этом месяце 31 день");
                break;
            case 4: case 6: case 9: case 11:
                System.out.println("В этом месяце 30 дней");
                break;
                case 2:
                    System.out.println("В этом месяце 28 дней");
                    break;

            default:
                System.out.println("null");
                break;
        }

    }

    public static void main(String[] args) {
        monthDays(3);
    }
}
