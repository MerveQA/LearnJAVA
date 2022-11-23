package src.j12_Loops.L01_ForLoop.Tasks_DersteCozulenler;

import java.util.Scanner;

public class Task04 {
    public static void main(String[] args) {

        /*
        Girilen 2 sayi arasindaki cift sayilari print eden code create ediniz
         */

        Scanner sc=new Scanner(System.in);
        System.out.print("1. sayiyi giriniz: ");
        int sayi1 = sc.nextInt();
        System.out.print("2. sayiyi giriniz: ");
        int sayi2 = sc.nextInt();

        if (sayi1<sayi2){
            for (int i = sayi1; i <sayi2 ; i++) {
                if (i%2==0){
                    System.out.print(i+ " ");
                }
            }
        }else{
            for (int i = sayi2; i <sayi1 ; i++) {
                if (i%2==0){
                    System.out.print(i+ " ");
                }
            }
        }



    }
}
