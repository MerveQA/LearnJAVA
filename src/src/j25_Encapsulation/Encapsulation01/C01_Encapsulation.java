package src.j25_Encapsulation.Encapsulation01;

public class C01_Encapsulation {
    /*
   1) Encapsulation kisaca "data hiding" demektir

   2) Basarili bir Encapsulation için :
      a) Nasil kullanilacagi ve hedefi net olmalidir.(Direksiyon gibi)
      b) Kodun karmasikligi kullanimin karmasikligina sebep olmamalidir.Yani cok
         karmasik kodlardan olusan bir yapi basit bir sekilde kullanilabilmelidir.
      c) Bir bolumun hata vermesi diger bolumlerin hatasına sebep olmamalidir.

   3) Encapsulation yapısı  tanımlanması için
      a) Access modifier'lari private tanımlanmalı
      b) istenilen field'lar için  getter ve setter methodlari ile "encapsulated" datalar okunmalı (getter) ve
         update edilebilmeli(setter)    .
      c) uygun constructor tanımlanmalı.
      d) toString() method tanımlanmalı


   4) Encapsulation'in faydalari
      a) Flexibility (Esneklik) -> Field'lar setter() methodu ile istenildiği kadar update edilebilir
      b) Reusability (Tekrar Kullanılabilirlik)-> Field'lar  getter ve setter method'lari bir kere tanımlanıp proje icindeki
         tum classlar'dan istenildiği kadar kullanabilir.
      c) Istenilen field  okunabilir(getter() methodu olustur), istenilen field okunamaz(getter() methodu olusturma)
         hale getirebilir.
      d) Istenilen field degistirebilir (setter() methodu olustur), Istenilen field degistirilemez
         (setter() methodu olusturma) yapabilir.

      TRICK: Tum variable'lar private ve sadece getter() method tanımlanan  class'da
             data'lar sadece okunabilir, degistirilemez. Bu tarz class'lara "immutable class" denir.

   5) Kullanicinin kullandigi sistem arkasindaki karmasik yapiyi kullaniciya gosterilmez.

 */

    public static void main(String[] args) {

        C02_Encapsulation obj1 =new C02_Encapsulation("Dilek Hanim",11);
        C02_Encapsulation obj2 =new C02_Encapsulation();

        System.out.println("obj1.idVer() = " + obj1.getId()); // 11
        System.out.println("obj1.isimVer() = " + obj1.getName()); // Dilek Hanim

        //obj1.id=333;
        //System.out.println("obj1.id = " + obj1.id); //333

        obj1.setName("Dilek Team Lead");
        System.out.println("obj1.isimVer() = " + obj1.getName()); // Dilek Team Lead

        System.out.println("obj2.idVer() = " + obj2.getId()); // 1001
        System.out.println("obj2.isimVer() = " + obj2.getName()); // Gamze Hanim

        obj2.setName("Gamze Scrum Master");
        System.out.println("obj2.isimVer() = " + obj2.getName()); // Gamze Scrum Master

        System.out.println("obj2 = " + obj2);
    }

}
