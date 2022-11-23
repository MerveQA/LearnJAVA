package src.j36_Map.Tasks;

import java.util.HashMap;
import java.util.Map;

public class Task02 {
    public static <Capacity> void main(String[] args) {
        /*
        Task ->
         Key:isim ,email,adres,telefon
         Key2lere ait valueeleri depolayan bir kartvizit  map ve isim Key'e kartvizit map'i value tanımlayan farklı bir map tanımlayıp
         print eden code create ediniz
         */

        HashMap<String,String> bilgi=new HashMap<>();
        bilgi.put("Telefon","0500 600 1266");
        bilgi.put("Adres","Corum/Turkiye");
        bilgi.put("email","crayz@gmail.com");
        bilgi.put("Isim","Ismail TAS");
        System.out.println("bilgi = " + bilgi);

        HashMap<String,String> bilgi1=new HashMap<>();
        bilgi1.put("Telefon","0232 500 1515");
        bilgi1.put("Adres","Gonya/Turkiye");
        bilgi1.put("email","ebikgabik@gmail.com");
        bilgi1.put("Isim","Arda MUTLU");
        System.out.println("bilgi1 = " + bilgi1);

        HashMap<String,HashMap<String,String>>kartvizit =new HashMap<>();
        kartvizit.put("Ismail",bilgi);
        kartvizit.put("arda",bilgi1);

        System.out.println("Kartvizit: "+kartvizit);



    }
}


//        semihMap.get(isim) = Semih Nerde
//        semihMap.get(telefon) = 0 532 230000
//        ismailKartvizit.get(isim) = İsmail Demir
//        ismailKartvizit.get(telefon) = 0 546 450000
//        semih in telefonu = 0 532 230000
//        ismail in bilgileri = {telefon=0 546 450000, adres=Amsterdam/Hollanda, email=ismail@gmail.com, isim=İsmail Demir}
//        kartvizitler = {ismail={telefon=0 546 450000, adres=Amsterdam/Hollanda, email=ismail@gmail.com, isim=İsmail Demir}, semih={telefon=0 532 230000, adres=Frkanfurt/Almanya, email=Semih@hotmail.com, isim=Semih Nerde}}
