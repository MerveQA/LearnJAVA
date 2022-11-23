package src.j11_MethodCreation.tasks;

import java.util.Scanner;

public class Task06_HocaninCozumu {
	static Scanner sc= new Scanner(System.in);

	public static void main(String[] args) {
		/*
		 Kullanıcıya kare, dikdörtgen ve üçgen kelimelerinden birini
		 ve iki sayı seçmesini söyleyin. 
         Hangi şekli seçerse, o şeklin alanını ve çevresini ekrana yazdıran programı yazınız.
		 */

		System.out.print("kare icin -> 1\ndikdortgen icin-> 2\nucgen icin-> 3 \nsayilarindan birini girin: ");
		int karar = sc.nextInt();

		secim(karar);
	}

	public static void secim(int karar){
		switch (karar){
			case 1:
				kareAlan();
				kareCevre();
				break;
			case 2:
				dikdortgenCevre();
				dikdortgenAlan();
				break;
			case 3:
				ucgeninAlani();
				ucgeninCevresi();
				break;
			default:
				System.out.println("Hatali secim yaptiniz.");
				secim(karar);
		}

	}

	private static void ucgeninCevresi() {
		System.out.print("1. kenari giriniz: ");
		int a=sc.nextInt();
		System.out.print("2. kenari giriniz: ");
		int b=sc.nextInt();
		System.out.print("3. kenari giriniz: ");
		int c=sc.nextInt();

		System.out.println("Ucgen Cevresi: "+(a+b+c));
	}

	private static void ucgeninAlani() {
		System.out.print("Taban uzunlugunu giriniz: ");
		int taban=sc.nextInt();
		System.out.print("Yukseklik giriniz: ");
		int yukseklik=sc.nextInt();

		System.out.println("Ucgenin Alani: "+(taban*yukseklik)/2);

	}

	private static void dikdortgenAlan() {
		System.out.print("Kisa kenari giriniz: ");
		int x=sc.nextInt();
		System.out.print("Uzun kenari giriniz: ");
		int y=sc.nextInt();

		System.out.println("Dikdortgen Alani: "+(x*y));
	}

	private static void dikdortgenCevre() {
		System.out.print("Kisa kenari giriniz: ");
		int x=sc.nextInt();
		System.out.print("Uzun kenari giriniz: ");
		int y=sc.nextInt();

		System.out.println("Dikdortgen Cevresi: "+(x+y)*2);
	}

	private static void kareCevre() {
		System.out.print("Karenin bir kenarini giriniz: ");
		int a=sc.nextInt();

		System.out.println("Karenin Cevresi: "+a*4);
	}

	private static void kareAlan() {
		System.out.print("Karenin bir kenarini giriniz: ");
		int a=sc.nextInt();

		System.out.println("Karenin Alani: "+(a*a));
	}


}
