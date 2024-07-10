package Classwork.Lesson28;
import java.time.*;

public class Test1 {
    public static void main(String[] args) {
//        System.out.println(LocalDate.now());
//        System.out.println(LocalTime.now());
//        System.out.println(LocalDateTime.now());
LocalDate ld = LocalDate.of(2015,12,15);
        System.out.println(ld);
        LocalDate ld1 = LocalDate.of(2015,Month.FEBRUARY,15);
        System.out.println(ld1);
        LocalTime lt1 = LocalTime.of(15,14);
        System.out.println(lt1);
        LocalTime lt3 = LocalTime.of(15,14,51);
        System.out.println(lt3);
        LocalTime lt2 = LocalTime.of(15,14, 32, 2);
        System.out.println(lt2);
        LocalDateTime ldt = LocalDateTime.of(2015,12,15,14,51);
        LocalDateTime ltd2 = LocalDateTime.of(ld1,lt1);
        ltd2 = ltd2.plusDays(1);
        System.out.println(ltd2);
    }
}
