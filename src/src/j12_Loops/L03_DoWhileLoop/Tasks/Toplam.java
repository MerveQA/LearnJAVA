package src.j12_Loops.L03_DoWhileLoop.Tasks;

import java.util.Random;
import java.util.Scanner;

public class Toplam {
    public static void main(String[] args) {

//       // *** Task01 ***
//        /*
//        Task-> girilen sayıların toplamı 333 gectiğinde girilen sayı adedini ve
//               toplamını print eden code create ediniz.
//         */
//
//        Scanner scan= new Scanner(System.in);
//        int sayi;
//        int sayilarToplami=0;
//        int sayiAdedi=0;
//
//        do{
//            System.out.print("Sayi giriniz: ");
//            sayi=scan.nextInt();
//
//            sayilarToplami+=sayi;
//            sayiAdedi++;
//
//        }while (sayilarToplami<=333);
//
//        System.out.println("Girilen: "+sayiAdedi+" adet sayinin Toplami: "+sayilarToplami);
//
//
//
//        // *** Task02 ***
//        /*
//        task-> girilen iki tamsayı arasındaki tamsayıları print eden code create ediniz.
//        for loop & while lopp
//         */
//
//        Scanner scan= new Scanner(System.in);
//        System.out.print("1. sayiyi giriniz: ");
//        int sayi1=scan.nextInt();
//        System.out.print("2. sayiyi giriniz: ");
//        int sayi2=scan.nextInt();
//
//        // Kullanicinin sayi1`imi yoksa sayi2`yimi buyuk sayi olarak girecegi bilinemedigi icin
//        // ifle iki durumda degerlendirildi
//
//        if (sayi1<sayi2){ // burada sayi1`in sayi2`den kucuk olma durumu ele alindi
//
//            do {
//                System.out.print(sayi1+" ");
//                sayi1++;
//            }while (sayi1<=sayi2);
//
//        }else { // burada sayi2`in sayi1`den kucuk olma durumu ele alindi
//
//            do {
//                System.out.print(sayi2+" ");
//                sayi1++;
//            }while (sayi2<=sayi1);
//        }
//
//
//
//       // *** Task03 ***
//        /*
//        task-> girilen  tamsayı için carpim tablosunu print eden code create ediniz.
//
//		 Ornek input = 13
//		 13x1=13 13x2=26  . . .. .  . 13x10=130
//		 */
//        Scanner scan= new Scanner(System.in);
//        System.out.print("Tam sayi giriniz: ");
//        int sayi=scan.nextInt();
//        int carpan= 1;
//
//        do {
//
//            System.out.println(carpan+" x "+sayi+" = "+(carpan*sayi));
//            carpan++;
//
//        }while (carpan<=10);
//
//
//
//        // *** Task04 ***
//        /*
//		task-> 3 basamakli 4 ve 6 ya tam bolunebilen tam sayilari buyukten kucuge ve
//			   kaç tane oldugunu print eden code create ediniz.
//		 */
//        int sayi=999;
//
//        while (sayi>99){
//
//            if (sayi%4==0 && sayi%6==0){
//                System.out.print(sayi+" ");
//            }
//            sayi--;
//        }
//
//
//
//        // *** Task05 ***
//        /*
//		task-> girilen isim ve soyismi için ilk isminin ilk harfinden soy isminin son harfine kadar olan butun harfleri
//		 	   ayni satirda aralarina bosluk birakarak print eden code create ediniz.
//		 */
//
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Adinizi girin: ");
//        String ad = sc.nextLine();
//
//        System.out.print("Soyadinizi girin: ");
//        String soyad = sc.nextLine();
//
//        String adSoyad = ad.concat(soyad).replaceAll("\\s","");
//
//        int sayac=0;
//
//        while (sayac<=adSoyad.length()-1){
//            System.out.print(adSoyad.charAt(sayac)+" ");
//            sayac++;
//        }
//
//
//
//        // *** Task06_sayiBulmaca ***
//        // bilgisayara 1 ile 100 arasinda bir sayi tutturun
//        // kullanicidan bu sayiyi tahmin etmesini isteyin
//        // girilen her tahminde sayiyi buyut veya kucult diye kullaniciya yol gosterin
//        // kullanici sayiyi buldugunda kac tahminde sayiyi buldugunu kullaniciya yazdirin
//
//        Random random = new Random();
//        int rastgele = random.nextInt(100);
//
//        Scanner scan= new Scanner(System.in);
//        int sayac=1;
//
//        while (true){
//            System.out.print("1-100 arasi Tam sayi giriniz: ");
//            int tahmin=scan.nextInt();
//
//            if (tahmin>rastgele){
//                System.out.println("Daha kucuk sayi girin.");
//
//            }else if (tahmin<rastgele){
//                System.out.println("Daha buyuk sayi girin.");
//
//            }else {
//                break;
//            }
//            sayac++;
//        }
//        System.out.println(sayac+" tahminde sayiyi dogru bildiniz");
//
//
//
//        // *** Task07 ***
//        // task-> girilen  5 sayının  en büyüğünü print den code create eediniz
//
//        Scanner oku = new Scanner(System.in);
//        System.out.print("Sayi girin: ");
//        int sayi=oku.nextInt();
//
//        int sayac=1;
//
//        while (sayac<5){
//
//            System.out.print("Tekrar Sayi girin: ");
//            int sayi1=oku.nextInt();
//
//            if (sayi1>sayi){
//                sayi=sayi1;
//            }
//            sayac++;
//        }
//        System.out.println("Girilen en buyuk sayi: "+sayi);
//
//
//
//        // *** Task10 ***
//        // task ->  Girilen bir sayıya kadar  tek olanlarını print eden code create ediniz.
//
//        Scanner scan= new Scanner(System.in);
//        System.out.print("Tam sayi giriniz: ");
//        int sayi=scan.nextInt();
//
//        int baslangic=1;
//
//        while (baslangic<=sayi){
//            System.out.print(baslangic+" ");
//            baslangic+=2;
//        }
//
//
//
//        // *** Task11 ***
//        /*
//        task -> 0 (sıfır) girilene kadar girilen tum sayıların adedini ve
//                toplamını print eden code create edinz.
//        */
//
//        Scanner scan= new Scanner(System.in);
//        System.out.print("Tam sayi giriniz: ");
//        int sayi=scan.nextInt();
//
//        int sayac=0;
//        int toplam=0;
//
//        while (sayi!=0){
//            System.out.print("Tekrar sayi giriniz: ");
//            sayi=scan.nextInt();
//            toplam+=sayi;
//            sayac++;
//        }
//
//        System.out.println("Sifir girilene kadar, "+sayac+" adet sayi girdiniz.\nGirilen sayilarin toplami: "+toplam);
//
//
//
//        // *** Task12 ***
//        /*
//		 task-> girilen bir metinde harf rakam ve özel karakter sayısını print eden code create ediniz.
//				do-While loop
//		 */
//
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Bir metin girin: ");
//        String metin = sc.nextLine().toLowerCase();
//
//        int sayac=0;
//        int sayacHarf=0;
//        int sayacRakam=0;
//        int sayacKrktr=0;
//
//        while (sayac<=metin.length()-1){
//            if (metin.charAt(sayac)>='a' &&metin.charAt(sayac)<='z'){ // harf kontrolu yapildi
//                sayacHarf++;
//            } else if (metin.charAt(sayac)>='0' &&metin.charAt(sayac)<='9') { // rakam kontrolu yapildi
//                sayacRakam++;
//            }else{  // harf ve rakam disinda kalan tum karakterlerin kontrolu
//                sayacKrktr++;
//            }
//
//            sayac++; // while blogunun sonlanmasi icin sayac olusturuldu
//        }
//
//        System.out.println("harf sayisi: "+sayacHarf);
//        System.out.println("rakam sayisi: "+sayacRakam);
//        System.out.println("karakter sayisi: "+sayacKrktr);
//
//
//
//        // *** Task13 ***
//        /*
//        task -> x karakteri girilene kadar "javaCAN" x karakteri girildiğinde "jAVATAR" print eden code create ediniz.
//                do-while lopp
//         */
//
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Bir karakter girin: ");
//        char ch;
//
//        do {
//            System.out.println("javaCAN");
//            System.out.print("Tekrar karakter girin: ");
//            ch = sc.next().toLowerCase().charAt(0);
//
//        }while (ch!='x');
//
//        System.out.println("jAVATAR");
//

    }
}

