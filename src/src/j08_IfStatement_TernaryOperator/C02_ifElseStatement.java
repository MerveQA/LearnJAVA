package src.j08_IfStatement_TernaryOperator;

import java.util.Scanner;

public class C02_ifElseStatement {
    public static void main(String[] args) {
        /*
        TASK: girilen yasin 18 den buyuklugunu kontrol eden code create ediniz.
         */

        Scanner scan=new Scanner(System.in);
        System.out.print("Yasinizi giriniz: ");
        int yas= scan.nextInt();

        //if (18<yas){
        //    System.out.println("Girilen yas 18`den buyuktur");
        //}

        /*
        TASK: girilen yasin 18 den buyuklugunu kontrol eden code create ediniz.
        18 den kucuk ise ehliyet alamazsinniz prin ediniz
         */
        if (18<=yas){ // girilen yasin 18den buyuk ve esit olmasini kontrol eder.
            System.out.println("Girilen yas 18`den buyuktur");
        }else System.out.println("Ehliyet alamazsiniz."); // if kosulu false cikarsa calisir.





    }
}
