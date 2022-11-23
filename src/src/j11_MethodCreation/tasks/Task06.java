package src.j11_MethodCreation.tasks;

import java.util.Scanner;

public class Task06 {

	public static void main(String[] args) {
		/*
		 Kullanıcıya paralelkenar, dikdörtgen ve üçgen kelimelerinden birini 
		 ve iki sayı seçmesini söyleyin. 
         Hangi şekli seçerse, o şeklin alanını ve çevresini ekrana yazdıran programı yazınız.
		 */
		Scanner sc= new Scanner(System.in);
		System.out.print("paralelkenar icin -> 1\ndikdortgen icin-> 2\nucgen icin-> 3 \nsayilarindan birini girin: ");
		int secim = sc.nextInt();

		switch (secim){
			case 1:
				System.out.print("Paralel kenarin bir kenar uzunlugunu girin: ");
				int a= sc.nextInt();
				System.out.print("Paralel kenarin taban uzunlugunu girin : ");
				int b= sc.nextInt();
				System.out.print("Paralel kenarin yuksekligini girin: ");
				int h= sc.nextInt();
				paralelkenarAlanVeCevreHesaplama(a,b,h);
				break;
			case 2:
				System.out.print("Dikdörtgenin kisa kenarinin uzunlugunu girin: ");
				int kisa= sc.nextInt();
				System.out.print("Dikdörtgenin uzun kenarinin uzunlugunu girin: ");
				int uzun= sc.nextInt();
				dikdortgenAlanVeCevreHesaplama(kisa, uzun);
				break;
			case 3:
				System.out.print("Ucgenin birinci kenar uzunlugunu girin: ");
				int sayi1= sc.nextInt();
				System.out.print("Ucgenin ikinci kenar uzunlugunu girin: ");
				int sayi2= sc.nextInt();
				System.out.print("Ucgenin taban uzunlugunu girin: ");
				int sayi3= sc.nextInt();
				System.out.print("Ucgenin yuksekligini girin: ");
				int yukseklik= sc.nextInt();
				ucgenAlanVeCevreHesaplama(sayi1, sayi2, sayi3, yukseklik);
				break;
			default:
				System.out.println("Hatali giris !!!\nTekrar deneyin... ");
		}

	}

	private static void ucgenAlanVeCevreHesaplama(int a, int b, int c, int h) {
		int cevre = a + b + c;
		double alan= (double) (c*h/2);

		System.out.println("Ucgenin cevresi= "+cevre+", Alani= "+alan);
	}

	private static void dikdortgenAlanVeCevreHesaplama(int kisa, int uzun) {
		int cevre= 2*(kisa+uzun);
		int alan= kisa*uzun;
		System.out.println("Dikdortgenin cevresi= "+cevre+", Alani= "+alan);
	}

	private static void paralelkenarAlanVeCevreHesaplama(int a, int b, int h) {

		int cevre= 2*(a+b);
		double alan= (double) (b*h/2);
		System.out.println("Paralelkenarin cevresi= "+cevre+", Alani= "+alan);
	}


}
