package src.j04_AritmeticOperators.tasks;

import java.util.Scanner;

public class _03_ArithmeticOperator_subtract1 {

    public static void main(String[] args) {

        /*    kullanıcıdan alınan iki tane int  (num1 , num2),
         farkını print eden code create ediniz. */

        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen aralarda enter`a basarak 2 tane sayi giriniz.");
        int nm1= scan.nextInt();
        int nm2= scan.nextInt();

        System.out.println("nm1: "+nm1+" ve nm2: "+nm2+"`nin Farki= "+ (nm1-nm2));


    }
}
