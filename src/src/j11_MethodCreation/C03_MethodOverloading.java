package src.j11_MethodCreation;

public class C03_MethodOverloading {
        /*
       Java'da  methodlarin farkli olup olmadiklarini  anlamak icin
             a) Method ismi
             b) parametreler kontrol edilir..

       Java da ayni isimle birden fazla method olusturulmasına overloading denir.
       Overloading icin Method Signature'larinin farkli olmasi gerekir
       Method Signature = isim + parametre sayisi + parametre data type

       TRICK_01: Access Modifier'lari degistirsekte Java bu methodlari farkli methodlar olarak derlemez
                 aynı method olarak derler. Cunku access modifier'lar method signature'a dahil degildir.
       TRICK_02: Methodlarin body`sini degistirsekte Java bu methodlari farkli methodlar olarak derlemez
                 aynı method olarak derler. Cunku body'ler method signature'a dahil degildir.
       TRICK_03: Overloading "Compile Time Error" verir.

       Overloading :
       1)Parametrelerin sayisini degistirerek ayni isimli method'lar olusturabilirsiniz.
       2)Parametre sayisini degistirmeden herhangi bir parametrenin data type'ini
         degistirerek de ayni isimli methodlar olusturabilirsiniz.
       Note: topla(2,3); cagrisi topla(int num1, int num2) var oldugu surece
             topla(int num1, int num2) yi kullanir, cunku argument data type ile parametre
             data type birebir ortusuyor. Fakat birebir ortusen data type yoksa auto widening'e
             gore Java kullanacagi method'u secer. Auto widening'e gore kullanabilecegi bir method
             yoksa Java hata verir.
       3)FARKLI data type'indeki parametrelerin yerlerini degistirerek de ayni isimli
         methodlar olusturabilirsiniz.
         birbirini kapsayan data turleri oldugunda Java en optimum cozumu uretir
         (bire bir uyan varsa o methodu calistirir, bire bir uyan yoksa en fazla uyan
         methodu kullanir)
         Eger kapsayan bir method da bulamazsa Java CTE verir
     */
    public static void main(String[] args) {

        String str= "javaCAN`lara selam olsun :)";

        System.out.println(str.indexOf("C")); // 4
        System.out.println(str.indexOf('C')); // 4
        System.out.println(str.indexOf("C",3)); // 4
        // Yukaridaki indexOf() methodu Javanin ayni isimde
        // farkli data type`lar kullanarak overload ettigi methoda ornektir

        topla('a','b'); // int-int type method calisti ->195 (char data type int`e autoveiding yapti ASCII tablosu)
        topla('a',24);  // int-int type method calisti ->121 (char data type int`e autoveiding yapti ASCII tablosu)
        topla(3,14);    // int-int type method calisti ->17
        topla(3.14,34); // double-int type method calisti ->37.14
        topla(3,5);     // int-int type method calisti ->8
        topla(35,3.14); // int-double type method calisti ->38.14
        topla(3.5,8.9); // double-double type method calisti ->12.4
        //topla("3",5);    String data type iceren method olmadigi icin CTE verir


    }//main sonu

    public static void topla(int sayi1, int sayi2){

        System.out.println("int-int type method calisti ->"+(sayi1+sayi2));

    }
    public static void topla(double sayi1, int sayi2){

        System.out.println("double-int type method calisti ->"+(sayi1+sayi2));

    }
    public static void topla(int sayi1, double sayi2){

        System.out.println("int-double type method calisti ->"+(sayi1+sayi2));

    }
    public static void topla(double sayi1, double sayi2){

        System.out.println("double-double type method calisti ->"+(sayi1+sayi2));

    }


}
