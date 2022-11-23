package src.j04_AritmeticOperators.tasks;

import java.util.Scanner;

public class _02_ArithmeticOperator_sum2 {

    public static void main(String[] args) {

        /*
        kullanıcıdan alınan 4 tane int toplamını print eden code create ediniz. */

        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen aralarda enter`a basarak 4 tane sayi giriniz.");
        int sayi1= scan.nextInt();
        int sayi2= scan.nextInt();
        int sayi3= scan.nextInt();
        int sayi4= scan.nextInt();

        System.out.println("Sayilarin Toplami= "+ (sayi1+ sayi2+ sayi3+ sayi4));



    }
}
