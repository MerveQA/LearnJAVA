package src.j22_DateTime;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class C05_ZonedDateTime {
    public static void main(String[] args) {

        // herhangi bir ulke sehir -> local tarih ve zaman bilgisi tutar.

        LocalDate trhZone = LocalDate.now(ZoneId.of("America/New_York")); // America/NewYork localinin
                                                                                 // anlik tarih bilgisi tanimlandi
        LocalDate trhZone1 = LocalDate.now(ZoneId.of("Japan"));

        System.out.println("trhZone = " + trhZone); // 2022-10-26
        System.out.println("trhZone1 = " + trhZone1); // 2022-10-27

        ZonedDateTime zdt1= ZonedDateTime.now(ZoneId.of("America/New_York"));
        //ZonedDateTime zdt2= ZonedDateTime.now(ZoneId.of("America"));// Rte -> yerel saat dilimi tanimlanmali
        ZonedDateTime zdt3= ZonedDateTime.now(ZoneId.of("Japan"));

        System.out.println("zdt1 = " + zdt1); // 2022-10-26T13:46:54.570408900-04:00[America/New_York]
        //System.out.println("zdt2 = " + zdt2);
        System.out.println("zdt3 = " + zdt3); // 2022-10-27T02:46:54.570408900+09:00[Japan]
    }
}
