package src.j12_Loops.L03_DoWhileLoop;

import java.util.Scanner;

public class C02_DoWhileLoop {
    public static void main(String[] args) {

        //TASK: girilen sayi 17 den kucuk ise kazandiniz buyuk ise kaybettiniz do ehile ile print eden code create ediniz.

        Scanner sc= new Scanner(System.in);
        System.out.print("Bir sayi girin: ");

        int sayi = 0;

        do {
            System.out.println("AGAM nassıng :) bir tamsayı giriyorsun : ");

            sayi= sc.nextInt();

            sayi++;
        }while (sayi>=17);
        System.out.println(sayi+" için kazandınız... :) ");

    }
}
