package src.j08_IfStatement_TernaryOperator.Task_Nestedİf;

import java.util.Scanner;

public class Q05 {

    public static void main(String[] args) {
		/*
		TASK :
		Kullanicidan  yasini ve kilosunu alaliniz
		18 yasindan kucuk ise kan bagisi yapamaz
		18 yasindann buyuk ve 50 kilo dan hafif ise kan bagisi yapamaz.
		18 yasindan buyuk ve 50 kilodan agir ise kan bagisi yapabilir.
		 */

        Scanner scan=new Scanner(System.in);
        System.out.print("yasinizi giriniz: ");
        int yas= scan.nextInt();

        if (yas>=18){
            System.out.print("kilonuzu kg olarak giriniz: ");
            double kg= scan.nextDouble();
            if (kg>=50){
                System.out.println("Kan bagisi yapabilirsiniz.");
            }else{
                System.out.println("Kilonuz 50 kg az oldugu icin kan veremezsiniz\n"+(50-kg)+" kg daha almaniz gerekli ");
            }
        }else{
            System.out.println("Yasiniz 18`den kucuk oldugu icin kan bagisi yapamazsiniz\n"+(18-yas)+" yil sonra kan verebilirsiniz.");
        }
    }

}
