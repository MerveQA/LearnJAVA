package src.j11_MethodCreation;

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {

        // TASK: Girilen ad ve soyadin ilk harflerini buyuk digerlerini kucuk yapan method create ediniz

        Scanner scan=new Scanner(System.in);
        System.out.print("Adinizi girin: ");
        String ad= scan.nextLine();
        System.out.print("Soyadinizi girin: ");
        String soyad= scan.nextLine();

        adSoyadYazdir(ad, soyad);
        System.out.println("2. Metod: "+adSoyadYazdir2(ad, soyad));

    }

    private static void adSoyadYazdir(String ad, String soyad) {

        System.out.print(ad.toUpperCase().charAt(0)+ad.toLowerCase().substring(1)+" ");
        System.out.println(soyad.toUpperCase().charAt(0)+soyad.toLowerCase().substring(1));
    }

    private static String adSoyadYazdir2(String ad, String soyad) {//return type olan method

        ad=ad.substring(0,1).toUpperCase()+ad.substring(1).toLowerCase();
        soyad=soyad.substring(0,1).toUpperCase()+soyad.substring(1).toLowerCase();

        return ad+" "+soyad;
    }


}
