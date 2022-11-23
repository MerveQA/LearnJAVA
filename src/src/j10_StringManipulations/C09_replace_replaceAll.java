package src.j10_StringManipulations;

import java.util.Scanner;

public class C09_replace_replaceAll {
    public static void main(String[] args) {

        /*
        replace()
        Metin icerisindeki karakter ya da bir parcasinin, istenilen karakter ya da metinle degistirilmesini (update -set) saglar.
        Sonuc String'dir..
        */

        String str= "javaCAN`lara selam olsun java ile bolcana offer";

        System.out.println(str.replace('a', '@')); //j@v@CAN`l@r@ sel@m olsun j@v@ ile bolc@n@ offer
        System.out.println(str.replace("can", "kan")); // javaCAN`lara selam olsun java ile bolkana offer

        /*
         ReplaceFirst: Replace ile aynı sadece ilk bulunanı değiştirir
         */
        System.out.println(str.replaceFirst("a", "@")); // j@vaCAN`lara selam olsun java ile bolcana offer

        // replaceAll() method u replace() methoduna benzer ama 2 fark vardır
        //1-replace() methodu char kabul eder ama replaceAll kabul etmez
        //2-replaceAll() method u regex kullanımına izin verir (Regular Expressions)

        //(Regular Expressions)
        //   \\s bosluk (
        //   \\S bosluk disindaki tum karakterler
        //   \\w harfler ve rakamlar (a z A Z, 0 9)
        //   \\W harfler ve rakamlar disindaki tum karakterler
        //   \\d rakamlar 0 9
        //   \\D rakamlar disindaki tum karakterler

        str= "    javaCAN`lara selam olsun :)  java ile 123654855  bolcana offer ***   ";

        System.out.println(str.replaceAll("\\s", "#"));
        //####javaCAN`lara#selam#olsun#:)##java#ile#123654855##bolcana#offer#***###

        System.out.println(str.replaceAll("\\S", "#"));
        //    ############ ##### ##### ##  #### ### #########  ####### ##### ###

        System.out.println(str.replaceAll("\\w", "#"));
        //    #######`#### ##### ##### :)  #### ### #########  ####### ##### ***

        System.out.println(str.replaceAll("\\W", "#"));
        //####javaCAN#lara#selam#olsun#####java#ile#123654855##bolcana#offer#######

        System.out.println(str.replaceAll("\\d", "#"));
        //    javaCAN`lara selam olsun :)  java ile #########  bolcana offer ***

        System.out.println(str.replaceAll("\\D", "#"));
        //##########################################123654855######################

        /*
        TASK: Girilen ismini, soyismini ve 16 haneli kredi karti no bilgilerini aşağıdaki
              formatta print eden code create ediniz.

        isim-soyisim : M***** B*******
        kart no : **** **** **** 1234
         */


        String isim= "Cigdem";
        String soyad= "Sen";
        String kartNo= "1234 5678 1234 5678";

        //1. YOL:
        String yeniIsim= isim.charAt(0)+isim.substring(1).replaceAll("\\w","*");
        String yeniSoyad= soyad.charAt(0)+soyad.substring(1).replaceAll("\\w","*");

        System.out.println(yeniIsim+" "+yeniSoyad);

        String yeniKartNo= kartNo.substring(4).replaceAll("\\d","*")+kartNo.substring(kartNo.length()-5);
        System.out.println(yeniKartNo);

        //2.YOL:
        String isim1 = "Çigdem Merve";
        String soyad1 = "Şen";
        String kartNo1 = "1234567890123456";
        String yeniIsim1 = isim1.charAt(0) + isim1.substring(1).replaceAll("\\w", "*");
        String yeniSoyisim1 = soyad1.charAt(0) + soyad1.substring(1).replaceAll("\\w", "*");

        String yeniKartNo1 = "**** **** **** ****" + kartNo1.substring(12);

        System.out.println("Isim-soyisim :"+yeniIsim1+" "+yeniSoyisim1+ "\nKart no : "+yeniKartNo1);




    }
}
