package src.HalukHocaProjeCozum.P01_ogrenciKayit_26Kasim;

import java.time.LocalDateTime;

public class Kullanici {
    // Task 1. Step
    String name; // obj de deger alacak instance variable
    LocalDateTime kayitZamani; // obj de deger alacak instance variable

    public Kullanici(String name, LocalDateTime kayitZamani) { // telescopik (full  parametreli)
        this.name = name;
        this.kayitZamani = kayitZamani;
    }

    @Override
    public String toString() { // bu classtan olusturulan obj print etmek icin obj datalarini stringe cevirir
        return "\nname: " + name +
                "\nkayitZamani: " + kayitZamani;
    }
}
