package Homework.Homework28;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Test1 {

    static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy, MMMM-dd !! hh:mm");
    static DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("hh:mm, dd/MMM/yy");

    static void smena(LocalDateTime nachalo, LocalDateTime konec, Period p, Duration d) {
        LocalDateTime date = nachalo;
        while (date.isBefore(konec)) {
            System.out.println("Working with: " + date.format(formatter));
            date = date.plus(p);
            System.out.println("Before: " + date.format(formatter));
            System.out.println("Rest from: " + date.format(formatter2));
            date = date.plus(d);
            System.out.println("Before: " + date.format(formatter2));
            System.out.println("-----------------------------------------------------");
        }
    }

    public static void main(String[] args) {
        LocalDateTime nachalo = LocalDateTime.of(2014, 12, 1, 0,0,0);
        LocalDateTime konec = LocalDateTime.of(2014, 12, 31, 0,0,0);
        Period p = Period.ofDays(5);
        Duration d = Duration.ofDays(2);
        smena(nachalo, konec, p, d);
    }
}
