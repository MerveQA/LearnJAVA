package src.j19_StaticVariable;

public class C02_StaticBlock {
      /*
       1. static block yapilari static variable`lari deger atamasi(update) icin kullanilir
       2. static blocklar Class olusturuldugunda butun methodlardan (main dahil) ONCE calisir.
       3. birden cok statik block varsa yukaridan asagiya sira ile calisir.
        */

    static String isim= "Haluk Hoca"; // static

    static { // 1. olarak calisacak static block
        System.out.println("isim = " + isim); // Haluk Hoca
        System.out.println("1. static blick calisti");
        isim = "Dilek";
        System.out.println("static isim = " + isim);
    }

    public static void main(String[] args) { // main baslangic // 3. olarak calisacak main block

        System.out.println("main method basladi");
        isim = "Kerim";
        System.out.println("main isim = " + isim);
        System.out.println("main method bitti");

    } // main bitis

    static { // 2. olarak calisacak static block
        System.out.println("2. static blick calisti");
        isim = "Ugur";
        System.out.println("static2 isim = " + isim);
    }

    // isim = Haluk Hoca
    // 1. static blick calisti
    // static isim = Dilek

    // 2. static blick calisti
    // static2 isim = Ugur

    // main method basladi
    // main isim = Kerim
    // main method bitti
}
