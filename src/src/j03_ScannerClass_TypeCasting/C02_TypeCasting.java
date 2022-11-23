package src.j03_ScannerClass_TypeCasting;

import java.util.Scanner;

public class C02_TypeCasting {
    public static void main(String[] args) {

       /*
       byte < short < int < long < float < double
       Auto Widening Casting -> Kucuk data type'larini buyuk data typlearina
       Java  otomatik olarak yapar.
      */

        boolean basarili= true;
        //String basari= basarili; => dogal uyumu olmayan variablelarda casting yapilamaz CTE
        //System.out.println("basari: " + basari);
        //System.out.println("basarili: " + basarili);

        double d= 17; // double variable`a int 17 atadik k->b
        System.out.println(d); // d= 17.0 outo widdinng

        int sayi1= 33;
        int sayi2= 7;
        System.out.println(sayi1/sayi2); //4
        /*
        java iki int sayiyi birbirine boldugumuzde sonucu int verir
        eger bolme isleminde ondalik sonuc cikarsa ondalik kismi siler.
         */

        byte b= 127;
        int i= b; // k->b atama auto widding
        System.out.println("i: "+i); //127

        int num= 1453;
        double d1= num; // k->b atama
        System.out.println("d1: " + d1); // 1453.0

        double db= d1/i; // double/int
        System.out.println("db: "+db); // 11.440944881889763
        // TRICK: iki farkli data type sayi isleme girerse java kucuk olan data type turu icin
        // auto widding yapar sonucu buyuk olan data type turune atar

        /*
         byte < short < int < long < float < double
         Explicit Narrowing Casting ->Buyuk data type'larini kucuk data type'larina cevirme islemini veri kaybndan dolayı
         Java otomatik olarak yapmaz. kod ile teyit ister...
         */

        double d2= 14.53;
        int num2= (int) d2; //b->k - d2`yi once int cevirdi sonra num2`ye atadi
        System.out.println("num2: "+num2); //14

        int num3= 150;
        byte b1= (byte) num3;
        System.out.println("b1: "+b1); // -106

        double d3= 333;
        long l= (long) d3;
        System.out.println("l: "+l); // 333

        double d4= 571.944;
        long l2= (long) d4;
        System.out.println("l2: "+l2); // 571

        /*
        TASK: Kullanicidan bir character girmesini isteyin ve
              girilen karakteri ve ascii degerini yazin

         Ornek : Input  : a
                 Output : Girdiginiz ‘a’ karakterinin ascii degeri : 95
         */

        Scanner scan= new Scanner(System.in);
        System.out.print("Lutfen bir karakter giriniz: ");
        char ch= scan.next().charAt(0);
        int ilk= ch;

        System.out.println("Girdiginiz "+ ch +" karakterinin ascii degeri: "+ilk);






    }
}
