package src.j12_Loops.L03_DoWhileLoop.Tasks;

import java.util.Scanner;

public class Task05 {

	public static void main(String[] args) {

		/*
		task-> girilen isim ve soyismi için ilk isminin ilk harfinden soy isminin son harfine kadar olan butun harfleri
		 	   ayni satirda aralarina bosluk birakarak print eden code create ediniz.
		 */

		Scanner sc = new Scanner(System.in);
		System.out.print("Adinizi girin: ");
		String ad = sc.nextLine();

		System.out.print("Soyadinizi girin: ");
		String soyad = sc.nextLine();

		String adSoyad = ad.concat(soyad).replaceAll("\\s","");

		int sayac=0;

		while (sayac<=adSoyad.length()-1){
			System.out.print(adSoyad.charAt(sayac)+" ");
			sayac++;
		}




	}

}
