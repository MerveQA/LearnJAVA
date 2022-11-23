package src.j03_ScannerClass_TypeCasting.ScannerTasks;

import java.util.Scanner;

public class Task04 {
    public static void main(String[] args) {

       /* TASK -> Clarusway spor salonu için kullanıcıdan isim soyisim, yaş, kilo, boy, salona devam edeceği ay süresini
                  bilgilerini alıp aylık $20 olarak toplam ücretini hesplayıp print eden code create ediniz.
        */
        Scanner scan= new Scanner(System.in);
        System.out.print("Lutfen adinizi ve soyadinizi giriniz: ");
        String adSoyad= scan.nextLine();
        System.out.print("Lutfen yasinizi giriniz: ");
        int yas= scan.nextInt();
        System.out.print("Lutfen kilonuzu kg olarak giriniz: ");
        double kilo= scan.nextInt();
        System.out.print("Lutfen boyunuzu cm olarak giriniz: ");
        int boy= scan.nextInt();
        System.out.print("Lutfen salonumuza devam edeceğiniz sureyi ay olarak giriniz: ");
        int devamSuresi= scan.nextInt();

        System.out.println("Salonumuza kayit yaptiran musterinin:\nAdi soyadi: "+adSoyad+"\nYasi: "+
                yas+"\nKilosu: "+kilo+" kg\nBoyu: "+boy+" cm\nSalona devam edecegi sure: "+devamSuresi+
                " ay\nOdeyecegi toplam ucret: "+devamSuresi*20+" $");


    }
}
