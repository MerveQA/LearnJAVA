package src.j08_IfStatement_TernaryOperator;

import java.util.Scanner;

public class C07_NestedTernaryOperator {
    public static void main(String[] args) {

        /*
        TASK :
         Girilen bir pozitif tamsayı 4 basamaklı ise  "4 Basamaklı" print eden
         4 basamaklı degilse çift olup olmadigini kontrol edip. Çift ise "4 basamaklı olmayan çift sayı" yazdırın.
         Çift sayı degilse "4 basamaklı olmayan tek sayı yazdırın."
         */

        Scanner scan=new Scanner(System.in);
        System.out.print("Sayi giriniz: ");
        int sayi= scan.nextInt();

        String sonuc= (sayi>999 && 10000>sayi) ? "4 Basamaklı": (sayi%2==0 ? "4 basamaklı olmayan çift sayı" : "4 basamaklı olmayan tek sayı");

        System.out.println(sonuc);

    }
}
