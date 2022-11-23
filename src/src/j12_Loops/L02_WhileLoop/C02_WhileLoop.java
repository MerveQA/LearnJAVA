package src.j12_Loops.L02_WhileLoop;

import java.util.Scanner;

public class C02_WhileLoop {
    public static void main(String[] args) {

        //TASK: girilen tam sayinin rakamlari toplamini print eden method create ediniz.
        Scanner sc= new Scanner(System.in);
        System.out.print("tam sayi girin: ");
        int sayi= sc.nextInt();

        rakamlariToplami(sayi);

    }

    private static void rakamlariToplami(int sayi) {

        int toplam=0;

        while (sayi>0){

            toplam+= sayi%10; // her seferinde sayinin birler basamagi toplama ekleniyor
            sayi/=10; // her seferinde sayinin birler basamagi eksiltildi

        }
        System.out.println(toplam);

    }
}
