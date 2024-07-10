package Classwork.Lesson28;
import java.time.*;
public class Test6 {
    public static void main(String[] args) {
        LocalDate nachalo = LocalDate.of(2020, Month.OCTOBER, 1);
        LocalDateTime nachalo1 = LocalDateTime.of(2020, Month.OCTOBER, 1, 1, 1);
        System.out.println(nachalo1.getDayOfWeek());
        System.out.println(nachalo.getDayOfWeek());
        System.out.println(nachalo1.getDayOfMonth());
        System.out.println(nachalo.getDayOfMonth());
        System.out.println(nachalo.getDayOfYear());
        System.out.println(nachalo1.getDayOfYear());
        System.out.println(nachalo1.getDayOfYear());
        System.out.println(nachalo1.getMonth());
        System.out.println(nachalo1.getMonthValue());
        System.out.println(nachalo1.getYear());

        LocalTime lt = LocalTime.now();
        System.out.println(lt.getNano());
        System.out.println(lt.getSecond());
        System.out.println(lt.getMinute());
        System.out.println(lt.getHour());

    }
}
