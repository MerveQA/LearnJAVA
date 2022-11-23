package src.j12_Loops.L01_ForLoop;

import java.util.Scanner;

public class C02_ForLoop {
    public static void main(String[] args) {

        //TASK: Girilen sayidan 100 kadar 4un kati olan tam sayilari prin eden kod create ediniz

        Scanner sc=new Scanner(System.in);
        System.out.print("100`den kucuk bir pozitif tam sayi giriniz: ");
        int sayi = sc.nextInt();

        if (sayi>0 && sayi<100){

            for (int i = sayi; i <100 ; i++) { // 100 degeri for sartini saglamadigi icin calismaz.

                if (i%4==0){
                    System.out.print(i+" ");
                }
            }
        }else{
            System.out.println("Hatali sayi yazdiniz tekrar deneyin");
        }
    }
}
