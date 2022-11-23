package src.j10_StringManipulations.StringManipulationTasks;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {

      /* TASK :
       Kullanıcıdan tek seferde alacağınız 2 kelimelik ad soyadı 2 ayrı kelimeye ayırınız,
       ad ayrı soyad ayrı sekilde ekrana yazdırınız.
       */

        Scanner scan= new Scanner(System.in);
        System.out.print("Adinizi ve soyadinizi girin: ");
        String adSoyad= scan.nextLine();

        String ad= adSoyad.substring(0,adSoyad.indexOf(" "));
        String soyAd= adSoyad.substring(adSoyad.indexOf(" ")+1);

        System.out.println("ad = " + ad);
        System.out.println("soyAd = " + soyAd);

        // Adinizi ve soyadinizi girin: emre ciftci
        // ad = emre
        // soyAd = ciftci

    }
}
