package src.j03_ScannerClass_TypeCasting;

import java.util.Scanner;

public class C01_ScannerClass {
    public static void main(String[] args) {

        // kullanicidan veri almak icin  su 3 adim takip edilir
        // 1. Adim: Scanner class`dan obj create edilir
        //Scanner scan= new Scanner(System.in);// Scanner class`indan scan isminde degerini System icinden olan bir obj

        // 2. Adim: Kullanicidan istenen veri icin bildirimde bulunulur -> sout(...)
        // System.out.print("Adiniz i giriniz.");

        // 3. Adim: kullanicinin girdigi veriyi data tipine gore bir variable`a atanir.
        //String isim= scan.nextLine(); // kullanicidan gelen String tipinde isim verisi scan obj`ni nextLine() methodu ile atandi.

        //System.out.println("isim: " + isim);

        //TASK: Kullanicinin girdigi degere gore kare alani ve cevresini hesaplayan bir code create ediniz.
        Scanner scan= new Scanner(System.in);
        //System.out.print("Karenin kenar uzunlugunu giriniz");

        //int a= scan.nextInt();

        //System.out.println("Karenin alani: "+(a*a));
        //System.out.println("Karenin cevresi: "+(4*a));

        /*
        TASK: Kullanicinın  gunde içtiği  cay ve kullandığı  seker değerine göre
              Bir yilda kac kg seker kullandigini hesaplayan bir code create ediniz...
              1 seker = 1.7 gr
        Ornek : Input : cay sayisi : 10 seker sayisi :2
                Output : Yilda 12.41 kg seker kullaniyorsunuz
        */

        //System.out.println("Gunluk ictiginiz cay sayisini giriniz.");
        //int cay= scan.nextInt();
        //System.out.println("Seker sayisini giriniz");
        //double seker= scan.nextDouble();

        //TRICK: Birkac satiri tek seferde yoruma almak icin yoruma alinacak alan seci;ip "Ctrl + /" kullanilir.

        //System.out.println("Yillik seker tuketiminiz:"+ (cay*seker*1.7*365)/1000+" kg");

        System.out.println("Isminizi giriniz: ");
        char ch= scan.nextLine().charAt(0); // kullanicidan gelen String ifadenin sifirinci index ilk karakterini alir.
        System.out.println("isminizin ilk karakteri: "+ ch);

        // .next() => kullanicinin girdigi ilk ifadeyi alir.
        // .nextLine() => kullanicinin girdigi tum satiri alir.


    }
}
