package src.j11_MethodCreation;

import java.util.Scanner;

public class C02_MethodCreation {
    public static void main(String[] args) { // main method acilisi

        // TASK: girilen 3 notun ortalamasini hesaplayan method create ediniz

        Scanner scan=new Scanner(System.in);
        System.out.print("1.notu girin: ");
        double not1= scan.nextDouble();
        System.out.print("2.notu girin: ");
        double not2= scan.nextDouble();
        System.out.print("3.notu girin: ");
        double not3= scan.nextDouble();

        double ortalama= notOrtalamasiHesapla(not1,not2,not3);
        System.out.println("ortalama = " + ortalama);

        System.out.println(notOrtalamasiHesapla(23, 45.6, 17)); // 28.53333333333333
        // Argument olarak tanımlanan variable ismleri yazılabilecegi gibi direkt değerde yazılabilir.

    } // main method kapanisi

    public static double notOrtalamasiHesapla(double a, double b, double c) {

        return (a+b+c)/3;
    }


}// class kapanis
