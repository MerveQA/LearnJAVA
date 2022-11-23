package src.j12_Loops.L03_DoWhileLoop.Tasks;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {

        /*
        task -> 0 (sıfır) girilene kadar girilen tum sayıların adedini ve
                toplamını print eden code create edinz.
        */

        Scanner scan= new Scanner(System.in);
        System.out.print("Tam sayi giriniz: ");
        int sayi=scan.nextInt();

        int sayac=0;
        int toplam=0;

        while (sayi!=0){
            System.out.print("Tekrar sayi giriniz: ");
            sayi=scan.nextInt();
            toplam+=sayi;
            sayac++;
        }

        System.out.println("Sifir girilene kadar, "+sayac+" adet sayi girdiniz.\nGirilen sayilarin toplami: "+toplam);






    }
}
