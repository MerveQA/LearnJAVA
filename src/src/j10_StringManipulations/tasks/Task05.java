package src.j10_StringManipulations.tasks;

import java.util.Scanner;

public class Task05 {
    public static void main(String[] args) {

        // Task->Girilen ad soyad bilgilerinin ilk harflerini buyuk harf print eden code create ediniz..

        Scanner scan= new Scanner(System.in);
        System.out.print("Adinizi girin: ");
        String ad= scan.nextLine();
        System.out.print("Soyadinizi girin: ");
        String soyad= scan.nextLine();

        System.out.println(ad.toUpperCase().charAt(0)+ad.substring(1).toLowerCase()+" "+
                           soyad.toUpperCase().charAt(0)+soyad.substring(1).toLowerCase());


        // CIFT ISIM ve CIFT SOYISIMLI

        if (ad.contains(" ")){
            String birinciAd= ad.substring(0,ad.indexOf(" "));
            String ikinciAd= ad.substring(ad.indexOf(" ")+1);

            System.out.print((birinciAd.toUpperCase().charAt(0)+birinciAd.substring(1))+" "+
                    (ikinciAd.toUpperCase().charAt(0)+ikinciAd.substring(1))+" ");
        }else{
            System.out.print(ad.toUpperCase().charAt(0)+ad.substring(1).toLowerCase()+" ");
        }


        if (soyad.contains(" ")){
            String birinciSoyad= soyad.substring(0,soyad.indexOf(" "));
            String ikinciSoyad= soyad.substring(soyad.indexOf(" ")+1);

            System.out.println((birinciSoyad.toUpperCase().charAt(0)+birinciSoyad.substring(1))+" "+
                    (ikinciSoyad.toUpperCase().charAt(0)+ikinciSoyad.substring(1))+" ");
        }else{
            System.out.println(soyad.toUpperCase().charAt(0)+soyad.substring(1).toLowerCase());
        }


    }
}
