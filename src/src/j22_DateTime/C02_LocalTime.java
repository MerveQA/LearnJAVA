package src.j22_DateTime;

import java.time.LocalTime;

public class C02_LocalTime {
    public static void main(String[] args) {

        // LocalTime -> saat dakika saniye milisaniye tutar
        LocalTime suan = LocalTime.now(); // sistemden anlik zaman bilgisi alir.

        System.out.println("suan = " + suan); // 22:42:44.236649100
        System.out.println("suan.getHour() = " + suan.getHour()); // 22
        System.out.println("suan.getMinute() = " + suan.getMinute()); // 44
        System.out.println("suan.getNano() = " + suan.getNano()); // 908651800
        System.out.println("suan.getSecond() = " + suan.getSecond()); // 11

        // belirli bir zamanda ilaeri geri zamana gidilebilir
        LocalTime time1 = LocalTime.of(13,43,34); // belirli bir sa, dk ve sn olan zaman atandi
        System.out.println("time1.plusMinutes(90) = " + time1.plusMinutes(90)); // 15:13:34
        System.out.println("time1.plusMinutes(150) = " + time1.plusMinutes(150)); // 16:13:34
        System.out.println("time1.minusHours(23) = " + time1.minusHours(23)); // 14:43:34
        System.out.println("time1.minusMinutes(100).plusHours(2) = "
                + time1.minusMinutes(100).plusHours(2)); // 14:03:34


        LocalTime forBasi = LocalTime.now();
        System.out.println("forBasi = " + forBasi.getNano());
        int sayi =0;
        for (int i = 0; i < 100000; i++) {
            sayi+=i;
        }
        LocalTime forSonu = LocalTime.now();
        System.out.println("forSonu = " + forSonu.getNano());
        System.out.println( forSonu.getNano() - forBasi.getNano());


    }
}
