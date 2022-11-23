package src.j09_SwitchStatement.tasks;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {

        // Girilen bir sayının onlar basamağının değerini yazı ile yazdırınız.

        Scanner sc = new Scanner(System.in);
        System.out.print("Sayi = ");
        int sayi = sc.nextInt();

        int onlarBasamagi=(sayi/10)%10;

        switch (onlarBasamagi){
            case 0 :
                System.out.println("Girilen sayinin onlar basamaği SIFIR");
                break;
            case 1 :
                System.out.println("Girilen sayinin onlar basamaği BIR");
                break;
            case 2 :
                System.out.println("Girilen sayinin onlar basamaği IKI");
                break;
            case 3 :
                System.out.println("Girilen sayinin onlar basamaği UC");
                break;
            case 4 :
                System.out.println("Girilen sayinin onlar basamaği DORT");
                break;
            case 5 :
                System.out.println("Girilen sayinin onlar basamaği BES");
                break;
            case 6 :
                System.out.println("Girilen sayinin onlar basamaği ALTI");
                break;
            case 7 :
                System.out.println("Girilen sayinin onlar basamaği YEDI");
                break;
            case 8 :
                System.out.println("Girilen sayinin onlar basamaği SEKIZ");
                break;
            case 9 :
                System.out.println("Girilen sayinin onlar basamaği DOKUZ");
        }








    }
}
