package src.HalukHocaProjeCozum.P02_kitapYonetimi;

import java.util.Scanner;

public class Kitapcı_Main {

	public static void main(String[] args) {


		menu();
		boolean flag = true;
		do {
			Scanner scan = new Scanner(System.in);
			System.out.println("Lütfen İşlem Seçiniz: çıkmak için '0' basın:");
			int islem = Integer.parseInt(scan.nextLine()); // DUMMY YERİNE BUNU KULLANDIM NEXTINT TEN KAÇMAK İÇİN.
			switch (islem) {
			case 1:
				Kitapcı_KitapEkle.kitapEkle();
				break;
			case 2:
				Kitapcı_KitapEkle.kitapNoIleKitap();
				break;
			case 3:
				Kitapcı_KitapEkle.bilgiIleKitap();
				break;
			case 4:
				Kitapcı_KitapEkle.numaraIleKitapSil();
				break;
			case 5:
				Kitapcı_KitapEkle.tumKitaplariListele();
				break;
			case 6:
				System.out.println("Yine Bekleriz GÜLE GÜLE....");
				flag = false;
				break;
			default:
				System.out.println("Lütfen geçerli bir işlem numarası girin.");
				break;
			}

		} while (flag == true);

	}

	private static void menu() {

		System.out.println("//////////////// KİTAPCI PRIGRAMI //////////////////");
		System.out.println(
				" 	1-kitap ekle\n" + 
				"	2-numara ile kitap goruntule\n" + 
				"	3-bilgi ile kitap goruntule\n"+ 
				"	4-numara ile kitap sil\n" + 
				"	5-tum kitaplari listele\n" + 
				"	6-cikis ");

	}

}
