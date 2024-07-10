package Classwork.Lesson28;
import java.time.*;
public class Test5 {
    public static void main(String[] args) {
        LocalDate nachalo = LocalDate.of(2020, Month.OCTOBER, 1);
        Period p = Period.ofDays(10);
        System.out.println(nachalo.plus(p));
        Duration d = Duration.ofHours(10);
    }
}
