package src.HalukHocaProjeCozum.P01_ogrenciKayit_26Kasim.MyCalisma;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;

public class Kayit {

    ArrayList <Kullanici> kullaniciListesi= new ArrayList<>();

    public ArrayList <Kullanici> kayitAl(){

        Scanner scan= new Scanner(System.in);
        System.out.print("Adinizi girin: ");
        String ad=scan.nextLine();

        Kullanici obj1 = new Kullanici(ad, LocalDateTime.now());
        kullaniciListesi.add(obj1);

        return kullaniciListesi;

    }
    public void printHappyUsers(ArrayList <Kullanici> kullaniciListesi){

        for (Kullanici w : kullaniciListesi) {
            if (w.kayitZamani.getSecond()<=10){
                System.out.println("Tebrikler: "+w.name+" Kayit Zamani: "+w.kayitZamani);
            }else {
                System.out.println("Malesef: "+w.name+" Kayit Zamani: "+w.kayitZamani);
            }
        }
    }

    public void kayitlariListele (ArrayList <Kullanici> kullaniciListesi){
        System.out.println(kullaniciListesi);
    }


}
