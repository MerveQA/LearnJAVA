package src.j11_MethodCreation.tasks;

import java.util.Scanner;

public class Task03 {

	public static void main(String[] args) {
		// Saati saniyeye, mil'i kilometreye, kilogrami gram'a 
		// ceviren bir method yaziniz.

		// 1 mil= 1.609344 km

		Scanner sc= new Scanner(System.in);
		System.out.print("Once tam saati girin enter`a basip dakikayi girin: ");
		int saat= sc.nextInt();
		int dakika= sc.nextInt();
		System.out.print("Mil biriminde uzunluk girin: ");
		double mil= sc.nextDouble();
		System.out.print("Kilogram cinsinde agirlik girin: ");
		double kg= sc.nextDouble();
		
		saatiSaniyeyeCevirme(saat, dakika);
		miliKilometreyeCevirme(mil);
		kilogramiGramaCevirme(kg);

	}

	private static void kilogramiGramaCevirme(double kg) {
		double gram= kg*1000;
		System.out.println(kg+" kilogram = "+gram+" gramdir");
	}

	private static void miliKilometreyeCevirme(double mil) {
		double km= mil*1.609344;
		System.out.println(mil+" mil = "+km+" kilometredir");
	}

	private static void saatiSaniyeyeCevirme(int saat, int dakika) {

		int saniye= (saat*3600)+(dakika*60);
		System.out.println(saat+" saat "+dakika+" dakika = "+saniye+" saniyedir");
	}


}
