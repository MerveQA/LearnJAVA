package src.j09_SwitchStatement.tasks;

import java.util.Scanner;

public class Task05 {

    public static void main(String[] args) {
		/*
		TASK :
		Girilen not değerini aşağıdaki tabloya göre karşılığını print eden code create ediniz.
		1. 0(dahil) ile 50 arasi - D
		2. 50(dahil) ile 60 arası - C
		3. 60(dahil) ile 80 arası - B
		4. 80(dahil) ustu- A
		Yanlis not girilirse ekrana "Gecerli not giriniz" yazdirin
		
		AHAN DA  TRICK :) switch() de long kullanilmaz, float kullanilmaz, double kullanilmaz, boolean kullanilmaz.
		switch() de int, byte, short, char, String kullanilir.

		 */

        Scanner scan = new Scanner(System.in);

        System.out.print("Notunuzu giriniz : ");
        int not = scan.nextInt();

        int harfDegeri = 0;

        if (not>=0 && not<50){
            harfDegeri=1;
        } else if (not>=50 && not<60) {
            harfDegeri=2;
        }else if (not>=60 && not<80) {
            harfDegeri=3;
        }else if (not>=80 && not<101) {
            harfDegeri=4;
        }else {
            System.out.println("Gecerli not giriniz");
        }

        switch (harfDegeri){
            case 1:
                System.out.println("notunuz D");
                break;
            case 2:
                System.out.println("notunuz C");
                break;
            case 3:
                System.out.println(" notunuz B");
                break;
            case 4:
                System.out.println("notunuz A");
                break;
        }

    }


}
