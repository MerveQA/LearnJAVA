package src.j12_Loops.L01_ForLoop.Tasks_DersteCozulenler;

import java.util.Scanner;

public class Task07_Nested {
    public static void main(String[] args) {

        /*
        Task -> girilen boyuttta bir kare için;
        Ekran Çıktısı
        Bir sayı giriniz: 7
        1 0 0 0 0 0 0
        0 1 0 0 0 0 0
        0 0 1 0 0 0 0
        0 0 0 1 0 0 0
        0 0 0 0 1 0 0
        0 0 0 0 0 1 0
        0 0 0 0 0 0 1

        Bir sayi giriniz: 5
        1 0 0 0 0
        0 1 0 0 0
        0 0 1 0 0
        0 0 0 1 0
        0 0 0 0 1     şekli print eden code create ediniz
        */

        Scanner sc=new Scanner(System.in);
        System.out.print("Bir rakam giriniz: ");
        int sayi= sc.nextInt();

        // if ile cozum
        for (int i = 0; i <sayi ; i++) {

            for (int j = 0; j <sayi ; j++) {
                if(i==j) System.out.print("1  ");

                else  System.out.print("0  ");

            }
            System.out.println(" ");
        }
        System.out.println(); // iki yontem arasina bosluk icin atildi

        // ternary ile cozum
        for (int i = 0; i <sayi ; i++) {

            for (int j = 0; j <sayi ; j++) {

                System.out.print(i == j ? "1  " : "0  ");
            }
            System.out.println(" ");
        }



    }
}
