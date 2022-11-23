package src.HalukHocaProjeCozum.P01_ogrenciKayit_26Kasim.MyCalisma;

import java.time.LocalDateTime;

public class Kullanici {

    // fields
    String name;
    LocalDateTime kayitZamani;

    public Kullanici(String name, LocalDateTime kayitZamani) {
        this.name = name;
        this.kayitZamani = kayitZamani;
    }

    @Override
    public String toString() {
        return  "Name: " + name + " Kayit Zamani: " + kayitZamani;
    }
}
