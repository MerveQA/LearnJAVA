package src.j04_AritmeticOperators.tasks;

import java.util.Scanner;

public class Task05 {
     public static void main(String[] args) {
        /*
          Girilen saati  saniyeye çeviren program yazınız
          Örnek : 1 saat 10 dakika 50 saniye - > 4250 saniye
          1 saat = 3600 saniye
          1 dk   = 60 saniye
         */

         Scanner scan= new Scanner(System.in);
         System.out.print("Lutfen bir saat giriniz: ");
         int saat= scan.nextInt();
         System.out.print("Lutfen bir dakika giriniz: ");
         int dakika= scan.nextInt();
         System.out.print("Lutfen bir saniye giriniz: ");
         int saniye= scan.nextInt();

         int saatiSaniyeyeCevirme= saat*3600;
         int dakikayiSaniyeyeCevirme= dakika*60;

         System.out.println(saat+" saat "+dakika+" dakika "+saniye+" saniye = "+
                           (saniye+saatiSaniyeyeCevirme+dakikayiSaniyeyeCevirme)+" saniyedir");



     }

}
