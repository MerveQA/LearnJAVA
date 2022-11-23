package src.j10_StringManipulations.StringManipulationTasks;

import java.util.Scanner;

public class toplam {
    public static void main(String[] args) {

        // *** _04_String_methods01 ***
        /*  I love java olan bir String oluşturun.
            Bu cümlenin toplam karakter sayısını yazdırın.   */

        //Kodu aşağıya yazınız.

        String s="I love java";
        System.out.println("Karakter sayisi: "+s.length()); // 11


        // *** _05_String_methods02 ***
        /*    Sprint planning olan bir String oluşturun.
        Bu dizenin toplam karakter sayısını yazdırın.   */

        //Kodu aşağıya yazınız.

        String s1="Sprint planning";
        System.out.println("s1.length() = " + s1.length()); // 15


        // *** _06_String_methods03 ***
        /*    paper olan bir String oluşturun.
          String'i büyük harfe çevirin ve yazdırın.
          örn: apple > APPLE   */

        //Kodu aşağıya yazınız.

        String s2= "paper";
        System.out.println("s2.toUpperCase() = " + s2.toUpperCase()); // PAPER


        // *** _07_String_methods04 ***
        /* OraNge olan bir String oluşturun.
           String'i küçük harfe çevirin ve yazdırın.
           örn: APPLE > apple  */

        //Kodu aşağıya yazınız.
        String s3="OraNge";
        System.out.println("s3.toLowerCase() = " + s3.toLowerCase()); // orange


        // *** _08_String_methods05 ***
        /*  New Jersey olan bir String oluşturun.
        String'i büyük harfe çevirin ve yazdırın  */

        //Kodu aşağıya yazınız.

        String s4= "New Jersey";
        System.out.println("s4.toUpperCase() = " + s4.toUpperCase()); // NEW JERSEY


        // *** _09_String_methods06 ***
        /*  New York olan bir String oluşturun.
            String'i küçük harfe çevirin ve yazdırın.  */

        //Kodu aşağıya yazınız.

        String s5= "New York";
        System.out.println("s5.toLowerCase() = " + s5.toLowerCase()); // new york


        // *** _10_String_methods07 ***
        /*  PADDLE olan bir String oluşturun.
            String'i küçük harfe çevirin ve yazdırın.  */

        //Kodu aşağıya yazınız.

        String s6="PADDLE";
        System.out.println("s6.toLowerCase() = " + s6.toLowerCase()); // paddle


        // *** _11_String_methods08 ***
        /*  apple olan bir String oluşturun.
                String'in içinde app olup olmadığını doğrula.   */

        //Kodu aşağıya yazınız.

        String s7="apple";
        System.out.println("s7.contains(\"app\") = " + s7.contains("app")); // true


        // *** _12_String_methods09 ***
        /*  apple kelimesinden  oluşan bir String yaz.
            String'in içinde App olup olmadığını doğrula.  */

        //Kodu buraya yazınız.

        String s8="apple";
        System.out.println("s8.contains(\"App\") = " + s8.contains("App")); // false


        // *** _13_String_methods10 ***
        /*  orange kelimesinden oluşan bir String oluşturun.
            String'in Apple'a eşit olup olmadığını doğrulayın. */

        //Kodu aşağıya yazınız.

        String s9= "orange";

        System.out.println("s9.equals(\"Apple\") = " + s9.equals("Apple")); // false
        System.out.println("s9==\"Apple\" = " + (s9 == "Apple")); // false


        // *** _14_String_methods11 ***
        /*  apple  olan  bir String oluşturun.
            String'in apple'a eşit olup olmadığını doğrulayın.
            Büyük harf veya küçük harf önemli değildir.    */

        //Kodu aşağıya yazınız.

        String s10= "apple";
        System.out.println("s10.equalsIgnoreCase(\"apple\") = " + s10.equalsIgnoreCase("apple")); // true


        // *** _16_String_methods12 ***
        /*  Florida kelimesinden bir String oluşturun.
            Florida kelimesinin içindeki, sadece  'o'  harfinin bulunduğu indexini yazdırın.  */

        //Kodu aşağıya yazınız.

        String s11= "Florida";
        System.out.println("s11.indexOf(\"o\") = " + s11.indexOf("o")); // 2


        // *** _17_String_methods13 ***
        /*  Thank you olan bir String oluşturun.
            Thank you içindeki, sadece  'y' harfinin bulunduğu konumu yazdırın.
            // Thank you Stringini oluşturun.  */

        //Kodu aşağıya yazınız.

        String s12="Thank you";
        System.out.println("s12.indexOf('y') = " + s12.indexOf('y')); // 6


        // *** _18_String_methods14 ***
        /*  String s1 = "      Clarus  Way          ";
            s13 String'inin önündeki ve arkasındaki boşlukları kaldırın.
            s13 String'ini yazdırın.  */

        //Kodu aşağıya yazınız.

        String s13 = "      Clarus  Way          ";
        System.out.println("s13.trim() = " + s13.trim()); // "Clarus  Way"


        // *** _19_String_methods15 ***
         /* Main method oluşturun.
            Mouse değerinde bir String oluştur.
            Mouse String'inin 2. sırasındaki karakteri yazdırın.  */

        //Kodu buraya yazınız.

        String s14="Mouse";

        System.out.println("s14.substring(2,3) = " + s14.substring(1,2)); // o
        // 2. sira dedigi icin (1,2) alindi
        // 2. index deseydi (2,3) olurdu


        // *** _20_String_methods16 ***
        /*  String s1 = "    Chocolade     ";
            s1 String'inin başındaki ve sonundaki boşlukları kaldırın.
            s1 String'ini yazdırın.  */

        //Kodu buraya yazınız.

        String s15= "    Chocolade     ";
        System.out.println("s15.trim() = " + s15.trim()); // "Chocolade"


        // *** Task11 ***
        /* TASK :
       Kullanıcıdan tek seferde alacağınız 2 kelimelik ad soyadı 2 ayrı kelimeye ayırınız,
       ad ayrı soyad ayrı sekilde ekrana yazdırınız.
       */

        Scanner scan= new Scanner(System.in);
        System.out.print("Adinizi ve soyadinizi girin: ");
        String adSoyad= scan.nextLine();

        String ad= adSoyad.substring(0,adSoyad.indexOf(" "));
        String soyAd= adSoyad.substring(adSoyad.indexOf(" ")+1);

        System.out.println("ad = " + ad);
        System.out.println("soyAd = " + soyAd);

        // Adinizi ve soyadinizi girin: emre ciftci
        // ad = emre
        // soyAd = ciftci


        // *** Task12 ***
        /*  TASK :
        Kullanıcıdan alacağınız, 3 kelimelik  ismi
         Örn. Ali Mert Yılmaz -> A.M.Y.  şeklinde print eden code create ediniz.
        */

        System.out.print("3 kelimelik isim girin: ");
        String isim= scan.nextLine();

        char birinciKelimeIlkH= isim.charAt(0);
        char ikinciKelimeIlkH= isim.charAt(isim.indexOf(" ")+1);
        char ucuncuKelimeIlkH= isim.charAt(isim.lastIndexOf(" ")+1);

        System.out.println(isim+" -> "+birinciKelimeIlkH+"."+ikinciKelimeIlkH+"."+ucuncuKelimeIlkH+".");
        // Ali Mert Yılmaz -> A.M.Y.

    }
}
