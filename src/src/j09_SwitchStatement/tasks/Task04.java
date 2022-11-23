package src.j09_SwitchStatement.tasks;

import java.util.Scanner;

public class Task04 {

	public static void main(String[] args) {


		// Girilen  ayın  kac cektigini print eden code create ediniz.

		Scanner oku = new Scanner(System.in);
		System.out.print("ayNo = ");
		int ayNo = oku.nextInt();

		switch (ayNo){
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				System.out.println("Girilen ay 31 cekiyor");
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				System.out.println("Girilen ay 30 cekiyor");
				break;
			case 2:
				System.out.print("Yili giriniz: ");
				int yil=oku.nextInt();
				if (yil%4==0){
					System.out.println("Girilen ay 29 cekiyor");
				}else{
					System.out.println("Girilen ay 28 cekiyor");
				}
				break;
			default:
				System.out.println("Yanlis ay no girdiniz");
		}

	}

}
