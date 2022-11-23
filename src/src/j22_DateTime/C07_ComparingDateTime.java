package src.j22_DateTime;

import java.time.LocalDate;

public class C07_ComparingDateTime {
    public static void main(String[] args) {

        LocalDate bugun = LocalDate.now();
        LocalDate xGun = bugun.minusDays(24);
        LocalDate yGun = bugun.plusDays(3);

        System.out.println("bugun = " + bugun); // 2022-10-26
        System.out.println("xGun = " + xGun); // 2022-10-24
        System.out.println("yGun = " + yGun); // 2022-10-29

        // TRICK -> is ile baslayan methodlar boolean return efer.
        System.out.println("bugun.isBefore(xGun) = " + bugun.isBefore(xGun)); // false
        System.out.println("bugun.isBefore(yGun) = " + bugun.isBefore(yGun)); // true
        System.out.println("xGun.isBefore(yGun) = " + xGun.isBefore(yGun)); // ture

        System.out.println("bugun.isAfter(yGun) = " + bugun.isAfter(yGun)); // false
        System.out.println("xGun.isAfter(yGun) = " + xGun.isAfter(yGun)); // false

        System.out.println("bugun.isLeapYear() = " + bugun.isLeapYear()); // false

        int fark= bugun.compareTo(xGun);

        System.out.println("fark = " + fark); // 24

        int fark1 = xGun.compareTo(yGun);
        System.out.println("fark1 = " + fark1); // -27

        LocalDate dogumTarihi= LocalDate.of(1987,06,28);
        System.out.println("bugun.compareTo(dogumTarihi) = " + bugun.compareTo(dogumTarihi));

        /*
        ComperaTo komutu işlevi:
        2020-05-23 >  2018-04-02   compareTo =>  2  en büyük fark yılda olduğu için
        2020-05-23 >  2020-04-02   compareTo =>  1  en büyük fark ayda  olduğu için
        2020-05-23 >  2020-05-02   compareTo =>  21  en büyük fark günde olduğu için
        */
    }
}
