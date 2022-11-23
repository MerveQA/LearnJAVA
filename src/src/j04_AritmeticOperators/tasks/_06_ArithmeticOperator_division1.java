package src.j04_AritmeticOperators.tasks;

import java.util.Scanner;

public class _06_ArithmeticOperator_division1 {

    public static void main(String[] args) {

        /* kullanıcıdan alınan iki tane int (num1 , num2), bölümünü print eden code create ediniz. */

        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen aralarda enter`a basarak 2 tane sayi giriniz.");
        int a= scan.nextInt();
        int b= scan.nextInt();

        System.out.println("Iki sayinin bolumu= "+ (a/b));


    }
}
