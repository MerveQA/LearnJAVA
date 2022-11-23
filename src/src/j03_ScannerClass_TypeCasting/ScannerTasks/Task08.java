package src.j03_ScannerClass_TypeCasting.ScannerTasks;

import java.util.Scanner;

public class Task08 {

    public static void main(String[] args) {

        /*
          Kullanicidan alacaginiz vize1 vize2 ve final notlarini
          vize ortalamasinin %30'u final notunun %70 alarak gecme notunu hesaplayiniz
         */

        Scanner scan= new Scanner(System.in);
        System.out.print("Lutfen 1. vize notunuzu giriniz: ");
        int birinciVize= scan.nextInt();
        System.out.print("Lutfen 2. vize notunuzu giriniz: ");
        int ikinciVize= scan.nextInt();
        System.out.print("Lutfen final notunuzu giriniz: ");
        int finalNotu= scan.nextInt();

        int vizeOrt= (birinciVize+ikinciVize)/2;
        System.out.println("Gecme notunuz: "+(vizeOrt*0.3+finalNotu*0.7));


    }
}
