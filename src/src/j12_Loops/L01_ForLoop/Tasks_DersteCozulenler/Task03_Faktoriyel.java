package src.j12_Loops.L01_ForLoop.Tasks_DersteCozulenler;

import java.util.Scanner;

public class Task03_Faktoriyel {
    public static void main(String[] args) {

        //TASK: Girilen sayinin faktoriyelini hesaplayan method create ediniz

        Scanner sc=new Scanner(System.in);
        System.out.print("pozitif tam sayi giriniz: ");
        int sayi = sc.nextInt();

        System.out.println(faktoriyelHesapla(sayi));

    }

    private static int faktoriyelHesapla(int sayi) {

        int faktoriyel = 1;
        for (int i = sayi; i > 0; i--) {
            faktoriyel *= i;
        }
        return faktoriyel;
    }
}
