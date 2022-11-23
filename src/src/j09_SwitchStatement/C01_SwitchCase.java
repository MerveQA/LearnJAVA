package src.j09_SwitchStatement;

import java.util.Scanner;

public class C01_SwitchCase {
    public static void main(String[] args) {

        /*
        Switch Case deyimi islev bakimindan if deyimine çok benzemektedir.
        Çok sayida if islem bloklari kullandigimizda programin okunurlugu azalacak ve
        programi izlemek zorlasacaktir. Programimizin bir degerini bir çok degerle
        karsilastirmak gerektiginde switch komutunu kullanacagiz. Switch seçenegi
        ile degiskenin durumuna göre bir çok durum içersinden bir tanesi gerçeklestirilir.
        Istersek de if deyimi ile switch case'' yi birlikte kullanabiliriz.
        Switch in yaptigi is kisaca, ifadenin degerini sirayla sabitlerle karsilastirarak ve her satiri islemektir.
        çok sayıda koşul içeren durumlarda switch kullanmak if'e göre programınızın daha hızlı çalışmasını sağlıyor.
        Bunun haricinde iki koşul ifadesi arasında dikkate değer bir performans farklılığı bulunmuyor.

        TRICK-> Switch Statement'de long,double,float ve boolean asla KULLANILMAZZZ.. CISSS
         */

        // TASK: kullanicinin girdigi rakami yazi ile print eden kod create ediniz.

        Scanner scan=new Scanner(System.in);
        System.out.print("Rakam giriniz: ");
        int rakam= scan.nextInt();

        System.out.println("   *** if-else   ***   ");
        if (rakam == 0) {
            System.out.println("girilen rakam SIFIR");
        } else if (rakam == 1) {
            System.out.println("girilen rakam BİR");
        } else if (rakam == 2) {
            System.out.println("girilen rakam İKİ");
        } else if (rakam == 3) {
            System.out.println("girilen rakam ÜÇ");
        } else if (rakam == 4) {
            System.out.println("girilen rakam DORT");
        } else if (rakam == 5) {
            System.out.println("girilen rakam BEŞ");
        } else if (rakam == 6) {
            System.out.println("girilen rakam ALTI");
        } else if (rakam == 7) {
            System.out.println("girilen rakam YEDİ");
        } else if (rakam == 8) {
            System.out.println("girilen rakam SEKİZ");
        } else if (rakam == 9) {
            System.out.println("girilen rakam DOKUZ");
        } else System.out.println("agam adam gibi rakam gir :(");


        System.out.println("*** Switch case ***");
        switch (rakam){
            case 0 :
                System.out.println("sifir");
                break;
            case 1 :
                System.out.println("Bir");
                break;
            case 2 :
                System.out.println("Iki");
                break;
            case 3 :
                System.out.println("Uc");
                break;
            case 4 :
                System.out.println("Dort");
                break;
            case 5 :
                System.out.println("Bes");
                break;
            case 6 :
                System.out.println("Alti");
                break;
            case 7 :
                System.out.println("Yedi");
                break;
            case 8 :
                System.out.println("Sekiz");
                break;
            case 9 :
                System.out.println("Dokuz");
                break;
            default:
                System.out.println("0 ile 9 arasinda bir rakam girin");
        }
        System.out.println("Bu satiri okuyorsan code run olup switch'ten cikmistir");

    }
}
