package src.j09_SwitchStatement.tasks;

import java.util.Scanner;

public class Task07 {
    public static void main(String[] args) {

        // 2- Girilen 3 basamaklı sayıyı kelime olarak print eden code create ediniz..

        Scanner scan = new Scanner(System.in);
        System.out.print("uc basamakli sayi giriniz :");
        int sayi = scan.nextInt();

        int birler= sayi%10;
        int onlar= (sayi/10)%10;
        int yuzler= (sayi/100)%10;

        switch (yuzler){
            case 0 :
                break;
            case 1 :
                System.out.println("Yuz");
                break;
            case 2 :
                System.out.println("Ikiyuz");
                break;
            case 3 :
                System.out.println("Ucyuz");
                break;
            case 4 :
                System.out.println("Dortyuz");
                break;
            case 5 :
                System.out.println("Besyuz");
                break;
            case 6 :
                System.out.println("Altiyuz");
                break;
            case 7 :
                System.out.println("Yediyuz");
                break;
            case 8 :
                System.out.println("Sekizyuz");
                break;
            case 9 :
                System.out.println("Dokuzyuz");
                break;
        }
        switch (onlar){
            case 0 :
                break;
            case 1 :
                System.out.println("On");
                break;
            case 2 :
                System.out.println("Yirmi");
                break;
            case 3 :
                System.out.println("Otuz");
                break;
            case 4 :
                System.out.println("Kirk");
                break;
            case 5 :
                System.out.println("Elli");
                break;
            case 6 :
                System.out.println("Altmis");
                break;
            case 7 :
                System.out.println("Yetmis");
                break;
            case 8 :
                System.out.println("Seksen");
                break;
            case 9 :
                System.out.println("Doksan");
                break;
        }
        switch (birler){
            case 0 :
                break;
            case 1 :
                System.out.println("Bir");
                break;
            case 2 :
                System.out.println("Iki");
                break;
            case 3 :
                System.out.println("Uc");
                break;
            case 4 :
                System.out.println("Dort");
                break;
            case 5 :
                System.out.println("Bes");
                break;
            case 6 :
                System.out.println("Alti");
                break;
            case 7 :
                System.out.println("Yedi");
                break;
            case 8 :
                System.out.println("Sekiz");
                break;
            case 9 :
                System.out.println("Dokuz");
                break;
            }



    }
}
