package src.j04_AritmeticOperators;

import java.util.Scanner;

public class C03_RakamToplami {
    public static void main(String[] args) {

        // Kullanicidan alinan 3 basamakli bir sayinin rakamlari toplamini print eden code yaziniz.

        Scanner scan= new Scanner(System.in);
        System.out.print("Lutfen 3 basamakli bir sayi giriniz: ");
        int sayi= scan.nextInt();

        int birler= sayi%10;
        int onlar= (sayi/10)%10;
        int yuzler= sayi/100;

        int toplam= birler+onlar+yuzler;
        System.out.println("Sayinin rakamlari toplami: "+toplam);





    }
}
