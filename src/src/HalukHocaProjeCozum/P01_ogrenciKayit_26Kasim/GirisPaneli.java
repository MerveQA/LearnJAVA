package src.HalukHocaProjeCozum.P01_ogrenciKayit_26Kasim;

import java.util.ArrayList;
import java.util.Scanner;

public class GirisPaneli {

    //public static void giris(){ // bu tanimlama ile method static oldugu icin ClassName ile call edilir
    public void giris(){
        Scanner sc= new Scanner(System.in);

        Kayit yeniKayit= new Kayit(); // kayit klasina erisim icin parametresiz cons. ile yeniKayit objesi uretildi
        // Kayit classtan obj olmadan method call etmek icin methodlar static yapilirsa className ile call edilebilir.
        ArrayList<Kullanici> kisi= new ArrayList<>(); // kullanici classdan uretilen obj.lerin tutulacagi bos list

        boolean cikilsinMi=true; // while dongu icin sart olusturuldu
        while (cikilsinMi){
            System.out.println("Yapmak istediginiz islemi secin'\n1 -> Kayit Al\n2 -> Sansli kisi Bul\n3 -> Listele\n4 -> Cikis ");
            int tercih= sc.nextInt();

            switch (tercih){
                case 1: kisi=yeniKayit.kayitAl(); // kayit klastan yeniKayit obj ile kayitAl() call edildi
                    break;
                case 2: yeniKayit.sansliKullanici(kisi);
                    break;
                case 3: yeniKayit.listele(kisi);
                    break;
                case 4: cikilsinMi=false;
                    break;
                default:
                    System.out.println("Hatali giris");

            }
        }

    }

}
