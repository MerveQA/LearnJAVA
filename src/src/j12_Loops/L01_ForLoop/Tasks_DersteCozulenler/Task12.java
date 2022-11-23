package src.j12_Loops.L01_ForLoop.Tasks_DersteCozulenler;

import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {


        /*
        TASK: girilen 5 sayinin 10 ile 20 arasi haric
              digerlerinin toplamini hesap eden kod yaziniz
         */
        Scanner sc=new Scanner(System.in);

        int toplam=0;

        for (int i = 1; i <=5 ; i++) {
            System.out.print(i+ ". sayiyi giriniz: ");
            int sayi= sc.nextInt();

            if (sayi<10 || 20<sayi){
                toplam+=sayi;
            }
        }
        System.out.println("Toplam: "+toplam);




    }
}
