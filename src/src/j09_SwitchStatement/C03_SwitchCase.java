package src.j09_SwitchStatement;

import java.util.Scanner;

public class C03_SwitchCase {
    public static void main(String[] args) {

        // Girilen ay numarasina gore kac gun cektigini prin eden kod crete ediniz

        Scanner scan=new Scanner(System.in);
        System.out.print("Ay numarasi : ");
        int ay= scan.nextInt();


        switch (ay) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("Girilen ay 31 gun cekiyor");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("Girilen ay 30 gun cekiyor");
                break;
            case 2:
                System.out.print("Yilinizi giriniz: ");
                int yil = scan.nextInt();
                if (yil%4==0){
                    System.out.println("Girilen ay 29 gun cekiyor");
                }else{
                    System.out.println("Girilen ay 28 gun cekiyor");
                }
                break;
            default:
                System.out.println("1 ile 12 arasinda bir sayi girin");
        }
    }
}
