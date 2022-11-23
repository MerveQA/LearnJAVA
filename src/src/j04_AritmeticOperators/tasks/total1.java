package src.j04_AritmeticOperators.tasks;

import java.util.Scanner;

public class total1 {
    public static void main(String[] args) {

        // *** _01_ArithmeticOperator_sum ***
        /*
        kullanıcıdan alınan iki tane int  (num1 , num2),
        toplamını print eden code create ediniz.
        */

        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen aralarda enter`a basarak 2 tane sayi giriniz.");
        int num1= scan.nextInt();
        int num2= scan.nextInt();

        System.out.println("num1: "+num1+" ve num2: "+num2+"`nin Toplami= "+ (num1+num2));


        // *** _02_ArithmeticOperator_sum2 ***
        /* kullanıcıdan alınan 4 tane int toplamını print eden code create ediniz. */

        System.out.println("Lutfen aralarda enter`a basarak 4 tane sayi giriniz.");
        int sayi1= scan.nextInt();
        int sayi2= scan.nextInt();
        int sayi3= scan.nextInt();
        int sayi4= scan.nextInt();

        System.out.println("Sayilarin Toplami= "+ (sayi1+ sayi2+ sayi3+ sayi4));


        // *** _03_ArithmeticOperator_subtract1 ***
         /*    kullanıcıdan alınan iki tane int  (num1 , num2),
         farkını print eden code create ediniz. */

        System.out.println("Lutfen aralarda enter`a basarak 2 tane sayi giriniz.");
        int nm1= scan.nextInt();
        int nm2= scan.nextInt();

        System.out.println("nm1: "+nm1+" ve nm2: "+nm2+"`nin Farki= "+ (nm1-nm2));


        // *** _04_ArithmeticOperator_subtract2 ***
        /*
        Verilen 4 tane int (num 1, num2 , num3 , num4),
        Int'leri birbirinden çıkarın.
        Sonucu yazdırın.
        Örneğin;
        num1 = 90
        num2 = 40
        num3 = 10
        num4 = 10
        Sonuc 30 olmalı.
         */

        int nuum1= 90, nuum2= 40, nuum3= 10, nuum4= 10;

        System.out.println(nuum1-nuum2-nuum3-nuum4); // 30


        // *** _05_ArithmeticOperator_sum3 ***
        /* kullanıcıdan alınan 3 tane int toplamını print eden code create ediniz. */

        System.out.println("Lutfen aralarda enter`a basarak 3 tane sayi giriniz.");
        int s1= scan.nextInt();
        int s2= scan.nextInt();
        int s3= scan.nextInt();

        System.out.println("Sayilarin Toplami= "+ (s1+ s2+ s3));


        // *** _06_ArithmeticOperator_division1 ***
        /* kullanıcıdan alınan iki tane int (num1 , num2), bölümünü print eden code create ediniz. */

        System.out.println("Lutfen aralarda enter`a basarak 2 tane sayi giriniz.");
        int a= scan.nextInt();
        int b= scan.nextInt();

        System.out.println("Iki sayinin bolumu= "+ (a/b));


        // *** _07_ArithmeticOperator_division2 ***
         /*
        Verilen int`ler hakkında, (num1, num2), num1'i num2'ye
        bölün ve sonucu int sonuc'a eşitleyin.
        int sonucu yazdırın.
        */

        int num11= 100, num12= 6;

        int sonuc= num11/num12;
        System.out.println(sonuc); // 16

        // *** _08_ArithmeticOperator_multiply1 ***
        /*
        Verilen 3 double hakkında, (num1 , num2, num3),
        Bu üç double'ı birbiriyle çarpın ve cevabı  sonuca eşitleyin.
        Sonucu yazdırın.
         */

        double x1= 15.956, x2= 9.78, x3= 85.365;

        double sonuc1= x1*x2*x3;
        int sonuc2= (int) (x1*x2*x3);

        System.out.println("double olarak sonuc: "+sonuc1); // 13321.1809332
        System.out.println("int olarak sonuc: "+sonuc2); // 13321


        // *** _09_ArithmeticOperator_multiply2 ***
        /*
        Oluşturulmuş olan double'lar hakkında,
        Bu 4 doubleyi  birbiriyle çarpın ve sonuca  eşitleyin.
        Double sonucu yazdırın.
        */

        double y1= 7.60, y2= 3.45, y3= 8.98, y4= 2.12;

        double sonucY= y1*y2*y3*y4;
        System.out.println("double sonuc: "+sonucY); // 499.16587200000004


        // *** _10_Arithmetic_Operator_multiply3 ***
         /*
        Oluşturulmuş olan int ler hakkında, (num1, num2 , num3, num4),
        Bu int'leri birbiriyle çarpın ve sonuca eşitleyin.
        int sonuc u yazdırın.
        */

        int z1= 45;
        int z2= 20;
        int z3= 5;
        int z4= 7;

        int sonucZ= z1*z2*z3*z4;
        System.out.println(sonucZ); // 31500


        // *** _11_ArithmeticOperator_reminder1 ***
        /*
        Verilen int ler hakkında (num1, num2),
        num1 'in   num2'ye bölümünden kalanı, int sonuc'a  eşitleyin.
        int sonucu yazdırın.
        */

        int d1= 100;
        int d2= 13;

        int sonucD= d1%d2;
        System.out.println(sonucD); // 9


        // *** _12_ArithmeticOperator_reminder2 ***
        /*
        Verilen int ler hakkında (num1 ve num2),
        num1'in num2'ye bölümünden kalanı int sonuc'a eşitleyiniz.
        int sonuc'u yazdırınız.
        */

        int numa1= 100;
        int numa2= 13;

        int sonucA= numa1%numa2;
        System.out.println(sonucA); // 9


        // *** _13_ArithmeticOperator_reminder3 ***
        /*
        Verilen iki int hakkında,
        num1'in num2'ye bölümünden kalanı yazdırınız.
        */

        int numBir= 105;
        int numIki= 11;

        System.out.println(numBir%numIki); // 6

    }
}
