package src.j22_DateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class C03_LocalDateTime {
    public static void main(String[] args) {

        // LocalDateTime-> tarih(yil, ay, gun) ve zaman (saat, dakika, saniye, mlsn) bilgilerini tutar.

        LocalDateTime ldt = LocalDateTime.now();
        System.out.println("ldt = " + ldt); // 2022-10-25T23:01:39.348298

        LocalDate d = LocalDate.of(2016, 3, 13); // tarih atamasi
        LocalTime t = LocalTime.of(14, 45, 35); // zaman atamasi

        LocalDateTime trhZmn= LocalDateTime.of(d,t);
        System.out.println("trhZmn = " + trhZmn); // 2016-03-13T14:45:35

        LocalDateTime ltd1=LocalDateTime.of(2018, Month.MAY,19,20,30);
        System.out.println("ltd1 = " + ltd1); // 2018-05-19T20:30

        System.out.println("trhZmn.getDayOfMonth() = " + trhZmn.getDayOfMonth()); // 13
        System.out.println("trhZmn.getDayOfWeek() = " + trhZmn.getDayOfWeek()); // SUNDAY
        System.out.println("trhZmn.getHour() = " + trhZmn.getHour()); // 14

        System.out.println("trhZmn.plusWeeks(3).minusDays(5).plusHours(13).minusMinutes(72) = "
                + trhZmn.plusWeeks(3).minusDays(5).plusHours(13).minusMinutes(72)); // 2016-03-30T02:33:35


    }
}
