package src.j03_ScannerClass_TypeCasting.ScannerTasks;

import java.util.Scanner;

public class Task05 {

	public static void main(String[] args) {
		
		// kullanicidan 2 tam sayi alip bu 2 tamsayinin  dort islem sonucunu yazdiriniz.

		Scanner scan= new Scanner(System.in);
		System.out.print("Lutfen tamsayi giriniz: ");
		int sayi1= scan.nextInt();
		System.out.print("Lutfen 2. tamsayiyi giriniz: ");
		int sayi2= scan.nextInt();

		System.out.println("Toplama: "+(sayi1+sayi2));
		System.out.println("Cikarma: "+(sayi1-sayi2));
		System.out.println("Carpma: "+(sayi1*sayi2));
		System.out.println("Bolme: "+(sayi1/sayi2));


	}

}
