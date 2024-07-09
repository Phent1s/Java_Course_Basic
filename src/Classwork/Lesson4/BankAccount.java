package Classwork.Lesson4;

public class BankAccount {
    int ID;

    String Name;

    double Balance;

}

class   BankAccountTest extends BankAccount{
    public static void main(String[] args) {
        BankAccountTest t = new BankAccountTest();

        t.ID = 1;



        System.out.println(t.Name + t.Balance);
    }
}