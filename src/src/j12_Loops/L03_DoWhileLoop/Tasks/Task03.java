package src.j12_Loops.L03_DoWhileLoop.Tasks;

import java.util.Scanner;

public class Task03 {

	public static void main(String[] args) {
		/*
        task-> girilen  tamsayı için carpim tablosunu print eden code create ediniz.

		 Ornek input = 13
		 13x1=13 13x2=26  . . .. .  . 13x10=130
		 */
		Scanner scan= new Scanner(System.in);
		System.out.print("Tam sayi giriniz: ");
		int sayi=scan.nextInt();
		int carpan= 1;

		do {

			System.out.println(carpan+" x "+sayi+" = "+(carpan*sayi));

			carpan++;

		}while (carpan<=10);

	}

}