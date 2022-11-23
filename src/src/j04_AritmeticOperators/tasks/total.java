package src.j04_AritmeticOperators.tasks;

import java.util.Scanner;

public class total {
    public static void main(String[] args) {

        //**** TASK 01 ****
        int x = 4;
        x++; // 4+1=5
        x += x; // 5+5= 10
        --x; // 10-1= 9
        x = 7 + x; // 7+9= 16
        x *= x; // 16*16= 256
        x -= 3; // 256-3= 253

        System.out.println(" x = " + x ); // 253

        int a = 3;
        double d = 4.5;

        d+=a; // 4.5 + 3=> d= 7.5 ve a= 3
        a+=d; // 3 + 7.5=> a= 10 ve d= 7.5 -> a sayisi int oldugu icin ondalik kismi siler
        d-=a; // 7.5 - 10=> d= -2.5 ve a= 10
        a-=d; // 10 -(-2.5) => a= 12 ve d= -2.5-> burada d ile a`yi toplayip a`ya atarken yine ondalik kismi isleme katmaz

        System.out.println(" d = " + ++d ); //-2.5 + 1 = -1.5
        System.out.println(" a = " + a-- ); // a sayisini once 12 olarak konsola yazdirip hafizada 1 cikarir


        //**** TASK 02 ****
        /*
		 Write a program that prints multiplication table for 1. Do not use any loop.
		 1 için çarpım tablosu yazdıran bir program yazınız. Herhangi bir döngü kullanmayınız.
		    1x1=1
		    1x2=2
			1x3=3
			1x4=4
			1x5=5
			1x6=6
			1x7=7
			1x8=8
			1x9=9
			1x10=10
		 */

        int b= 1;
        System.out.println(1 + " x " +   b + " = " + (1*b));
        System.out.println(1 + " x " + ++b + " = " + (1*b));
        System.out.println(1 + " x " + ++b + " = " + (1*b));
        System.out.println(1 + " x " + ++b + " = " + (1*b));
        System.out.println(1 + " x " + ++b + " = " + (1*b));
        System.out.println(1 + " x " + ++b + " = " + (1*b));
        System.out.println(1 + " x " + ++b + " = " + (1*b));
        System.out.println(1 + " x " + ++b + " = " + (1*b));
        System.out.println(1 + " x " + ++b + " = " + (1*b));
        System.out.println(1 + " x " + ++b + " = " + (1*b));


        //**** TASK 03 ****
        // Soru 10:Kullanicinin girdigi 3 basamakli sayinin ilk ve son rakamlarinin toplamini veren programi yaziniz

        Scanner scan= new Scanner(System.in);
        System.out.print("Lutfen 3 basamakli bir sayi giriniz: ");
        int sayi= scan.nextInt();

        System.out.println("Kullanicinin girdigi sayi: "+sayi);

        int sayininBirlerBasamagi= sayi%10;
        int sayininYuzlerBasamagi= sayi/100;

        System.out.println("Kullanicinin girdigi sayinin yuzler basamagi= "+sayininYuzlerBasamagi +
                "\nKullanicinin girdigi sayinin birler basamagi= "+sayininBirlerBasamagi +
                "\nRakamlari Toplami= "+(sayininYuzlerBasamagi+sayininBirlerBasamagi));


        //**** TASK 05 ****
         /*
          Girilen saati  saniyeye çeviren program yazınız
          Örnek : 1 saat 10 dakika 50 saniye - > 4250 saniye
          1 saat = 3600 saniye
          1 dk   = 60 saniye
         */

        System.out.print("Lutfen bir saat giriniz: ");
        int saat= scan.nextInt();
        System.out.print("Lutfen bir dakika giriniz: ");
        int dakika= scan.nextInt();
        System.out.print("Lutfen bir saniye giriniz: ");
        int saniye= scan.nextInt();

        int saatiSaniyeyeCevirme= saat*3600;
        int dakikayiSaniyeyeCevirme= dakika*60;

        System.out.println(saat+" saat "+dakika+" dakika "+saniye+" saniye = "+
                (saniye+saatiSaniyeyeCevirme+dakikayiSaniyeyeCevirme)+" saniyedir");


        //**** TASK 06 ****
         /*
          Kullanicidan uc basamakli bir sayi alin ve sayinin rakamlarini birler,onlar ve yuzler basamagi olarak yazdirin
          Ornek : Inputs : 853
          Output : Girdiginiz sayinin birler basamagi : 3
                   Girdiginiz sayinin onlar basamagi : 5
                   Girdiginiz sayinin yuzler basamagi : 8
         */

        System.out.print("Lutfen 3 basamakli bir sayi giriniz: ");
        int sayi1= scan.nextInt();

        System.out.println("Kullanicinin girdigi sayi: "+sayi);

        int sayininBirlerBasamagi1= sayi1%10;
        int sayininOnlarBasamagi1= (sayi1/10)%10;
        int sayininYuzlerBasamagi1=sayi1/100;

        System.out.println("Girdiginiz sayinin birler basamagi: "+sayininBirlerBasamagi1);
        System.out.println("Girdiginiz sayinin onlar basamagi: "+sayininOnlarBasamagi1);
        System.out.println("Girdiginiz sayinin yuzler basamagi: "+sayininYuzlerBasamagi1);

        //**** TASK 07 ****
        // Soru 5: 120 yi 60 a bolunuz, sonucu 10 ile carpip 20 ile toplayiniz, cikan sonuctan 40 cikariniz.
        System.out.println((120/60*10+20)-40); // 0

        //**** TASK 08 ****
         /*
        Saniyeyi saat, dk ve saniyeye çeviren bir program yazınız.
     		Örnek : 4250 - > 1 saat 10 dakika 50 saniye
                    1 saat = 3600 saniye
                    1 dk   = 60 saniye
       */
        int input= 4250;

        int saat1= 4250/3600;
        int saniye1= 4250%60;
        int dakika1= (4250-(50+3600))/60;
        System.out.println(input+" saniye "+saat1+" saat "+dakika1+" dakika "+saniye1+" saniye");

        //**** TASK 09 ****
        /*
        Çiftlikteki hayvanların ayaklarının toplam sayısını bulma.
        Çiftlikteki bulunun inek, koyun, tavukların ayark sayısını hesaplayalım.
        */

        System.out.print("Ciftlikteki inek saysini giriniz: ");
        int inek= scan.nextInt();
        System.out.print("Ciftlikteki koyun saysini giriniz: ");
        int koyun= scan.nextInt();
        System.out.print("Ciftlikteki tavuk saysini giriniz: ");
        int tavuk= scan.nextInt();

        System.out.println("Ciftlikteki ineklerin ayaklari toplami: "+ inek*4 +
                "\nCiftlikteki koyunlarin ayaklari toplami: "+koyun*4 +
                "\nCiftlikteki tavuklarin ayaklari toplami: "+tavuk*2 +
                "\nCiftlikteki toplam "+(inek+koyun+tavuk)+" hayvanin ayak sayisi= "+ (inek*4+koyun*4+tavuk*2));

    }










}
