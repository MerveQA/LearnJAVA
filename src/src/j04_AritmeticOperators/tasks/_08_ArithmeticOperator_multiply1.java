package src.j04_AritmeticOperators.tasks;

import java.util.Scanner;

public class _08_ArithmeticOperator_multiply1 {

    public static void main(String[] args) {

        /*
        Verilen 3 double hakkında, (num1 , num2, num3),
        Bu üç double'ı birbiriyle çarpın ve cevabı  sonuca eşitleyin.
        Sonucu yazdırın.
         */

        double num1= 15.956, num2= 9.78, num3= 85.365;

        double sonuc= num1*num2*num3;
        int sonuc1= (int) (num1*num2*num3);

        System.out.println("double olarak sonuc: "+sonuc); // 13321.1809332
        System.out.println("int olarak sonuc: "+sonuc1); // 13321



    }
}
