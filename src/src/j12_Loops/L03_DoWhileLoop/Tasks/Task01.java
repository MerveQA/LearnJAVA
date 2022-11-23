package src.j12_Loops.L03_DoWhileLoop.Tasks;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        /*
        Task-> girilen sayıların toplamı 333 gectiğinde girilen sayı adedini ve
               toplamını print eden code create ediniz.
         */

        Scanner scan= new Scanner(System.in);
        int sayi;
        int sayilarToplami=0;
        int sayiAdedi=0;

        /*
         do{
            System.out.print("Sayi giriniz: ");
            sayi=scan.nextInt();

            sayilarToplami+=sayi;
            sayiAdedi++;


        }while (sayilarToplami<333); */

        while(sayilarToplami<333){
            System.out.print("Sayi giriniz: ");
            sayi=scan.nextInt();

            sayilarToplami+=sayi;
            sayiAdedi++;

        }



        System.out.println("Girilen: "+sayiAdedi+" adet sayinin Toplami: "+sayilarToplami);


    }
}
