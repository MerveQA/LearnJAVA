package src.j18_Constructor.Tasks.AlanHesabi;

import java.util.Scanner;

public class Runeer {
    /*
    Task 01 >
    fields: width, length ve cevre ve alan hesaplayaan methodolan Rectangle isminde Class create ediniz.
    Runeer class'da obj ile cevre ve alan değerelerini print eden code create ediniz.
     */
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.print("1. Uzunlugu Girin: ");
        int uzunluk1= sc.nextInt();
        System.out.print("2. Uzunlugu Girin: ");
        int uzunluk2= sc.nextInt();

        Rectangle obj = new Rectangle(uzunluk1,uzunluk2);

        System.out.println("obj.alanHesapla() = " + obj.alanHesapla());
        System.out.println("obj.cevreHesapla() = " + obj.cevreHesapla());


    }




}
