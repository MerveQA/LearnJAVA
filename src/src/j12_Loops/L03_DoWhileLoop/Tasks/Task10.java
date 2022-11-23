package src.j12_Loops.L03_DoWhileLoop.Tasks;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        // task ->  Girilen bir sayıya kadar  tek olanlarını print eden code create ediniz.

        Scanner scan= new Scanner(System.in);
        System.out.print("Tam sayi giriniz: ");
        int sayi=scan.nextInt();

        int baslangic=1;

        while (baslangic<=sayi){
            System.out.print(baslangic+" ");
            baslangic+=2;
        }


    }
}
