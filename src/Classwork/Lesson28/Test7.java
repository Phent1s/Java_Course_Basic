package Classwork.Lesson28;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Test7 {
    public static void main(String[] args) {
        LocalDate nachalo = LocalDate.of(2020, Month.OCTOBER, 1);
        LocalDateTime nachalo1 = LocalDateTime.of(2020, Month.OCTOBER, 1, 1, 1);
        LocalTime lt = LocalTime.now();
//        DateTimeFormatter d1 = DateTimeFormatter.ISO_LOCAL_DATE;
//        System.out.println(nachalo);
//        System.out.println(nachalo.format(d1));
//        DateTimeFormatter d2 = DateTimeFormatter.ISO_LOCAL_TIME;
//        System.out.println(lt);
//        System.out.println(lt.format(d2));
//        DateTimeFormatter d3 = DateTimeFormatter.ISO_LOCAL_DATE_TIME;
//        System.out.println(nachalo1);
//        System.out.println(nachalo1.format(d3));
//        DateTimeFormatter d1 = DateTimeFormatter.ISO_WEEK_DATE;
//        System.out.println(nachalo);
//        System.out.println(nachalo.format(d1));
        DateTimeFormatter shortFormat = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
        System.out.println(nachalo);
        System.out.println(nachalo.format(shortFormat));

        DateTimeFormatter f = DateTimeFormatter.ofPattern("MM dd yyyy");
        LocalDate ld2 = LocalDate.parse("03, 02, 2013", f);
        System.out.println(ld2);
    }
}
