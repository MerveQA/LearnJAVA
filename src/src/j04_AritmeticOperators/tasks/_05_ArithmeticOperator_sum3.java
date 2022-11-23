package src.j04_AritmeticOperators.tasks;

import java.util.Scanner;

public class _05_ArithmeticOperator_sum3 {

    public static void main(String[] args) {

        /* kullanıcıdan alınan 3 tane int toplamını print eden code create ediniz. */

        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen aralarda enter`a basarak 3 tane sayi giriniz.");
        int s1= scan.nextInt();
        int s2= scan.nextInt();
        int s3= scan.nextInt();


        System.out.println("Sayilarin Toplami= "+ (s1+ s2+ s3));



    }
}
