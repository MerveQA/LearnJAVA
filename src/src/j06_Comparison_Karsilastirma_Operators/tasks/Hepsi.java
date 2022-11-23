package src.j06_Comparison_Karsilastirma_Operators.tasks;

import java.util.Scanner;

public class Hepsi {
    public static void main(String[] args) {

        // *** _14_ComparisonOperators_bigger ***
        /*
        Bir integer oluşturun ve değeri 13 olsun.
        Başka bir integer daha oluşturun ve değeri 10 olsun.
        Print kodunun içine Ilk int ,ikinci int'ten büyüktür yazın. (>,< simgeleri ile)
        Console' da 'true' yazısını görmelisiniz.
        */

        //Kodu aşağıya yazınız.

        int sayi= 13;
        int deger= 10;

        System.out.println("Ilk int ,ikinci int'ten büyük mü? -> "+(sayi>deger));

        // Ilk int ,ikinci int'ten büyük mü? -> true


        // *** _15_ComparisonOperators_smaller ***
        /*
        İki ayrı integer oluşturun.
        İlk integerin değeri 17,
        İkinci integerin değeri 20 olsun.
        Print kodunun içine, ilk int ikinci int'ten küçüktür yazın.(<,> simgeleri ile)
        Console'da true yazısını görmelisiniz.
        */

        // Kodu buraya yazınız.

        int a= 17;
        int b= 20;

        System.out.println("ilk int ikinci int'ten küçük mü? -> "+(a<b));

        // ilk int ikinci int'ten küçük mu? -> true


        // *** _16_ComparisonOperators_small_equal ***
        /*
        İki integer oluştur.
        İkisinin de değeri 13 olsun.
        Print kodunun içine, ilk int ikinci inte küçük veya eşittir yazın ve yazdırın.
        Console'da true yazısını görmelisiniz.
        Örnek:   15>=15
        */

        // Kodu aşağıya yazınız.

        int sayi1= 13;
        int sayi2= 13;

        System.out.println("sayi1 sayi2`den kucuk veya esit mi? -> "+(sayi1<=sayi2));

        // sayi1 sayi2`den kucuk veya esit mi? -> true


        // *** _17_ComparisonOperators_equal_equal ***
        /*
        Verilen iki tane int (num1, num2) ile ilgili,
        Eger num1  num2 ya  eşitse console'da true yazsın.
        Değilse false
        */

        Scanner scan= new Scanner(System.in);
        System.out.print("lutfen 1. sayiyi giriniz: ");
        int intNum1= scan.nextInt();
        System.out.print("lutfen 2. sayiyi giriniz: ");
        int intNum2= scan.nextInt();

        System.out.println("num1 num2`ye esit mi? -> "+(intNum1==intNum2));

        // intNum1= 10, intNum2= 10 girilirse => // intNum1 intNum2`ye esit mi? -> true
        // intNum1= 10, intNum2= 35 girilirse => // intNum1 intNum2`ye esit mi? -> false


        // *** _18_ComparisonOperators_equal_equal2 ***
        /*
        Oluşturulan double'lar hakkında (num1, num2)
        birbirine eşit olup olmadıklarını doğrulayın.
        Eğer eşitlerse konsolda true yazacaktır.
        */

        Scanner dp = new Scanner(System.in);

        double num1 = dp.nextDouble();
        double num2 = dp.nextDouble();

        // Kodu aşağıya yazınız. BU SATIRIN YUKARISINI DEĞİŞTİRMEYİNİZ.

        System.out.println("Kullanicinin girdigi num1= "+num1+", num2= "+num2+"`e esit mi? -> "+(num1==num2));

        // num1= 15, num2= 15 girilirse => // Kullanicinin girdigi num1= 15.0, num2= 15.0`e esit mi? -> true
        // num1= 15, num2= 55 girilirse => // Kullanicinin girdigi num1= 15.0, num2= 55.0`e esit mi? -> false


        // *** _19_ComparisonOperators_equals ***
        /*
        2 tane String oluşturun.
        String 1 "Apple" String 2 "Apple"
        İlk String'in değeri "Apple" , ikinci String'in değeri de "Apple"  olmalı.
        String1'in String2'ye eşit olduğunu doğrulayın.
        */

        // Kodu aşağıya yazdırınız.

        String str1 = "Apple";
        String str2 = "Apple";

        System.out.println("str1 str2`ye asit mi? -> "+ (str1==str2)); // str1 str2`ye asit mi? -> true


        // *** _20_ComparisonOperators_bigger_equal ***
        /*
        İki tane float oluşturun. Birinci float 14, ikinci float 17'dir.
        Birinci float'un, ikinci float'dan büyük eşit olduğunu veya  büyük olduğunu yada olmadığını doğrulayın.
        Sonucu yazdırınız.
        */

        //Kodu aşağıya yazınız.

        float f1= 14f;
        float f2= 17f;

        System.out.println("f1 f2`den buyuk veya esit mi? -> "+(f1>=f2)); // f1 f2`den buyuk veya esit mi? -> false
        System.out.println("f1 f2`den kucuk veya esit mi? -> "+(f1<=f2)); // f1 f2`den kucuk veya esit mi? -> true
        System.out.println("f1 f2`den buyuk mu? -> "+(f1>f2)); // f1 f2`den buyuk mu? -> false
        System.out.println("f1 f2`den kucuk mu? -> "+(f1<f2)); // f1 f2`den kucuk mu? -> true


        // *** _21_ComparisonOperators_not_equal ***
        /*
        2 double oluşturun.
        İlk double'ın değeri 14.23, ikinci double'ın değeri 19.52 olmalı.
        Double1'in double2'ye eşit olmadığını doğrulayın.
        Eğer eşit değilse cevap true olmalı.
        Cevabı yazdırınız.
        */

        // Kodu aşağıya yazınız.

        double d1= 14.23;
        double d2= 19.52;

        System.out.println("d1 d2`ye esit degil mi? -> "+ (d1!=d2)); // d1 d2`ye esit degil mi? -> true


        // *** _22_ComparisonOperators_not_equal2 ***
        /*
        2 String oluşturunuz.
        İlk String'in değeri "Techno Study", ikinci String'in değeri de "Techno Study" olsun.
        İlk String'in ikinci String'e eşit olmadığını doğrulayın. örn: (  !=    işareti ile)
        Eğer eşit değilse cevap true, eğer eşitse cevap false olacaktır.
        Cevabı yazdırın.
        */

        //Kodu aşağıya yazınız.

        String s1= "Techno Study";
        String s2= "Techno Study";

        System.out.println("s1 s2`ye esit mi? -> "+ (s1==s2)); // s1 s2`ye esit mi? -> true
        System.out.println("s1 s2`ye esit degil mi? -> "+ (s1!=s2)); // s1 s2`ye esit degil mi? -> false
        System.out.println("s1 s2`ye esit degil degil mi? -> "+ !(s1!=s2)); // s1 s2`ye esit degil degil mi? -> true


        // *** _23_ComparisonOperators_small ***
        /*
        2 double oluşturun.
        İkisinin de değeri 14.23 olsun.
        Double1'in double2 'den küçük olup olmadığını doğrulayın.(Eğer küçükse konsolda 'true' yazacaktır.)
        Cevabı yazdırın.
        */

        //  Kodu aşağıya yazınız.

        double db1= 14.23;
        double db2= 14.23;

        System.out.println("Double1 double2`den kucuk mu? -> "+(db1<db2)); // Double1 double2`den kucuk mu? -> false
        System.out.println("Double1 double2`den kucuk degil mi? -> "+!(db1<db2)); // Double1 double2`den kucuk degil mi? -> true


        // *** _24_ComparisonOperators_bigger ***
        /*
        2 int oluşturun. int 1 'in değeri 120,
        int 2'nin değeri 158 olmalı.
        int 1 'in int 2'den büyük olup olmadığını doğrulayın.
        (Eğer int1, int2'den büyükse konsolda true sonucu vermeli.)
        Cevabı yazdırın.
        */

        // Kodu aşağıya yazınız.

        int int1 =120;
        int int2= 158;

        System.out.println("int1 int2`den buyuk mu? -> "+(int1>int2)); // int1 int2`den buyuk mu? -> false
        System.out.println("int1 int2`den buyuk degil mi? -> "+!(int1>int2)); // int1 int2`den buyuk degil mi? -> true

    }
}
