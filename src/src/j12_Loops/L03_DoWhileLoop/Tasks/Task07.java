package src.j12_Loops.L03_DoWhileLoop.Tasks;

import java.util.Scanner;

public class Task07 {
    public static void main(String[] args) {
        // task-> girilen  5 sayının  en büyüğünü print den code create eediniz

        Scanner oku = new Scanner(System.in);
        System.out.print("Sayi girin: ");
        int sayi=oku.nextInt();

        int sayac=1;

        while (sayac<5){

            System.out.print("Tekrar Sayi girin: ");
            int sayi1=oku.nextInt();

            if (sayi1>sayi){
                sayi=sayi1;
            }
            sayac++;

        }
        System.out.println("Girilen en buyuk sayi: "+sayi);
    }
}
