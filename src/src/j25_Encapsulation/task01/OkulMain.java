package src.j25_Encapsulation.task01;

import java.util.ArrayList;
import java.util.Scanner;

public class OkulMain {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);

        System.out.print("max ogrenci sayisini giriniz:");
        int maxSayi=sc.nextInt();

        Okul okul1 =new Okul("YildizKoleji",maxSayi);
        ArrayList<Ogrenci>kayitliOgrenciler=okul1.getOgrenciler();

        int sayac=0;
        while (sayac!=maxSayi){
            System.out.print("Ogrencinin Yasini Giriniz: ");
            int yas =sc.nextInt();
            System.out.print("Ogrencinin Adini Giriniz: ");
            String ad= sc.next();
            System.out.print("Ogrencinin Soyadini Giriniz: ");
            String soyAd= sc.next();

            Ogrenci ogrenci = new Ogrenci(ad,soyAd,yas);
            kayitliOgrenciler.add(ogrenci);

            sayac++;
        }
        System.out.println("Kayitli Ogrenciler: \n"+kayitliOgrenciler);

    }
}
