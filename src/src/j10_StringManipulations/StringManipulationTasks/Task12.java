package src.j10_StringManipulations.StringManipulationTasks;

import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
       /*  TASK :
        Kullanıcıdan alacağınız, 3 kelimelik  ismi
         Örn. Ali Mert Yılmaz -> A.M.Y.  şeklinde print eden code create ediniz.
        */

        Scanner scan= new Scanner(System.in);
        System.out.print("3 kelimelik isim girin: ");
        String isim= scan.nextLine();

        char birinciKelimeIlkH= isim.charAt(0);
        char ikinciKelimeIlkH= isim.charAt(isim.indexOf(" ")+1);
        char ucuncuKelimeIlkH= isim.charAt(isim.lastIndexOf(" ")+1);

        System.out.println(isim+" -> "+birinciKelimeIlkH+"."+ikinciKelimeIlkH+"."+ucuncuKelimeIlkH+".");
        // Ali Mert Yılmaz -> A.M.Y.

    }
}
