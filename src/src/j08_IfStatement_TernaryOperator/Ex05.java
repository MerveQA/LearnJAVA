package src.j08_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {

        // Girilen iki sayiyi secilen 4 islemden birini uygulayip sonucu print eden code create ediniz.

        Scanner sc= new Scanner(System.in);

        System.out.print("Birinci sayi giriniz: ");
        double sayi1= sc.nextDouble();
        System.out.print("Ikinci sayi giriniz: ");
        double sayi2= sc.nextDouble();

        // 1. YOL:
        System.out.print("Yapmak istediginiz 4 islemden birini seciniz-> '+', '-', '*', '/' : ");
        char secim= sc.next().charAt(0);

        if (secim=='+'){
            System.out.println("Toplam: "+(sayi1+sayi2));
        }else if (secim=='-'){
            System.out.println("Cikarma: "+(sayi1-sayi2));
        }else if (secim=='*'){
            System.out.println("Carpma: "+(sayi1*sayi2));
        }else if (secim=='/'){
            System.out.println("Bolme: "+(sayi1/sayi2));
        } else {
            System.out.println("Yanlis secim yaptiniz.");
        }

        //2. YOL: hocanin cozumu
        System.out.println("+ için -> 1 seciniz \n- için -> 2 seçiniz \n* için -> 3 seciniz\n/ için -> 4 seciniz");
        int secim1 = sc.nextInt();

        if (secim==1) {
            System.out.println("toplama sonucu: " +sayi1+"+"+sayi2+"="+(sayi1+sayi2));
        } else if (secim1==2) {
            System.out.println("cıkarma sonucu: " +sayi1+"-"+sayi2+"="+(sayi1-sayi2));
        } else if (secim1==3) {
            System.out.println("carpma sonucu: " +sayi1+"*"+sayi2 +"="+(sayi1*sayi2));
        } else if (secim1==4) {
            System.out.println("bolme sonucu: " +sayi1+"/"+sayi2+"="+(sayi1/sayi2));
        } else {
            System.out.println("agam ne istiyon adam akıllı bişey gir işlemini yapalım");
        }



        
    }
}
