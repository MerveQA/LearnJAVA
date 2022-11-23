package src.j12_Loops.L03_DoWhileLoop.Tasks;

import java.util.Scanner;

public class Task12 {

	public static void main(String[] args) {
		/*
		 task-> girilen bir metinde harf rakam ve özel karakter sayısını print eden code create ediniz.
				do-While loop
		 */

		Scanner sc = new Scanner(System.in);
		System.out.print("Bir metin girin: ");
		String metin = sc.nextLine().toLowerCase();

		int sayac=0;
		int sayacHarf=0;
		int sayacRakam=0;
		int sayacKrktr=0;

		while (sayac<=metin.length()-1){
			if (metin.charAt(sayac)>='a' &&metin.charAt(sayac)<='z'){ // harf kontrolu yapildi
				sayacHarf++;
			} else if (metin.charAt(sayac)>='0' &&metin.charAt(sayac)<='9') { // rakam kontrolu yapildi
				sayacRakam++;
			}else{  // harf ve rakam disinda kalan tum karakterlerin kontrolu
				sayacKrktr++;
			}

			sayac++; // while blogunun sonlanmasi icin sayac olusturuldu
		}

		System.out.println("harf sayisi: "+sayacHarf);
		System.out.println("rakam sayisi: "+sayacRakam);
		System.out.println("karakter sayisi: "+sayacKrktr);


	}

}
