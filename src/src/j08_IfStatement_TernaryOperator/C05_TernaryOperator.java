package src.j08_IfStatement_TernaryOperator;

import java.util.Scanner;

public class C05_TernaryOperator {
    public static void main(String[] args) {

        // TASK-> girilen bir tamsayı çiftse yarısını değilse
        // "girilen sayı tek oldugu için yarısı tamsayı değildir" print eden code create ediniz

        Scanner scan=new Scanner(System.in);
        System.out.print("Sayi giriniz: ");
        int sayi= scan.nextInt();

       //String sonuc= sayi%2==0 ? (sayi/2) : "girilen sayı tek oldugu için yarısı tamsayı değildir";

        /*
        Ternary ikidurum(T/F) icin farkli data type ciktisi veriyorsa variable atama yapmadan sout yapilmali
        yada ternary ciktisi ayni data serializable edilmeli
         */

        System.out.println(sayi%2==0 ? (sayi/2) : "girilen sayı tek oldugu için yarısı tamsayı değildir");
    }
}
