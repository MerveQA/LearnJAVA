package src.j01_Variables;

public class C01_HelloWorld {
    public static void main(String[] args) {
        System.out.println("Merhaba Dunya"); // bu komut konsola yazilan metni print eder.
        //`dan sonra yazilan ifadeler komut veya kod satiri olarak degil yorum olarak tanimlanir.
        /*
        bu araya yazilan her ifade yorum satiri olur.
        java kod olarak derlemez
        */

        System.out.println("javacan`lara selam olsun");
        System.out.println("javacan`lara selam olsun");
        System.out.println("javacan`lara selam olsun");
        System.out.println("javacan`lara selam olsun");

        //imlecin oldugu satir Ctrl+D ile alt satira kopyalanir.
        /*
        TRICK: javada kod satiri cumle (statement) sonuna mutlaka  ";" koyulmali
        code satirinda kirmizi alt cizgi uyarisi "Complite Time Error" CTE uyarisi demektir.
        CTE duzeltilmeden code yazilamaz, yazilan code calismaz.
         */

        // TASK: ad soyad yas memleket ve meslek print ediniz.

        System.out.print("Ad-Soyad: Yunus Emre ");
        System.out.println("Yas: 35 ");
        System.out.println("Memleket: Urfa");
        System.out.println("Meslek: Issiz");

        /*
        TRICK:
        print -> yazdirma isleminden sonraki komutu AYNI saqtirda devam ettirir.
        println -> yazdirma isleminden sonraki komutu ALT saqtirda devam ettirir.
        javada space yani bosluk bir character olarak tanimlanir.
        e m r e-> 7 karakter.
         */






    }
}
