package src.j08_IfStatement_TernaryOperator.Task_Nestedİf;

import java.util.Scanner;

public class toplam {
    public static void main(String[] args) {

        // **** Q03 ****
        /* TASK :
		Kullanicinin boyunu  m  ve kilosunu kg alarak  BMI (VKE) hesaplayiniz
	    INFO :
		BMI = kilo(kg) /(boy*boy)(m)
		BMI <=20 oldukca zayifsiniz
		20<BMI<=25 Normal sinirlardasiniz
		25<BMI<=30 Sisman kategorisindesiniz
		30<BMI ==> Obez grubundasiniz.
		*/
        Scanner scan=new Scanner(System.in);
        System.out.print("boyunuzu metre olarak giriniz: ");
        double boy= scan.nextDouble();
        System.out.print("kilonuzu kg olarak giriniz: ");
        double kilo= scan.nextDouble();

        double bmi= kilo/(boy*boy);
        System.out.println("bmi = " + bmi);

        if (bmi<=20){
            System.out.println("Oldukca zayifsiniz");
        } else if (20<bmi && bmi<=25) {
            System.out.println("Normal sinirlardasiniz");
        }else if (25<bmi && bmi<=30) {
            System.out.println("Sisman kategorisindesiniz");
        }else {
            System.out.println("Obez grubundasiniz.");
        }

        // **** Q05 ****
        /*
		TASK :
		Kullanicidan  yasini ve kilosunu alaliniz
		18 yasindan kucuk ise kan bagisi yapamaz
		18 yasindann buyuk ve 50 kilo dan hafif ise kan bagisi yapamaz.
		18 yasindan buyuk ve 50 kilodan agir ise kan bagisi yapabilir.
		 */
        System.out.print("yasinizi giriniz: ");
        int yas= scan.nextInt();

        if (yas>=18){
            System.out.print("kilonuzu kg olarak giriniz: ");
            double kg= scan.nextDouble();
            if (kg>=50){
                System.out.println("Kan bagisi yapabilirsiniz.");
            }else{
                System.out.println("Kilonuz 50 kg az oldugu icin kan veremezsiniz\n"+(50-kg)+" kg daha almaniz gerekli ");
            }
        }else{
            System.out.println("Yasiniz 18`den kucuk oldugu icin kan bagisi yapamazsiniz\n"+(18-yas)+" yil sonra kan verebilirsiniz.");
        }

        // **** Q08 ****
        /*
      TASK :
      Kullanicidan aldigi urunun adedini ve liste fiyatini alin, kullaniciya
      musteri karti olup olmadigini sorun
      Musteri karti varsa ve 10 urunden fazla alirsa %20, yoksa %15 indirim yapin
      Musteri karti yoksa ve 10 urunden fazla alirsa %15, 10 urunden az
      alirsa %10 indirim yapan code create ediniz.
     */
        System.out.print("Musteri kartiniz var mi? -> (V)ar or (Y)ok giriniz: ");
        char musteriKarti = scan.next().toUpperCase().charAt(0);

        if (musteriKarti == 'V') {
            System.out.print("Kac adet urun satin aldiniz: ");
            int urunAdet = scan.nextInt();
            if (urunAdet > 10) {
                System.out.println("Tebrikler %20 indirim kazandiniz");
            } else if(urunAdet >0) {
                System.out.println("Tebrikler %15 indirim kazandiniz");
            }else {
                System.out.println("Indirimden yararlanmak icin urun satin almaniz gerekli");
            }
        } else if (musteriKarti == 'Y') {
            System.out.print("Kac adet urun satin aldiniz: ");
            int urunAdet = scan.nextInt();
            if (urunAdet > 10) {
                System.out.println("Tebrikler %15 indirim kazandiniz");
            } else if (urunAdet > 0) {
                System.out.println("Tebrikler %10 indirim kazandiniz");
            } else {
                System.out.println("Indirimden yararlanmak icin urun satin almaniz gerekli");
            }
        } else{
            System.out.println("Hatali giris. musteri kartiniz varsa -> V, Yoksa -> Y karakterlerinden birini giriniz");
        }

        // **** Q09 ****
         /*
            TASK :
            45 değerinde bir double oluşturun.
            Eğer double 5'e bölününce kalan 0 ise ve double 8'e bölününce kalan 0 ise
            "able to divide by 5 and 8" yazdırınız.

            Eğer double 10'a bölününce kalan 5 ise ve double 9'a bölününce kalan 0 ise
            "able to divide by 9 and divide by 10 reminder is 5" yazdırınız.
        */
        double db= 45;

        if (db%5==0 && db%8==0){
            System.out.println("able to divide by 5 and 8");
        } else if (db%10==5 && db%9==0) {
            System.out.println("able to divide by 9 and divide by 10 reminder is 5");
        }

        // **** Q16 ****
       /*
        TASK :
        Kullanicidan 3 Numara isteyiniz ve bu numaralarin en buyuk ve
        en kucuk olanlarini konsola yazdiriniz
        int num1
        int num2
        int num3
        */
        System.out.println("Aralarda enter tusuna basarak 3 sayi giriniz");
        int m1 = scan.nextInt();
        int m2 = scan.nextInt();
        int m3 = scan.nextInt();

        if (m1>m2 && m2>m3){
            System.out.println("Minimum sayi: "+ m3);
        } else if (m1>m3 && m3>m2){
            System.out.println("Minimum sayi: "+ m2);
        } else if (m2>m1 && m1>m3){
            System.out.println("Minimum sayi: "+ m3);
        }else if (m2>m3 && m3>m1){
            System.out.println("Minimum sayi: "+ m1);
        }else if (m3>m2 && m2>m1){
            System.out.println("Minimum sayi: "+ m1);
        }else if (m3>m1 && m1>m2){
            System.out.println("Minimum sayi: "+ m2);
        }

    }
}
