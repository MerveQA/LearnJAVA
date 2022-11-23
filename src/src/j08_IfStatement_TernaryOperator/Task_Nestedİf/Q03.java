package src.j08_IfStatement_TernaryOperator.Task_Nestedİf;

import java.util.Scanner;

public class Q03 {

	public static void main(String[] args) {
		/* TASK :
		 *  Kullanicinin boyunu  m  ve kilosunu kg alarak  BMI (VKE) hesaplayiniz

	    INFO :
		BMI = kilo(kg) /(boy*boy)(m)
		BMI <=20 oldukca zayifsiniz
		20<BMI<=25 Normal sinirlardasiniz 
		25<BMI<=30 Sisman kategorisindesiniz
		30<BMI ==> Obez grubundasiniz.
		*/

        Scanner scan=new Scanner(System.in);
        System.out.print("boyunuzu metre olarak giriniz: ");
        double boy= scan.nextDouble();
        System.out.print("kilonuzu kg olarak giriniz: ");
        double kilo= scan.nextDouble();
        
        double bmi= kilo/(boy*boy);
        System.out.println("bmi = " + bmi);

        if (bmi<=20){
            System.out.println("Oldukca zayifsiniz");
        } else if (20<bmi && bmi<=25) {
            System.out.println("Normal sinirlardasiniz");
        }else if (25<bmi && bmi<=30) {
            System.out.println("Sisman kategorisindesiniz");
        }else {
            System.out.println("Obez grubundasiniz.");
        }


    }

}
