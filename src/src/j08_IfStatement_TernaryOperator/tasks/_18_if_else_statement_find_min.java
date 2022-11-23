package src.j08_IfStatement_TernaryOperator.tasks;

import java.util.Scanner;

public class _18_if_else_statement_find_min {

    public static void main(String[] args) {

    /*    Oluşturulan bu 3 int arasında en düşük değerdeki numarayı bulunuz.
          Bu numarayı yazdırınız.
          Not: Kodunuz her farklı senaryoda en küçük numarayı yazdırmalıdır.

          Örn: 10-11-12 > 10  */


        Scanner scan = new Scanner(System.in);
        System.out.println("Aralarda enter tusuna basarak 3 sayi giriniz");
        int m1 = scan.nextInt();
        int m2 = scan.nextInt();
        int m3 = scan.nextInt();
        //Kodu aşağıya yazınız. BU SATIRIN YUKARISINI DEĞİŞTİRMEYİNİZ.

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
