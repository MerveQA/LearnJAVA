package src.j04_AritmeticOperators.tasks;

import java.util.Scanner;

public class Task03 {
	
	public static void main(String[] args) {
		
		// Soru 10:Kullanicinin girdigi 3 basamakli sayinin ilk ve son rakamlarinin toplamini veren programi yaziniz

		Scanner scan= new Scanner(System.in);
		System.out.print("Lutfen 3 basamakli bir sayi giriniz: ");
		int sayi= scan.nextInt();

		System.out.println("Kullanicinin girdigi sayi: "+sayi);

		int sayininBirlerBasamagi= sayi%10;
		int sayininYuzlerBasamagi=sayi/100;

		System.out.println("Kullanicinin girdigi sayinin yuzler basamagi= "+sayininYuzlerBasamagi +
				           "\nKullanicinin girdigi sayinin birler basamagi= "+sayininBirlerBasamagi +
					       "\nRakamlari Toplami= "+(sayininYuzlerBasamagi+sayininBirlerBasamagi));


		

		
	}

}
