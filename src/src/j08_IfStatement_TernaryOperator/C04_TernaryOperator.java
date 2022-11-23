package src.j08_IfStatement_TernaryOperator;

import java.util.Scanner;

public class C04_TernaryOperator {
    public static void main(String[] args) {

        // TASK-> girilen bir tamsayının 2 veya daha fazla basamkalı olmasını kontrol eden code create ediniz.

        Scanner scan=new Scanner(System.in);
        System.out.print("Sayi giriniz: ");
        int sayi= scan.nextInt();

        String sonuc= (sayi>9 || sayi<-9)? "2 veya daha fazla basamkalı" :"2 veya daha fazla basamkalı degil";

        System.out.println(sonuc);

    }
}
