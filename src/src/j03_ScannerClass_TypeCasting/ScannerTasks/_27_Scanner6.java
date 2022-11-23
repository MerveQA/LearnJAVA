package src.j03_ScannerClass_TypeCasting.ScannerTasks;

import java.util.Scanner;

public class _27_Scanner6 {

    public static void main(String[] args) {

        /* kullanıcının Doğum gününü print eden code create ediniz */

        Scanner scan= new Scanner(System.in);
        System.out.print("Lutfen dogum gununuzu gun ay yil olarak giriniz: ");
        String dogumGunu= scan.nextLine();
        System.out.println("Dogum gununuz: "+dogumGunu);


    }
}
