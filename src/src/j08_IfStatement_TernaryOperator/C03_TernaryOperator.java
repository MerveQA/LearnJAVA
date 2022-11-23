package src.j08_IfStatement_TernaryOperator;

import java.util.Scanner;

public class C03_TernaryOperator {
    public static void main(String[] args) {

        /*
        Ternary ile yapilan tum islemler if-else blok ile de yapilabilir
        ternary tercih edilmesi yapinin basit okunabilir ve anlasilabilir olmasi içindir -> clean code
        Ternary icerisinde kompleks kodlar yerine dogrudan sonuç üreten veya sonucu veren
        daha basic code'lar bulunur.
        */


        // TASK01 -> girilen bir tamsayının tek-çift olmasını kontrol eden code create ediniz.

        Scanner scan=new Scanner(System.in);
        System.out.print("Sayi giriniz: ");
        int sayi= scan.nextInt();

        System.out.println("   ***  if-else   ***   ");

        if (sayi % 2 == 0) {
            System.out.println("agam sayi ÇİFT");
        } else System.out.println("agam sayi TEK ");

        System.out.println("   ***  ternary   ***   ");

        //String sonuc = sayi%2==0 ? "Cift sayi" : "Tek sayi";
        //System.out.println(sonuc);

        System.out.println(sayi%2==0 ? "Cift sayi" : "Tek sayi");
        /*
        Ternary operator islem sonucunda true veya false gore bir cikti verir.
        eger bu cikti type`a gore bir variable atanmazsa sout ile dogrudan print edilmeli.
         */

        // TASK02 -> girilen bir tamsayının negatif olmasını kontrol eden code create ediniz.

        String negatif= sayi<0 ? "Negatif" : "Negatif degil";

        System.out.println(negatif);

    }
}
