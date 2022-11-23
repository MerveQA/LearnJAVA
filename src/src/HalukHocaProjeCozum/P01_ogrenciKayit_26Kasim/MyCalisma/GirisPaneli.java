package src.HalukHocaProjeCozum.P01_ogrenciKayit_26Kasim.MyCalisma;

import java.util.ArrayList;
import java.util.Scanner;

public class GirisPaneli {

    public static void menu() {

        Kayit kayitliOgrenciler = new Kayit();
        ArrayList<Kullanici> list = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        boolean cikilsinMi = true;

        while (cikilsinMi) {
            System.out.println("Ne yapmak istersin:" +
                    "\n1 -> Kayit Al" +
                    "\n2 -> Sansli kisi" +
                    "\n3-> Kayitli Ogrencileri Listele" +
                    "\n4 -> Cikis");

            int secim = sc.nextInt();
            switch (secim) {
                case 1:
                    list = kayitliOgrenciler.kayitAl();
                    break;
                case 2:
                    kayitliOgrenciler.printHappyUsers(list);
                    break;
                case 3:
                    kayitliOgrenciler.kayitlariListele(list);
                    break;
                case 4:
                    cikilsinMi = false;
                    break;
                default:
                    System.out.println("hatali giris yaptiniz.");
            }
        }
    }
}
