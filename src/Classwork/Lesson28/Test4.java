package Classwork.Lesson28;
import java.time.*;
public class Test4 {
    static void smenaDejurnogo(LocalDate nachalo, LocalDate konech, Period p){
        LocalDate date = nachalo;
        while(date.isBefore(konech)){
            System.out.println("Nastupilo " + date + ", pora meniyatb dejurnogo");
            date = date.plus(p);
        }
    }

    public static void main(String[] args) {
        LocalDate nachalo = LocalDate.of(2020, Month.OCTOBER, 1);
        LocalDate konech = LocalDate.of(2021, Month.MAY, 31);
        Period p = Period.ofMonths(1);
        smenaDejurnogo(nachalo, konech, p);
    }
}
