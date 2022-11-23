package src.j03_ScannerClass_TypeCasting.ScannerTasks;

import java.util.Scanner;

public class _30_Scanner8 {

    public static void main(String[] args) {

        /*
        Bir byte oluşturunuz.
        Konsola kg cinsinden bir ağırlık yazınız.
        Byte'ı yazdırınız.
        */

        Scanner scan= new Scanner(System.in);
        byte kilo;
        System.out.print("Lutfen kg cinsinden kilonuzu giriniz: ");
        kilo= scan.nextByte();

        System.out.println("Boyunuz: "+kilo);



    }
}
