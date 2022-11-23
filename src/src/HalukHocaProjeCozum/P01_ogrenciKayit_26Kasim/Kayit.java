package src.HalukHocaProjeCozum.P01_ogrenciKayit_26Kasim;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;

public class Kayit {

    ArrayList<Kullanici> kullaniciKisiler = new ArrayList<>(); // kulanici kilastan olusturulacak objelerin tutulacagi bos list
    // Task 2. step
    public ArrayList<Kullanici> kayitAl(){ // kullanıcı Class"dan obj uretmek ıcın cons.`a gereken name ve kayıtzamanı
                                            // bilgilerini olusturup olusan obj`i liste ekler.
        Scanner sc =new Scanner(System.in);
        System.out.print("Adinizi girin: ");
        String ad =sc.nextLine(); // Kullanici objesi icin name alindi
        Kullanici k1 =new Kullanici(ad, LocalDateTime.now()); // k1 objesi name`i kullanicinin girdigi ad`dan, kayit zamanini ise
                                                              // LocalDateTime.now()`dan parametre olarak  alir
        kullaniciKisiler.add(k1); //olsturulan k1 objesi liste eklendi

        return kullaniciKisiler; // kullaniciKisiler listi method ciktisi return olarak tanimlandi.
    }
        // Task 3. step
    public void sansliKullanici(ArrayList<Kullanici> kullObj){ // kullanici listindeki obj.lerin kayitZamanini 10sn az olup
                                                               // olmamasina gore sansli kullanici return edecek
        for (Kullanici k:kullObj) { // Kullanici klastan kayitAl method ile uretilip kullaniciKisi listine eklenen obj.ler donguya alindi

            if (k.kayitZamani.getSecond()<=10){ // Donguye giren herbir kullanici objesinin kayitZamani datasindaki
                                                // saniye verisi 10`dan kucuk olma sarti
                System.out.println(k.name+ " Tebrikler sansli kisisin 5 kilo bal kazandin. Kayit zamanin: "+k.kayitZamani);
            }else{
                System.out.println(k.name+ " Sansli degilsiniz. Kayit zamanin: "+k.kayitZamani);
            }
        }

    }

    public void  listele(ArrayList<Kullanici> kullObj){

        System.out.println(kullObj); // Kullanici classtaki toString methodu yazdirir
    }
}
