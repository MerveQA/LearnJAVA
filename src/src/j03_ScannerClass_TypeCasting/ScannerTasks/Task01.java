package src.j03_ScannerClass_TypeCasting.ScannerTasks;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {

        /*
        TASK-> Ask user to enter mid-term grade, final grade, and project grade Calculate the general grade
		       (mid-term : 30% , project : 20%, final : 50%)

		Example: INPUT: mid-term grade (ara sınav notu) =78
		      		    final grade (final grade) =66
		      		    project grade (proje notu) =90
		         OUTPUT: "Your grade is : 81,6"
		 */

        Scanner scan= new Scanner(System.in);
        System.out.print("Lutfen ara sinav notunuzu giriniz: ");
        int araSinavNotu= scan.nextInt();
        System.out.print("Lutfen final notunuzu giriniz: ");
        int finalNotu= scan.nextInt();
        System.out.print("Lutfen proje notunuzu giriniz: ");
        int projeNotu= scan.nextInt();

        System.out.println("Genel notunuz: "+ (araSinavNotu*0.3+finalNotu*0.5+projeNotu*0.2));



    }
}
