package src.j21_ImmutableClass;

public class C03_OCA_Equals {

    public static void main(String[] args) {
        String a = ""; // immutable class
        a += 2;     // a= "2"
        a += 'c';   // a= "2c"
        a += false; // a= "2cfalse"

        if (a == "2cfalse") { // sart saglamaz if calismaz -> a referansi "2cfalse" atama olmadigi icin referansi yok
            System.out.println("==");
        }

        if (a.equals("2cfalse")) {
            System.out.println("equals");
        }
         /*
        yukaridaki if sarti neden FALSE verdi(calisti)?
        CUNKU -> a`nin baslangic referans degeri hiclik uzerinden olustu.
        "2cfalse" degiskeni bir variable`a atanmis olsayi bile a variable`i ilk olarak HICLIK
        olarak tanimlandigi icin referanslari farkli olurdu. concat yoluyla
        eklemeler sonucu "2cfalse" elde edildi bu yuzden == kosulu yine FALSE verirdi.

        yukaridaki ikinci if sarti neden TRUE verdi(calisti)?
        CUNKU -> equals() methodu sadece degerlere baktigi ve referanslara
        bakmadigi icin degerlerde ayni oldugundan TRUE verir.
       */

        // ************* Eklemeler Yaptik **************

        String b = "2cfalse";
        System.out.println(b);

        String x = "ali";
        String y = "ali";

        if (x == y) {// x ve y String havuzunda ayni referansa sahip oldugu icin kosul TRUE olur if blok calisir
            System.out.println("referansları aynı havuzda x ve y eşit ==");
        }


        if (a == b) { // a`nin hiclik olarak String havuzunda referans var
                      // o yuzden b ile farkli referanta oyuzden kosul FALSE
            System.out.println("referansları aynı havuzda a ve b eşit ==");
        }

        /*
        a`nin baslangic referans degeri hiclik uzerinden olustu.
        burada a`ya ilk olarak hiclik atandi daha sonra concat yoluyla "2cfalse" degeri elde edildi
        ilk bastaki referansi hiclik degeri uzerindendir. Ama b variable`i direkt "2cfalse" degeri uzerinden
        olusturuldu bu yuzden String havuzunda farkli bir referans degeri aldi.
        */

    }
}
