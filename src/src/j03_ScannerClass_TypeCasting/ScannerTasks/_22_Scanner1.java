package src.j03_ScannerClass_TypeCasting.ScannerTasks;

import java.util.Scanner;

public class _22_Scanner1 {

    public static void main(String[] args) {

       /* kullanıcının ismini print eden code create ediniz */

        Scanner scan= new Scanner(System.in);
        System.out.print("Lutfen isminizi giriniz: ");
        String isim= scan.nextLine();
        System.out.println("Isminiz: "+isim);




    }
}
