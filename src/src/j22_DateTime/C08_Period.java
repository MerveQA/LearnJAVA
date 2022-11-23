package src.j22_DateTime;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class C08_Period {
    public static void main(String[] args) {

        // Period -> iki tarih arasinda  gecen tekrarlanabilen zamani tutar.

        LocalDate bugun = LocalDate.now();
        LocalDate falanGun = LocalDate.of(1923,10,29);

        Period fark = Period.between(falanGun,bugun);

        System.out.println("fark = " + fark); // P98Y11M27D
        System.out.println("fark.toTotalMonths() = " + fark.toTotalMonths()); // 1187 ay olarak farki getirir
        System.out.println("fark.getDays() = " + fark.getDays()); // 27

        System.out.println("****");
        Period period5Gun = Period.ofDays(5); // 5 gunde tekrarlayan periyod
        Period period7Ay = Period.ofMonths(7); // 7 ayde bir tekrarlayan period
        Period periodX = Period.ofMonths(7).ofDays(21); // 21`i dikkate alir, ay pasif kalir.

        System.out.println("bugun = " + bugun); // 2022-10-26
        bugun=bugun.plus(period5Gun);// bugune 5 gunluk period eklendi
        System.out.println("bugun = " + bugun); // 2022-10-31

        bugun=bugun.minus(period7Ay);
        System.out.println("bugun = " + bugun); // 2022-03-31

        bugun=bugun.plus(periodX);
        System.out.println("bugun = " + bugun); // 2022-04-21

        // TRICK: peryot tanimlamada birden cok zaman parametresi tanimlanirsa son parametre calisir digerleri pasif kalir

        //TASK: 5.9.2022 de baslayan kursun 9 ay sonra bitis tarihini print eden kode create ediniz.

        LocalDate baslangic= LocalDate.of(2022,9,5);
        System.out.println("baslangic: " + baslangic); // 2022-09-05
        Period kursSuresi = Period.ofMonths(9);
        System.out.println("bitis: " + baslangic.plus(kursSuresi)); // 2023-06-05

        System.out.println("Bitis2: " + baslangic.plus(kursSuresi).format(DateTimeFormatter.ISO_LOCAL_DATE));

        // ISO -> International Organization for Standardization
    }
}
