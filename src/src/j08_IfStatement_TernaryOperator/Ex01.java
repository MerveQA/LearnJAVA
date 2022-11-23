package src.j08_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        /*
        Task01: girilen bir sayının negatif ve pozitifliğini kontrol eden code create ediniz..
         */

        Scanner scan=new Scanner(System.in);
        System.out.print("Sayi giriniz: ");
        int sayi= scan.nextInt();

        if (sayi>0){ // sayinin 0`dan buyuk olmasi kontrol ediliyor
            System.out.println("Sayi pozitif");
        } else if (sayi<0) { // sayinin 0`dan buyuk olmamasi halinde sifirdan kucuk olmasi kontrol ediliyor
            System.out.println("Sayi negatif");
        }else { // sayinin negatif veya pozitif olmamasi durumu sarta baglandi.
            System.out.println("Sayi sifir");
        }


    }
}
