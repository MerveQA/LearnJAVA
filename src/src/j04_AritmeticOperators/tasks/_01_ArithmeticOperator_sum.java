package src.j04_AritmeticOperators.tasks;

import java.util.Scanner;

public class _01_ArithmeticOperator_sum {
    public static void main(String[] args) {

        /*
        kullanıcıdan alınan iki tane int  (num1 , num2),
        toplamını print eden code create ediniz.
        */

        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen aralarda enter`a basarak 2 tane sayi giriniz.");
        int num1= scan.nextInt();
        int num2= scan.nextInt();

        System.out.println("num1: "+num1+" ve num2: "+num2+"`nin Toplami= "+ (num1+num2));


    }
}
