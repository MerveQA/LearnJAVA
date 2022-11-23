package src.j03_ScannerClass_TypeCasting.ScannerTasks;

import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
        /*
          TASK-> Kullaniciya gunde kac saat uyudugunu sorun,
                 ayda yilda ve 40 yilda kac gununun uykuda gectigini yazdirin

          Ornek : Input : 8
                  Output : Ayda 10, yilda 121, 40 yilda 4866 gununuz uykuda geciyor
         */

        Scanner scan= new Scanner(System.in);
        System.out.print("Gunde kac saat uyuyorsunuz: ");
        double saat= scan.nextInt();

        double ayda= 30*saat/24;
        double yilda= saat*365/24;

        System.out.println("Ayda: "+ayda+" gun, yilda: "+yilda+" gun, 40 yilda: "+yilda*40+" gun uykuda geciyor.");



    }
}
