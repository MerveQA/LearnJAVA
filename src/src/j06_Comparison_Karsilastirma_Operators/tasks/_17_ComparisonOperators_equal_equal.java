package src.j06_Comparison_Karsilastirma_Operators.tasks;

import java.util.Scanner;

public class _17_ComparisonOperators_equal_equal {

    public static void main(String[] args) {

        /*
        Verilen iki tane int (num1, num2) ile ilgili,
        Eger num1  num2 ya  eşitse console'da true yazsın.
        Değilse false
        */

        Scanner scan= new Scanner(System.in);
        System.out.print("lutfen 1. sayiyi giriniz: ");
        int intNum1= scan.nextInt();
        System.out.print("lutfen 2. sayiyi giriniz: ");
        int intNum2= scan.nextInt();

        System.out.println("num1 num2`ye esit mi? -> "+(intNum1==intNum2));

        // intNum1= 10, intNum2= 10 girilirse => // intNum1 intNum2`ye esit mi? -> true
        // intNum1= 10, intNum2= 35 girilirse => // intNum1 intNum2`ye esit mi? -> false


    }
}
