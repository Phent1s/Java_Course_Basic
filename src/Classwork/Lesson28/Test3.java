package Classwork.Lesson28;
import java.time.*;
public class Test3  {
    public static void main(String[] args) {
        LocalDate ld1 = LocalDate.of(2015,Month.FEBRUARY,15);
        LocalDate ld2 = LocalDate.of(2012,Month.JUNE,18);
        ld1.isAfter(ld2);
        LocalTime lt1 = LocalTime.of(15,14);
        LocalTime lt2 = LocalTime.of(3,5, 32, 10);
        lt1.isBefore(lt2);
        LocalDateTime ldt = LocalDateTime.of(2015,12,15,14,51);
        LocalDateTime ldt2 = LocalDateTime.of(2015,12,15,14,51,32);
        ldt.isAfter(ldt2);
    }
}
